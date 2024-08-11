package org.example;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;


public class BibliotecaTest {
    Biblioteca biblioteca;

    Livro livro1;
    Livro livro2;
    Livro livro3;



    @BeforeEach
    public void setUp() {
        biblioteca = new Biblioteca();

        livro1 = new Livro("Java How to Program");
        livro2 = new Livro("Patterns of head Application Architecture");
        livro3 = new Livro("head First Patterns");

        biblioteca.addLivro(livro1);
        biblioteca.addLivro(livro2);
        biblioteca.addLivro(livro3);

        biblioteca.addUsuario("João");
        biblioteca.addUsuario("Maria");
        biblioteca.addUsuario("José");
    }

    @Test
    @DisplayName("Quando um Usuário quer buscar um livro")
    public void buscarLivro(){
        ArrayList<Livro> livros1 = biblioteca.buscarLivro("Java");
        assertEquals(livros1, new ArrayList<Livro>(List.of(livro1)));

        ArrayList<Livro> livros2 = biblioteca.buscarLivro("head");
        assertEquals(livros2, new ArrayList<Livro>(List.of(livro2, livro3)));
    }


}
