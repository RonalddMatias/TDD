package org.example;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Biblioteca {
    private List<Livro> livros;
    private List<String> usuarios;
    private HashMap<Livro, String> reservas;

    public Biblioteca() {
        this.livros = new ArrayList<>();
        this.usuarios = new ArrayList<>();
        this.reservas = new HashMap<>();
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


    public String listarLivrosCadastrados() {
        String retorno = "";

        for (Livro l: livros){
            retorno += l.getTitulo() + "\n";
        }
        return retorno;
    }


    public String reservaLivro(int idLivro, int idUsuario) {
        if (idLivro < 0 || idLivro >= livros.size() + 1){
            return "Livro não encontrado";
        }
        if(idUsuario < 0 || idUsuario >= usuarios.size() + 1){
            return "Usuário não encontrado";
        }
        Livro livro = livros.get(idLivro-1);
        if (reservas.containsKey(livro)){
            return "Livro já reservado";
        }

        String usuario = usuarios.get(idUsuario-1);
        reservas.put(livro, usuario);

        return "Livro Reservado: " + livro. getTitulo() + " - " + usuario;
    }
}

