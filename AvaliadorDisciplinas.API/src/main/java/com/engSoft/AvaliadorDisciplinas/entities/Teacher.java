package com.engSoft.AvaliadorDisciplinas.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Teacher {

    @Id
    @GeneratedValue
    private Long id;

    private String nome;

    public Teacher() {
    }

    public Teacher(String nome){
        this.nome = nome;
    }

    public long getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
    @Override
    public String toString() {
        return "Teacher {" +
                "id:" + id +
                ", Nome=" + getNome() +
                "}";
    }
}
