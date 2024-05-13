package com.conectbd.escola.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Endereco {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id_endereco;
    @Column (name = "rua")
    private String rua;
    @Column (name = "cidade")
    private String cidade;
    @Column (name = "uf")
    private String uf;
    @Column (name = "cep")
    private String cep;
    @Column (name = "numero")
    private int numero;
    @Column (name = "id_aluno")
    private long id_aluno;

    public long getIdEndereco(){
        return id_endereco;
    }

    public void setIdEndereco (long id_endereco){
        this.id_endereco = id_endereco;
    }

    public String getRua() {
        return rua;
    }

    public void setRua(String rua) {
        this.rua = rua;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public String getUf() {
        return uf;
    }

    public void setUf(String uf) {
        this.uf = uf;
    }

    public String getCep() {
        return cep;
    }

    public void setCep(String cep) {
        this.cep = cep;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public long getIdAluno() {
        return id_aluno;
    }

    public void setIdAluno(long id_aluno) {
        this.id_aluno = id_aluno;
    }
}
