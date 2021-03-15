package com.cocorette.genesis.model;

import com.cocorette.genesis.configuration.ConstantesForTest;
import com.cocorette.genesis.model.bo.AdresseBo;
import com.cocorette.genesis.model.bo.BatimentBo;
import com.cocorette.genesis.model.bo.GpsBo;
import com.cocorette.genesis.model.entity.AdresseEntity;
import com.cocorette.genesis.model.entity.BatimentEntity;
import com.cocorette.genesis.model.entity.EntrepriseEntity;
import com.cocorette.genesis.model.entity.GpsEntity;
import com.cocorette.genesis.model.form.BatimentForm;
import com.cocorette.genesis.model.table.BatimentTable;
import com.cocorette.genesis.model.transitionnel.BatimentPo;
import com.cocorette.genesis.model.transitionnel.EntreprisePo;
import com.cocorette.genesis.model.view.BatimentView;

import java.time.LocalDateTime;

public class BatimentTest {
    private static final int ID = ConstantesForTest.ID;
    private static final String INTERNE = ConstantesForTest.INTERNE;
    private static final String INUAV = ConstantesForTest.INUAV;
    private static final String EAU = ConstantesForTest.EAU;
    private static final int DIST_CENTRE = ConstantesForTest.DIST_CENTRE;
    private static final int ANNEE_DEBUT = ConstantesForTest.ANNEE_DEBUT;
    private static final String T_BATIMENT = ConstantesForTest.T_BATIMENT;
    private static final int NB_ARBRES = ConstantesForTest.NB_ARBRES;
    private static final String T_ARBRES = ConstantesForTest.T_ARBRES;
    private static final String COMMENTAIRE = ConstantesForTest.COMM;
    private static final boolean ACTIF = ConstantesForTest.ACTIF;
    private static final boolean ARCHIVE = ConstantesForTest.ARCHIVE;
    private static final LocalDateTime CREATION = ConstantesForTest.CREATION;
    private static final LocalDateTime MODIF = ConstantesForTest.MODIF;
    private static final String RUE = ConstantesForTest.RUE;
    private static final String CP = ConstantesForTest.CP;
    private static final String VILLE = ConstantesForTest.VILLE;
    private static final String PAYS = ConstantesForTest.PAYS;
    private static final float LATITUDE = ConstantesForTest.LATITUDE;
    private static final float LONGITUDE = ConstantesForTest.LONGITUDE;
    private static final String NOM_ENTERPRISE = ConstantesForTest.NOM_ENTERPRISE;

    public BatimentEntity creerEntity(){
        BatimentEntity entity = new BatimentEntity();

        EntrepriseEntity entreprise = new EntrepriseEntity();

        GpsEntity gps = new GpsEntity();
        gps.setLatitude(LATITUDE);
        gps.setLongitude(LONGITUDE);

        entity.setId(ID);
        entity.setInuav(INUAV);
        entity.setEntreprise(entreprise);
        entity.setEau(EAU);
        entity.setDistCentre(DIST_CENTRE);
        entity.setAnneeDebut(ANNEE_DEBUT);
        entity.setGps(gps);
        entity.setTypeBatiment(T_BATIMENT);
        entity.setNbArbres(NB_ARBRES);
        entity.setTypeArbres(T_ARBRES);
        entity.setCommentaire(COMMENTAIRE);
        entity.setActif(ACTIF);
        entity.setArchive(ARCHIVE);
        entity.setCreated(CREATION);
        entity.setModified(MODIF);

        return entity;
    }

    public BatimentBo creerBo(){
        BatimentBo bo = new BatimentBo();
        EntreprisePo entreprise = new EntreprisePo();

        GpsBo gps = new GpsBo();
        gps.setLatitude(LATITUDE);
        gps.setLongitude(LONGITUDE);

        bo.setId(ID);
        bo.setInuav(INUAV);
        bo.setEntreprisePo(entreprise);
        bo.setEau(EAU);
        bo.setDistCentre(DIST_CENTRE);
        bo.setAnneeDebut(ANNEE_DEBUT);
        bo.setGps(gps);
        bo.setTypeBatiment(T_BATIMENT);
        bo.setNbArbres(NB_ARBRES);
        bo.setTypeArbres(T_ARBRES);
        bo.setCommentaire(COMMENTAIRE);
        bo.setActif(ACTIF);
        bo.setArchive(ARCHIVE);
        bo.setCreated(CREATION);
        bo.setModified(MODIF);

        return bo;
    }

    public BatimentForm creerForm(){
        BatimentForm form = new BatimentForm();

        form.setInuav(INUAV);
        form.setRue(RUE);
        form.setCodePostal(CP);
        form.setVille(VILLE);
        form.setPays(PAYS);
        form.setEntrepriseId(ID);
        form.setEau(EAU);
        form.setDistCentre(DIST_CENTRE);
        form.setAnneeDebut(ANNEE_DEBUT);
        form.setLatitude(LATITUDE);
        form.setLongitude(LONGITUDE);
        form.setTypeBatiment(T_BATIMENT);
        form.setTypeArbres(T_ARBRES);
        form.setNbArbres(NB_ARBRES);
        form.setCommentaire(COMMENTAIRE);
        form.setCreated(CREATION);
        form.setModified(MODIF);

        return form;
    }

    public BatimentTable creerTable(){
        BatimentTable table = new BatimentTable();

        table.setId(ID);
        table.setCodeInterne(INTERNE);
        table.setAdresse(RUE+" "+CP+" "+VILLE+" "+PAYS);
        table.setEntrepriseId(ID);
        table.setEntrepriseNom(NOM_ENTERPRISE);
        table.setActif(ACTIF);
        table.setArchive(ARCHIVE);
        table.setCreated(CREATION);
        table.setModified(MODIF);

        return table;
    }

    public BatimentView creerView(){
        BatimentView view = new BatimentView();

        view.setId(ID);
        view.setInuav(INUAV);
        view.setEntreprise(NOM_ENTERPRISE);
        view.setEntrepriseId(ID);
        view.setRue(RUE);
        view.setCodePostal(CP);
        view.setVille(VILLE);
        view.setPays(PAYS);
        view.setEau(EAU);
        view.setDistCentre(DIST_CENTRE);
        view.setAnneeDebut(ANNEE_DEBUT);
        view.setTypeBatiment(T_BATIMENT);
        view.setNbArbres(NB_ARBRES);
        view.setTypeArbres(T_ARBRES);
        view.setCommentaire(COMMENTAIRE);
        view.setCreated(CREATION);
        view.setModified(MODIF);
        view.setActif(ACTIF);
        view.setArchive(ARCHIVE);

        return view;
    }

    public BatimentPo creerPo(){
        BatimentPo po = new BatimentPo();

        po.setId(ID);
        po.setCodeInterne(INTERNE);

        return po;
    }
}
