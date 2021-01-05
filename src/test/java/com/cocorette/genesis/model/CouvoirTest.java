package com.cocorette.genesis.model;

import com.cocorette.genesis.model.bo.CouvoirBo;
import com.cocorette.genesis.model.entity.ContactEntity;
import com.cocorette.genesis.model.entity.CouvoirEntity;

import java.time.LocalDateTime;

public class CouvoirTest {
    private final static int ID=573;
    private final static String NOM = "Poulette";
    private final static String COMM = "Ceci est un commentaire";
    private final static boolean ACTIF = true;
    private final static boolean ARCHIVE = false;
    private final static LocalDateTime CREATION = LocalDateTime.MIN;
    private final static LocalDateTime MODIF = LocalDateTime.MAX;

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
}