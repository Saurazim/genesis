package com.cocorette.genesis.model;

import com.cocorette.genesis.configuration.ConstantesForTest;
import com.cocorette.genesis.model.bo.GpsBo;
import com.cocorette.genesis.model.bo.VeterinaireBo;
import com.cocorette.genesis.model.entity.GpsEntity;
import com.cocorette.genesis.model.entity.VeterinaireEntity;

import java.time.LocalDateTime;

public class VeterinaireTest {
    private static final int ID = ConstantesForTest.ID;
    private static final String NOM = ConstantesForTest.NOM_VETO;
    private static final float LONGITUDE = ConstantesForTest.LONGITUDE;
    private static final float LATITUDE = ConstantesForTest.LATITUDE;
    private static final String COMMENTAIRE = ConstantesForTest.COMM;
    private static final boolean ACTIVE = ConstantesForTest.ACTIF;
    private static final boolean ARCHIVE = ConstantesForTest.ARCHIVE;
    private static final LocalDateTime CREATION = ConstantesForTest.CREATION;
    private static final LocalDateTime MODIF = ConstantesForTest.MODIF;

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
