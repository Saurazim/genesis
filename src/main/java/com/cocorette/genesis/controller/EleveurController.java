package com.cocorette.genesis.controller;

import com.cocorette.genesis.coordination.EleveurCoord;
import com.cocorette.genesis.coordination.EntrepriseCoord;
import com.cocorette.genesis.model.form.EleveurForm;
import com.cocorette.genesis.model.modif.EleveurModif;
import com.cocorette.genesis.model.table.EleveurTable;
import com.cocorette.genesis.model.table.EntrepriseTable;
import com.cocorette.genesis.model.view.EleveurView;
import com.cocorette.genesis.service.EleveurService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

@Controller
public class EleveurController {
    @Autowired
    EleveurCoord eleveurCoord;

    @Autowired
    EntrepriseCoord entrepriseCoord;


    @GetMapping("/eleveurs")
    public String eleveurList(Model model){
        List<EleveurTable> tables = eleveurCoord.findAll();
        model.addAttribute("eleveurs", tables);

        return "eleveur/eleveurList";
    }

    @GetMapping("/addEleveur")
    public String showAddEleveurPage(Model model){
        EleveurForm form = new EleveurForm();
        model.addAttribute("form",form);

        return "eleveur/addEleveur";
    }

    @PostMapping("/addEleveur")
    public String saveEleveur(Model model, @ModelAttribute("form") EleveurForm form){
        Map<String, String> erreurs = eleveurCoord.validEleveur(form);

        if(erreurs.isEmpty()){
            eleveurCoord.saveEleveur(form);
            return "redirect:/eleveurs";
        }

        model.addAllAttributes(erreurs);
        model.addAttribute("submit","Formulaire invalide");
        return "eleveur/addEleveur";
    }

    @GetMapping("/eleveur/{id}")
    public String viewEleveur(Model model, @PathVariable int id){
        EleveurView view = eleveurCoord.findEleveurView(id);
        List<EntrepriseTable> tables = entrepriseCoord.findEntrepriseByEleveurId(id);

        model.addAttribute("eleveur",view);
        model.addAttribute("entreprises", tables);
        return "eleveur/eleveurView";
    }

    @GetMapping("/eleveur/{id}/modif")
    public String modifEleveur(Model model, @PathVariable int id){
        EleveurModif modif = eleveurCoord.findEleveurModif(id);

        model.addAttribute("modif", modif);
        return "eleveur/updateEleveur";
    }

    @PutMapping("/updateEleveur")
    public String updateEleveur(Model model, @ModelAttribute("modif") EleveurModif modif){
        Map<String,String> erreurs = eleveurCoord.validEleveur(modif);
        boolean change = false;

        if(erreurs.isEmpty()){
            change = eleveurCoord.updateEleveur(modif);
        }

        if (change)
            return "redirect:/eleveurs";

        model.addAttribute("change", change);
        model.addAttribute("erreurs",erreurs);
        return "eleveur/updateEleveur";
    }

}
