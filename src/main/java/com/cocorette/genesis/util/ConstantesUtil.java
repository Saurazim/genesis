package com.cocorette.genesis.util;

import com.cocorette.genesis.configuration.Configurations;
import com.cocorette.genesis.configuration.Constantes;

/**
 * interface pour récupérer les valeurs constantes de constantes.properties
 * @see Constantes
 */
@SuppressWarnings("unused")
public interface ConstantesUtil {

    /**
     * avoir rapidement la valeur de la constante
     * @param key clé de la constante
     * @return valeur de la constante
     */
    static String getProperty(String key){
        return Configurations.getInstance().getProperty(key);
    }

    /**
     * avoir rapidement la valeur de la constante si c'est un entier
     * @param key la clé
     * @return la valeur
     */
    static int getPropertyToInt(String key){
        String property = Configurations.getInstance().getProperty(key);
        return Integer.parseInt(property);
    }

    /**
     * avoir rapidement la valeur de la constante si c'est un booléen
     * @param key la clé
     * @return la valeur
     */
    static boolean getPropertyToBool(String key){
        String property = Configurations.getInstance().getProperty(key);
        return Boolean.parseBoolean(property);
    }

    static void testProd(Object obj){
        System.out.println(obj.getClass().toString());
    }
}
