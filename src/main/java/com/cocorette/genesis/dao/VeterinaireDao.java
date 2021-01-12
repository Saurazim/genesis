package com.cocorette.genesis.dao;

import com.cocorette.genesis.model.entity.VeterinaireEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface VeterinaireDao extends JpaRepository<VeterinaireEntity, Integer> {
}
