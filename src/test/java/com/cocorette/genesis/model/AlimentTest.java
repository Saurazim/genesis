package com.cocorette.genesis.model;

import com.cocorette.genesis.model.bo.AlimentBo;
import com.cocorette.genesis.model.entity.AlimentEntity;
import com.cocorette.genesis.model.form.AlimentForm;
import com.cocorette.genesis.model.table.AlimentTable;
import com.cocorette.genesis.model.view.AlimentView;

import java.time.LocalDateTime;

public class AlimentTest {
    private int ID = 123;
    private String NOM = "Trucmuche";
    private String COMM = "Ceci est un commentaire";
    private boolean ACTIF = false;
    private boolean ARCHIVE = true;
    private LocalDateTime CREA = LocalDateTime.MIN;
    private LocalDateTime MOD = LocalDateTime.MAX;

    public AlimentEntity creerEntity() {
        AlimentEntity entity = new AlimentEntity();
        entity.setId(ID);
        entity.setNom(NOM);
        entity.setCommentaire(COMM);
        entity.setActive(ACTIF);
        entity.setArchive(ARCHIVE);
        entity.setCreated(CREA);
        entity.setModified(MOD);

        return entity;
    }

    public AlimentBo creerBo() {
        AlimentBo bo = new AlimentBo();
        bo.setId(ID);
        bo.setNom(NOM);
        bo.setCommentaire(COMM);
        bo.setActive(ACTIF);
        bo.setArchive(ARCHIVE);
        bo.setCreated(CREA);
        bo.setModified(MOD);

        return bo;
    }

    public AlimentForm creerForm() {
        AlimentForm form = new AlimentForm();
        form.setNom(NOM);
        form.setCommentaire(COMM);

        return form;
    }

    public AlimentView creerView() {
        AlimentView view = new AlimentView();
        view.setId(ID);
        view.setNom(NOM);
        view.setCommentaire(COMM);
        view.setActive(ACTIF);
        view.setArchive(ARCHIVE);
        view.setCreated(CREA);
        view.setModified(MOD);

        return view;
    }

    public AlimentTable creerTable(){
        AlimentTable table = new AlimentTable();
        table.setId(ID);
        table.setNom(NOM);
        table.setCommentaire(COMM);
        table.setActive(ACTIF);
        table.setArchive(ARCHIVE);
        table.setCreated(CREA);
        table.setModified(MOD);

        return table;
    }
}
