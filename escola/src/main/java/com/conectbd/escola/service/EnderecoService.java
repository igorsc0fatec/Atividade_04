package com.conectbd.escola.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.conectbd.escola.model.Endereco;
import com.conectbd.escola.repository.EnderecoDAO;

@Service
public class EnderecoService implements EnderecoDAO{

    @Autowired
    private EnderecoDAO enderecoDAO;

    @Override
    public Iterable<Endereco> findAll() {
        return enderecoDAO.findAll();
    }

    @Override
    public <S extends Endereco> S save(S entity) {
        return enderecoDAO.save(entity);
    }

    @Override
    public <S extends Endereco> Iterable<S> saveAll(Iterable<S> entities) {
        throw new UnsupportedOperationException("Unimplemented method 'saveAll'");
    }

    @Override
    public Optional<Endereco> findById(Long id) {
        return enderecoDAO.findById(id);
    }

    @Override
    public boolean existsById(Long id) {
        throw new UnsupportedOperationException("Unimplemented method 'existsById'");
    }

    @Override
    public Iterable<Endereco> findAllById(Iterable<Long> ids) {
        throw new UnsupportedOperationException("Unimplemented method 'findAllById'");
    }

    @Override
    public long count() {
        return enderecoDAO.count();
    }

    @Override
    public void deleteById(Long id) {
        enderecoDAO.deleteById(id);
    }

    @Override
    public void delete(Endereco entity) {
        enderecoDAO.delete(entity);
    }

    @Override
    public void deleteAllById(Iterable<? extends Long> ids) {
        throw new UnsupportedOperationException("Unimplemented method 'deleteAllById'");
    }

    @Override
    public void deleteAll(Iterable<? extends Endereco> entities) {
        throw new UnsupportedOperationException("Unimplemented method 'deleteAll'");
    }

    @Override
    public void deleteAll() {
        throw new UnsupportedOperationException("Unimplemented method 'deleteAll'");
    }
    
}
