package br.edu.ifms.crudspring.service;

import java.util.List;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.edu.ifms.crudspring.model.Estudante;
import br.edu.ifms.crudspring.repository.EstudanteRepositorio;


@Service
public class EstudanteServico {
    
    @Autowired
    
    
    EstudanteRepositorio estudanteRepositorio;

    public List<Estudante> getEstudante(){
        return estudanteRepositorio.findAll();/*vai retornar uma lista de estudantes do BD*/
    }

    
    public void save(Estudante estudante){
        estudanteRepositorio.save(estudante);
        
    }

    public void delete(UUID id){
        estudanteRepositorio.deleteById(id);
    }
    public Estudante findById(UUID id) {
        return estudanteRepositorio.findById(id).get();
    }
    public void updateEstudante(Estudante estudante) {
        estudanteRepositorio.save(estudante);
    }


}
