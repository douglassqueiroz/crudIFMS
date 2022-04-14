package br.edu.ifms.crudspring.service;

import java.util.List;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.edu.ifms.crudspring.model.Coordenator;
import br.edu.ifms.crudspring.repository.CoordenatorRepository;

@Service
public class CoordenatorService {

    @Autowired


    CoordenatorRepository coordenatorRepository;

    public List<Coordenator> getCoordenator(){
        return coordenatorRepository.findAll();
    }
    
    public void save(Coordenator coordenator){
        coordenatorRepository.save(coordenator);
    }

    public void delete (UUID id){
        coordenatorRepository.deleteById(id);
    }

    public Coordenator findById(UUID id){
        return coordenatorRepository.findById(id).get();
    }

    public void updateCoordenator(Coordenator coordenator){
        coordenatorRepository.save(coordenator);
    }

    
}