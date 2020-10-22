package com.cocorette.genesis.dao;

import com.cocorette.genesis.model.entity.EntrepriseEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EntrepriseDao extends JpaRepository<EntrepriseEntity,Integer> {
}
