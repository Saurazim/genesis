package com.cocorette.genesis.convert;

import com.cocorette.genesis.model.bo.CentreBo;
import com.cocorette.genesis.model.bo.CentreBo;
import com.cocorette.genesis.model.bo.GpsBo;
import com.cocorette.genesis.model.entity.CentreEntity;
import com.cocorette.genesis.model.entity.CentreEntity;
import com.cocorette.genesis.model.form.CentreForm;
import com.cocorette.genesis.model.table.CentreTable;
import com.cocorette.genesis.model.view.CentreView;

public class CentreConvert {
    public static CentreEntity centreBoToEntity(CentreBo bo){
        CentreEntity entity = new CentreEntity();
        entity.setId(bo.getId());
        entity.setNom(bo.getNom());
        entity.setGpsEntity(GpsConvert.gpsBoToEntity(bo.getGpsBo()));
        entity.setCommentaire(bo.getCommentaire());
        entity.setActive(bo.isActive());
        entity.setArchive(bo.isArchive());
        entity.setCreated(bo.getCreated());
        entity.setModified(bo.getModified());


        return entity;
    }

    public static CentreBo centreEntityToBo(CentreEntity entity){
        CentreBo bo = new CentreBo();
        bo.setId(entity.getId());
        bo.setNom(entity.getNom());
        bo.setGpsBo(GpsConvert.gpsEntityToBo(entity.getGpsEntity()));
        bo.setCommentaire(entity.getCommentaire());
        bo.setActive(entity.isActive());
        bo.setArchive(entity.isArchive());
        bo.setCreated(entity.getCreated());
        bo.setModified(entity.getModified());

        return bo;
    }

    public static CentreBo centreFormToBo(CentreForm form){
        CentreBo bo = new CentreBo();
        bo.setNom(form.getNom());
        bo.setCommentaire(form.getCommentaire());
        bo.setGpsBo(new GpsBo(form.getLatitude(), form.getLongitude()));

        return bo;
    }

    public static CentreView centreBoToView(CentreBo bo){
        CentreView view = new CentreView();
        view.setId(bo.getId());
        view.setNom(bo.getNom());
        view.setCommentaire(bo.getCommentaire());
        view.setActive(bo.isActive());
        view.setArchive(bo.isArchive());
        view.setCreated(bo.getCreated());
        view.setModified(bo.getModified());
        view.setLatitude(bo.getGpsBo().getLatitude());
        view.setLongitude(bo.getGpsBo().getLongitude());

        return view;
    }

    public static CentreTable centreBoToTable(CentreBo bo){
        CentreTable table = new CentreTable();
        table.setId(bo.getId());
        table.setNom(bo.getNom());
        table.setCommentaire(bo.getCommentaire());
        table.setActive(bo.isActive());
        table.setArchive(bo.isArchive());
        table.setCreated(bo.getCreated());
        table.setModified(bo.getModified());

        return table;
    }

    public static CentreEntity centreFormToEntity(CentreForm form){
        CentreBo bo = centreFormToBo(form);

        return centreBoToEntity(bo);
    }

    public static CentreView centreEntityToView(CentreEntity entity){
        CentreBo bo = centreEntityToBo(entity);

        return centreBoToView(bo);
    }

    public static CentreTable centreEntityToTable(CentreEntity entity){
        CentreBo bo = centreEntityToBo(entity);

        return centreBoToTable(bo);
    }
}
