package com.cocorette.genesis.service;

import com.cocorette.genesis.convert.ArriveeEauConvert;
import com.cocorette.genesis.dao.ArriveeEauDao;
import com.cocorette.genesis.model.bo.ArriveeEauBo;
import com.cocorette.genesis.model.entity.ArriveeEauEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ArriveeEauService {
    @Autowired
    ArriveeEauDao aed;

    public List<ArriveeEauEntity> findAll(){
        return aed.findAll();
    }

    public List<ArriveeEauBo> findAllBo(){
        List<ArriveeEauEntity> listEau = aed.findAll();
        List<ArriveeEauBo> listBo = new ArrayList<>();

        for (ArriveeEauEntity eau:
             listEau) {
            ArriveeEauBo bo = ArriveeEauConvert.arriveeEauEntityToBo(eau);
            listBo.add(bo);
        }

        return listBo;
    }

    public ArriveeEauEntity findById(int id){
        return aed.findById(id).orElseThrow();
    }

    public ArriveeEauBo findByIdBo(int id){
        ArriveeEauEntity aee = aed.findById(id).orElseThrow();
        return ArriveeEauConvert.arriveeEauEntityToBo(aee);

    }
}
