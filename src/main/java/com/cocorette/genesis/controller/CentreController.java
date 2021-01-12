package com.cocorette.genesis.controller;

import com.cocorette.genesis.coordination.CentreCoord;
import com.cocorette.genesis.model.form.CentreForm;
import com.cocorette.genesis.model.table.CentreTable;
import com.cocorette.genesis.model.view.CentreView;
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
public class CentreController {
    @Autowired
    CentreCoord centreCoord;

    @GetMapping("/centres")
    public String centreList(Model model){
        List<CentreTable> tables = centreCoord.findAll();
        model.addAttribute("centres", tables);

        return "centre/centreList";
    }

    @GetMapping("/addCentre")
    public String showAddCentre(Model model){
        CentreForm form = new CentreForm();
        model.addAttribute("form", form);

        return "centre/addCentre";
    }

    @PostMapping("/addCentre")
    public String saveCentre(Model model, @ModelAttribute("form")CentreForm form){
        Map<String, String> erreurs = centreCoord.validCentre(form);

        if (erreurs.isEmpty()){
            centreCoord.saveCentre(form);

            return "redirect:/centres";
        }

        model.addAllAttributes(erreurs);
        model.addAttribute("submit","Formulaire invalide");

        return "centre/addCentre";
    }

    @GetMapping("/centre/{id}")
    public String viewCentre(Model model, @PathVariable int id){
        CentreView view = centreCoord.findCentreView(id);

        model.addAttribute("centre",view);
        return "centre/centreView";
    }
}
