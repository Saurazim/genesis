package com.cocorette.genesis.model;

import com.cocorette.genesis.configuration.ConstantesForTest;
import com.cocorette.genesis.model.bo.ContactBo;
import com.cocorette.genesis.model.entity.ContactEntity;

public class ContactTest {
    private final static int ID = ConstantesForTest.ID;
    private final static String MAIL = ConstantesForTest.MAIL;
    private final static String FIXE = ConstantesForTest.FIXE;
    private final static String PORT = ConstantesForTest.PORT;
    private final static String FAX = ConstantesForTest.FAX;

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
