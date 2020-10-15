package com.cocorette.genesis.service;

import com.cocorette.genesis.form.EleveurForm;
import com.cocorette.genesis.model.Eleveur;

public class EleveurService {
    public static Eleveur eleveurFormToEntity(EleveurForm form){
        Eleveur eleveur = new Eleveur();
        eleveur.setPrenom(form.getPrenom());
        eleveur.setNom(form.getNom());
        eleveur.setMail(form.getMail());
        eleveur.setTelFixe(form.getTelFixe());
        eleveur.setTelPort(form.getTelPort());
        eleveur.setFax(form.getFax());

        return eleveur;
    }
}
