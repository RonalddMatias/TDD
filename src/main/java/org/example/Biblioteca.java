package org.example;

import java.util.ArrayList;
import java.util.List;

public class Biblioteca {
    private List<Livro> livros;
    private List<String> usuarios;

    public Biblioteca() {
        this.livros = new ArrayList<>();
        this.usuarios = new ArrayList<>();
    }

    public void addLivro(Livro livro){
        this.livros.add(livro);
    }

    public void addUsuario(String usuario){
        this.usuarios.add(usuario);
    }

    public ArrayList<Livro> buscarLivro(String titulo) {
        ArrayList<Livro> resultados = new ArrayList<>();

        // percorrer a lista de livros
        for(Livro l : livros){
            if(l.getTitulo().contains(titulo)){
                resultados.add(l);
            }
        }
        return resultados;
    }


    public String listarLivros() {
        String retorno = "";

        for (Livro l: livros){
            retorno += l.getTitulo() + "\n";
        }
        return retorno;
    }
}

