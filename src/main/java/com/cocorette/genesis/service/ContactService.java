package com.cocorette.genesis.service;

import com.cocorette.genesis.convert.ContactConvert;
import com.cocorette.genesis.dao.ContactDao;
import com.cocorette.genesis.model.bo.ContactBo;
import com.cocorette.genesis.model.entity.ContactEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ContactService {
    @Autowired
    ContactDao contactDao;

    public void saveContact(ContactBo contact){
        contactDao.save(ContactConvert.contactBoToEntity(contact));
    }



}
