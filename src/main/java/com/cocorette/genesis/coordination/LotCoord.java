package com.cocorette.genesis.coordination;

import com.cocorette.genesis.convert.LotConvert;
import com.cocorette.genesis.dao.AlimentDao;
import com.cocorette.genesis.dao.CategorieDao;
import com.cocorette.genesis.dao.CouvoirDao;
import com.cocorette.genesis.dao.SoucheDao;
import com.cocorette.genesis.model.bo.CouvoirBo;
import com.cocorette.genesis.model.entity.*;
import com.cocorette.genesis.model.form.LotForm;
import com.cocorette.genesis.model.table.LotTable;
import com.cocorette.genesis.model.view.LotView;
import com.cocorette.genesis.service.BatimentService;
import com.cocorette.genesis.service.CategorieService;
import com.cocorette.genesis.service.LotService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.time.LocalDateTime;
import java.util.List;

@Component
public class LotCoord {
    @Autowired
    LotService lotService;
    @Autowired
    BatimentService batimentService;
    @Autowired
    AlimentDao alimentDao;
    @Autowired
    SoucheDao soucheDao;
    @Autowired
    CouvoirDao couvoirDao;
    @Autowired
    CategorieService categorieService;

    public void saveLot(LotForm form){
        LotEntity entity = LotConvert.lotFormToEntity(form);

        entity.setAlimentEntity(alimentDao.findById(0).orElseThrow());
        entity.setSoucheEntity(soucheDao.findById(0).orElseThrow());
        entity.setCouvoirEntity(couvoirDao.findById(0).orElseThrow());
        entity.setCategorieEntity(categorieService.findById(form.getCategorieId()).orElseThrow());
        //
        entity.setActif(true);
        entity.setArchive(false);
        entity.setCreated(LocalDateTime.now());
        entity.setModified(LocalDateTime.now());
        BatimentEntity batiment = batimentService.findBatiment(form.getBatimentId()).orElseThrow();
        entity.setBatimentEntity(batiment);
        lotService.saveLot(entity);
    }

    public void validLot(LotForm form){}

    public List<LotTable> findAll(){
        return lotService.findAll();
    }

    public LotView findLotView(int id){
        return lotService.findLotView(id);
    }

    public List<LotTable> findLotByBatimentId(int batimentId){
        BatimentEntity batiment = batimentService.findBatiment(batimentId).orElseThrow();
        return lotService.findLotByBatiment(batiment);
    }
}
