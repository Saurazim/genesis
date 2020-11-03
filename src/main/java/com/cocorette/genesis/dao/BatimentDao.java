package com.cocorette.genesis.dao;

import com.cocorette.genesis.model.entity.BatimentEntity;
import com.cocorette.genesis.model.entity.EntrepriseEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface BatimentDao extends JpaRepository<BatimentEntity,Integer> {
    List<BatimentEntity> findAllByEntreprise(EntrepriseEntity entreprise);
}
