package com.cocorette.genesis.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class FragmentController {
    @GetMapping("/fragment")
    public String fragmentPage(){
        return "fragment/fragment";
    }

    @GetMapping("/topbar")
    public String topbarPage(){
        return "fragment/topbar";
    }
}
