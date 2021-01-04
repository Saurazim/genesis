package com.cocorette.genesis.convert;

import com.cocorette.genesis.model.ContactTest;
import com.cocorette.genesis.model.bo.ContactBo;
import com.cocorette.genesis.model.entity.ContactEntity;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class ContactConvertTest {
    private static ContactTest contactTest;

    @BeforeAll
    public static void init(){
        contactTest = new ContactTest();
    }

    @Test
    public void contactEntityToBo(){
        ContactEntity input = contactTest.creerEntity();
        ContactBo expected = contactTest.creerBo();

        ContactBo result = ContactConvert.contactEntityToBo(input);

        assertEquals(expected.getClass(), result.getClass());
        assertEquals(expected.getId(), result.getId());
        assertEquals(expected.getMail(), result.getMail());
        assertEquals(expected.getTelFixe(), result.getTelFixe());
        assertEquals(expected.getTelPort(), result.getTelPort());
        assertEquals(expected.getFax(), result.getFax());
    }

    @Test
    public void contactBoToEntity(){
        ContactEntity expected = contactTest.creerEntity();
        ContactBo input = contactTest.creerBo();

        ContactEntity result = ContactConvert.contactBoToEntity(input);

        assertEquals(expected.getClass(), result.getClass());
        assertEquals(expected.getId(), result.getId());
        assertEquals(expected.getMail(), result.getMail());
        assertEquals(expected.getTelFixe(), result.getTelFixe());
        assertEquals(expected.getTelPort(), result.getTelPort());
        assertEquals(expected.getFax(), result.getFax());
    }
}
