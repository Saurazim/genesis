package com.cocorette.genesis.model;

import com.cocorette.genesis.model.bo.AdresseBo;
import com.cocorette.genesis.model.bo.BatimentBo;
import com.cocorette.genesis.model.bo.GpsBo;
import com.cocorette.genesis.model.entity.AdresseEntity;
import com.cocorette.genesis.model.entity.BatimentEntity;
import com.cocorette.genesis.model.entity.EntrepriseEntity;
import com.cocorette.genesis.model.entity.GpsEntity;
import com.cocorette.genesis.model.form.BatimentForm;
import com.cocorette.genesis.model.table.BatimentTable;
import com.cocorette.genesis.model.transitionnel.EntreprisePo;
import com.cocorette.genesis.model.view.BatimentView;

import java.time.LocalDateTime;

public class BatimentTest {
    private static final int ID = 132;
    private static final String INUAV = "code00xxx";
    private static final String EAU = "arrosage";
    private static final int DIST_CENTRE = 456;
    private static final int ANNEE_DEBUT = 2020;
    private static final String T_BATIMENT = "Poulailler";
    private static final int NB_ARBRES = 8456;
    private static final String T_ARBRES = "Noyer";
    private static final String COMMENTAIRE = "Ceci est un commentaire";
    private static final boolean ACTIF = true;
    private static final boolean ARCHIVE = true;
    private static final LocalDateTime CREATION = LocalDateTime.MIN;
    private static final LocalDateTime MODIF = LocalDateTime.MAX;
    private static final String RUE = "25 rue TrucMuche";
    private static final String CP = "95 056";
    private static final String VILLE = "Rintintin";
    private static final String PAYS = "France";
    private static final int ENTREPRISE_ID = 654;
    private static final String ENTREPRISE_NOM = "Test oeuf";
    private static final float LATITUDE = 951;
    private static final float LONGITUDE = 159;

    public BatimentEntity creerEntity(){
        BatimentEntity entity = new BatimentEntity();
        AdresseEntity adresse = new AdresseEntity();
        EntrepriseEntity entreprise = new EntrepriseEntity();
        GpsEntity gps = new GpsEntity();

        entity.setId(ID);
        entity.setInuav(INUAV);
        entity.setAdresse(adresse);
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
        AdresseBo adresse = new AdresseBo();
        EntreprisePo entreprise = new EntreprisePo();
        GpsBo gps = new GpsBo();

        bo.setId(ID);
        bo.setInuav(INUAV);
        bo.setAdresseBo(adresse);
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
        form.setEntrepriseId(ENTREPRISE_ID);
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
        table.setInuav(INUAV);
        table.setAdresse(RUE+" "+CP+" "+VILLE+" "+PAYS);
        table.setEntrepriseId(ENTREPRISE_ID);
        table.setEntrepriseNom(ENTREPRISE_NOM);
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
        view.setEntreprise(ENTREPRISE_NOM);
        view.setEntrepriseId(ENTREPRISE_ID);
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
}
