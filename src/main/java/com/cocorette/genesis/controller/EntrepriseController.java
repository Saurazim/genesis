package com.cocorette.genesis.controller;

import com.cocorette.genesis.model.form.EntrepriseForm;
import com.cocorette.genesis.model.table.EntrepriseTable;
import com.cocorette.genesis.model.view.EntrepriseView;
import com.cocorette.genesis.service.EntrepriseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.List;

@Controller
public class EntrepriseController {
    @Autowired
    EntrepriseService entrepriseService;

    @GetMapping("/entreprises")
    public String entrepriseList(Model model){
        List<EntrepriseTable> tables = entrepriseService.findAll();
        model.addAttribute("entreprises", tables);

        return "entreprise/entrepriseList";
    }

    @GetMapping("/addEntreprise")
    public String showAddEntreprise(Model model){
        EntrepriseForm form = new EntrepriseForm();
        model.addAttribute("form", form);

        //model.addAttribute("erreur",erreur);
        return "entreprise/addEntreprise";
    }

    @PostMapping("/addEntreprise")
    public String saveEntreprise(Model model, @ModelAttribute("form") EntrepriseForm form){
        entrepriseService.saveEntreprise(form);

        return "redirect:/entreprises";
    }

    @GetMapping("/entreprise/{id}")
    public String viewEntreprise(Model model, @PathVariable int id){
        EntrepriseView view = entrepriseService.findEntrepriseView(id);

        model.addAttribute("entreprise", view);
        return "entreprise/entrepriseView";
    }
}
