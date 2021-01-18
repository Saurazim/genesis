package com.cocorette.genesis.convert;

import com.cocorette.genesis.model.GpsTest;
import com.cocorette.genesis.model.VeterinaireTest;
import com.cocorette.genesis.model.bo.GpsBo;
import com.cocorette.genesis.model.bo.VeterinaireBo;
import com.cocorette.genesis.model.entity.GpsEntity;
import com.cocorette.genesis.model.entity.VeterinaireEntity;
import com.cocorette.genesis.model.form.VeterinaireForm;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

public class VeterinaireConvertTest {
    @Mock
    GpsConvert gpsConvert;

    private static VeterinaireTest veterinaireTest;
    private static GpsTest gpsTest;

    @BeforeAll
    public static void init(){
        veterinaireTest = new VeterinaireTest();
        gpsTest = new GpsTest();
    }

    @Test
    public void veterinaireEntityToBoTest(){
        GpsEntity gpsEntity = gpsTest.creerEntity();
        GpsBo gpsBo = gpsTest.creerBo();

        VeterinaireEntity input = veterinaireTest.creerEntity();
        input.setGps(gpsEntity);
        VeterinaireBo expected = veterinaireTest.creerBo();

        when(gpsConvert.gpsEntityToBo(input.getGps())).thenReturn(gpsBo);

        VeterinaireBo result = VeterinaireConvert.veterinaireEntityToBo(input);

        assertEquals(expected.getClass(), result.getClass());
        assertEquals(expected.getId(), result.getId());
        assertEquals(expected.getNom(), result.getNom());
        assertEquals(expected.getCommentaire(), result.getCommentaire());
        assertEquals(expected.isActive(), result.isActive());
        assertEquals(expected.isArchive(), result.isArchive());
        assertEquals(expected.getCreated(), result.getCreated());
        assertEquals(expected.getModified(), result.getModified());
        verify(gpsConvert).gpsEntityToBo(input.getGps());
    }

    @Test
    public void veterinaireBoToEntityTest(){
        GpsEntity gpsEntity = gpsTest.creerEntity();
        GpsBo gpsBo = gpsTest.creerBo();

        VeterinaireEntity expected = veterinaireTest.creerEntity();
        VeterinaireBo input = veterinaireTest.creerBo();
        input.setGpsBo(gpsBo);

        when(gpsConvert.gpsBoToEntity(input.getGpsBo())).thenReturn(gpsEntity);

        VeterinaireEntity result = VeterinaireConvert.veterinaireBoToEntity(input);

        assertEquals(expected.getClass(), result.getClass());
        assertEquals(expected.getNom(), result.getNom());
        assertEquals(expected.getCommentaire(), result.getCommentaire());
        assertEquals(expected.isActive(), result.isActive());
        assertEquals(expected.isArchive(), result.isArchive());
        assertEquals(expected.getCreated(), result.getCreated());
        assertEquals(expected.getModified(), result.getModified());
        verify(gpsConvert).gpsBoToEntity(input.getGpsBo());
    }

    @Test
    public void veterinaireFormToBo(){
        GpsBo gpsBo = gpsTest.creerBo();

        VeterinaireForm input = veterinaireTest.creerForm();
        VeterinaireBo expected = veterinaireTest.creerBo();

        VeterinaireBo result = VeterinaireConvert.veterinaireFormToBo(input);

        assertEquals(expected.getClass(), result.getClass());
        assertEquals(expected.getNom(), result.getNom());
        assertEquals(gpsBo.getLatitude(), result.getGpsBo().getLatitude());
        assertEquals(gpsBo.getLongitude(), result.getGpsBo().getLongitude());
        assertEquals(expected.getCommentaire(), result.getCommentaire());
    }
}
