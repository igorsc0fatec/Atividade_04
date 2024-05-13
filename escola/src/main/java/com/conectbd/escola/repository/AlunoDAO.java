package com.conectbd.escola.repository;

import org.springframework.data.repository.CrudRepository;
import com.conectbd.escola.model.Aluno;

public interface AlunoDAO extends CrudRepository <Aluno, Long>{

    
}