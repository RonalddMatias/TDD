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

    @Test
    @DisplayName("Quando o usuario deseja listar todos os livros cadastrados")
    public void TestListarLivros(){
        assertEquals("Java How to Program\nPatterns of head Application Architecture\nhead First Patterns\n", biblioteca.listarLivrosCadastrados());
    }

    @Test
    @DisplayName("Quando o usuario deseja listar todos os livros disponíveis")
    public void testarListarLivrosDisponiveis(){
        biblioteca.reservaLivro(1,1);
        assertEquals("Patterns of head Application Architecture\nhead First Patterns\n", biblioteca.listarLivrosDisponiveis());
    }

    @Test
    @DisplayName("Quando o usuario deseja reservar um livro")
    public void TestReservarLivro(){
           assertEquals("Livro Reservado: Java How to Program - João", biblioteca.reservaLivro(1,1));
           assertEquals("Livro Reservado: Patterns of head Application Architecture - Maria", biblioteca.reservaLivro(2,2));
           assertEquals("Livro Reservado: head First Patterns - José", biblioteca.reservaLivro(3,3));
           assertEquals("Livro já reservado", biblioteca.reservaLivro(1,2));
           assertEquals("Livro não encontrado", biblioteca.reservaLivro(4,1));
           assertEquals("Livro não encontrado", biblioteca.reservaLivro(-1,1));
           assertEquals("Usuário não encontrado", biblioteca.reservaLivro(1,4));
    }


}
