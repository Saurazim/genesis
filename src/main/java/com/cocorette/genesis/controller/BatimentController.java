package com.cocorette.genesis.controller;

import com.cocorette.genesis.coordination.BatimentCoord;
import com.cocorette.genesis.coordination.LotCoord;
import com.cocorette.genesis.model.form.BatimentForm;
import com.cocorette.genesis.model.table.BatimentTable;
import com.cocorette.genesis.model.table.LotTable;
import com.cocorette.genesis.model.view.BatimentView;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

@Controller
public class BatimentController {
    @Autowired
    BatimentCoord batimentCoord;

    @Autowired
    LotCoord lotCoord;

    @GetMapping("/batiments")
    public String batimentList(Model model){
        List<BatimentTable> tables = batimentCoord.findAll();
        model.addAttribute("batiments", tables);

        return "batiment/batimentList";
    }

    @GetMapping("/addBatiment/{entrepriseId}")
    public String showAddBatiment(Model model, @PathVariable int entrepriseId){
        BatimentForm form = new BatimentForm(entrepriseId);
        model.addAttribute("form", form);

        return "batiment/addBatiment";
    }

    @PostMapping("/addBatiment")
    public String saveBatiment(Model model, @ModelAttribute("form") BatimentForm form, @RequestParam("docCharte") MultipartFile file) throws IOException {
        Map<String, String> erreurs = batimentCoord.validBatiment(form);

        if (erreurs.isEmpty()){
            batimentCoord.saveBatiment(form, file);

            return "redirect:/batiments";
        }

        model.addAllAttributes(erreurs);
        model.addAttribute("submit","Formulaire invalide");

        return "batiment/addBatiment";
    }

    @GetMapping("/batiment/{id}")
    public String viewBatiment(Model model, @PathVariable int id){
        BatimentView view = batimentCoord.findBatimentView(id);
        List<LotTable> tables = lotCoord.findLotByBatimentId(id);

        model.addAttribute("batiment", view);
        model.addAttribute("lots", tables);
        return "batiment/batimentView";
    }
}
