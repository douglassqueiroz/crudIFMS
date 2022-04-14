package br.edu.ifms.crudspring.controller;

import java.util.List; 
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import br.edu.ifms.crudspring.model.Coordenator;
import br.edu.ifms.crudspring.service.CoordenatorService;

@Controller
@RequestMapping("/coordenator")
public class CoordenatorController {
 

    @Autowired
    public CoordenatorService coordenatorService;

    @PostMapping("/salvar")
    public String save(@ModelAttribute("Coordenator")Coordenator coordenator){
        coordenatorService.save(coordenator);
        return "redirect:/coordenator/cList";
    }
//-----------------------------------------------------------
    @GetMapping("/cList")
    public String getCoordenator(Model model){
        List<Coordenator>coordenators = coordenatorService.getCoordenator();
        model.addAttribute("coordenator",coordenators);
        model.addAttribute("coordenators", new Coordenator());
        return "cList";
    }
//-------------------------------------------------------------
    @GetMapping("/remove/{id}")
    public String removeCoordenator(@PathVariable ("id") UUID id){
        coordenatorService.delete(id);
        return "redirect:/coordenator/cList";
    }
//-------------------------------------------------------
    @PostMapping("/update/{id}")
    public String updateCoordenator(@PathVariable("id")UUID id, Coordenator coordenator, Model model){
        coordenatorService.updateCoordenator(coordenator);
        return "redirect:/coordenator/cList";
    }




}



