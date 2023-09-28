package atividade02;

import java.util.*;


public class Biblioteca {

// Classe Biblioteca
// Crie uma classe chamada Biblioteca.
// Adicione os seguintes atributos privados:
// String nome
// String endereco
// List<Livro> livros
// Crie um construtor para inicializar o nome e o endereco da classe. 
// Inicialize a lista de livros como uma lista vazia.
// Crie métodos getters e setters para os atributos nome e endereco.
// Adicione um método adicionarLivro(Livro livro) que adiciona um livro à lista de livros da biblioteca.
// Adicione um método listarLivros() que imprime os títulos de todos os livros disponíveis na biblioteca.
// Lembre-se de testar todas as classes e métodos para garantir que eles funcionem como esperado.

private String nome;
private String endereco;
private List<Livro> livros;

// Crie um construtor para inicializar o nome e o endereco da classe. 
public Biblioteca(){
    
}

// Crie métodos getters e setters para os atributos nome e endereco.

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

//Adicione um método adicionarLivro(Livro livro) que adiciona um livro à lista de livros da biblioteca.

public void adicionarLivro(Livro livro){
    livros.add(livro);
}

// Adicione um método listarLivros() que imprime os títulos de todos os livros disponíveis na biblioteca.

public void listarLivros() {
    if (livros.isEmpty()) {
        System.out.println("A biblioteca não possui livros disponíveis.");
    } else {
        System.out.println("Livros disponíveis na biblioteca:");
        for (Livro livro : livros) {
            System.out.println(livro.toString());
        }
    }
}

    
}
