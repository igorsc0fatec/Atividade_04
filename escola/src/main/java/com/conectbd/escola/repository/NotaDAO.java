package com.conectbd.escola.repository;

import org.springframework.data.repository.CrudRepository;

import com.conectbd.escola.model.Nota;

public interface NotaDAO extends CrudRepository <Nota, Long>{
    
}
