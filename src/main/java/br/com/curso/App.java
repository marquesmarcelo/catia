package br.com.curso;

import br.com.curso.model.Autor;

public class App {
    public static void main(String[] args) {
        Autor marcelo = new Autor(100L, "marcelo");
        Autor catia = new Autor(100L, "catia");

        System.out.println(marcelo.getNome());

    }
}
