package com.cocorette.genesis.model;

import com.cocorette.genesis.configuration.ConstantesForTest;
import com.cocorette.genesis.model.bo.*;
import com.cocorette.genesis.model.entity.*;
import com.cocorette.genesis.model.form.EntrepriseForm;
import com.cocorette.genesis.model.table.EntrepriseTable;
import com.cocorette.genesis.model.transitionnel.EleveurPo;
import com.cocorette.genesis.model.transitionnel.EntreprisePo;
import com.cocorette.genesis.model.view.EntrepriseView;

import java.time.LocalDateTime;

public class EntrepriseTest {
    private static final int ID = ConstantesForTest.ID;
    private static final String EDE = ConstantesForTest.EDE;
    private static final String NOM = ConstantesForTest.NOM_ENTERPRISE;
    private static final String COMM = ConstantesForTest.COMM;
    private static final boolean ACTIF = ConstantesForTest.ACTIF;
    private static final boolean ARCHIVE = ConstantesForTest.ARCHIVE;
    private static final LocalDateTime CREATION = ConstantesForTest.CREATION;
    private static final LocalDateTime MODIF = ConstantesForTest.MODIF;
    private static final String RUE = ConstantesForTest.RUE;
    private static final String CP = ConstantesForTest.CP;
    private static final String VILLE = ConstantesForTest.VILLE;
    private static final String PAYS = ConstantesForTest.PAYS;
    private static final String MAIL = ConstantesForTest.MAIL;
    private static final String FIXE = ConstantesForTest.FIXE;
    private static final String PORT = ConstantesForTest.PORT;
    private static final String FAX = ConstantesForTest.FAX;
    private static final String ELEVEURNOM = ConstantesForTest.NOM_ELEVEUR;
    private static final String ELEVEURPRENOM = ConstantesForTest.PRENOM_ELEVEUR;
    private static final String VETO = ConstantesForTest.NOM_VETO;
    private static final String CENTRE = ConstantesForTest.NOM_CENTRE;

    public EntrepriseEntity creerEntity(){
        EntrepriseEntity entity = new EntrepriseEntity();

        VeterinaireEntity veto = new VeterinaireEntity();


        entity.setId(ID);
        entity.setEde(EDE);
        entity.setNom(NOM);
        entity.setCommentaire(COMM);
        entity.setActif(ACTIF);
        entity.setArchive(ARCHIVE);
        entity.setCreated(CREATION);
        entity.setModified(MODIF);

        return entity;
    }

    public EntrepriseBo creerBo(){
        EntrepriseBo bo = new EntrepriseBo();

        VeterinaireBo veto = new VeterinaireBo();
        veto.setId(ID);
        veto.setNom(VETO);

        bo.setId(ID);
        bo.setNom(NOM);
        bo.setEde(EDE);
        bo.setVeterinaireBo(veto);
        bo.setCommentaire(COMM);
        bo.setActif(ACTIF);
        bo.setArchive(ARCHIVE);
        bo.setCreated(CREATION);
        bo.setModified(MODIF);

        return bo;
    }

    public EntrepriseForm creerForm(){
        EntrepriseForm form = new EntrepriseForm();

        form.setId(ID);
        form.setEde(EDE);
        form.setNom(NOM);
        form.setRue(RUE);
        form.setCodePostal(CP);
        form.setVille(VILLE);
        form.setPays(PAYS);
        form.setMail(MAIL);
        form.setTelFixe(FIXE);
        form.setTelPort(PORT);
        form.setFax(FAX);
        form.setEleveurId(ID);
        form.setCommentaire(COMM);

        return form;
    }

    public EntrepriseTable creerTable(){
        EntrepriseTable table = new EntrepriseTable();

        table.setId(ID);
        table.setEde(EDE);
        table.setNom(NOM);
        table.setEleveurNom(ELEVEURNOM+" "+ELEVEURPRENOM);
        table.setEleveurId(ID);
        table.setAdresse(RUE+" "+CP+" "+VILLE+" "+PAYS);
        table.setMail(MAIL);
        table.setTelFixe(FIXE);
        table.setTelPort(PORT);
        table.setFax(FAX);
        table.setVeterinaire(VETO);
        table.setCentre(CENTRE);
        table.setActif(ACTIF);
        table.setArchive(ARCHIVE);
        table.setCreated(CREATION);
        table.setModified(MODIF);

        return table;
    }

    public EntrepriseView creerView(){
        EntrepriseView view = new EntrepriseView();

        view.setId(ID);
        view.setNom(NOM);
        view.setEde(EDE);
        view.setMail(MAIL);
        view.setTelFixe(FIXE);
        view.setTelPort(PORT);
        view.setFax(FAX);
        view.setRue(RUE);
        view.setCodePostal(CP);
        view.setVille(VILLE);
        view.setPays(PAYS);
        view.setEleveur(ELEVEURNOM);
        view.setEleveurId(ID);
        view.setVeterinaireId(ID);
        view.setVeterinaire(VETO);
        view.setCentreId(ID);
        view.setCentre(CENTRE);
        view.setCommentaire(COMM);
        view.setCreated(CREATION);
        view.setModified(MODIF);
        view.setActif(ACTIF);
        view.setArchive(ARCHIVE);

        return view;
    }

    public EntreprisePo creerPo(){
        EntreprisePo po = new EntreprisePo();

        po.setId(ID);
        po.setEde(EDE);
        po.setNom(NOM);

        return po;
    }
}
