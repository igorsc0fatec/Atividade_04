package com.conectbd.escola.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Aluno {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id_aluno;
    @Column (name = "nm_aluno")
    private String nome;
    @Column (name = "nm_curso")
    private String curso;
    @Column (name = "idade")
    private int idade;
    @Column (name = "matricula")
    private boolean matricula;

    public long getIdAluno(){
        return id_aluno;
    }
    public void setIdAluno (long id_aluno){
        this.id_aluno = id_aluno;
    }
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getCurso() {
        return curso;
    }
    public void setCurso(String curso) {
        this.curso = curso;
    }
    public int getIdade() {
        return idade;
    }
    public void setIdade(int idade) {
        this.idade = idade;
    }
    public boolean isMatriculado() {
        return matricula;
    }
    public void setMatriculado(boolean matricula) {
        this.matricula = matricula;
    }

}
