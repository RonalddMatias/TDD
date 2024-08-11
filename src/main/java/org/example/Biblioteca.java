package org.example;

import java.util.ArrayList;
import java.util.List;

public class Biblioteca {
    private List<Livro> livros;
    private List<String> usuarios;

    public Biblioteca() {
        this.livros = new ArrayList<>();
    }

    public void addLivro(Livro livro){
        this.livros.add(livro);
    }

    public void addUsuario(String usuario){
        this.usuarios.add(usuario);
    }

}
