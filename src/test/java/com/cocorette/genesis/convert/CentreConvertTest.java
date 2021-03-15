package com.cocorette.genesis.convert;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import com.cocorette.genesis.model.CentreTest;
import com.cocorette.genesis.model.GpsTest;
import com.cocorette.genesis.model.bo.CentreBo;
import com.cocorette.genesis.model.bo.GpsBo;
import com.cocorette.genesis.model.entity.CentreEntity;
import com.cocorette.genesis.model.entity.GpsEntity;
import com.cocorette.genesis.model.form.CentreForm;
import com.cocorette.genesis.model.table.CentreTable;
import com.cocorette.genesis.model.view.CentreView;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import org.reactivestreams.Publisher;

public class CentreConvertTest {
    @Mock
    GpsConvert gpsConvert;

    private static CentreTest centreTest;
    private static GpsTest gpsTest;

    @BeforeAll
    public static void init(){
        centreTest = new CentreTest();
        gpsTest = new GpsTest();
    }

    @Test
    public void centreBoToEntityTest(){
        GpsEntity gpsEntity = gpsTest.creerEntity();
        GpsBo gpsBo = gpsTest.creerBo();

        CentreEntity expected = centreTest.creerEntity();
        CentreBo input = centreTest.creerBo();
        input.setGpsBo(gpsBo);

        when(gpsConvert.gpsBoToEntity(input.getGpsBo())).thenReturn(gpsEntity);

        CentreEntity result = CentreConvert.centreBoToEntity(input);

        assertEquals(expected.getClass(), result.getClass());
        assertEquals(expected.getId(), result.getId());
        assertEquals(expected.getNom(), result.getNom());
        assertEquals(expected.getCommentaire(), result.getCommentaire());
        assertEquals(expected.isActive(), result.isActive());
        assertEquals(expected.isArchive(), result.isArchive());
        assertEquals(expected.getCreated(), result.getCreated());
        assertEquals(expected.getModified(), result.getModified());
        verify(gpsConvert).gpsBoToEntity(input.getGpsBo());
    }

    @Test
    public void centreEntityToBoTest(){
        GpsEntity gpsEntity = gpsTest.creerEntity();
        GpsBo gpsBo = gpsTest.creerBo();

        CentreEntity input = centreTest.creerEntity();
        input.setGpsEntity(gpsEntity);
        CentreBo expected = centreTest.creerBo();

        when(gpsConvert.gpsEntityToBo(input.getGpsEntity())).thenReturn(gpsBo);

        CentreBo result = CentreConvert.centreEntityToBo(input);

        assertEquals(expected.getClass(), result.getClass());
        assertEquals(expected.getId(), result.getId());
        assertEquals(expected.getNom(), result.getNom());
        assertEquals(expected.getCommentaire(), result.getCommentaire());
        assertEquals(expected.isActive(), result.isActive());
        assertEquals(expected.isArchive(), result.isArchive());
        assertEquals(expected.getCreated(), result.getCreated());
        assertEquals(expected.getModified(), result.getModified());
        verify(gpsConvert).gpsEntityToBo(input.getGpsEntity());
    }

    @Test
    public void centreFormToBo(){
        GpsBo gpsBo = gpsTest.creerBo();
        CentreForm input = centreTest.creerForm();
        CentreBo expected = centreTest.creerBo();

        CentreBo result = CentreConvert.centreFormToBo(input);

        assertEquals(expected.getClass(), result.getClass());
        assertEquals(expected.getNom(), result.getNom());
        assertEquals(expected.getCommentaire(), result.getCommentaire());
        assertEquals(gpsBo.getLatitude(), result.getGpsBo().getLatitude());
        assertEquals(gpsBo.getLongitude(), result.getGpsBo().getLongitude());
    }

    @Test
    public void centreBoToView(){
        GpsBo gpsBo = gpsTest.creerBo();

        CentreBo input = centreTest.creerBo();
        input.setGpsBo(gpsBo);

        CentreView expected = centreTest.creerView();

        CentreView result = CentreConvert.centreBoToView(input);

        assertEquals(expected.getClass(), result.getClass());
        assertEquals(expected.getId(), result.getId());
        assertEquals(expected.getNom(), result.getNom());
        assertEquals(expected.getCommentaire(), result.getCommentaire());
        assertEquals(expected.isActive(), result.isActive());
        assertEquals(expected.isArchive(), result.isArchive());
        assertEquals(expected.getCreated(), result.getCreated());
        assertEquals(expected.getModified(), result.getModified());
        assertEquals(expected.getLatitude(), result.getLatitude());
        assertEquals(expected.getLongitude(), result.getLongitude());
    }

    @Test
    public void centreBoToTable(){
        GpsBo gpsBo = gpsTest.creerBo();

        CentreBo input = centreTest.creerBo();
        input.setGpsBo(gpsBo);

        CentreTable expected = centreTest.creerTable();

        CentreTable result = centreTest.creerTable();

        assertEquals(expected.getClass(), result.getClass());
        assertEquals(expected.getId(), result.getId());
        assertEquals(expected.getNom(), result.getNom());
        assertEquals(expected.getCommentaire(), result.getCommentaire());
        assertEquals(expected.isActive(), result.isActive());
        assertEquals(expected.isArchive(), result.isArchive());
        assertEquals(expected.getCreated(), result.getCreated());
        assertEquals(expected.getModified(), result.getModified());
    }
}
