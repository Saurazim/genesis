package com.cocorette.genesis.convert;

import static org.junit.jupiter.api.Assertions.*;

import com.cocorette.genesis.model.CentreTest;
import com.cocorette.genesis.model.bo.CentreBo;
import com.cocorette.genesis.model.entity.CentreEntity;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

public class CentreConvertTest {
    private static CentreTest centreTest;

    @BeforeAll
    public static void init(){
        centreTest = new CentreTest();
    }

    @Test
    public void centreBoToEntityTest(){
        CentreEntity expected = centreTest.creerEntity();
        CentreBo input = centreTest.creerBo();

        CentreEntity result = CentreConvert.centreBoToEntity(input);

        assertEquals(expected.getClass(), result.getClass());
        assertEquals(expected.getId(), result.getId());
        assertEquals(expected.getNom(), result.getNom());
        assertEquals(expected.getLongitude(), result.getLongitude());
        assertEquals(expected.getLatitude(), result.getLatitude());
    }

    @Test
    public void centreEntityToBoTest(){
        CentreEntity input = centreTest.creerEntity();
        CentreBo expected = centreTest.creerBo();

        CentreBo result = CentreConvert.centreEntityToBo(input);

        assertEquals(expected.getClass(), result.getClass());
        assertEquals(expected.getId(), result.getId());
        assertEquals(expected.getNom(), result.getNom());
        assertEquals(expected.getLongitude(), result.getLongitude());
        assertEquals(expected.getLatitude(), result.getLatitude());
    }
}
