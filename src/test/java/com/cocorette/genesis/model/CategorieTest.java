package com.cocorette.genesis.model;

import com.cocorette.genesis.model.bo.CategorieBo;
import com.cocorette.genesis.model.entity.CategorieEntity;
import com.cocorette.genesis.model.form.CategorieForm;
import com.cocorette.genesis.model.table.CategorieTable;
import com.cocorette.genesis.model.view.CategorieView;

import java.time.LocalDateTime;

public class CategorieTest {

    private static final int ID = 100;
    private static final String NOM = "categ test";
    private static final String COMMENTAIRE = "Ceci est un commentaire";
    private static final boolean ACTIF = true;
    private static final boolean ARCHIVE = false;
    private static final LocalDateTime CREATION = LocalDateTime.MIN;
    private static final LocalDateTime MODIF = LocalDateTime.MAX;

    public CategorieEntity creerEntity(){
        CategorieEntity entity = new CategorieEntity();

        entity.setId(ID);
        entity.setNom(NOM);
        entity.setCommentaire(COMMENTAIRE);
        entity.setActive(ACTIF);
        entity.setArchive(ARCHIVE);
        entity.setCreated(CREATION);
        entity.setModified(MODIF);

        return entity;
    }

    public CategorieBo creerBo(){
        CategorieBo bo = new CategorieBo();

        bo.setId(ID);
        bo.setNom(NOM);
        bo.setCommentaire(COMMENTAIRE);
        bo.setActive(ACTIF);
        bo.setArchive(ARCHIVE);
        bo.setCreated(CREATION);
        bo.setModified(MODIF);

        return bo;
    }

    public CategorieForm creerForm(){
        CategorieForm form = new CategorieForm();

        form.setNom(NOM);
        form.setCommentaire(COMMENTAIRE);

        return form;
    }

    public CategorieTable creerTable(){
        CategorieTable table = new CategorieTable();

        table.setId(ID);
        table.setNom(NOM);
        table.setCommentaire(COMMENTAIRE);
        table.setActive(ACTIF);
        table.setArchive(ARCHIVE);
        table.setCreated(CREATION);
        table.setModified(MODIF);

        return table;
    }

    public CategorieView creerView(){
        CategorieView view = new CategorieView();

        view.setId(ID);
        view.setNom(NOM);
        view.setCommentaire(COMMENTAIRE);
        view.setActive(ACTIF);
        view.setArchive(ARCHIVE);
        view.setCreated(CREATION);
        view.setModified(MODIF);

        return view;
    }
}
