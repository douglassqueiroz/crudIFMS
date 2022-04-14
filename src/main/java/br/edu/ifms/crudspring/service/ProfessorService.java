package br.edu.ifms.crudspring.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.edu.ifms.crudspring.model.Professor;
import br.edu.ifms.crudspring.repository.ProfessorRepository;


@Service
public class ProfessorService {


    @Autowired

    ProfessorRepository professorRepository;

    public List<Professor> getProfessor(){
        return professorRepository.findAll();/*vai retornar uma lista de estudantes do BD*/
    }

    public void save(Professor professor){
       professorRepository.save(professor);
        
    }
    
}
