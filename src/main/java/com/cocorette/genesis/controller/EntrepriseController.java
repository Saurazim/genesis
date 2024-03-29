package com.cocorette.genesis.controller;

import com.cocorette.genesis.coordination.BatimentCoord;
import com.cocorette.genesis.coordination.EntrepriseCoord;
import com.cocorette.genesis.model.form.EntrepriseForm;
import com.cocorette.genesis.model.modif.EntrepriseModif;
import com.cocorette.genesis.model.table.BatimentTable;
import com.cocorette.genesis.model.table.EntrepriseTable;
import com.cocorette.genesis.model.view.EntrepriseView;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;

@Controller
public class EntrepriseController {
    @Autowired
    EntrepriseCoord entrepriseCoord;
    @Autowired
    BatimentCoord batimentCoord;

    @GetMapping("/entreprises")
    public String entrepriseList(Model model){
        List<EntrepriseTable> tables = entrepriseCoord.findAll();
        model.addAttribute("entreprises", tables);

        return "entreprise/entrepriseList";
    }

    @GetMapping("/addEntreprise/{eleveurId}")
    public String showAddEntreprise(Model model, @PathVariable int eleveurId){
        EntrepriseForm form = new EntrepriseForm(eleveurId);
        model.addAttribute("form", form);

        //model.addAttribute("erreur",erreur);
        return "entreprise/addEntreprise";
    }

    @PostMapping("/addEntreprise")
    public String saveEntreprise(Model model, @ModelAttribute("form") EntrepriseForm form){
        Map<String, String> erreurs = entrepriseCoord.validEntreprise(form);

        if (erreurs.isEmpty()){
            entrepriseCoord.saveEntreprise(form);

            return "redirect:/entreprises";
        }

        model.addAllAttributes(erreurs);
        model.addAttribute("submit", "Formulaire invalide");
        return "entreprise/addEntreprise";
    }

    @GetMapping("/entreprise/{id}")
    public String viewEntreprise(Model model, @PathVariable int id){
        EntrepriseView view = entrepriseCoord.findEntrepriseView(id);
        List<BatimentTable> tables = batimentCoord.findBatimentByEntrepriseId(id);

        model.addAttribute("entreprise", view);
        model.addAttribute("batiments", tables);
        return "entreprise/entrepriseView";
    }

    @GetMapping("/entreprise/{id}/modif")
    public String modifEntreprise(Model model, @PathVariable int id){
        EntrepriseModif modif = entrepriseCoord.findEntrepriseModif(id);

        model.addAttribute("modif", modif);
        return "entreprise/updateEntreprise";
    }

    @PutMapping("/updateEntreprise")
    public String updateEntreprise(Model model, @ModelAttribute("modif") EntrepriseModif modif){
        Map<String, String> erreurs = entrepriseCoord.validEntreprise(modif);
        boolean change = false;

        if (erreurs.isEmpty()){

        }

        model.addAttribute("change", change);
        model.addAttribute("erreurs", erreurs);
        return "entreprise/updateEntreprise";
    }
}
