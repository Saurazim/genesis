package com.cocorette.genesis.controller;

import com.cocorette.genesis.service.EntrepriseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class EntrepriseController {
    @Autowired
    EntrepriseService entrepriseService;

    @GetMapping("/entreprises")
    public String entrepriseList(Model model){
        return "entrepriseList";
    }

}
