package com.cocorette.genesis.model;

import com.cocorette.genesis.configuration.ConstantesForTest;
import com.cocorette.genesis.model.bo.EleveurBo;
import com.cocorette.genesis.model.entity.EleveurEntity;
import com.cocorette.genesis.model.form.EleveurForm;
import com.cocorette.genesis.model.table.EleveurTable;
import com.cocorette.genesis.model.transitionnel.EleveurPo;
import com.cocorette.genesis.model.view.EleveurView;

import java.time.LocalDateTime;

public class EleveurTest {
    private static final int ID = ConstantesForTest.ID;
    private static final String PRENOM = ConstantesForTest.PRENOM_ELEVEUR;
    private static final String NOM = ConstantesForTest.NOM_ELEVEUR;
    private static final String COMMENTAIRE = ConstantesForTest.COMM;
    private static final boolean ACTIF = ConstantesForTest.ACTIF;
    private static final boolean ARCHIVE = ConstantesForTest.ARCHIVE;
    private static final LocalDateTime CREATION = ConstantesForTest.CREATION;
    private static final LocalDateTime MODIF = ConstantesForTest.MODIF;

    //Contact
    private static final String MAIL = ConstantesForTest.MAIL;
    private static final String FIXE = ConstantesForTest.FIXE;
    private static final String PORT = ConstantesForTest.PORT;
    private static final String FAX = ConstantesForTest.FAX;




    public EleveurEntity creerEntity(){
        EleveurEntity entity = new EleveurEntity();

        entity.setId(ID);
        entity.setPrenom(PRENOM);
        entity.setNom(NOM);
        entity.setCommentaire(COMMENTAIRE);
        entity.setActif(ACTIF);
        entity.setArchive(ARCHIVE);
        entity.setCreated(CREATION);
        entity.setModified(MODIF);

        return entity;
    }

    public EleveurBo creerBo(){
        EleveurBo bo = new EleveurBo();

        bo.setId(ID);
        bo.setPrenom(PRENOM);
        bo.setNom(NOM);
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
