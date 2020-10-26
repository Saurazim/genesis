package com.cocorette.genesis.controller;

import com.cocorette.genesis.model.form.BatimentForm;
import com.cocorette.genesis.model.table.BatimentTable;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.ArrayList;
import java.util.List;

@Controller
public class BatimentController {
    @GetMapping("/batiments")
    public String batimentList(Model model){
        List<BatimentTable> tables = new ArrayList<>();
        model.addAttribute("batiments", tables);

        return "batiment/batimentEntreprise";
    }

    @GetMapping("/addBatiment")
    public String showAddBatiment(Model model){
        BatimentForm form = new BatimentForm();
        model.addAttribute("form", form);

        return "batiment/addBatiment";
    }

    @PostMapping("/addBatiment")
    public String saveBatiment(Model model, @ModelAttribute("form") BatimentForm form){
        //TODO
        return "redirect:/batiments";
    }
}
