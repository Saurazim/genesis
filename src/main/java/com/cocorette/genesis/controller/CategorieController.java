package com.cocorette.genesis.controller;

import com.cocorette.genesis.coordination.CategorieCoord;
import com.cocorette.genesis.model.form.CategorieForm;
import com.cocorette.genesis.model.table.CategorieTable;
import com.cocorette.genesis.model.view.CategorieView;
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
public class CategorieController {
    @Autowired
    CategorieCoord categorieCoord;

    @GetMapping("/categories")
    public String categorieList(Model model){
        List<CategorieTable> tables = categorieCoord.findAll();
        model.addAttribute("categories", tables);

        return "categorie/categorieList";
    }

    @GetMapping("/addCategorie")
    public String showAddCateg(Model model){
        CategorieForm form = new CategorieForm();
        model.addAttribute("form", form);

        return "categorie/addCategorie";
    }

    @PostMapping("/addCategorie")
    public String saveCateg(Model model, @ModelAttribute("form")CategorieForm form){
        Map<String,String> erreurs = categorieCoord.validCategorie(form);

        if (erreurs.isEmpty()){
            categorieCoord.saveCategorie(form);

            return "redirect:/categories";
        }

        model.addAllAttributes(erreurs);
        model.addAttribute("submit", "Formulaire invalide");

        return "categorie/addCategorie";
    }

    @GetMapping("/categorie/{id}")
    public String viewCateg(Model model, @PathVariable int id){
        CategorieView view = categorieCoord.findCategorieView(id);

        model.addAttribute("categorie",view);
        return "categorie/categorieView";
    }

}
