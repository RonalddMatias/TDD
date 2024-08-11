package org.example;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;


public class BibliotecaTest {
    Biblioteca biblioteca;

    Livro livro1;
    Livro livro2;
    Livro livro3;

    Usuario usuario1;
    Usuario usuario2;
    Usuario usuario3;

    @BeforeEach
    public void setUp() {
        biblioteca = new Biblioteca();

        livro1 = new Livro("Java How to Program");
        livro2 = new Livro("Patterns of Enterprise Application Architecture");
        livro3 = new Livro("Head First Design Patterns");

        biblioteca.addLivro(livro1);
        biblioteca.addLivro(livro2);
        biblioteca.addLivro(livro3);

        biblioteca.addUsuario(usuario1);
        biblioteca.addUsuario(usuario2);
        biblioteca.addUsuario(usuario3);
    }
}
