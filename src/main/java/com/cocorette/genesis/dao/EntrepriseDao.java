package com.cocorette.genesis.dao;

import com.cocorette.genesis.model.entity.EleveurEntity;
import com.cocorette.genesis.model.entity.EntrepriseEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface EntrepriseDao extends JpaRepository<EntrepriseEntity,Integer> {
    List<EntrepriseEntity> findAllByEleveurId(int eleveurId);
}
