package com.cocorette.genesis.controller;

import com.cocorette.genesis.convert.EleveurConvert;
import com.cocorette.genesis.form.EleveurForm;
import com.cocorette.genesis.model.ContactEntity;
import com.cocorette.genesis.model.EleveurEntity;
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

    private static List<EleveurForm> eleveurForms = new ArrayList<>();

    static {
        EleveurForm e1 = new EleveurForm();
        e1.setNom("Lemaire");
        e1.setPrenom("Pascal");
        e1.setMail("plemaire@cocorette.fr");
        e1.setTelFixe("###########");
        e1.setTelPort("###########");
        e1.setFax("###########");
        e1.setRue("XXXX");
        e1.setCodePostal(99999);
        e1.setVille("XXXX");
        e1.setPays("France");
        e1.setAdresse();

        EleveurForm e2 = new EleveurForm();
        e2.setNom("Le Gall");
        e2.setPrenom("Hervé");

        eleveurForms.add(e1);
        eleveurForms.add(e2);
    }

    private String erreur = "Le nom et le prénom doivent être remplis";

    @GetMapping("/eleveurs")
    public String eleveurList(Model model){
        model.addAttribute("eleveurs", eleveurForms);

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
            eleveurService.saveEleveur(form);

            eleveurForms.add(form);
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
