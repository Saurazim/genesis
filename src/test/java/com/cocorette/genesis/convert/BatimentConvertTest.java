package com.cocorette.genesis.convert;

import static org.junit.jupiter.api.Assertions.*;

import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import com.cocorette.genesis.model.AdresseTest;
import com.cocorette.genesis.model.BatimentTest;
import com.cocorette.genesis.model.EntrepriseTest;
import com.cocorette.genesis.model.GpsTest;
import com.cocorette.genesis.model.bo.AdresseBo;
import com.cocorette.genesis.model.bo.BatimentBo;
import com.cocorette.genesis.model.bo.GpsBo;
import com.cocorette.genesis.model.entity.AdresseEntity;
import com.cocorette.genesis.model.entity.BatimentEntity;
import com.cocorette.genesis.model.entity.EntrepriseEntity;
import com.cocorette.genesis.model.entity.GpsEntity;
import com.cocorette.genesis.model.form.BatimentForm;
import com.cocorette.genesis.model.table.BatimentTable;
import com.cocorette.genesis.model.transitionnel.BatimentPo;
import com.cocorette.genesis.model.transitionnel.EntreprisePo;
import com.cocorette.genesis.model.view.BatimentView;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

@ExtendWith(MockitoExtension.class)
public class BatimentConvertTest {

    @Mock
    AdresseConvert adresseConvert;
    @Mock
    EntrepriseConvert entrepriseConvert;
    @Mock
    GpsConvert gpsConvert;

    private static BatimentTest batimentTest;
    private static AdresseTest adresseTest;
    private static EntrepriseTest entrepriseTest;
    private static GpsTest gpsTest;

    //TODO faire tests adresse, entreprise, etc.

    @BeforeAll
    public static void init(){
        batimentTest = new BatimentTest();
        adresseTest = new AdresseTest();
        entrepriseTest = new EntrepriseTest();
        gpsTest = new GpsTest();
    }

    @Test
    void batimentEntityToBoTest(){
        AdresseEntity adresseEntity = adresseTest.creerEntity();
        AdresseBo adresseBo = adresseTest.creerBo();

        GpsEntity gpsEntity = gpsTest.creerEntity();
        GpsBo gpsBo = gpsTest.creerBo();

        EntrepriseEntity entrepriseEntity = entrepriseTest.creerEntity();
        EntreprisePo entreprisePo = entrepriseTest.creerPo();

        BatimentEntity input = batimentTest.creerEntity();
        input.setAdresse(adresseEntity);
        input.setGps(gpsEntity);
        input.setEntreprise(entrepriseEntity);
        BatimentBo expected = batimentTest.creerBo();


        when(adresseConvert.adresseEntityToBo(input.getAdresse())).thenReturn(adresseBo);
        when(entrepriseConvert.entrepriseEntityToPo(input.getEntreprise())).thenReturn(entreprisePo);
        when(gpsConvert.gpsEntityToBo(input.getGps())).thenReturn(gpsBo);

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
        verify(adresseConvert).adresseEntityToBo(input.getAdresse());
        verify(entrepriseConvert).entrepriseEntityToPo(input.getEntreprise());
        //assertEquals(adresseBo, result.getAdresseBo()); //TODO verifier marche à suivre
    }

    @Test
    void batimentBoToEntityTest(){
        AdresseEntity adresseEntity = adresseTest.creerEntity();
        AdresseBo adresseBo = adresseTest.creerBo();

        GpsEntity gpsEntity = gpsTest.creerEntity();
        GpsBo gpsBo = gpsTest.creerBo();

        EntrepriseEntity entrepriseEntity = entrepriseTest.creerEntity();
        EntreprisePo entreprisePo = entrepriseTest.creerPo();

        BatimentBo input = batimentTest.creerBo();
        input.setAdresseBo(adresseBo);
        input.setGps(gpsBo);
        input.setEntreprisePo(entreprisePo);
        BatimentEntity expected = batimentTest.creerEntity();

        when(adresseConvert.adresseBoToEntity(input.getAdresseBo())).thenReturn(adresseEntity);
        when(entrepriseConvert.entreprisePoToEntity(input.getEntreprisePo())).thenReturn(entrepriseEntity);
        when(gpsConvert.gpsBoToEntity(input.getGps())).thenReturn(gpsEntity);

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
        verify(adresseConvert).adresseBoToEntity(input.getAdresseBo());
        verify(entrepriseConvert).entreprisePoToEntity(input.getEntreprisePo());
        verify(gpsConvert).gpsBoToEntity(input.getGps());
    }

    @Test
    void batimentFormToBoTest(){
        AdresseBo adresseBo = adresseTest.creerBo();
        GpsBo gpsBo = gpsTest.creerBo();
        EntreprisePo entreprisePo = entrepriseTest.creerPo();
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
        assertEquals(adresseBo.getRue(), result.getAdresseBo().getRue());
        assertEquals(adresseBo.getCodePostal(), result.getAdresseBo().getCodePostal());
        assertEquals(adresseBo.getVille(), result.getAdresseBo().getVille());
        assertEquals(adresseBo.getPays(), result.getAdresseBo().getPays());
        assertEquals(entreprisePo.getId(), result.getEntreprisePo().getId());
        assertEquals(gpsBo.getLatitude(), result.getGps().getLatitude());
        assertEquals(gpsBo.getLongitude(), result.getGps().getLongitude());

    }

    @Test
    void batimentBoToViewTest(){
        AdresseBo adresseBo = adresseTest.creerBo();
        GpsBo gpsBo = gpsTest.creerBo();
        EntreprisePo entreprisePo = entrepriseTest.creerPo();
        BatimentBo input = batimentTest.creerBo();
        input.setAdresseBo(adresseBo);
        input.setGps(gpsBo);
        input.setEntreprisePo(entreprisePo);
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
        assertEquals(expected.getEntrepriseId(), result.getEntrepriseId());
        assertEquals(expected.getEntreprise(), result.getEntreprise());
    }

    @Test
    void batimentBoToTableTest(){
        AdresseBo adresseBo = adresseTest.creerBo();
        GpsBo gpsBo = gpsTest.creerBo();
        EntreprisePo entreprisePo = entrepriseTest.creerPo();
        BatimentBo input = batimentTest.creerBo();
        input.setAdresseBo(adresseBo);
        input.setGps(gpsBo);
        input.setEntreprisePo(entreprisePo);
        BatimentTable expected = batimentTest.creerTable();

        BatimentTable result = BatimentConvert.batimentBoToTable(input);

        assertEquals(expected.getClass(),result.getClass());
        assertEquals(expected.getId(), result.getId());
        assertEquals(expected.getInuav(), result.getInuav());
        assertEquals(expected.getEntrepriseId(), result.getEntrepriseId());
        assertEquals(expected.getEntrepriseNom(), result.getEntrepriseNom());
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
