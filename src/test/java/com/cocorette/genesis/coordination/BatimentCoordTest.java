package com.cocorette.genesis.coordination;

import com.cocorette.genesis.convert.BatimentConvert;
import com.cocorette.genesis.model.BatimentTest;
import com.cocorette.genesis.model.EntrepriseTest;
import com.cocorette.genesis.model.entity.BatimentEntity;
import com.cocorette.genesis.model.entity.EntrepriseEntity;
import com.cocorette.genesis.model.form.BatimentForm;
import com.cocorette.genesis.service.AdresseService;
import com.cocorette.genesis.service.BatimentService;
import com.cocorette.genesis.service.EntrepriseService;
import com.cocorette.genesis.service.GpsService;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.HashMap;
import java.util.Map;

import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;
import static org.junit.jupiter.api.Assertions.*;

@ExtendWith(MockitoExtension.class)
public class BatimentCoordTest {
    @Mock
    BatimentService batimentService;
    @Mock
    AdresseService adresseService;
    @Mock
    EntrepriseService entrepriseService;
    @Mock
    GpsService gpsService;
    @Mock
    BatimentConvert batimentConvert;

    private static BatimentCoord batimentCoord;
    private static BatimentTest batimentTest;
    private static EntrepriseTest entrepriseTest;

    @BeforeAll
    private static void init(){
        batimentCoord = new BatimentCoord();
        batimentTest = new BatimentTest();
        entrepriseTest = new EntrepriseTest();
    }

    @Test
    public void saveBatimentTest(){
        BatimentForm form = batimentTest.creerForm();
        BatimentEntity entity = batimentTest.creerEntity();
        EntrepriseEntity entrepriseEntity = entrepriseTest.creerEntity();

        when(batimentConvert.batimentFormToEntity(form)).thenReturn(entity);
        when(entrepriseService.findEntreprise(form.getEntrepriseId())).thenReturn(java.util.Optional.ofNullable(entrepriseEntity));

        batimentCoord.saveBatiment(form);

        verify(adresseService).saveAdresse(entity.getAdresse());
        verify(gpsService).saveGps(entity.getGps());
        verify(batimentService).saveBatiment(entity);
    }

    @Test
    public void validBatimentTest_valid(){
        BatimentForm form = batimentTest.creerForm();

        Map<String, String> result = batimentCoord.validBatiment(form);

        assertNull(result);
    }

    @Test
    public void validBatimentTest_null_inuav(){
        Map<String, String> expected = new HashMap<>();
        expected.put("inuav","Le code INUAV est obligatoire");

        BatimentForm form = batimentTest.creerForm();
        form.setInuav(null);

        Map<String, String> result = batimentCoord.validBatiment(form);

        assertEquals(expected,result);
    }

    @Test
    public void validBatimentTest_null_eau(){
        Map<String, String> expected = new HashMap<>();
        expected.put("eau","Le type d'arrivée d'eau est obligatoire");

        BatimentForm form = batimentTest.creerForm();
        form.setEau(null);

        Map<String, String> result = batimentCoord.validBatiment(form);

        assertEquals(expected,result);
    }

    @Test
    public void validBatimentTest_null_adresse(){
        Map<String, String> expected = new HashMap<>();
        expected.put("adresse", "adresse invalide");

        BatimentForm form = batimentTest.creerForm();
        form.setRue(null);

        Map<String, String> result = batimentCoord.validBatiment(form);

        assertEquals(expected,result);
    }

    @Test
    public void validBatimentTest_invalid_codepostal(){
        Map<String, String> expected = new HashMap<>();
        expected.put("codepostal","Code postal invalide");

        BatimentForm form = batimentTest.creerForm();
        form.setCodePostal("null");

        Map<String, String> result = batimentCoord.validBatiment(form);

        assertEquals(expected,result);
    }
}
