package com.cocorette.genesis.controller;

import com.cocorette.genesis.coordination.LotCoord;
import com.cocorette.genesis.model.form.LotForm;
import com.cocorette.genesis.model.table.LotTable;
import com.cocorette.genesis.model.view.LotView;
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
public class LotController {
    @Autowired
    LotCoord lotCoord;

    @GetMapping("/lots")
    public String lotList(Model model){
        List<LotTable> lots = lotCoord.findAll();
        model.addAttribute("lots", lots);

        return "lot/lotList";
    }

    @GetMapping("/addLot/{batimentId}")
    public String showAddLot(Model model, @PathVariable int batimentId){
        LotForm form = new LotForm(batimentId);
        model.addAttribute("form", form);

        return "lot/addLot";
    }

    @PostMapping("/addLot")
    public String saveLot(Model model, @ModelAttribute("form") LotForm form){
        lotCoord.saveLot(form);

        return "redirect:/lots";
    }

    @GetMapping("/lot/{id}")
    public String viewLot(Model model, @PathVariable int id){
        LotView view = lotCoord.findLotView(id);

        model.addAttribute("lot", view);
        return "lot/lotView";
    }
}
