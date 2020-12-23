package com.cocorette.genesis.coordination;

import com.cocorette.genesis.configuration.Constantes;
import com.cocorette.genesis.convert.EleveurConvert;
import com.cocorette.genesis.model.bo.EleveurBo;
import com.cocorette.genesis.model.entity.EleveurEntity;
import com.cocorette.genesis.model.form.EleveurForm;
import com.cocorette.genesis.model.table.EleveurTable;
import com.cocorette.genesis.model.view.EleveurView;
import com.cocorette.genesis.service.ContactService;
import com.cocorette.genesis.service.EleveurService;
import com.cocorette.genesis.util.ConstantesUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.time.LocalDateTime;
import java.util.ArrayList;
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

    public EleveurView findEleveurView(int id){
        return eleveurService.findEleveurView(id);
    }

    public List<EleveurTable> findAll(){
        return eleveurService.findAll();
    }
}
