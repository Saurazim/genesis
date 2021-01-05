package com.cocorette.genesis.model;

import com.cocorette.genesis.model.bo.GpsBo;
import com.cocorette.genesis.model.bo.VeterinaireBo;
import com.cocorette.genesis.model.entity.GpsEntity;
import com.cocorette.genesis.model.entity.VeterinaireEntity;

import java.time.LocalDateTime;

public class VeterinaireTest {
    private static final int ID = 789;
    private static final String NOM = "Vétérinaire";
    private static final float LONGITUDE = 78945;
    private static final float LATITUDE = 123456;
    private static final String COMMENTAIRE = "Ceci est un commentaire";
    private static final boolean ACTIVE = true;
    private static final boolean ARCHIVE = false;
    private static final LocalDateTime CREATION = LocalDateTime.MIN;
    private static final LocalDateTime MODIF = LocalDateTime.MAX;

    public VeterinaireEntity creerEntity(){
        VeterinaireEntity entity = new VeterinaireEntity();
        GpsEntity gps = new GpsEntity();

        entity.setId(ID);
        entity.setNom(NOM);
        entity.setCommentaire(COMMENTAIRE);
        entity.setActive(ACTIVE);
        entity.setArchive(ARCHIVE);
        entity.setCreated(CREATION);
        entity.setModified(MODIF);
        entity.setGps(gps);

        return entity;
    }

    public VeterinaireBo creerBo(){
        VeterinaireBo bo = new VeterinaireBo();
        GpsBo gpsBo = new GpsBo();

        bo.setId(ID);
        bo.setNom(NOM);
        bo.setCommentaire(COMMENTAIRE);
        bo.setActive(ACTIVE);
        bo.setArchive(ARCHIVE);
        bo.setCreated(CREATION);
        bo.setModified(MODIF);
        bo.setGpsBo(gpsBo);

        return bo;
    }
}
