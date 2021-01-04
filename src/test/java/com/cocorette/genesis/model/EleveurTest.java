package com.cocorette.genesis.model;

import com.cocorette.genesis.model.bo.ContactBo;
import com.cocorette.genesis.model.bo.EleveurBo;
import com.cocorette.genesis.model.entity.ContactEntity;
import com.cocorette.genesis.model.entity.EleveurEntity;
import com.cocorette.genesis.model.form.EleveurForm;
import com.cocorette.genesis.model.table.EleveurTable;
import com.cocorette.genesis.model.transitionnel.EleveurPo;
import com.cocorette.genesis.model.view.EleveurView;

import java.time.LocalDateTime;

public class EleveurTest {
    private static final int ID = 123;
    private static final String PRENOM = "PASCAL";
    private static final String NOM = "LEMAIRE";
    private static final String COMMENTAIRE = "Ceci est un commentaire";
    private static final boolean ACTIF = false;
    private static final boolean ARCHIVE = true;
    private static final LocalDateTime CREATION = LocalDateTime.MIN;
    private static final LocalDateTime MODIF = LocalDateTime.MAX;

    //Contact
    private static final String MAIL = "azer@azer.fr";
    private static final String FIXE = "0199999999";
    private static final String PORT = "0299999999";
    private static final String FAX = "0399999999";




    public EleveurEntity creerEntity(){
        EleveurEntity entity = new EleveurEntity();
        ContactEntity contact = new ContactEntity();

        entity.setId(ID);
        entity.setPrenom(PRENOM);
        entity.setNom(NOM);
        entity.setContact(contact);
        entity.setCommentaire(COMMENTAIRE);
        entity.setActif(ACTIF);
        entity.setArchive(ARCHIVE);
        entity.setCreated(CREATION);
        entity.setModified(MODIF);

        return entity;
    }

    public EleveurBo creerBo(){
        EleveurBo bo = new EleveurBo();
        ContactBo contact = new ContactBo();

        bo.setId(ID);
        bo.setPrenom(PRENOM);
        bo.setNom(NOM);
        bo.setContactBo(contact);
        bo.setCommentaire(COMMENTAIRE);
        bo.setActif(ACTIF);
        bo.setArchive(ARCHIVE);
        bo.setCreated(CREATION);
        bo.setModified(MODIF);

        return bo;
    }

    public EleveurForm creerForm(){
        EleveurForm form = new EleveurForm();

        form.setPrenom(PRENOM);
        form.setNom(NOM);

        form.setMail(MAIL);
        form.setTelFixe(FIXE);
        form.setTelPort(PORT);
        form.setFax(FAX);

        form.setCommentaire(COMMENTAIRE);
        form.setCreated(CREATION);
        form.setModified(MODIF);

        return form;
    }

    public EleveurTable creerTable(){
        EleveurTable table = new EleveurTable();

        table.setId(ID);
        table.setPrenom(PRENOM);
        table.setNom(NOM);
        table.setMail(MAIL);
        table.setTelFixe(FIXE);
        table.setTelPort(PORT);
        table.setFax(FAX);
        table.setActif(ACTIF);
        table.setArchive(ARCHIVE);
        table.setCreated(CREATION);
        table.setModified(MODIF);

        return table;
    }

    public EleveurView creerView(){
        EleveurView view = new EleveurView();

        view.setId(ID);
        view.setPrenom(PRENOM);
        view.setNom(NOM);
        view.setMail(MAIL);
        view.setTelFixe(FIXE);
        view.setTelPort(PORT);
        view.setFax(FAX);
        view.setCommentaire(COMMENTAIRE);
        view.setCreated(CREATION);
        view.setModified(MODIF);
        view.setActif(ACTIF);
        view.setArchive(ARCHIVE);

        return view;
    }

    public EleveurPo creerPo(){
        EleveurPo po = new EleveurPo();

        po.setId(ID);
        po.setPrenom(PRENOM);
        po.setNom(NOM);

        return po;
    }
}
