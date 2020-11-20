package com.cocorette.genesis.dao;

import com.cocorette.genesis.model.entity.CategorieEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CategorieDao extends JpaRepository<CategorieEntity, Integer> {
}
