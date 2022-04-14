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

import br.edu.ifms.crudspring.model.Professor;
import br.edu.ifms.crudspring.service.ProfessorService;

@Controller
@RequestMapping("/professor")
public class ProfessorController {
 

    @Autowired
    public ProfessorService professorService;

   @PostMapping("/salvar")
   public String save(@ModelAttribute("Professor")Professor professor){
       professorService.save(professor);
       return "redirect:/professor/pList";
   }
   //------------------------------------------------------------------


   @GetMapping("/pList")
   public String getProfessor(Model model){
       List<Professor> students = professorService.getProfessor();
       model.addAttribute("professor",students);
       model.addAttribute("professorSemDados", new Professor());
       return "pList";
   }
   //--------------------------------------------

   @GetMapping("/remove/{id}")
   public String removeProfessor(@PathVariable ("id") UUID id){
       professorService.delete(id);
       return "redirect:/professor/pList";
   }

//-----------------------------------
    @PostMapping("/update/{id}")
    public String updateProfessor(@PathVariable("id")UUID id, Professor professor, Model model){

        professorService.updateProfessor(professor);

        return "redirect:/professor/pList";
    }

}