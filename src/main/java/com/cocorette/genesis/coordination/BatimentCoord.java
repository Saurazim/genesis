package com.cocorette.genesis.coordination;

import com.cocorette.genesis.configuration.Constantes;
import com.cocorette.genesis.convert.BatimentConvert;
import com.cocorette.genesis.model.entity.BatimentEntity;
import com.cocorette.genesis.model.entity.EntrepriseEntity;
import com.cocorette.genesis.model.form.BatimentForm;
import com.cocorette.genesis.model.table.BatimentTable;
import com.cocorette.genesis.model.view.BatimentView;
import com.cocorette.genesis.service.AdresseService;
import com.cocorette.genesis.service.BatimentService;
import com.cocorette.genesis.service.EntrepriseService;
import com.cocorette.genesis.service.GpsService;
import com.cocorette.genesis.util.ConstantesUtil;
import com.cocorette.genesis.util.FileUploadUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.util.StringUtils;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;
import java.time.LocalDateTime;
import java.util.List;

@Component
public class BatimentCoord {
    @Autowired
    BatimentService batimentService;
    @Autowired
    AdresseService adresseService;
    @Autowired
    EntrepriseService entrepriseService;
    @Autowired
    GpsService gpsService;

    public void saveBatiment(BatimentForm form, MultipartFile file) throws IOException {
        String filename = StringUtils.cleanPath(file.getOriginalFilename());

        BatimentEntity entity = BatimentConvert.batimentFormToEntity(form);

        entity.setDocCharte(filename);
        entity.setActif(true);
        entity.setArchive(false);
        entity.setCreated(LocalDateTime.now());
        entity.setModified(LocalDateTime.now());
        adresseService.saveAdresse(entity.getAdresse());
        gpsService.saveGps(entity.getGps());
        EntrepriseEntity entreprise = entrepriseService.findEntreprise(form.getEntrepriseId()).orElseThrow();
        entity.setEntreprise(entreprise);
        BatimentEntity savedEntity = batimentService.saveBatiment(entity);

        String uploadDir = ConstantesUtil.getProperty(Constantes.PATH_UPLOAD_BATIMENT) + savedEntity.getId();

        FileUploadUtil.saveFile(uploadDir, filename, file);
    }

    public List<BatimentTable> findAll(){
        return batimentService.findAll();
    }

    public BatimentView findBatimentView(int id){
        return batimentService.findBatimentView(id);
    }

    public List<BatimentTable> findBatimentByEntrepriseId(int entrepriseId){
        EntrepriseEntity entreprise = entrepriseService.findEntreprise(entrepriseId).orElseThrow();
        return batimentService.findBatimentByEntreprise(entreprise);
    }
}
