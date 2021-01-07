package com.cocorette.genesis.configuration;

import java.time.LocalDate;
import java.time.LocalDateTime;

public interface ConstantesForTest {
    //Autres
    int ID = 123;
    String COMM = "Ceci est un commentaire";
    boolean ACTIF = false;
    boolean ARCHIVE = true;
    LocalDateTime CREATION = LocalDateTime.MIN;
    LocalDateTime MODIF = LocalDateTime.MAX;
    //Adresse
    String RUE = "25 rue TrucMuche";
    String CP = "56 123";
    String VILLE = "Trifouillis les Oies";
    String PAYS = "France";
    //Aliment
    String NOM_ALIMENT = "Trucmuche";
    //Batiment
    String INUAV = "code00xxx";
    String EAU = "arrosage";
    int DIST_CENTRE = 456;
    int ANNEE_DEBUT = 2020;
    String T_BATIMENT = "Poulailler";
    int NB_ARBRES = 8456;
    String T_ARBRES = "Noyer";
    //Categorie
    String NOM_CATEG = "categ test";
    //Centre
    String NOM_CENTRE = "Doullens";
    //Contact
    String MAIL = "azer@zaer.fr";
    String FIXE = "0299999999";
    String PORT = "0399999999";
    String FAX = "0199999999";
    //Couvoir
    String NOM_COUVOIR = "Poulette";
    //Eleveur
    String PRENOM_ELEVEUR = "PASCAL";
    String NOM_ELEVEUR = "LEMAIRE";
    //Entreprise
    String EDE = "code EDE";
    String NOM_ENTERPRISE = "NOM";
    //GPS
    float LATITUDE = 123546;
    float LONGITUDE = 456132;
    //Lot
    String CODE_OEUF = "Code Oeuf";
    int DUREE_THEORIQUE = 123;
    int DUREE_REELLE = 321;
    LocalDate FIN_LOT_THEORIQ = LocalDate.now();
    int NB_POULES_MEP = 6000;
    int COEF_EROSION = 65;
    boolean DERNIER_LOT = true;
    LocalDate NAISSANCE_POULES = LocalDate.of(2007, 7,27);
    LocalDate MEP = LocalDate.of(2012,1,1);
    LocalDate FIN_LOT = LocalDate.of(2012,12,31);
    //Souche
    String NOM_SOUCHE = "Souche A";
    //Veterinaire
    String NOM_VETO = "Vétérinaire";
}
