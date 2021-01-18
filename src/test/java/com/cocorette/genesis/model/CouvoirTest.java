package com.cocorette.genesis.model;

import com.cocorette.genesis.configuration.ConstantesForTest;
import com.cocorette.genesis.model.bo.CouvoirBo;
import com.cocorette.genesis.model.entity.ContactEntity;
import com.cocorette.genesis.model.entity.CouvoirEntity;
import com.cocorette.genesis.model.form.CouvoirForm;
import com.cocorette.genesis.model.table.CouvoirTable;
import com.cocorette.genesis.model.view.CouvoirView;

import java.time.LocalDateTime;

public class CouvoirTest {
    private final static int ID= ConstantesForTest.ID;
    private final static String NOM = ConstantesForTest.NOM_COUVOIR;
    private final static String COMM = ConstantesForTest.COMM;
    private final static boolean ACTIF = ConstantesForTest.ACTIF;
    private final static boolean ARCHIVE = ConstantesForTest.ARCHIVE;
    private final static LocalDateTime CREATION = ConstantesForTest.CREATION;
    private final static LocalDateTime MODIF = ConstantesForTest.MODIF;

    public CouvoirEntity creerEntity(){
        CouvoirEntity entity = new CouvoirEntity();

        entity.setId(ID);
        entity.setNom(NOM);
        entity.setCommentaire(COMM);
        entity.setActive(ACTIF);
        entity.setArchive(ARCHIVE);
        entity.setCreated(CREATION);
        entity.setModified(MODIF);

        return entity;
    }

    public CouvoirBo creerBo(){
        CouvoirBo bo = new CouvoirBo();

        bo.setId(ID);
        bo.setNom(NOM);
        bo.setCommentaire(COMM);
        bo.setActive(ACTIF);
        bo.setArchive(ARCHIVE);
        bo.setCreated(CREATION);
        bo.setModified(MODIF);

        return bo;
    }

    public CouvoirForm creerForm(){
        CouvoirForm form = new CouvoirForm();

        form.setNom(NOM);
        form.setNom(COMM);

        return form;
    }

    public CouvoirTable creerTable(){
        CouvoirTable table = new CouvoirTable();

        table.setId(ID);
        table.setNom(NOM);
        table.setCommentaire(COMM);
        table.setActive(ACTIF);
        table.setArchive(ARCHIVE);
        table.setCreated(CREATION);
        table.setModified(MODIF);

        return table;
    }

    public CouvoirView creerView(){
        CouvoirView view = new CouvoirView();

        view.setId(ID);
        view.setNom(NOM);
        view.setCommentaire(COMM);
        view.setActive(ACTIF);
        view.setArchive(ARCHIVE);
        view.setCreated(CREATION);
        view.setModified(MODIF);

        return view;
    }
}
