package atividade02;

import java.util.List;

public class Biblioteca {
    private String nome;
    private String endereco;
    private List<Livro> livros;

    public Biblioteca(String nome, String endereco, List<Livro> livros){
    this.nome = nome;
    this.endereco = endereco;
    this.livros = livros;
    }

    public String getNome() {
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

    public List<Livro> getLivros() {
        return livros;
    }

    public void setLivros(List<Livro> livros) {
        this.livros = livros;
    }

    public void adicionarLivro(Livro livro){

    }
    public String listarLivros(){
        return nome;
    }
}
