package br.edu.ifms.crudspring.model;

import java.util.UUID;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Professor {
    
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)//esse cara é o que vai gerar os ids do banco de dados
    UUID id;

    //@NotBlank(message = "Nome não pode estar em branco");
    String name;
    //@OneToOne
    //@JoinColumn(name = "turma_id")
    //List<Professor> professores;
    String email;

    String password;

}
