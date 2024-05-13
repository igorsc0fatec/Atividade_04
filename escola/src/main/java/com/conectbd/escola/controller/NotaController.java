package com.conectbd.escola.controller;

import java.util.List;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.conectbd.escola.model.Nota;
import com.conectbd.escola.service.NotaService;

@RestController
@RequestMapping("/nota")
public class NotaController {
    
    private final NotaService ns;

    public NotaController(NotaService NotaService) {
        this.ns = NotaService;
    }

    @GetMapping("/listar")
    public List<Nota> listaNotas(){
        return (List<Nota>) ns.findAll();
    }

    @PostMapping("/criar")
    public Nota criarEndereco(@RequestBody Nota a){
        Nota novo = ns.save(a);
        return novo;
    }

    @PutMapping("/alterar")
    public void alterar(@RequestBody Nota e) {  
        if (e.getIdNota() > 0) 
        ns.save(e);
    }

    @DeleteMapping("/excluir/{id}")
    public void excluirNota(@PathVariable Long id) { 
        ns.deleteById(id);
    }
}
