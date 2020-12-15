package com.cocorette.genesis.controller;

import com.cocorette.genesis.convert.BatimentConvert;
import com.cocorette.genesis.coordination.BatimentCoord;
import com.cocorette.genesis.coordination.EntrepriseCoord;
import com.cocorette.genesis.model.form.EntrepriseForm;
import com.cocorette.genesis.model.table.BatimentTable;
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
        Map<String, String> erreurs = entrepriseCoord.validateEntreprise(form);

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
}
