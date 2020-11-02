package com.cocorette.genesis.dao;

import com.cocorette.genesis.model.entity.BatimentEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface BatimentDao extends JpaRepository<BatimentEntity,Integer> {
    List<BatimentEntity> findAllByEntrepriseId(int entrepriseId);
}
