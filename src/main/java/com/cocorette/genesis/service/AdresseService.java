package com.cocorette.genesis.service;

import com.cocorette.genesis.convert.AdresseConvert;
import com.cocorette.genesis.dao.AdresseDao;
import com.cocorette.genesis.model.bo.AdresseBo;
import com.cocorette.genesis.model.entity.AdresseEntity;
import com.cocorette.genesis.model.form.BatimentForm;
import com.cocorette.genesis.model.form.EntrepriseForm;
import com.cocorette.genesis.model.modif.EntrepriseModif;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class AdresseService {
    @Autowired
    AdresseDao adresseDao;

    public Optional<AdresseEntity> findOne(int id){
        return adresseDao.findById(id);
    }

    public void saveAdresse(AdresseEntity entity){
        adresseDao.save(entity);
    }

    public AdresseBo getAdresseBo(EntrepriseForm entreprise){
        AdresseBo adresse = new AdresseBo();
        adresse.setRue(entreprise.getRue());
        adresse.setCodePostal(entreprise.getCodePostal());
        adresse.setVille(entreprise.getVille());
        adresse.setPays(entreprise.getPays());

        return adresse;
    }

    public AdresseBo getAdresseBo(BatimentForm batiment){
        AdresseBo adresse = new AdresseBo();
        adresse.setRue(batiment.getRue());
        adresse.setCodePostal(batiment.getCodePostal());
        adresse.setVille(batiment.getVille());
        adresse.setPays(batiment.getPays());

        return adresse;
    }

    public AdresseBo getAdresseBo(EntrepriseModif entreprise){
        AdresseBo adresse = new AdresseBo();
        adresse.setRue(entreprise.getRue());
        adresse.setCodePostal(entreprise.getCodePostal());
        adresse.setVille(entreprise.getVille());
        adresse.setPays(entreprise.getPays());

        return adresse;
    }
}
