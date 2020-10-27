package com.cocorette.genesis.dao;

import com.cocorette.genesis.model.entity.GpsEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface GpsDao extends JpaRepository<GpsEntity, Integer> {
}
