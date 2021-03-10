package com.cocorette.genesis.service;

import com.cocorette.genesis.convert.ContactConvert;
import com.cocorette.genesis.dao.ContactDao;
import com.cocorette.genesis.model.bo.ContactBo;
import com.cocorette.genesis.model.entity.ContactEntity;
import com.cocorette.genesis.model.form.EntrepriseForm;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ContactService {
    @Autowired
    ContactDao contactDao;

    public void saveContact(ContactEntity contact){
        contactDao.save(contact);
    }

    public ContactBo getContactFromEntreprise(EntrepriseForm form){
        ContactBo contactBo = new ContactBo();
        contactBo.setMail(form.getMail());
        contactBo.setTelFixe(form.getTelFixe());
        contactBo.setTelPort(form.getTelPort());
        contactBo.setFax(form.getFax());

        return contactBo;
    }

}
