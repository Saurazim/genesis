package com.cocorette.genesis.service;

import com.cocorette.genesis.dao.AdresseDao;
import com.cocorette.genesis.model.AdresseEntity;
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
}
