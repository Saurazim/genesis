package com.cocorette.genesis.controller;

import com.cocorette.genesis.coordination.SoucheCoord;
import com.cocorette.genesis.model.form.SoucheForm;
import com.cocorette.genesis.model.table.SoucheTable;
import com.cocorette.genesis.model.view.SoucheView;
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
public class SoucheController {
    @Autowired
    SoucheCoord soucheCoord;

    @GetMapping("/souches")
    public String soucheList(Model model){
        List<SoucheTable> tables = soucheCoord.findAll();
        model.addAttribute("souches", tables);

        return "souche/soucheList";
    }

    @GetMapping("/addSouche")
    public String showAddSouche(Model model){
        SoucheForm form = new SoucheForm();
        model.addAttribute("form", form);

        return "souche/addSouche";
    }

    @PostMapping("/addSouche")
    public String saveSouche(Model model, @ModelAttribute("form")SoucheForm form){
        Map<String,String> erreur = soucheCoord.validSouche(form);

        if (erreur.isEmpty()){
            soucheCoord.saveSouche(form);

            return "redirect:/souches";
        }

        model.addAllAttributes(erreur);
        model.addAttribute("submit","Formulaire invalide");

        return "souche/addSouche";
    }

    @GetMapping("/souche/{id}")
    public String viewSouche(Model model, @PathVariable int id){
        SoucheView view = soucheCoord.findSoucheView(id);

        model.addAttribute("souche", view);
        return "souche/soucheView";
    }
}
