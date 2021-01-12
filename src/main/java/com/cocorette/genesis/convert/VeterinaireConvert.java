package com.cocorette.genesis.convert;

import com.cocorette.genesis.model.bo.GpsBo;
import com.cocorette.genesis.model.bo.VeterinaireBo;
import com.cocorette.genesis.model.entity.VeterinaireEntity;
import com.cocorette.genesis.model.form.VeterinaireForm;
import com.cocorette.genesis.model.table.VeterinaireTable;
import com.cocorette.genesis.model.view.VeterinaireView;

public class VeterinaireConvert {
    public static VeterinaireBo veterinaireEntityToBo(VeterinaireEntity entity){
        VeterinaireBo bo = new VeterinaireBo();
        bo.setId(entity.getId());
        bo.setNom(entity.getNom());
        bo.setGpsBo(GpsConvert.gpsEntityToBo(entity.getGps()));
        bo.setCommentaire(entity.getCommentaire());
        bo.setActive(entity.isActive());
        bo.setArchive(entity.isArchive());
        bo.setCreated(entity.getCreated());
        bo.setModified(entity.getModified());

        return bo;
    }

    public static VeterinaireEntity veterinaireBoToEntity(VeterinaireBo bo){
        VeterinaireEntity entity = new VeterinaireEntity();

        entity.setNom(bo.getNom());
        entity.setGps(GpsConvert.gpsBoToEntity(bo.getGpsBo()));
        entity.setCommentaire(bo.getCommentaire());
        entity.setActive(bo.isActive());
        entity.setArchive(bo.isArchive());
        entity.setCreated(bo.getCreated());
        entity.setModified(bo.getModified());

        return entity;
    }

    public static VeterinaireBo veterinaireFormToBo(VeterinaireForm form){
        VeterinaireBo bo = new VeterinaireBo();

        bo.setId(form.getId());
        bo.setNom(form.getNom());
        bo.setGpsBo(new GpsBo(form.getLatitude(), form.getLongitude()));
        bo.setCommentaire(form.getCommentaire());

        return bo;
    }

    public static VeterinaireView veterinaireBoToView(VeterinaireBo bo){
        VeterinaireView view = new VeterinaireView();

        view.setId(bo.getId());
        view.setNom(bo.getNom());
        view.setLatitude(bo.getGpsBo().getLatitude());
        view.setLongitude(bo.getGpsBo().getLongitude());
        view.setCommentaire(bo.getCommentaire());
        view.setActive(bo.isActive());
        view.setArchive(bo.isArchive());
        view.setCreated(bo.getCreated());
        view.setModified(bo.getModified());

        return view;
    }

    public static VeterinaireTable veterinaireBoToTable(VeterinaireBo bo){
        VeterinaireTable table = new VeterinaireTable();

        table.setId(bo.getId());
        table.setNom(bo.getNom());
        table.setCommentaire(bo.getCommentaire());
        table.setActive(bo.isActive());
        table.setArchive(bo.isArchive());
        table.setCreated(bo.getCreated());
        table.setModified(bo.getModified());

        return table;
    }

    public static VeterinaireEntity veterinaireFormToEntity(VeterinaireForm form){
        VeterinaireBo bo = veterinaireFormToBo(form);

        return veterinaireBoToEntity(bo);
    }

    public static VeterinaireTable veterinaireEntityToTable(VeterinaireEntity entity){
        VeterinaireBo bo = veterinaireEntityToBo(entity);

        return veterinaireBoToTable(bo);
    }

    public static VeterinaireView veterinaireEntityToView(VeterinaireEntity entity){
        VeterinaireBo bo = veterinaireEntityToBo(entity);

        return veterinaireBoToView(bo);
    }
}
