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

import com.conectbd.escola.model.Endereco;
import com.conectbd.escola.service.EnderecoService;

@RestController
@RequestMapping("/endereco")
public class EnderecoController {

    private final EnderecoService es;

    public EnderecoController(EnderecoService EnderecoService) {
        this.es = EnderecoService;
    }

    @GetMapping("/listar")
    public List<Endereco> listaEnderecos(){
        return (List<Endereco>) es.findAll();
    }

    @PostMapping("/criar")
    public Endereco criarEndereco(@RequestBody Endereco a){
        Endereco novo = es.save(a);
        return novo;
    }

    @PutMapping("/alterar")
    public void alterar(@RequestBody Endereco e) {  
        if (e.getIdEndereco() > 0) 
        es.save(e);
    }

    @DeleteMapping("/excluir/{id}")
    public void excluirEndereco(@PathVariable Long id) { 
        es.deleteById(id);
    }
}
