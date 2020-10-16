package com.cocorette.genesis.controller;

import com.cocorette.genesis.convert.EleveurConvert;
import com.cocorette.genesis.form.EleveurForm;
import com.cocorette.genesis.model.Eleveur;
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
    EleveurService eleveurService;

    private static List<Eleveur> eleveurs = new ArrayList<>();

    static {
        Eleveur e1 = new Eleveur();
        e1.setNom("Lemaire");
        e1.setPrenom("Pascal");
        e1.setMail("plemaire@cocorette.fr");
        e1.setTelFixe("###########");
        e1.setTelPort("###########");
        e1.setFax("###########");

        Eleveur e2 = new Eleveur();
        e2.setNom("Le Gall");
        e2.setPrenom("Hervé");

        eleveurs.add(e1);
        eleveurs.add(e2);
    }

    private String erreur = "Le nom et le prénom doivent être remplis";

    @GetMapping("/eleveurList")
    public String eleveurList(Model model){
        model.addAttribute("eleveurs",eleveurs);

        return "eleveurList";
    }

    @GetMapping("/addEleveur")
    public String showAddEleveurPage(Model model){
        EleveurForm form = new EleveurForm();
        model.addAttribute("form",form);

        return "addEleveur";
    }

    @PostMapping("/addEleveur")
    public String saveEleveur(Model model, @ModelAttribute("form") EleveurForm form){
        String nom = form.getNom();
        String prenom = form.getPrenom();

        if(!nom.isBlank() && !prenom.isBlank()){
            Eleveur e = EleveurConvert.eleveurFormToEntity(form);
            eleveurs.add(e);
            return "redirect:/eleveurList";
        }

        model.addAttribute("erreur", erreur);
        return "addEleveur";
    }

    @GetMapping("/eleveur/{id}")
    public String viewEleveur(Model model, @PathVariable int id){
        EleveurForm form = eleveurService.findEleveurForm(id);

        model.addAttribute("eleveur",form);
        return "eleveurView";
    }
}
