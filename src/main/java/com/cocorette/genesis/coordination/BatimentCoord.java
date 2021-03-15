package com.cocorette.genesis.coordination;

import com.cocorette.genesis.configuration.Constantes;
import com.cocorette.genesis.convert.BatimentConvert;
import com.cocorette.genesis.model.bo.AdresseBo;
import com.cocorette.genesis.model.bo.BatimentBo;
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
import java.util.HashMap;
import java.util.List;
import java.util.Map;

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

    private String cpRegex = ConstantesUtil.getProperty(Constantes.REGEX_CP);

    /**
     * @deprecated
     * sauvegarde le batiment et un document (charte sanitaire)
     * @param form
     * @param file
     * @throws IOException
     */
    @Deprecated
    public void saveBatiment(BatimentForm form, MultipartFile file) throws IOException {
        String filename = StringUtils.cleanPath(file.getOriginalFilename());

        BatimentEntity entity = BatimentConvert.batimentFormToEntity(form);

        //entity.setDocCharte(filename);
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

    public void saveBatiment(BatimentForm form){
        BatimentBo bo = BatimentConvert.batimentFormToBo(form);
        AdresseBo adresse = adresseService.getAdresseBo(form);
        bo.setAdresseBo(adresse);
        BatimentEntity entity = BatimentConvert.batimentBoToEntity(bo);
        entity.setActif(true);
        entity.setArchive(false);
        entity.setCreated(LocalDateTime.now());
        entity.setModified(LocalDateTime.now());
        adresseService.saveAdresse(entity.getAdresse());
        gpsService.saveGps(entity.getGps());
        EntrepriseEntity entreprise = entrepriseService.findEntreprise(form.getEntrepriseId()).orElseThrow();
        entity.setEntreprise(entreprise);
        batimentService.saveBatiment(entity);
    }

    public Map<String, String> validBatiment(BatimentForm form){
        Map<String, String> error = new HashMap<>();

        if (form.getCodeInterne().isBlank())
            error.put("codeInterne","Le code interne est obligatoire");

        if (form.getEau().isBlank())
            error.put("eau","Le type d'arrivée d'eau est obligatoire");

        //verifs adresse
        if (form.getRue().isBlank()||form.getCodePostal().isBlank()
                ||form.getVille().isBlank()||form.getPays().isBlank()){
            error.put("adresse", "adresse invalide");
        }else {
            if (!form.getCodePostal().matches(cpRegex))
                error.put("codepostal","Code postal invalide");
        }

        return error;
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
