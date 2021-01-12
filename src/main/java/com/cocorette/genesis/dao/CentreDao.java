package com.cocorette.genesis.dao;

import com.cocorette.genesis.model.entity.CentreEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CentreDao extends JpaRepository<CentreEntity, Integer> {
}
