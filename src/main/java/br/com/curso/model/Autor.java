package br.com.curso.model;

import java.io.Serializable;
import java.util.List;
import java.util.Set;

public class Autor implements Serializable {

    // atributo serial
    private static final long serialVersionUID = 1L;

    // Metodo Construtores, invocados sempre que a classe é instanciada.
    // Deve possuir 2 construtores. Um sem parametros e outros com TODOS os
    // atributos da classe
    public Autor() {
    }

    public Autor(Long id, String nome) {
        this.id = id;
        this.nome = nome;
    }
    
    // Atributos da Classe, devem ser privados e sempre tem um atributo chamado id
    private Long id;
    private String nome;

    // Métodos get/set. Um get e um set para cada atributo da classe
    public Long getId() {
        return this.id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNome() {
        return this.nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj == null || obj.getClass() != this.getClass()) {
            return false;
        }

        Autor guest = (Autor) obj;
        return id == guest.id;
    }

    @Override
    public String toString() {
        return "Id: " + this.id + ", Nome: "+ this.nome;
    }
}
