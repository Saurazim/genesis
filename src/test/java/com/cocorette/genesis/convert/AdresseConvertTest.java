package com.cocorette.genesis.convert;

import static org.junit.jupiter.api.Assertions.*;

import com.cocorette.genesis.model.AdresseTest;
import com.cocorette.genesis.model.bo.AdresseBo;
import com.cocorette.genesis.model.entity.AdresseEntity;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

public class AdresseConvertTest {
    private static AdresseTest adresseTest;

    @BeforeAll
    public static void init(){
        adresseTest = new AdresseTest();
    }

    @Test
    void adresseBoToEntityTest(){
        AdresseBo input = adresseTest.creerBo();
        AdresseEntity expected = adresseTest.creerEntity();


        AdresseEntity result = AdresseConvert.adresseBoToEntity(input);

        assertEquals(expected.getClass(), result.getClass());
        assertEquals(expected.getRue(), result.getRue());
        assertEquals(expected.getCodePostal(), result.getCodePostal());
        assertEquals(expected.getVille(), result.getVille());
        assertEquals(expected.getPays(), result.getPays());
    }

    @Test
    void adresseEntityToBoTest(){
        AdresseEntity input = adresseTest.creerEntity();
        AdresseBo expected = adresseTest.creerBo();

        AdresseBo result = AdresseConvert.adresseEntityToBo(input);

        assertEquals(expected.getClass(), result.getClass());
        assertEquals(expected.getRue(), result.getRue());
        assertEquals(expected.getCodePostal(), result.getCodePostal());
        assertEquals(expected.getVille(), result.getVille());
        assertEquals(expected.getPays(), result.getPays());
    }
}
