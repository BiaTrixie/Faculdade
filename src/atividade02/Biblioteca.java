package atividade02;

import java.util.ArrayList;
import java.util.List;

public class Biblioteca {
    private static String nome;
    private String endereco;
    private List<Livro> livros;

    public Biblioteca(String nome, String endereco){
    this.nome = nome;
    this.endereco = endereco;
    this.livros = new ArrayList<>();
    }

    public static String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public void adicionarLivro(Livro livro) {
        livros.add(livro);
    }


    public void listarLivros() {
        
        System.out.println("Livros disponíveis na biblioteca:");
            
        for (Livro livro : livros) {
            System.out.println(livro.getTitulo());
        }
            
        }
    }

