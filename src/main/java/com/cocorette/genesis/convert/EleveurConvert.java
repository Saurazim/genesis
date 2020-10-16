package com.cocorette.genesis.convert;

import com.cocorette.genesis.form.EleveurForm;
import com.cocorette.genesis.model.Eleveur;

public class EleveurConvert {
    public static Eleveur eleveurFormToEntity(EleveurForm form){
        Eleveur eleveur = new Eleveur();
        eleveur.setPrenom(form.getPrenom().isBlank() ? "" : form.getPrenom());
        eleveur.setNom(form.getNom().isBlank() ? "" : form.getNom());
        eleveur.setMail(form.getMail().isBlank() ? "" : form.getMail());
        eleveur.setTelFixe(form.getTelFixe().isBlank() ? "" : form.getTelFixe());
        eleveur.setTelPort(form.getTelPort().isBlank() ? "" : form.getTelPort());
        eleveur.setFax(form.getFax().isBlank() ? "" : form.getFax());

        return eleveur;
    }

    public static EleveurForm eleveurEntityToForm(Eleveur eleveur){
        EleveurForm form = new EleveurForm();
        form.setPrenom(eleveur.getPrenom().isBlank() ? "": eleveur.getPrenom());
        form.setNom(eleveur.getNom().isBlank() ? "": eleveur.getNom());
        form.setMail(eleveur.getMail().isBlank() ? "": eleveur.getMail());
        form.setTelFixe(eleveur.getTelFixe().isBlank() ? "": eleveur.getTelFixe());
        form.setTelPort(eleveur.getTelPort().isBlank() ? "": eleveur.getTelPort());
        form.setFax(eleveur.getFax().isBlank() ? "": eleveur.getFax());

        return form;
    }
}
