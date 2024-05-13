package com.conectbd.escola.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "nota")
public class Nota {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id_nota;
    @Column (name = "nm_disciplina")
    private String nome_disciplina;
    @Column (name = "nota")
    private double nota;
    @Column (name = "id_aluno")
    private long id_aluno;

    public long getIdNota(){
        return id_nota;
    }

    public void setIdNota (long id_nota){
        this.id_nota = id_nota;
    }

    public String getNomeDisciplina() {
        return nome_disciplina;
    }

    public void setNomeDisciplina(String nome_disciplina) {
        this.nome_disciplina = nome_disciplina;
    }

    public double getNota() {
        return nota;
    }

    public void setNota(double nota) {
        this.nota = nota;
    }

    public long getIdAluno() {
        return id_aluno;
    }

    public void setIdAluno(long id_aluno) {
        this.id_aluno = id_aluno;
    }
}
