package com.cocorette.genesis.convert;

import com.cocorette.genesis.model.bo.ContactBo;
import com.cocorette.genesis.model.entity.ContactEntity;

public class ContactConvert {
    public static ContactEntity contactBoToEntity(ContactBo bo){
        ContactEntity entity = new ContactEntity();
        entity.setMail(bo.getMail());
        entity.setTelFixe(bo.getTelFixe());
        entity.setTelPort(bo.getTelPort());
        entity.setFax(bo.getFax());

        return entity;
    }

    public static ContactBo contactEntityToBo(ContactEntity entity){
        ContactBo bo = new ContactBo();
        bo.setId(entity.getId());
        bo.setMail(entity.getMail());
        bo.setTelFixe(entity.getTelFixe());
        bo.setTelPort(entity.getTelPort());
        bo.setFax(entity.getFax());

        return bo;
    }

}
