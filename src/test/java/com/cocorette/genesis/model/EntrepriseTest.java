package com.cocorette.genesis.model;

import com.cocorette.genesis.model.bo.*;
import com.cocorette.genesis.model.entity.*;
import com.cocorette.genesis.model.form.EntrepriseForm;
import com.cocorette.genesis.model.table.EntrepriseTable;
import com.cocorette.genesis.model.transitionnel.EleveurPo;
import com.cocorette.genesis.model.transitionnel.EntreprisePo;
import com.cocorette.genesis.model.view.EntrepriseView;

import java.time.LocalDateTime;

public class EntrepriseTest {
    private static final int ID = 123;
    private static final String EDE = "code EDE";
    private static final String NOM = "NOM";
    private static final String COMM = "Ceci est un commentaire";
    private static final boolean ACTIF = true;
    private static final boolean ARCHIVE = false;
    private static final LocalDateTime CREATION = LocalDateTime.MIN;
    private static final LocalDateTime MODIF = LocalDateTime.MAX;
    private static final String RUE = "12 rue TrucMuche";
    private static final String CP = "12 230";
    private static final String VILLE = "Quimper";
    private static final String PAYS = "France";
    private static final String MAIL = "azer@azer.fr";
    private static final String FIXE = "+33199999999";
    private static final String PORT = "+33299999999";
    private static final String FAX = "+33399999999";
    private static final int ELEVEURID = 456;
    private static final String ELEVEURNOM = "L'éleveur";
    private static final String ELEVEURPRENOM = "Ducoin";
    private static final int VETOID = 147;
    private static final String VETO = "Le vétérinaire";
    private static final int CENTREID = 963;
    private static final String CENTRE = "Le Centre";

    public EntrepriseEntity creerEntity(){
        EntrepriseEntity entity = new EntrepriseEntity();

        VeterinaireEntity veto = new VeterinaireEntity();
        CentreEntity centre = new CentreEntity();
        AdresseEntity adresse = new AdresseEntity();
        ContactEntity contact = new ContactEntity();
        EleveurEntity eleveur = new EleveurEntity();
        eleveur.setId(ELEVEURID);
        eleveur.setNom(ELEVEURNOM);
        eleveur.setPrenom(ELEVEURPRENOM);

        entity.setId(ID);
        entity.setEde(EDE);
        entity.setNom(NOM);
        entity.setVeterinaire(veto);
        entity.setCentre(centre);
        entity.setAdresse(adresse);
        entity.setContact(contact);
        entity.setEleveur(eleveur);
        entity.setCommentaire(COMM);
        entity.setActif(ACTIF);
        entity.setArchive(ARCHIVE);
        entity.setCreated(CREATION);
        entity.setModified(MODIF);

        return entity;
    }

    public EntrepriseBo creerBo(){
        EntrepriseBo bo = new EntrepriseBo();

        CentreBo centre = new CentreBo();
        centre.setId(CENTREID);
        centre.setNom(CENTRE);

        AdresseBo adresse = new AdresseBo();
        adresse.setRue(RUE);
        adresse.setCodePostal(CP);
        adresse.setVille(VILLE);
        adresse.setPays(PAYS);

        ContactBo contact = new ContactBo();
        contact.setMail(MAIL);
        contact.setTelFixe(FIXE);
        contact.setTelPort(PORT);
        contact.setFax(FAX);

        VeterinaireBo veto = new VeterinaireBo();
        veto.setId(VETOID);
        veto.setNom(VETO);

        EleveurPo eleveur = new EleveurPo();
        eleveur.setId(ELEVEURID);
        eleveur.setNom(ELEVEURNOM);
        eleveur.setPrenom(ELEVEURPRENOM);

        bo.setId(ID);
        bo.setNom(NOM);
        bo.setEde(EDE);
        bo.setCentreBo(centre);
        bo.setAdresseBo(adresse);
        bo.setContactBo(contact);
        bo.setVeterinaireBo(veto);
        bo.setEleveurPo(eleveur);
        bo.setCommentaire(COMM);
        bo.setActif(ACTIF);
        bo.setArchive(ARCHIVE);
        bo.setCreated(CREATION);
        bo.setModified(MODIF);

        return bo;
    }

    public EntrepriseForm creerForm(){
        EntrepriseForm form = new EntrepriseForm();

        form.setId(ID);
        form.setEde(EDE);
        form.setNom(NOM);
        form.setRue(RUE);
        form.setCodePostal(CP);
        form.setVille(VILLE);
        form.setPays(PAYS);
        form.setMail(MAIL);
        form.setTelFixe(FIXE);
        form.setTelPort(PORT);
        form.setFax(FAX);
        form.setEleveurId(ELEVEURID);
        form.setCommentaire(COMM);

        return form;
    }

    public EntrepriseTable creerTable(){
        EntrepriseTable table = new EntrepriseTable();

        table.setId(ID);
        table.setEde(EDE);
        table.setNom(NOM);
        table.setEleveurNom(ELEVEURNOM+" "+ELEVEURPRENOM);
        table.setEleveurId(ELEVEURID);
        table.setAdresse(RUE+" "+CP+" "+VILLE+" "+PAYS);
        table.setMail(MAIL);
        table.setTelFixe(FIXE);
        table.setTelPort(PORT);
        table.setFax(FAX);
        table.setVeterinaire(VETO);
        table.setCentre(CENTRE);
        table.setActif(ACTIF);
        table.setArchive(ARCHIVE);
        table.setCreated(CREATION);
        table.setModified(MODIF);

        return table;
    }

    public EntrepriseView creerView(){
        EntrepriseView view = new EntrepriseView();

        view.setId(ID);
        view.setNom(NOM);
        view.setEde(EDE);
        view.setMail(MAIL);
        view.setTelFixe(FIXE);
        view.setTelPort(PORT);
        view.setFax(FAX);
        view.setRue(RUE);
        view.setCodePostal(CP);
        view.setVille(VILLE);
        view.setPays(PAYS);
        view.setEleveur(ELEVEURNOM);
        view.setEleveurId(ELEVEURID);
        view.setVeterinaireId(VETOID);
        view.setVeterinaire(VETO);
        view.setCentreId(CENTREID);
        view.setCentre(CENTRE);
        view.setCommentaire(COMM);
        view.setCreated(CREATION);
        view.setModified(MODIF);
        view.setActif(ACTIF);
        view.setArchive(ARCHIVE);

        return view;
    }

    public EntreprisePo creerPo(){
        EntreprisePo po = new EntreprisePo();

        po.setId(ID);
        po.setEde(EDE);
        po.setNom(NOM);

        return po;
    }
}
