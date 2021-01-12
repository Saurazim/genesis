package com.cocorette.genesis.controller;

import com.cocorette.genesis.coordination.VeterinaireCoord;
import com.cocorette.genesis.model.form.VeterinaireForm;
import com.cocorette.genesis.model.table.VeterinaireTable;
import com.cocorette.genesis.model.view.VeterinaireView;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.List;
import java.util.Map;

@Controller
public class VeterinaireController {
    @Autowired
    VeterinaireCoord veterinaireCoord;

    @GetMapping("/veterinaires")
    public String veterinaireList(Model model){
        List<VeterinaireTable> tables = veterinaireCoord.findAll();
        model.addAttribute("veterinaires", tables);

        return "veterinaire/veterinaireList";
    }

    @GetMapping("/addVeterinaire")
    public String showAddVeterinaire(Model model){
        VeterinaireForm form = new VeterinaireForm();
        model.addAttribute("form", form);

        return "veterinaire/addVeterinaire";
    }

    @PostMapping("/addVeterinaire")
    public String saveVeterinaire(Model model, @ModelAttribute("form")VeterinaireForm form){
        Map<String, String> erreurs = veterinaireCoord.validVeterinaire(form);

        if (erreurs.isEmpty()){
            veterinaireCoord.saveVeterinaire(form);

            return "redirect:/veterinaires";
        }

        model.addAllAttributes(erreurs);
        model.addAttribute("submit","Formulaire invalide");

        return "veterinaire/addVeterinaire";
    }

    @GetMapping("/veterinaire/{id}")
    public String viewVeterinaire(Model model, @PathVariable int id){
        VeterinaireView view = veterinaireCoord.findVeterinaireView(id);

        model.addAttribute("veterinaire", view);
        return "veterinaire/veterinaireView";
    }
}
