package com.cocorette.genesis.model;

import java.time.LocalDate;

public class LotEntity {
    private int id;
    private String codeOeuf;
    private int dureeProdTheorique;
    private int dureeProdReelle;
    //TODO categories
    //TODO Accouveurs
    //TODO Souche
    //TODO aliments
    private int nbPoulesMEP;
    private LocalDate finLotTheorique;
    private int coefErosion;
    private boolean dernierLot;
    //dates
    private LocalDate naissancePoules;
    private LocalDate mep;
    private LocalDate finLot;
    private LocalDate analyse1;
    private LocalDate analyse2;
    private LocalDate prelevement1;
    private LocalDate prelevement2;
    private LocalDate prelevement3;
    private LocalDate prelevement4;
}
