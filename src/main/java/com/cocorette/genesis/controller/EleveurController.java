package com.cocorette.genesis.controller;

import com.cocorette.genesis.coordination.EleveurCoord;
import com.cocorette.genesis.coordination.EntrepriseCoord;
import com.cocorette.genesis.model.form.EleveurForm;
import com.cocorette.genesis.model.table.EleveurTable;
import com.cocorette.genesis.model.table.EntrepriseTable;
import com.cocorette.genesis.model.view.EleveurView;
import com.cocorette.genesis.service.EleveurService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.ArrayList;
import java.util.List;

@Controller
public class EleveurController {
    @Autowired
    EleveurCoord eleveurCoord;

    @Autowired
    EntrepriseCoord entrepriseCoord;

    private String erreur = "Le nom et le prénom doivent être remplis";

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
        String nom = form.getNom();
        String prenom = form.getPrenom();

        if(!nom.isBlank() && !prenom.isBlank()){
            eleveurCoord.saveEleveur(form);
            return "redirect:/eleveurs";
        }

        model.addAttribute("erreur", erreur);
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
}
