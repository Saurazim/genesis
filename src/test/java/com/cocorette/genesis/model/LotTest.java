package com.cocorette.genesis.model;

import com.cocorette.genesis.configuration.ConstantesForTest;
import com.cocorette.genesis.model.bo.*;
import com.cocorette.genesis.model.entity.*;
import com.cocorette.genesis.model.form.LotForm;
import com.cocorette.genesis.model.table.LotTable;
import com.cocorette.genesis.model.transitionnel.BatimentPo;
import com.cocorette.genesis.model.view.LotView;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class LotTest {
    private final int ID = ConstantesForTest.ID;
    private String CODE_OEUF = ConstantesForTest.CODE_OEUF;
    private final int DUREE_THEORIQUE = ConstantesForTest.DUREE_THEORIQUE;
    private final int DUREE_REELLE = ConstantesForTest.DUREE_REELLE;
    private final int NB_POULES_MEP = ConstantesForTest.NB_POULES_MEP;
    private final LocalDate FIN_LOT_THEORIQ = ConstantesForTest.FIN_LOT_THEORIQ;
    private final int COEF_EROSION = ConstantesForTest.COEF_EROSION;
    private final boolean DERNIER_LOT = ConstantesForTest.DERNIER_LOT;
    private final LocalDate NAISSANCE_POULES = ConstantesForTest.NAISSANCE_POULES;
    private final LocalDate MEP = ConstantesForTest.MEP;
    private final LocalDate FIN_LOT = ConstantesForTest.FIN_LOT;
    private final String COMM = ConstantesForTest.COMM;
    private final boolean ACTIF = ConstantesForTest.ACTIF;
    private final boolean ARCHIVE = ConstantesForTest.ARCHIVE;
    private final LocalDateTime CREATION = ConstantesForTest.CREATION;
    private final LocalDateTime MODIF = ConstantesForTest.MODIF;

    private final String NOM_BATIMENT = ConstantesForTest.INUAV;
    private final String NOM_CATEGORIE = ConstantesForTest.NOM_CATEG;
    private final String NOM_COUVOIR = ConstantesForTest.NOM_COUVOIR;
    private final String NOM_ALIMENT = ConstantesForTest.NOM_ALIMENT;
    private final String NOM_SOUCHE = ConstantesForTest.NOM_SOUCHE;

    public LotEntity creerEntity(){
        LotEntity entity = new LotEntity();

        entity.setId(ID);
        entity.setDureeProdTheorique(DUREE_THEORIQUE);
        entity.setDureeProdReelle(DUREE_REELLE);
        entity.setNbPoulesMEP(NB_POULES_MEP);
        entity.setFinLotTheorique(FIN_LOT_THEORIQ);
        entity.setCoefErosion(COEF_EROSION);
        entity.setDernierLot(DERNIER_LOT);
        entity.setNaissancePoules(NAISSANCE_POULES);
        entity.setMep(MEP);
        entity.setFinLot(FIN_LOT);
        entity.setCommentaire(COMM);
        entity.setActif(ACTIF);
        entity.setArchive(ARCHIVE);
        entity.setCreated(CREATION);
        entity.setModified(MODIF);

        return entity;
    }

    public LotBo creerBo(){
        LotBo bo = new LotBo();

        bo.setId(ID);
        bo.setCodeOeuf(CODE_OEUF);
        bo.setDureeProdTheorique(DUREE_THEORIQUE);
        bo.setDureeProdReelle(DUREE_REELLE);
        bo.setNbPoulesMEP(NB_POULES_MEP);
        bo.setFinLotTheorique(FIN_LOT_THEORIQ);
        bo.setCoefErosion(COEF_EROSION);
        bo.setDernierLot(DERNIER_LOT);
        bo.setNaissancePoules(NAISSANCE_POULES);
        bo.setMep(MEP);
        bo.setFinLot(FIN_LOT);
        bo.setCommentaires(COMM);
        bo.setActif(ACTIF);
        bo.setArchive(ARCHIVE);
        bo.setCreated(CREATION);
        bo.setModified(MODIF);

        return bo;
    }

    public LotForm creerForm(){
        LotForm form = new LotForm();

        form.setCodeOeuf(CODE_OEUF);
        form.setBatimentId(ID);
        form.setBatimentNom(NOM_BATIMENT);
        form.setCategorieId(ID);
        form.setCategorieNom(NOM_CATEGORIE);
        form.setCouvoirId(ID);
        form.setCouvoirNom(NOM_COUVOIR);
        form.setSoucheId(ID);
        form.setSoucheNom(NOM_SOUCHE);
        form.setAlimentId(ID);
        form.setAlimentNom(NOM_ALIMENT);
        form.setNbPoulesMEP(NB_POULES_MEP);
        form.setDernierLot(DERNIER_LOT);
        form.setNaissancePoules(NAISSANCE_POULES);
        form.setMep(MEP);
        form.setCommentaire(COMM);
        form.setCreated(CREATION);
        form.setModified(MODIF);

        return form;
    }

    public LotTable creerTable(){
        LotTable table = new LotTable();

        table.setId(ID);
        table.setCodeOeuf(CODE_OEUF);
        table.setBatiment(NOM_BATIMENT);
        table.setCategorie(NOM_CATEGORIE);
        table.setCouvoir(NOM_COUVOIR);
        table.setSouche(NOM_SOUCHE);
        table.setAliment(NOM_ALIMENT);
        table.setNbPoulesMEP(NB_POULES_MEP);
        table.setCoefErosion(COEF_EROSION);
        table.setMep(MEP);
        table.setActif(ACTIF);
        table.setArchive(ARCHIVE);
        table.setCreated(CREATION);
        table.setModified(MODIF);

        return table;
    }

    public LotView creerView(){
        LotView view = new LotView();

        view.setId(ID);
        view.setCodeOeuf(CODE_OEUF);
        view.setBatiment(NOM_BATIMENT);
        view.setBatimentId(ID);
        view.setCategorie(NOM_CATEGORIE);
        view.setCouvoir(NOM_COUVOIR);
        view.setCouvoirId(ID);
        view.setSouche(NOM_SOUCHE);
        view.setSoucheId(ID);
        view.setAliment(NOM_ALIMENT);
        view.setAlimentId(ID);
        view.setDureeProdTheorique(DUREE_THEORIQUE);
        view.setDureeProdReelle(DUREE_REELLE);
        view.setNbPoulesMEP(NB_POULES_MEP);
        view.setFinLotTheorique(FIN_LOT_THEORIQ);
        view.setCoefErosion(COEF_EROSION);
        view.setDernierLot(DERNIER_LOT);
        view.setNaissancePoules(NAISSANCE_POULES);
        view.setMep(MEP);
        view.setFinLot(FIN_LOT);
        view.setCommentaire(COMM);
        view.setCreated(CREATION);
        view.setModified(MODIF);
        view.setActif(ACTIF);
        view.setArchive(ARCHIVE);

        return view;
    }


}
