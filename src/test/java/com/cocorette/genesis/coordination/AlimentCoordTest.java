package com.cocorette.genesis.coordination;

import com.cocorette.genesis.convert.AlimentConvert;
import com.cocorette.genesis.model.AlimentTest;
import com.cocorette.genesis.model.entity.AlimentEntity;
import com.cocorette.genesis.model.form.AlimentForm;
import com.cocorette.genesis.service.AlimentService;
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
public class AlimentCoordTest {
    @Mock
    AlimentService alimentService;
    @Mock
    AlimentConvert alimentConvert;

    private static AlimentCoord alimentCoord;
    private static AlimentTest alimentTest;

    @BeforeAll
    private static void init(){
        alimentCoord = new AlimentCoord();
        alimentTest = new AlimentTest();
    }

    @Test
    public void saveAlimentTest(){
        AlimentForm input = alimentTest.creerForm();
        AlimentEntity entity = alimentTest.creerEntity();

        when(alimentConvert.alimentFormToEntity(input)).thenReturn(entity);

        verify(alimentConvert).alimentFormToEntity(input);
        verify(alimentService).saveAliment(entity);
    }

    @Test
    public void validAlimentTest_invalid(){
        AlimentForm input = new AlimentForm();

        Map<String, String> result = alimentCoord.validAliment(input);

        assertNotNull(result);
    }

    @Test
    public void validAlimentTest_valid(){
        AlimentForm input = new AlimentForm();
        input.setNom("nom test");

        Map<String, String> result = alimentCoord.validAliment(input);

        assertNull(result);
    }
}
