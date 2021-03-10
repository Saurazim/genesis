package com.cocorette.genesis.coordination;

import com.cocorette.genesis.configuration.Constantes;
import com.cocorette.genesis.convert.EntrepriseConvert;
import com.cocorette.genesis.model.bo.AdresseBo;
import com.cocorette.genesis.model.bo.ContactBo;
import com.cocorette.genesis.model.bo.EntrepriseBo;
import com.cocorette.genesis.model.entity.EleveurEntity;
import com.cocorette.genesis.model.entity.EntrepriseEntity;
import com.cocorette.genesis.model.form.EntrepriseForm;
import com.cocorette.genesis.model.table.EntrepriseTable;
import com.cocorette.genesis.model.view.EntrepriseView;
import com.cocorette.genesis.service.AdresseService;
import com.cocorette.genesis.service.ContactService;
import com.cocorette.genesis.service.EleveurService;
import com.cocorette.genesis.service.EntrepriseService;
import com.cocorette.genesis.util.ConstantesUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.time.LocalDateTime;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Component
public class EntrepriseCoord {
    @Autowired
    EleveurService eleveurService;
    @Autowired
    EntrepriseService entrepriseService;
    @Autowired
    ContactService contactService;
    @Autowired
    AdresseService adresseService;

    private final String mailRegex = ConstantesUtil.getProperty(Constantes.REGEX_MAIL);
    private final String telRegex = ConstantesUtil.getProperty(Constantes.REGEX_TEL);
    private final String cpRegex = ConstantesUtil.getProperty(Constantes.REGEX_CP);

    public void saveEntreprise(EntrepriseForm form){
        EntrepriseBo bo = EntrepriseConvert.entrepriseFormToBo(form);
        AdresseBo adresseBo = adresseService.getAdresseBo(form);
        ContactBo contactBo = contactService.getContactFromEntreprise(form);
        bo.setAdresseBo(adresseBo);
        bo.setContactBo(contactBo);
        EntrepriseEntity entity = EntrepriseConvert.entrepriseBoToEntity(bo);
        entity.setActif(true);
        entity.setArchive(false);
        entity.setCreated(LocalDateTime.now());
        entity.setModified(LocalDateTime.now());
        contactService.saveContact(entity.getContact());
        adresseService.saveAdresse(entity.getAdresse());
        EleveurEntity eleveur = eleveurService.findEleveur(form.getEleveurId()).orElseThrow();
        entity.setEleveur(eleveur);
        entrepriseService.saveEntreprise(entity);
    }

    public Map<String,String> validEntreprise(EntrepriseForm form){
        Map<String,String> error = new HashMap<>();
        //verif obligatoires
        if (form.getNom().isBlank())
            error.put("nom","Le nom est obligatoire");
        if (form.getEde().isBlank())
            error.put("ede","EDE obligatoire");
        if (form.getMail().isBlank() && form.getTelFixe().isBlank()
                && form.getTelPort().isBlank() && form.getFax().isBlank()){
            error.put("contact","au moins un contact doit etre rempli");
        }else{
            //verif contacts
            if (!form.getFax().isBlank() && !form.getFax().matches(telRegex)){
                error.put("fax", "numéro invalide");
            }
            if (!form.getTelFixe().isBlank() && !form.getTelFixe().matches(telRegex)){
                error.put("telfixe", "numéro invalide");
            }
            if (!form.getTelPort().isBlank() && !form.getTelPort().matches(telRegex)){
                error.put("telport", "numéro invalide");
            }
            if (!form.getMail().isBlank() && !form.getMail().matches(mailRegex)){
                error.put("mail", "mail invalide");
            }
        }
        //verifs adresse
        if (form.getRue().isBlank()||form.getCodePostal().isBlank()
                ||form.getVille().isBlank()||form.getPays().isBlank()){
            error.put("adresse", "adresse invalide");
        }else {
            if (!form.getCodePostal().matches(cpRegex))
                error.put("codepostal","Code postal invalide");
        }

        return error;
    }

    public List<EntrepriseTable> findAll(){
        return entrepriseService.findAll();
    }

    public EntrepriseView findEntrepriseView(int id){
        return entrepriseService.findEntrepriseView(id);
    }

    public List<EntrepriseTable> findEntrepriseByEleveurId(int eleveurId){
        EleveurEntity eleveur = eleveurService.findEleveur(eleveurId).orElseThrow();
        return entrepriseService.findEntrepriseByEleveur(eleveur);
    }
}
