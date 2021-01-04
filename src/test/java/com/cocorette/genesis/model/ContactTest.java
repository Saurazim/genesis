package com.cocorette.genesis.model;

import com.cocorette.genesis.model.bo.ContactBo;
import com.cocorette.genesis.model.entity.ContactEntity;

public class ContactTest {
    private final static int ID = 456;
    private final static String MAIL = "azer@zaer.fr";
    private final static String FIXE = "0299999999";
    private final static String PORT = "0399999999";
    private final static String FAX = "0199999999";

    public ContactEntity creerEntity(){
        ContactEntity entity = new ContactEntity();

        entity.setId(ID);
        entity.setMail(MAIL);
        entity.setTelFixe(FIXE);
        entity.setTelPort(PORT);
        entity.setFax(FAX);

        return entity;
    }

    public ContactBo creerBo(){
        ContactBo bo = new ContactBo();

        bo.setId(ID);
        bo.setMail(MAIL);
        bo.setTelFixe(FIXE);
        bo.setTelPort(PORT);
        bo.setFax(FAX);

        return bo;
    }
}
