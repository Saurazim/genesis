package com.cocorette.genesis.convert;

import com.cocorette.genesis.model.GpsTest;
import com.cocorette.genesis.model.VeterinaireTest;
import com.cocorette.genesis.model.bo.VeterinaireBo;
import com.cocorette.genesis.model.entity.VeterinaireEntity;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class VeterinaireConvertTest {
    private static VeterinaireTest veterinaireTest;
    private static GpsTest gpsTest;

    @BeforeAll
    public static void init(){
        veterinaireTest = new VeterinaireTest();
    }

    @Test
    public void veterinaireEntityToBoTest(){
        VeterinaireEntity input = veterinaireTest.creerEntity();
        VeterinaireBo expected = veterinaireTest.creerBo();

        VeterinaireBo result = VeterinaireConvert.veterinaireEntityToBo(input);

        assertEquals(expected.getClass(), result.getClass());
        assertEquals(expected.getId(), result.getId());
        assertEquals(expected.getNom(), result.getNom());
        assertEquals(expected.getCommentaire(), result.getCommentaire());
        assertEquals(expected.isActive(), result.isActive());
        assertEquals(expected.isArchive(), result.isArchive());
        assertEquals(expected.getCreated(), result.getCreated());
        assertEquals(expected.getModified(), result.getModified());
    }

    @Test
    public void veterinaireBoToEntityTest(){
        VeterinaireEntity expected = veterinaireTest.creerEntity();
        VeterinaireBo input = veterinaireTest.creerBo();

        VeterinaireEntity result = VeterinaireConvert.veterinaireBoToEntity(input);

        assertEquals(expected.getClass(), result.getClass());
        assertEquals(expected.getNom(), result.getNom());
        assertEquals(expected.getCommentaire(), result.getCommentaire());
        assertEquals(expected.isActive(), result.isActive());
        assertEquals(expected.isArchive(), result.isArchive());
        assertEquals(expected.getCreated(), result.getCreated());
        assertEquals(expected.getModified(), result.getModified());
    }
}
