package com.cocorette.genesis.convert;

import static org.junit.jupiter.api.Assertions.*;

import com.cocorette.genesis.model.ContactTest;
import com.cocorette.genesis.model.EleveurTest;
import com.cocorette.genesis.model.bo.ContactBo;
import com.cocorette.genesis.model.bo.EleveurBo;
import com.cocorette.genesis.model.entity.ContactEntity;
import com.cocorette.genesis.model.entity.EleveurEntity;
import com.cocorette.genesis.model.form.EleveurForm;
import com.cocorette.genesis.model.table.EleveurTable;
import com.cocorette.genesis.model.transitionnel.EleveurPo;
import com.cocorette.genesis.model.view.EleveurView;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import org.reactivestreams.Publisher;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)
public class EleveurConvertTest {
    @Mock
    ContactConvert contactConvert;

    private static EleveurTest eleveurTest;
    private static ContactTest contactTest;

    @BeforeAll
    public static void init(){
        eleveurTest = new EleveurTest();
        contactTest = new ContactTest();
    }

    @Test
    public void eleveurEntityToBoTest(){
        EleveurEntity input = eleveurTest.creerEntity();

        EleveurBo expected = eleveurTest.creerBo();

        EleveurBo result = EleveurConvert.eleveurEntityToBo(input);

        assertEquals(expected.getClass(), result.getClass());
        assertEquals(expected.getId(), result.getId());
        assertEquals(expected.getPrenom(), result.getPrenom());
        assertEquals(expected.getNom(), result.getNom());
        assertEquals(expected.getCommentaire(), result.getCommentaire());
        assertEquals(expected.isActif(), result.isActif());
        assertEquals(expected.isArchive(), result.isArchive());
        assertEquals(expected.getCreated(), result.getCreated());
        assertEquals(expected.getModified(), result.getModified());
    }

    @Test
    public void entityToBo_contact(){
        ContactEntity contactEntity = contactTest.creerEntity();
        ContactBo contactBo = contactTest.creerBo();

        EleveurEntity input = eleveurTest.creerEntity();
        input.setContact(contactEntity);

        when(contactConvert.contactEntityToBo(input.getContact())).thenReturn(contactBo);

        EleveurBo result = EleveurConvert.eleveurEntityToBo(input);

        verify(contactConvert).contactEntityToBo(input.getContact());
    }

    @Test
    public void eleveurBoToEntityTest(){
        EleveurEntity expected = eleveurTest.creerEntity();
        EleveurBo input = eleveurTest.creerBo();

        EleveurEntity result = EleveurConvert.eleveurBoToEntity(input);

        assertEquals(expected.getClass(), result.getClass());
        assertEquals(expected.getId(), result.getId());
        assertEquals(expected.getPrenom(), result.getPrenom());
        assertEquals(expected.getNom(), result.getNom());
        assertEquals(expected.getCommentaire(), result.getCommentaire());
        assertEquals(expected.isActif(), result.isActif());
        assertEquals(expected.isArchive(), result.isArchive());
        assertEquals(expected.getCreated(), result.getCreated());
        assertEquals(expected.getModified(), result.getModified());
        assertNull(result.getContact());
    }

    @Test
    public void boToEntity_contact(){
        ContactEntity contactEntity = contactTest.creerEntity();
        ContactBo contactBo = contactTest.creerBo();

        EleveurBo input = eleveurTest.creerBo();
        input.setContactBo(contactBo);

        when(contactConvert.contactBoToEntity(input.getContactBo())).thenReturn(contactEntity);

        EleveurEntity result = EleveurConvert.eleveurBoToEntity(input);

        verify(contactConvert).contactBoToEntity(input.getContactBo());
    }

    @Test
    public void eleveurFormToBoTest(){
        ContactBo contactBo = contactTest.creerBo();
        EleveurForm input = eleveurTest.creerForm();
        EleveurBo expected = eleveurTest.creerBo();

        EleveurBo result = EleveurConvert.eleveurFormToBo(input);

        assertEquals(expected.getClass(), result.getClass());
        assertEquals(expected.getPrenom(), result.getPrenom());
        assertEquals(expected.getNom(), result.getNom());
        assertEquals(contactBo.getMail(), result.getContactBo().getMail());
        assertEquals(contactBo.getTelFixe(), result.getContactBo().getTelFixe());
        assertEquals(contactBo.getTelPort(), result.getContactBo().getTelPort());
        assertEquals(contactBo.getFax(), result.getContactBo().getFax());
        assertEquals(expected.getCommentaire(), result.getCommentaire());
        assertEquals(expected.getCreated(), result.getCreated());
        assertEquals(expected.getModified(), result.getModified());
    }

    @Test
    public void eleveurBoToViewTest(){
        ContactBo contactBo = contactTest.creerBo();
        EleveurView expected = eleveurTest.creerView();
        EleveurBo input = eleveurTest.creerBo();
        input.setContactBo(contactBo);

        EleveurView result = EleveurConvert.eleveurBoToView(input);

        assertEquals(expected.getClass(), result.getClass());
        assertEquals(expected.getId(), result.getId());
        assertEquals(expected.getPrenom(), result.getPrenom());
        assertEquals(expected.getNom(), result.getNom());
        assertEquals(expected.getMail(), result.getMail());
        assertEquals(expected.getTelFixe(), result.getTelFixe());
        assertEquals(expected.getTelPort(), result.getTelPort());
        assertEquals(expected.getFax(), result.getFax());
        assertEquals(expected.getCommentaire(), result.getCommentaire());
        assertEquals(expected.isActif(), result.isActif());
        assertEquals(expected.isArchive(), result.isArchive());
        assertEquals(expected.getCreated(), result.getCreated());
        assertEquals(expected.getModified(), result.getModified());
    }

    @Test
    public void eleveurBoToTableTest(){
        EleveurTable expected = eleveurTest.creerTable();
        EleveurBo input = eleveurTest.creerBo();

        EleveurTable result =  EleveurConvert.eleveurBoToTable(input);

        assertEquals(expected.getClass(), result.getClass());
        assertEquals(expected.getId(), result.getId());
        assertEquals(expected.getPrenom(), result.getPrenom());
        assertEquals(expected.getNom(), result.getNom());
        assertEquals(expected.getMail(), result.getMail());
        assertEquals(expected.getTelFixe(), result.getTelFixe());
        assertEquals(expected.getTelPort(), result.getTelPort());
        assertEquals(expected.getFax(), result.getFax());
        assertEquals(expected.isActif(), result.isActif());
        assertEquals(expected.isArchive(), result.isArchive());
        assertEquals(expected.getCreated(), result.getCreated());
        assertEquals(expected.getModified(), result.getModified());
    }

    @Test
    public void eleveurEntityToPoTest(){
        EleveurPo expected = eleveurTest.creerPo();
        EleveurEntity input = eleveurTest.creerEntity();

        EleveurPo result = EleveurConvert.eleveurEntityToPo(input);

        assertEquals(expected.getClass(), result.getClass());
        assertEquals(expected.getId(), result.getId());
        assertEquals(expected.getPrenom(), result.getPrenom());
        assertEquals(expected.getNom(), result.getNom());
    }
}
