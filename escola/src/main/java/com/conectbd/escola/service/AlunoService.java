package com.conectbd.escola.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.conectbd.escola.model.Aluno;
import com.conectbd.escola.repository.AlunoDAO;


@Service
public class AlunoService implements AlunoDAO{
    
    @Autowired
    private AlunoDAO alunoDao;

    @Override
    public Iterable<Aluno> findAll() {
        return alunoDao.findAll();
    }

    @Override
    public <S extends Aluno> S save(S entity) {
        return alunoDao.save(entity);
    }

    @Override
    public Optional<Aluno> findById(Long id) {
        return alunoDao.findById(id);
    }

    @Override
    public long count() {
        return alunoDao.count();
    }

    @Override
    public void delete(Aluno entity) {
        alunoDao.delete(entity);
    }

    @Override
    public void deleteById(Long id) {
        alunoDao.deleteById(id);
    }

    @Override
    public void deleteAll() {
        throw new UnsupportedOperationException("Unimplemented method 'deleteAll'");
    }

    @Override
    public void deleteAll(Iterable<? extends Aluno> entities) {
        throw new UnsupportedOperationException("Unimplemented method 'deleteAll'");
    }

    @Override
    public void deleteAllById(Iterable<? extends Long> ids) {
        throw new UnsupportedOperationException("Unimplemented method 'deleteAllById'");
    }

    @Override
    public boolean existsById(Long id) {
        throw new UnsupportedOperationException("Unimplemented method 'existsById'");
    }

    @Override
    public Iterable<Aluno> findAllById(Iterable<Long> ids) {
        throw new UnsupportedOperationException("Unimplemented method 'findAllById'");
    }

    @Override
    public <S extends Aluno> Iterable<S> saveAll(Iterable<S> entities) {
        throw new UnsupportedOperationException("Unimplemented method 'saveAll'");
    }
}
