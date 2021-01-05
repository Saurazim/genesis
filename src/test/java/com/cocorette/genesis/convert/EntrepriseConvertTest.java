package com.cocorette.genesis.convert;

import com.cocorette.genesis.model.EntrepriseTest;
import com.cocorette.genesis.model.bo.ContactBo;
import com.cocorette.genesis.model.bo.EntrepriseBo;
import com.cocorette.genesis.model.entity.ContactEntity;
import com.cocorette.genesis.model.entity.EntrepriseEntity;
import com.cocorette.genesis.model.form.EntrepriseForm;
import com.cocorette.genesis.model.table.EntrepriseTable;
import com.cocorette.genesis.model.transitionnel.EntreprisePo;
import com.cocorette.genesis.model.view.EntrepriseView;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class EntrepriseConvertTest {
    private static EntrepriseTest entrepriseTest;

    //TODO cas particuliers, cas limites

    @BeforeAll
    public static void init(){
        entrepriseTest = new EntrepriseTest();
    }

    @Test
    public void entrepriseEntityToBoTest(){
        EntrepriseEntity input = entrepriseTest.creerEntity();
        EntrepriseBo expected = entrepriseTest.creerBo();

        EntrepriseBo result = EntrepriseConvert.entrepriseEntityToBo(input);

        assertEquals(expected.getClass(), result.getClass());
        assertEquals(expected.getNom(), result.getNom());
        assertEquals(expected.getEde(), result.getEde());
        assertEquals(expected.getCommentaire(), result.getCommentaire());
        assertEquals(expected.isActif(), result.isActif());
        assertEquals(expected.isArchive(), result.isArchive());
        assertEquals(expected.getCreated(), result.getCreated());
        assertEquals(expected.getModified(), result.getModified());
    }

    @Test
    public void entityToBo_noContact(){
        EntrepriseEntity input = entrepriseTest.creerEntity();
        input.setContact(null);

        EntrepriseBo result  = EntrepriseConvert.entrepriseEntityToBo(input);

        assertNull(result.getContactBo());
    }

    @Test
    public void entreriseBoToEntityTest(){
        EntrepriseEntity expected = entrepriseTest.creerEntity();
        EntrepriseBo input = entrepriseTest.creerBo();

        EntrepriseEntity result = EntrepriseConvert.entrepriseBoToEntity(input);

        assertEquals(expected.getClass(), result.getClass());
        assertEquals(expected.getNom(), result.getNom());
        assertEquals(expected.getEde(), result.getEde());
        assertEquals(expected.getCommentaire(), result.getCommentaire());
        assertEquals(expected.isActif(), result.isActif());
        assertEquals(expected.isArchive(), result.isArchive());
        assertEquals(expected.getCreated(), result.getCreated());
        assertEquals(expected.getModified(), result.getModified());
    }

    @Test
    public void entrepriseFormToBoTest(){
        EntrepriseForm input = entrepriseTest.creerForm();
        EntrepriseBo expected = entrepriseTest.creerBo();

        EntrepriseBo result = EntrepriseConvert.entrepriseFormToBo(input);

        assertEquals(expected.getClass(), result.getClass());
        assertEquals(expected.getNom(), result.getNom());
        assertEquals(expected.getEde(), result.getEde());
        assertEquals(expected.getCommentaire(), result.getCommentaire());
        assertEquals(expected.getContactBo().getMail(), result.getContactBo().getMail());
        assertEquals(expected.getContactBo().getTelFixe(), result.getContactBo().getTelFixe());
        assertEquals(expected.getContactBo().getTelPort(), result.getContactBo().getTelPort());
        assertEquals(expected.getContactBo().getFax(), result.getContactBo().getFax());
        assertEquals(expected.getEleveurPo().getId(), result.getEleveurPo().getId());
        assertEquals(expected.getAdresseBo().getRue(), result.getAdresseBo().getRue());
        assertEquals(expected.getAdresseBo().getCodePostal(), result.getAdresseBo().getCodePostal());
        assertEquals(expected.getAdresseBo().getVille(), result.getAdresseBo().getVille());
        assertEquals(expected.getAdresseBo().getPays(), result.getAdresseBo().getPays());
    }

    @Test
    public void entrepriseBoToTableTest(){
        EntrepriseTable expected = entrepriseTest.creerTable();
        EntrepriseBo input = entrepriseTest.creerBo();

        EntrepriseTable result = EntrepriseConvert.entrepriseBoToTable(input);

        assertEquals(expected.getClass(), result.getClass());
        assertEquals(expected.getId(), result.getId());
        assertEquals(expected.getNom(), result.getNom());
        assertEquals(expected.getEde(), result.getEde());
        assertEquals(expected.isActif(), result.isActif());
        assertEquals(expected.isArchive(), result.isArchive());
        assertEquals(expected.getCreated(), result.getCreated());
        assertEquals(expected.getModified(), result.getModified());
        assertEquals(expected.getMail(), result.getMail());
        assertEquals(expected.getTelFixe(), result.getTelFixe());
        assertEquals(expected.getTelPort(), result.getTelPort());
        assertEquals(expected.getFax(), result.getFax());
        assertEquals(expected.getCentre(), result.getCentre());
        assertEquals(expected.getEleveurNom(), result.getEleveurNom());
        assertEquals(expected.getVeterinaire(), result.getVeterinaire());
    }

    @Test
    public void entrepriseBoToViewTest(){
        EntrepriseView expected = entrepriseTest.creerView();
        EntrepriseBo input = entrepriseTest.creerBo();

        EntrepriseView result = EntrepriseConvert.entrepriseBoToView(input);

        assertEquals(expected.getClass(), result.getClass());
        assertEquals(expected.getId(), result.getId());
        assertEquals(expected.getNom(), result.getNom());
        assertEquals(expected.getEde(), result.getEde());
        assertEquals(expected.isActif(), result.isActif());
        assertEquals(expected.isArchive(), result.isArchive());
        assertEquals(expected.getCreated(), result.getCreated());
        assertEquals(expected.getModified(), result.getModified());
        assertEquals(expected.getMail(), result.getMail());
        assertEquals(expected.getTelFixe(), result.getTelFixe());
        assertEquals(expected.getTelPort(), result.getTelPort());
        assertEquals(expected.getFax(), result.getFax());
        assertEquals(expected.getCentre(), result.getCentre());
        assertEquals(expected.getCentreId(), result.getCentreId());
        assertEquals(expected.getVeterinaire(), result.getVeterinaire());
        assertEquals(expected.getVeterinaireId(), result.getVeterinaireId());
        assertEquals(expected.getCommentaire(), result.getCommentaire());
    }

    @Test
    public void entrepriseEntityToPoTest(){
        EntrepriseEntity input = entrepriseTest.creerEntity();
        EntreprisePo expected = entrepriseTest.creerPo();

        EntreprisePo result = EntrepriseConvert.entrepriseEntityToPo(input);

        assertEquals(expected.getClass(), result.getClass());
        assertEquals(expected.getId(), result.getId());
        assertEquals(expected.getNom(), result.getNom());
        assertEquals(expected.getEde(), result.getEde());
    }
}
