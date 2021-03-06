package com.cocorette.genesis.controller;

import com.cocorette.genesis.coordination.AlimentCoord;
import com.cocorette.genesis.model.form.AlimentForm;
import com.cocorette.genesis.model.table.AlimentTable;
import com.cocorette.genesis.model.view.AlimentView;
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
public class AlimentController {
    @Autowired
    AlimentCoord alimentCoord;

    @GetMapping("/aliments")
    public String alimentList(Model model){
        List<AlimentTable> tables = alimentCoord.findAll();
        model.addAttribute("aliments", tables);

        return "aliment/alimentList";
    }

    @GetMapping("/addAliment")
    public String showAddAliment(Model model){
        AlimentForm form = new AlimentForm();
        model.addAttribute("form", form);

        return "aliment/addAliment";
    }

    @PostMapping("/addAliment")
    public String saveAliment(Model model, @ModelAttribute("form")AlimentForm form){
        Map<String, String> erreurs = alimentCoord.validAliment(form);

        if (erreurs.isEmpty()){
            alimentCoord.saveAliment(form);

            return "redirect:/aliments";
        }

        model.addAllAttributes(erreurs);
        model.addAttribute("submit","Formulaire invalide");

        return "aliment/addAliment";
    }

    @GetMapping("/aliment/{id}")
    public String viewAliment(Model model, @PathVariable int id){
        AlimentView view = alimentCoord.findAlimentView(id);

        model.addAttribute("aliment", view);
        return "aliment/alimentView";
    }
}
