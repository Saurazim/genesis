package com.cocorette.genesis.controller;

import com.cocorette.genesis.coordination.CouvoirCoord;
import com.cocorette.genesis.model.form.CouvoirForm;
import com.cocorette.genesis.model.table.CouvoirTable;
import com.cocorette.genesis.model.view.CouvoirView;
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
public class CouvoirController {
    @Autowired
    CouvoirCoord couvoirCoord;

    @GetMapping("/couvoirs")
    public String couvoirList(Model model){
        List<CouvoirTable> tables = couvoirCoord.findAll();
        model.addAttribute("couvoirs", tables);

        return "couvoir/couvoirList";
    }

    @GetMapping("/addCouvoir")
    public String showAddCouvoir(Model model){
        CouvoirForm form = new CouvoirForm();
        model.addAttribute("form", form);

        return "couvoir/addCouvoir";
    }

    @PostMapping("/addCouvoir")
    public String saveCouvoir(Model model, @ModelAttribute("form")CouvoirForm form){
        Map<String,String > erreurs = couvoirCoord.validCouvoir(form);

        if (erreurs.isEmpty()){
            couvoirCoord.saveCouvoir(form);

            return "redirect:/couvoirs";
        }

        model.addAllAttributes(erreurs);
        model.addAttribute("submit", "Formulaire invalide");

        return "couvoir/addCouvoir";
    }

    @GetMapping("/couvoir/{id}")
    public String viewCouvoir(Model model, @PathVariable int id){
        CouvoirView view = couvoirCoord.findCouvoirView(id);

        model.addAttribute("couvoir", view);
        return "couvoir/couvoirView";
    }
}
