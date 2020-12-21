package com.cocorette.genesis.controller;

import com.cocorette.genesis.coordination.AlimentCoord;
import com.cocorette.genesis.coordination.CategorieCoord;
import com.cocorette.genesis.model.table.AlimentTable;
import com.cocorette.genesis.model.table.CategorieTable;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Controller
public class AdminController {

    @Autowired
    AlimentCoord alimentCoord;

    @GetMapping("/administration")
    public String administration(Model model){
        return "admin/admin";
    }

    @GetMapping("/test")
    public String testView(Model model){
        return "test";
    }
}
