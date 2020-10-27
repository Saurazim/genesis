package com.cocorette.genesis.service;

import com.cocorette.genesis.dao.LotDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class LotService {
    @Autowired
    LotDao lotDao;
}
