package com.conectbd.escola.controller;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.conectbd.escola.model.Aluno;
import com.conectbd.escola.service.AlunoService;

import java.util.List;

@RestController
@RequestMapping("/aluno")
public class AlunoController {

    private final AlunoService as;

    public AlunoController(AlunoService alunoService) {
        this.as = alunoService;
    }

    @GetMapping("/listar")
    public List<Aluno> listaAlunos(){
        return (List<Aluno>) as.findAll();
    }

    @PostMapping("/criar")
    public Aluno criarAluno(@RequestBody Aluno a){
        Aluno novo = as.save(a);
        return novo;
    }

    @PutMapping("/alterar")
    public void alterar(@RequestBody Aluno a) {  
        if (a.getIdAluno() > 0) 
        as.save(a);
    }

    @DeleteMapping("/excluir/{id}")
    public void excluirAluno(@PathVariable Long id) { 
        as.deleteById(id);
    }
}
