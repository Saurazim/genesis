package com.cocorette.genesis.coordination;

import com.cocorette.genesis.configuration.Constantes;
import com.cocorette.genesis.convert.EleveurConvert;
import com.cocorette.genesis.model.bo.ContactBo;
import com.cocorette.genesis.model.bo.EleveurBo;
import com.cocorette.genesis.model.entity.ContactEntity;
import com.cocorette.genesis.model.entity.EleveurEntity;
import com.cocorette.genesis.model.form.EleveurForm;
import com.cocorette.genesis.model.modif.EleveurModif;
import com.cocorette.genesis.model.table.EleveurTable;
import com.cocorette.genesis.model.view.EleveurView;
import com.cocorette.genesis.service.ContactService;
import com.cocorette.genesis.service.EleveurService;
import com.cocorette.genesis.util.ConstantesUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.time.LocalDateTime;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Component
public class EleveurCoord {
    @Autowired
    EleveurService eleveurService;

    @Autowired
    ContactService contactService;

    private String mailRegex = ConstantesUtil.getProperty(Constantes.REGEX_MAIL);
    private String telRegex = ConstantesUtil.getProperty(Constantes.REGEX_TEL);

    public void saveEleveur(EleveurForm form){
        EleveurEntity entity = EleveurConvert.eleveurFormToEntity(form);
        entity.setActif(true);
        entity.setArchive(false);
        entity.setCreated(LocalDateTime.now());
        entity.setModified(LocalDateTime.now());
        contactService.saveContact(entity.getContact());
        eleveurService.saveEleveur(entity);
    }

    public boolean updateEleveur(EleveurModif modif){
        EleveurEntity nouveau = EleveurConvert.eleveurModifToEntity(modif);
        ContactEntity nouveauContact = contactService.getContactEntity(modif);
        boolean change = false;
        EleveurEntity origin = eleveurService.findEleveur(nouveau.getId()).orElseThrow();
        List<String> list = eleveurService.checkDiff(origin,nouveau);

        if (!list.isEmpty()){
            if (list.contains("prenom"))
                origin.setPrenom(nouveau.getPrenom());
            if (list.contains("nom"))
                origin.setNom(nouveau.getNom());
            if (list.contains("commentaire"))
                origin.setCommentaire(nouveau.getCommentaire());

            change = true;
            list.clear();
        }

        list = contactService.checkDiff(origin.getContact(),nouveauContact);
        if (!list.isEmpty()){
            ContactEntity contactOrigin = contactService.findByIdEntity(origin.getContact().getId()).orElseThrow();
            if (list.contains("mail"))
                contactOrigin.setMail(nouveauContact.getMail());
            if (list.contains("tel_fixe"))
                contactOrigin.setTelFixe(nouveauContact.getTelFixe());
            if (list.contains("tel_port"))
                contactOrigin.setTelPort(nouveauContact.getTelPort());
            if (list.contains("fax"))
                contactOrigin.setFax(nouveauContact.getFax());

            change = true;
        }

        if (change)
            origin.setModified(LocalDateTime.now());

        return change;
    }

    public Map<String, String> validEleveur(EleveurForm form){
        Map<String, String> erreurs = new HashMap<>();

        if (form.getNom().isBlank())
            erreurs.put("nom","le nom est vide");

        if (form.getPrenom().isBlank())
            erreurs.put("prenom","le nom est vide");

        if (form.getFax().isBlank() && form.getMail().isBlank() && form.getTelFixe().isBlank() && form.getTelPort().isBlank()){
            erreurs.put("contact","au moins un contact doit etre rempli");
        }
        else{
            if (!form.getFax().isBlank() && !form.getFax().matches(telRegex)){
                erreurs.put("fax", "numéro invalide");
            }
            if (!form.getTelFixe().isBlank() && !form.getTelFixe().matches(telRegex)){
                erreurs.put("telfixe", "numéro invalide");
            }
            if (!form.getTelPort().isBlank() && !form.getTelPort().matches(telRegex)){
                erreurs.put("telport", "numéro invalide");
            }
            if (!form.getMail().isBlank() && !form.getMail().matches(mailRegex)){
                erreurs.put("mail", "mail invalide");
            }
        }

        return erreurs;
    }

    public Map<String, String> validEleveur(EleveurModif form){
        Map<String, String> erreurs = new HashMap<>();

        if (form.getNom().isBlank())
            erreurs.put("nom","le nom est vide");

        if (form.getPrenom().isBlank())
            erreurs.put("prenom","le nom est vide");

        if (form.getFax().isBlank() && form.getMail().isBlank() && form.getTelFixe().isBlank() && form.getTelPort().isBlank()){
            erreurs.put("contact","au moins un contact doit etre rempli");
        }
        else{
            if (!form.getFax().isBlank() && !form.getFax().matches(telRegex)){
                erreurs.put("fax", "numéro invalide");
            }
            if (!form.getTelFixe().isBlank() && !form.getTelFixe().matches(telRegex)){
                erreurs.put("telfixe", "numéro invalide");
            }
            if (!form.getTelPort().isBlank() && !form.getTelPort().matches(telRegex)){
                erreurs.put("telport", "numéro invalide");
            }
            if (!form.getMail().isBlank() && !form.getMail().matches(mailRegex)){
                erreurs.put("mail", "mail invalide");
            }
        }

        return erreurs;
    }

    public EleveurView findEleveurView(int id){
        return eleveurService.findEleveurView(id);
    }

    public EleveurModif findEleveurModif(int id){
        EleveurBo bo = eleveurService.findEleveurBo(id);
        EleveurModif modif = EleveurConvert.eleveurBoToModif(bo);

        return modif;
    }

    public List<EleveurTable> findAll(){
        return eleveurService.findAll();
    }
}
