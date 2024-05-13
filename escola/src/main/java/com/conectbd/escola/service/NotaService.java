package com.conectbd.escola.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.conectbd.escola.model.Nota;
import com.conectbd.escola.repository.NotaDAO;

@Service
public class NotaService implements NotaDAO{

    @Autowired
    private NotaDAO notaDAO;

    @Override
    public <S extends Nota> S save(S entity) {
        return notaDAO.save(entity);
    }

    @Override
    public <S extends Nota> Iterable<S> saveAll(Iterable<S> entities) {
        throw new UnsupportedOperationException("Unimplemented method 'saveAll'");
    }

    @Override
    public Optional<Nota> findById(Long id) {
        return notaDAO.findById(id);
    }

    @Override
    public boolean existsById(Long id) {
        throw new UnsupportedOperationException("Unimplemented method 'existsById'");
    }

    @Override
    public Iterable<Nota> findAll() {
        return notaDAO.findAll();
    }

    @Override
    public Iterable<Nota> findAllById(Iterable<Long> ids) {
        throw new UnsupportedOperationException("Unimplemented method 'findAllById'");
    }

    @Override
    public long count() {
        return notaDAO.count();
    }

    @Override
    public void deleteById(Long id) {
        notaDAO.deleteById(id);
    }

    @Override
    public void delete(Nota entity) {
        notaDAO.delete(entity);
    }

    @Override
    public void deleteAllById(Iterable<? extends Long> ids) {
        throw new UnsupportedOperationException("Unimplemented method 'deleteAllById'");
    }

    @Override
    public void deleteAll(Iterable<? extends Nota> entities) {
        throw new UnsupportedOperationException("Unimplemented method 'deleteAll'");
    }

    @Override
    public void deleteAll() {
        throw new UnsupportedOperationException("Unimplemented method 'deleteAll'");
    }
    
}
