package com.cocorette.genesis.controller;

import com.cocorette.genesis.coordination.BatimentCoord;
import com.cocorette.genesis.model.form.BatimentForm;
import com.cocorette.genesis.model.table.BatimentTable;
import com.cocorette.genesis.model.view.BatimentView;
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
public class BatimentController {
    @Autowired
    BatimentCoord batimentCoord;

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
        batimentCoord.saveBatiment(form);

        return "redirect:/batiments";
    }

    @GetMapping("/batiment/{id}")
    public String viewBatiment(Model model, @PathVariable int id){
        BatimentView view = batimentCoord.findBatimentView(id);

        model.addAttribute("batiment", view);
        return "batiment/batimentView";
    }
}
