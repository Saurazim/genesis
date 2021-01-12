package com.cocorette.genesis.model;

import com.cocorette.genesis.configuration.ConstantesForTest;
import com.cocorette.genesis.model.bo.CentreBo;
import com.cocorette.genesis.model.entity.CentreEntity;
import com.cocorette.genesis.model.form.CentreForm;
import com.cocorette.genesis.model.table.CentreTable;
import com.cocorette.genesis.model.view.CentreView;

import java.time.LocalDateTime;

public class CentreTest {
    private static final int ID = ConstantesForTest.ID;
    private static final String NOM = ConstantesForTest.NOM_CENTRE;
    private static final String COMM = ConstantesForTest.COMM;
    private static final float LONGITUDE = ConstantesForTest.LONGITUDE;
    private static final float LATITUDE = ConstantesForTest.LATITUDE;
    private static final boolean ACTIF = ConstantesForTest.ACTIF;
    private static final boolean ARCHIVE = ConstantesForTest.ARCHIVE;
    private static final LocalDateTime CREATION = ConstantesForTest.CREATION;
    private static final LocalDateTime MODIF = ConstantesForTest.MODIF;

    public CentreEntity creerEntity(){
        CentreEntity entity = new CentreEntity();

        entity.setId(ID);
        entity.setNom(NOM);
        entity.setCommentaire(COMM);
        entity.setActive(ACTIF);
        entity.setArchive(ARCHIVE);
        entity.setCreated(CREATION);
        entity.setModified(MODIF);

        return entity;
    }

    public CentreBo creerBo(){
        CentreBo bo = new CentreBo();

        bo.setId(ID);
        bo.setNom(NOM);
        bo.setCommentaire(COMM);
        bo.setActive(ACTIF);
        bo.setArchive(ARCHIVE);
        bo.setCreated(CREATION);
        bo.setModified(MODIF);

        return bo;
    }

    public CentreForm creerForm(){
        CentreForm form = new CentreForm();

        form.setNom(NOM);
        form.setCommentaire(COMM);

        return form;
    }

    public CentreTable creerTable(){
        CentreTable table = new CentreTable();

        table.setId(ID);
        table.setNom(NOM);
        table.setCommentaire(COMM);
        table.setActive(ACTIF);
        table.setArchive(ARCHIVE);
        table.setCreated(CREATION);
        table.setModified(MODIF);

        return table;
    }

    public CentreView creerView(){
        CentreView view = new CentreView();

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
