package com.cocorette.genesis.controller;

import com.cocorette.genesis.z_essai.form.PersonForm;
import com.cocorette.genesis.z_essai.model.Person;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.ArrayList;
import java.util.List;

@Controller
public class MainController {

    //injection via application.properties
    @Value("${welcome.message}")
    private String message;

    @Value("${error.message}")
    private String errorMessage;

    @GetMapping(value = {"/","/index"})
    public String index(Model model){
        model.addAttribute("message",message);

        return "index";
    }
}
