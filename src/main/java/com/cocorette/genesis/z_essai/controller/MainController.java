package com.cocorette.genesis.z_essai.controller;

import com.cocorette.genesis.z_essai.model.Person;
import com.cocorette.genesis.z_essai.form.PersonForm;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.ArrayList;
import java.util.List;

public class MainController {

    private static List<Person> people = new ArrayList<>();

    static {
        people.add(new Person("Bill","Gates"));
        people.add(new Person("Steve","Jobs"));
    }

    //injection via application.properties
    @Value("${welcome.message}")
    private String message;

    @Value("${error.message}")
    private String errorMessage;

    //@GetMapping(value = {"/","/index"})
    public String index(Model model){
        model.addAttribute("message",message);

        return "essai/index";
    }

    @GetMapping("/personList")
    public String personList(Model model){
        model.addAttribute("people", people);

        return "essai/personList";
    }

    @GetMapping("/addPerson")
    public String showAddPersonPage(Model model){
        PersonForm form = new PersonForm();
        model.addAttribute("personForm",form);

        return "essai/addPerson";
    }

    @PostMapping("/addPerson")
    public String savePerson(Model model, @ModelAttribute("personForm") PersonForm form){
        String firstName = form.getFirstName();
        String lastName = form.getLastName();

        if(!firstName.isBlank() && !lastName.isBlank()){
            Person newPerson = new Person(firstName,lastName);
            people.add(newPerson);

            return "redirect:/essai/personList";
        }

        model.addAttribute("errorMessage", errorMessage);
        return "essai/addPerson";
    }
}
