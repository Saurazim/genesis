package com.cocorette.genesis.convert;

import static org.junit.jupiter.api.Assertions.*;

import com.cocorette.genesis.model.EleveurTest;
import com.cocorette.genesis.model.bo.EleveurBo;
import com.cocorette.genesis.model.entity.EleveurEntity;
import com.cocorette.genesis.model.form.EleveurForm;
import com.cocorette.genesis.model.table.EleveurTable;
import com.cocorette.genesis.model.transitionnel.EleveurPo;
import com.cocorette.genesis.model.view.EleveurView;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class EleveurConvertTest {
    private static EleveurTest eleveurTest;

    @BeforeAll
    public static void init(){
        eleveurTest = new EleveurTest();
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
    }

    @Test
    public void eleveurFormToBoTest(){
        EleveurForm input = eleveurTest.creerForm();
        EleveurBo expected = eleveurTest.creerBo();

        EleveurBo result = EleveurConvert.eleveurFormToBo(input);

        assertEquals(expected.getClass(), result.getClass());
        assertEquals(expected.getPrenom(), result.getPrenom());
        assertEquals(expected.getNom(), result.getNom());
        assertEquals(expected.getContactBo().getMail(), result.getContactBo().getMail());
        assertEquals(expected.getContactBo().getTelFixe(), result.getContactBo().getTelFixe());
        assertEquals(expected.getContactBo().getTelPort(), result.getContactBo().getTelPort());
        assertEquals(expected.getContactBo().getFax(), result.getContactBo().getFax());
        assertEquals(expected.getCommentaire(), result.getCommentaire());
        assertEquals(expected.getCreated(), result.getCreated());
        assertEquals(expected.getModified(), result.getModified());
    }

    @Test
    public void eleveurBoToViewTest(){
        EleveurView expected = eleveurTest.creerView();
        EleveurBo input = eleveurTest.creerBo();

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
