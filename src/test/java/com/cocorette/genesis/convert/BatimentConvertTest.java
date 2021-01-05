package com.cocorette.genesis.convert;

import static org.junit.jupiter.api.Assertions.*;

import com.cocorette.genesis.model.BatimentTest;
import com.cocorette.genesis.model.bo.BatimentBo;
import com.cocorette.genesis.model.entity.BatimentEntity;
import com.cocorette.genesis.model.form.BatimentForm;
import com.cocorette.genesis.model.table.BatimentTable;
import com.cocorette.genesis.model.transitionnel.BatimentPo;
import com.cocorette.genesis.model.view.BatimentView;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

public class BatimentConvertTest {
    private static BatimentTest batimentTest;

    //TODO faire tests adresse, entreprise, etc.

    @BeforeAll
    public static void init(){
        batimentTest = new BatimentTest();
    }

    @Test
    void batimentEntityToBoTest(){
        BatimentEntity input = batimentTest.creerEntity();
        BatimentBo expected = batimentTest.creerBo();

        BatimentBo result = BatimentConvert.batimentEntityToBo(input);

        assertEquals(expected.getClass(),result.getClass());
        assertEquals(expected.getId(),result.getId());
        assertEquals(expected.getInuav(),result.getInuav());
        assertEquals(expected.getEau(),result.getEau());
        assertEquals(expected.getDistCentre(),result.getDistCentre());
        assertEquals(expected.getAnneeDebut(),result.getAnneeDebut());
        assertEquals(expected.getTypeBatiment(),result.getTypeBatiment());
        assertEquals(expected.getTypeArbres(),result.getTypeArbres());
        assertEquals(expected.getNbArbres(),result.getNbArbres());
        assertEquals(expected.getCommentaire(),result.getCommentaire());
        assertEquals(expected.isActif(),result.isActif());
        assertEquals(expected.isArchive(),result.isArchive());
        assertEquals(expected.getCreated(),result.getCreated());
        assertEquals(expected.getModified(),result.getModified());
    }

    @Test
    void batimentBoToEntityTest(){
        BatimentBo input = batimentTest.creerBo();
        BatimentEntity expected = batimentTest.creerEntity();

        BatimentEntity result = BatimentConvert.batimentBoToEntity(input);

        assertEquals(expected.getClass(),result.getClass());
        assertEquals(expected.getId(), result.getId());
        assertEquals(expected.getInuav(), result.getInuav());
        assertEquals(expected.getEau(), result.getEau());
        assertEquals(expected.getDistCentre(), result.getDistCentre());
        assertEquals(expected.getAnneeDebut(), result.getAnneeDebut());
        assertEquals(expected.getTypeBatiment(), result.getTypeBatiment());
        assertEquals(expected.getNbArbres(), result.getNbArbres());
        assertEquals(expected.getTypeArbres(), result.getTypeArbres());
        assertEquals(expected.getCommentaire(), result.getCommentaire());
        assertEquals(expected.isActif(), result.isActif());
        assertEquals(expected.isArchive(), result.isArchive());
        assertEquals(expected.getCreated(), result.getCreated());
        assertEquals(expected.getModified(), result.getModified());
    }

    @Test
    void batimentFormToBoTest(){
        BatimentForm input = batimentTest.creerForm();
        BatimentBo expected = batimentTest.creerBo();

        BatimentBo result = BatimentConvert.batimentFormToBo(input);

        assertEquals(expected.getClass(),result.getClass());
        assertEquals(expected.getInuav(), result.getInuav());
        assertEquals(expected.getEau(), result.getEau());
        assertEquals(expected.getDistCentre(), result.getDistCentre());
        assertEquals(expected.getAnneeDebut(), result.getAnneeDebut());
        assertEquals(expected.getTypeBatiment(), result.getTypeBatiment());
        assertEquals(expected.getNbArbres(), result.getNbArbres());
        assertEquals(expected.getTypeArbres(), result.getTypeArbres());
        assertEquals(expected.getCommentaire(), result.getCommentaire());
        assertEquals(expected.getCreated(), result.getCreated());
        assertEquals(expected.getModified(), result.getModified());
        assertEquals(expected.getAdresseBo().getRue(), result.getAdresseBo().getRue());
        assertEquals(expected.getAdresseBo().getCodePostal(), result.getAdresseBo().getCodePostal());
        assertEquals(expected.getAdresseBo().getVille(), result.getAdresseBo().getVille());
        assertEquals(expected.getAdresseBo().getPays(), result.getAdresseBo().getPays());
        assertEquals(expected.getGps().getLatitude(), result.getGps().getLatitude());
        assertEquals(expected.getGps().getLongitude(), result.getGps().getLongitude());
    }

    @Test
    void batimentBoToViewTest(){
        BatimentBo input = batimentTest.creerBo();
        BatimentView expected = batimentTest.creerView();

        BatimentView result = BatimentConvert.batimentBoToView(input);

        assertEquals(expected.getClass(),result.getClass());
        assertEquals(expected.getId(), result.getId());
        assertEquals(expected.getInuav(), result.getInuav());
        assertEquals(expected.getEau(), result.getEau());
        assertEquals(expected.getDistCentre(), result.getDistCentre());
        assertEquals(expected.getAnneeDebut(), result.getAnneeDebut());
        assertEquals(expected.getTypeBatiment(), result.getTypeBatiment());
        assertEquals(expected.getNbArbres(), result.getNbArbres());
        assertEquals(expected.getTypeArbres(), result.getTypeArbres());
        assertEquals(expected.getCommentaire(), result.getCommentaire());
        assertEquals(expected.isActif(), result.isActif());
        assertEquals(expected.isArchive(), result.isArchive());
        assertEquals(expected.getCreated(), result.getCreated());
        assertEquals(expected.getModified(), result.getModified());
    }

    @Test
    void batimentBoToTableTest(){
        BatimentBo input = batimentTest.creerBo();
        BatimentTable expected = batimentTest.creerTable();

        BatimentTable result = BatimentConvert.batimentBoToTable(input);

        assertEquals(expected.getClass(),result.getClass());
        assertEquals(expected.getId(), result.getId());
        assertEquals(expected.getInuav(), result.getInuav());
        assertEquals(expected.isActif(), result.isActif());
        assertEquals(expected.isArchive(), result.isArchive());
        assertEquals(expected.getCreated(), result.getCreated());
        assertEquals(expected.getModified(), result.getModified());
    }

    @Test
    void batimentEntityToPo(){
        BatimentEntity input = batimentTest.creerEntity();
        BatimentPo expected = batimentTest.creerPo();

        BatimentPo result = BatimentConvert.batimentEntityToPo(input);

        assertEquals(expected.getClass(),result.getClass());
        assertEquals(expected.getId(), result.getId());
        assertEquals(expected.getInuav(), result.getInuav());
    }
}
