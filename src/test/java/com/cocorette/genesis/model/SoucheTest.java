package com.cocorette.genesis.model;

import com.cocorette.genesis.configuration.ConstantesForTest;
import com.cocorette.genesis.model.bo.SoucheBo;
import com.cocorette.genesis.model.entity.SoucheEntity;
import com.cocorette.genesis.model.form.SoucheForm;
import com.cocorette.genesis.model.table.SoucheTable;
import com.cocorette.genesis.model.view.SoucheView;

import java.time.LocalDateTime;

public class SoucheTest {
    private static final int ID = ConstantesForTest.ID;
    private static final String NOM = ConstantesForTest.NOM_SOUCHE;
    private static final String COMMENTAIRE = ConstantesForTest.COMM;
    private static final boolean ACTIVE = ConstantesForTest.ACTIF;
    private static final boolean ARCHIVE = ConstantesForTest.ARCHIVE;
    private static final LocalDateTime CREATION = ConstantesForTest.CREATION;
    private static final LocalDateTime MODIF = ConstantesForTest.MODIF;

    public SoucheEntity creerEntity(){
        SoucheEntity entity = new SoucheEntity();

        entity.setId(ID);
        entity.setNom(NOM);
        entity.setCommentaire(COMMENTAIRE);
        entity.setActive(ACTIVE);
        entity.setArchive(ARCHIVE);
        entity.setCreated(CREATION);
        entity.setModified(MODIF);

        return entity;
    }

    public SoucheBo creerBo(){
        SoucheBo bo = new SoucheBo();

        bo.setId(ID);
        bo.setNom(NOM);
        bo.setCommentaire(COMMENTAIRE);
        bo.setActive(ACTIVE);
        bo.setArchive(ARCHIVE);
        bo.setCreated(CREATION);
        bo.setModified(MODIF);

        return bo;
    }

    public SoucheForm creerForm(){
        SoucheForm form = new SoucheForm();

        form.setNom(NOM);
        form.setCommentaire(COMMENTAIRE);

        return form;
    }

    public SoucheTable creerTable(){
        SoucheTable table = new SoucheTable();

        table.setId(ID);
        table.setNom(NOM);
        table.setCommentaire(COMMENTAIRE);
        table.setActive(ACTIVE);
        table.setArchive(ARCHIVE);
        table.setCreated(CREATION);
        table.setModified(MODIF);

        return table;
    }

    public SoucheView creerView(){
        SoucheView view = new SoucheView();

        view.setId(ID);
        view.setNom(NOM);
        view.setCommentaire(COMMENTAIRE);
        view.setActive(ACTIVE);
        view.setArchive(ARCHIVE);
        view.setCreated(CREATION);
        view.setModified(MODIF);

        return view;
    }
}
