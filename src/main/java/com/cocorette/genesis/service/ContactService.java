package com.cocorette.genesis.service;

import com.cocorette.genesis.convert.ContactConvert;
import com.cocorette.genesis.dao.ContactDao;
import com.cocorette.genesis.model.bo.ContactBo;
import com.cocorette.genesis.model.entity.ContactEntity;
import com.cocorette.genesis.model.form.EntrepriseForm;
import com.cocorette.genesis.model.modif.EleveurModif;
import com.cocorette.genesis.model.modif.EntrepriseModif;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Optional;

@Service
public class ContactService {
    @Autowired
    ContactDao contactDao;

    public void saveContact(ContactEntity contact){
        contactDao.save(contact);
    }

    public ContactBo getContactBo(EntrepriseForm form){
        ContactBo contactBo = new ContactBo();
        contactBo.setMail(form.getMail());
        contactBo.setTelFixe(form.getTelFixe());
        contactBo.setTelPort(form.getTelPort());
        contactBo.setFax(form.getFax());

        return contactBo;
    }

    public ContactBo getContactBo(EntrepriseModif modif){
        ContactBo contactBo = new ContactBo();
        contactBo.setMail(modif.getMail());
        contactBo.setTelFixe(modif.getTelFixe());
        contactBo.setTelPort(modif.getTelPort());
        contactBo.setFax(modif.getFax());

        return contactBo;
    }

    public ContactEntity getContactEntity(EleveurModif modif){
        ContactBo contactBo = new ContactBo();
        contactBo.setMail(modif.getMail());
        contactBo.setTelFixe(modif.getTelFixe());
        contactBo.setTelPort(modif.getTelPort());
        contactBo.setFax(modif.getFax());

        return ContactConvert.contactBoToEntity(contactBo);
    }


    public Optional<ContactEntity> findByIdEntity(int id){
        return contactDao.findById(id);
    }

    public ContactBo findByIdBo(int id){
        Optional<ContactEntity> entity = contactDao.findById(id);

        return ContactConvert.contactEntityToBo(entity.orElseThrow());
    }

    public List<String> checkDiff(ContactEntity ce1, ContactEntity ce2){
        List<String> listDiff = new ArrayList<>();

        if (!ce1.getMail().contentEquals(ce2.getMail()))
            listDiff.add("mail");

        if (!ce1.getTelFixe().contentEquals(ce2.getTelFixe()))
            listDiff.add("tel_fixe");

        if (!ce1.getTelPort().contentEquals(ce2.getTelPort()))
            listDiff.add("tel_port");

        if (!ce1.getFax().contentEquals(ce2.getFax()))
            listDiff.add("fax");

        return listDiff;
    }

}
