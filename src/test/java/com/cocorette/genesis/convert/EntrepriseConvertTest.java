package com.cocorette.genesis.convert;

import com.cocorette.genesis.model.*;
import com.cocorette.genesis.model.bo.*;
import com.cocorette.genesis.model.entity.*;
import com.cocorette.genesis.model.form.EntrepriseForm;
import com.cocorette.genesis.model.table.EntrepriseTable;
import com.cocorette.genesis.model.transitionnel.EleveurPo;
import com.cocorette.genesis.model.transitionnel.EntreprisePo;
import com.cocorette.genesis.model.view.EntrepriseView;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import org.reactivestreams.Publisher;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.verify;
import static reactor.core.publisher.Mono.when;

@ExtendWith(MockitoExtension.class)
public class EntrepriseConvertTest {
    @Mock
    AdresseConvert adresseConvert;
    @Mock
    ContactConvert contactConvert;
    @Mock
    CentreConvert centreConvert;
    @Mock
    VeterinaireConvert veterinaireConvert;

    private static EntrepriseTest entrepriseTest;
    private static EleveurTest eleveurTest;
    private static AdresseTest adresseTest;
    private static ContactTest contactTest;
    private static CentreTest centreTest;
    private static VeterinaireTest veterinaireTest;

    //TODO cas particuliers, cas limites

    @BeforeAll
    public static void init(){
        entrepriseTest = new EntrepriseTest();
        eleveurTest = new EleveurTest();
        adresseTest = new AdresseTest();
        contactTest = new ContactTest();
        centreTest = new CentreTest();
        veterinaireTest = new VeterinaireTest();
    }

    /**
     * @Test sur conversion
     * objet à convertir = entrepriseEntity
     */
    @Test
    public void entityToBo(){
        EntrepriseEntity input = entrepriseTest.creerEntity();
        EntrepriseBo expected = entrepriseTest.creerBo();

        EntrepriseBo result  = EntrepriseConvert.entrepriseEntityToBo(input);

        assertEquals(expected.getClass(), result.getClass());
        assertEquals(expected.getNom(), result.getNom());
        assertEquals(expected.getEde(), result.getEde());
        assertEquals(expected.getCommentaire(), result.getCommentaire());
        assertEquals(expected.isActif(), result.isActif());
        assertEquals(expected.isArchive(), result.isArchive());
        assertEquals(expected.getCreated(), result.getCreated());
        assertEquals(expected.getModified(), result.getModified());
        assertNull(result.getContactBo());
        assertNull(result.getAdresseBo());
        assertNull(result.getCentreBo());
    }

    /**
     * @Test sur conversion
     * objet à convertir = entrepriseEntity
     * adresse
     */
    @Test
    public void entityToBo_adresse(){
        AdresseEntity adresseEntity = adresseTest.creerEntity();
        AdresseBo adresseBo = adresseTest.creerBo();

        EntrepriseEntity input = entrepriseTest.creerEntity();
        input.setAdresse(adresseEntity);

        EntrepriseBo result = EntrepriseConvert.entrepriseEntityToBo(input);


        verify(adresseConvert).adresseEntityToBo(input.getAdresse());
    }

    /**
     * @Test sur conversion
     * objet à convertir = entrepriseEntity
     * centre
     */
    @Test
    public void entityToBo_centre(){
        CentreEntity centreEntity = centreTest.creerEntity();
        CentreBo centreBo = centreTest.creerBo();

        EntrepriseEntity input = entrepriseTest.creerEntity();
        input.setCentre(centreEntity);

        when((Iterable<? extends Publisher<?>>) centreConvert.centreEntityToBo(input.getCentre())).thenReturn(centreBo);

        EntrepriseBo result = EntrepriseConvert.entrepriseEntityToBo(input);


        verify(adresseConvert).adresseEntityToBo(input.getAdresse());
    }

    /**
     * @Test sur conversion
     * objet à convertir = entrepriseEntity
     * contact
     */
    @Test
    public void entityToBo_contact(){
        ContactEntity contactEntity = contactTest.creerEntity();
        ContactBo contactBo = contactTest.creerBo();

        EntrepriseEntity input = entrepriseTest.creerEntity();
        input.setContact(contactEntity);

        when((Iterable<? extends Publisher<?>>) contactConvert.contactEntityToBo(input.getContact())).thenReturn(contactBo);

        EntrepriseBo result = EntrepriseConvert.entrepriseEntityToBo(input);

        verify(contactConvert).contactEntityToBo(input.getContact());
    }

    /**
     * @Test sur conversion
     * objet à convertir = entrepriseEntity
     * contact
     */
    @Test
    public void entityToBo_veto(){
        VeterinaireEntity veterinaireEntity = veterinaireTest.creerEntity();
        VeterinaireBo veterinaireBo = veterinaireTest.creerBo();

        EntrepriseEntity input = entrepriseTest.creerEntity();
        input.setVeterinaire(veterinaireEntity);

        when((Iterable<? extends Publisher<?>>) veterinaireConvert.veterinaireEntityToBo(input.getVeterinaire())).thenReturn(veterinaireBo);

        EntrepriseBo result = EntrepriseConvert.entrepriseEntityToBo(input);

        verify(veterinaireConvert).veterinaireEntityToBo(input.getVeterinaire());
    }

    /**
     * @Test sur conversion
     * objet à convertir = entrepriseBo
     */
    @Test
    public void boToEntity(){
        EntrepriseBo input = entrepriseTest.creerBo();
        EntrepriseEntity expected = entrepriseTest.creerEntity();

        EntrepriseEntity result = EntrepriseConvert.entrepriseBoToEntity(input);

        assertEquals(expected.getClass(), result.getClass());
        assertEquals(expected.getNom(), result.getNom());
        assertEquals(expected.getEde(), result.getEde());
        assertEquals(expected.getCommentaire(), result.getCommentaire());
        assertEquals(expected.isActif(), result.isActif());
        assertEquals(expected.isArchive(), result.isArchive());
        assertEquals(expected.getCreated(), result.getCreated());
        assertEquals(expected.getModified(), result.getModified());
        assertNull(result.getAdresse());
        assertNull(result.getContact());
        assertNull(result.getCentre());
    }

    /**
     * @Test sur conversion
     * objet à convertir = entrepriseBo
     * adresse
     */
    @Test
    public void boToEntity_adresse(){
        AdresseEntity adresseEntity = adresseTest.creerEntity();
        AdresseBo adresseBo = adresseTest.creerBo();

        EntrepriseBo input = entrepriseTest.creerBo();
        input.setAdresseBo(adresseBo);

        when((Iterable<? extends Publisher<?>>) adresseConvert.adresseBoToEntity(input.getAdresseBo())).thenReturn(adresseEntity);

        EntrepriseEntity result = EntrepriseConvert.entrepriseBoToEntity(input);

        verify(adresseConvert).adresseBoToEntity(input.getAdresseBo());
    }

    /**
     * @Test sur conversion
     * objet à convertir = entrepriseBo
     * centre
     */
    @Test
    public void boToEntity_centre(){
        CentreEntity centreEntity = centreTest.creerEntity();
        CentreBo centreBo = centreTest.creerBo();

        EntrepriseBo input = entrepriseTest.creerBo();
        input.setCentreBo(centreBo);

        when((Iterable<? extends Publisher<?>>) centreConvert.centreBoToEntity(input.getCentreBo())).thenReturn(centreEntity);

        EntrepriseEntity result = EntrepriseConvert.entrepriseBoToEntity(input);

        verify(centreConvert).centreBoToEntity(input.getCentreBo());
    }

    /**
     * @Test sur conversion
     * objet à convertir = entrepriseBo
     * contact
     */
    @Test
    public void boToEntity_contact(){
        ContactEntity contactEntity = contactTest.creerEntity();
        ContactBo contactBo = contactTest.creerBo();

        EntrepriseBo input = entrepriseTest.creerBo();
        input.setContactBo(contactBo);

        when((Iterable<? extends Publisher<?>>) contactConvert.contactBoToEntity(input.getContactBo())).thenReturn(contactEntity);

        EntrepriseEntity result = EntrepriseConvert.entrepriseBoToEntity(input);

        verify(contactConvert).contactBoToEntity(input.getContactBo());
    }

    @Test
    public void entrepriseFormToBoTest(){
        EleveurPo eleveurPo = eleveurTest.creerPo();
        AdresseBo adresseBo = adresseTest.creerBo();
        ContactBo contactBo = contactTest.creerBo();
        EntrepriseForm input = entrepriseTest.creerForm();
        EntrepriseBo expected = entrepriseTest.creerBo();

        EntrepriseBo result = EntrepriseConvert.entrepriseFormToBo(input);

        assertEquals(expected.getClass(), result.getClass());
        assertEquals(expected.getNom(), result.getNom());
        assertEquals(expected.getEde(), result.getEde());
        assertEquals(expected.getCommentaire(), result.getCommentaire());
        assertEquals(contactBo.getMail(), result.getContactBo().getMail());
        assertEquals(contactBo.getTelFixe(), result.getContactBo().getTelFixe());
        assertEquals(contactBo.getTelPort(), result.getContactBo().getTelPort());
        assertEquals(contactBo.getFax(), result.getContactBo().getFax());
        assertEquals(eleveurPo.getId(), result.getEleveurPo().getId());
        assertEquals(adresseBo.getRue(), result.getAdresseBo().getRue());
        assertEquals(adresseBo.getCodePostal(), result.getAdresseBo().getCodePostal());
        assertEquals(adresseBo.getVille(), result.getAdresseBo().getVille());
        assertEquals(adresseBo.getPays(), result.getAdresseBo().getPays());
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
