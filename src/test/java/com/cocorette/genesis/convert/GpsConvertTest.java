package com.cocorette.genesis.convert;

import com.cocorette.genesis.model.GpsTest;
import com.cocorette.genesis.model.bo.GpsBo;
import com.cocorette.genesis.model.entity.GpsEntity;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class GpsConvertTest {
    private static GpsTest gpsTest;

    @BeforeAll
    public static void init(){
        gpsTest = new GpsTest();
    }

    @Test
    public void gpsEntityToBoTest(){
        GpsEntity input = gpsTest.creerEntity();
        GpsBo expected = gpsTest.creerBo();

        GpsBo result = GpsConvert.gpsEntityToBo(input);

        assertEquals(expected.getClass(), result.getClass());
        assertEquals(expected.getId(), result.getId());
        assertEquals(expected.getLatitude(), result.getLatitude());
        assertEquals(expected.getLongitude(), result.getLongitude());
    }

    @Test
    public void gpsBoToEntityTest(){
        GpsEntity expected = gpsTest.creerEntity();
        GpsBo input = gpsTest.creerBo();

        GpsEntity result = GpsConvert.gpsBoToEntity(input);

        assertEquals(expected.getClass(), result.getClass());
        assertEquals(expected.getId(), result.getId());
        assertEquals(expected.getLatitude(), result.getLatitude());
        assertEquals(expected.getLongitude(), result.getLongitude());
    }
}
