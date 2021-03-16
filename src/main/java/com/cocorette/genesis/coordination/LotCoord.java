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
import com.cocorette.genesis.service.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.time.LocalDateTime;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Component
public class LotCoord {
    @Autowired
    LotService lotService;
    @Autowired
    BatimentService batimentService;
    @Autowired
    AlimentService alimentService;
    @Autowired
    SoucheService soucheService;
    @Autowired
    CouvoirService couvoirService;
    @Autowired
    CategorieService categorieService;

    public void saveLot(LotForm form){
        LotEntity entity = LotConvert.lotFormToEntity(form);

        entity.setAlimentEntity(alimentService.findById(form.getAlimentId()).orElseThrow());
        entity.setSoucheEntity(soucheService.findById(form.getSoucheId()).orElseThrow());
        entity.setCouvoirEntity(couvoirService.findById(form.getCouvoirId()).orElseThrow());
        entity.setCategorieEntity(categorieService.findById(form.getCategorieId()).orElseThrow());
        //
        entity.setActif(true);
        entity.setArchive(false);
        entity.setCreated(LocalDateTime.now());
        entity.setModified(LocalDateTime.now());
        BatimentEntity batiment = batimentService.findBatiment(form.getBatimentId());
        entity.setBatimentEntity(batiment);
        lotService.saveLot(entity);
    }

    public Map<String, String> validLot(LotForm form){
        Map<String, String> error = new HashMap<>();
        if (form.getCodeOeuf().isBlank())
            error.put("codeoeuf","Le code oeuf est obligatoire. Remplir \"A VENIR\" si indisponible");
        if (form.getCategorieId()==null)
            error.put("categorie","Le choix de la catégorie est obligatoire");
        if (form.getCouvoirId()==null)
            error.put("couvoir","Le choix d'un fournisseur de poulette est obligatoire");
        if (form.getSoucheId()==null)
            error.put("souche","Le choix d'une souche est obligatoire");
        if (form.getAlimentId()==null)
            error.put("aliment","Le choix d'une fabrique d'aliment est obligatoire");
        if (form.getNbPoulesMEP()==null)
            error.put("nbmep","Le nombre de poule à la mise en place est obligatoire");
        if (form.getNaissancePoules()==null)
            error.put("naissancepoules","La date de naissance  des poules est obligatoire");
        if (form.getMep()==null)
            error.put("mep","La date de mise en place est obligatoire");

        return error;
    }

    public List<LotTable> findAll(){
        return lotService.findAll();
    }

    public LotView findLotView(int id){
        return lotService.findLotView(id);
    }

    public List<LotTable> findLotByBatimentId(int batimentId){
        BatimentEntity batiment = batimentService.findBatiment(batimentId);
        return lotService.findLotByBatiment(batiment);
    }
}
