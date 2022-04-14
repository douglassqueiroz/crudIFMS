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

import br.edu.ifms.crudspring.model.Estudante;
import br.edu.ifms.crudspring.service.EstudanteServico;

@Controller
@RequestMapping("/estudante")
public class EstudanteControle {
    

    @Autowired
    public EstudanteServico estudanteServico;

    @PostMapping("/salvar")
    public String save(@ModelAttribute("Estudante") Estudante estudante){
        estudanteServico.save(estudante);
        return "redirect:/estudante/lista";
    }
//------------------------------------------------------------------


    @GetMapping("/lista")
    public String getEstudante(Model model){
        List<Estudante> students = estudanteServico.getEstudante();
        model.addAttribute("estudante",students);
        model.addAttribute("estudanteSemDados", new Estudante());
        return "lista";
    }
//------------------------------------------------------------------

    @GetMapping("/remove/{id}")
    public String removeEstudante(@PathVariable ("id") UUID id){
        estudanteServico.delete(id);
        return "redirect:/estudante/lista";
    }


//------------------------------------------------------------------
    @PostMapping("/update/{id}")
    public String updateEstudante(@PathVariable("id")UUID id, Estudante estudante, Model model){

        estudanteServico.updateEstudante(estudante);

        return "redirect:/estudante/lista";
    }

}
