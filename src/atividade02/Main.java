
package atividade02;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Livro livro1 = new Livro("A revolta dos bichos", "George Orwell", 2001, "ficcão");

        livro1.resumo();

        Retangulo retangulo1 = new Retangulo(7, 8);

        System.out.println(retangulo1);

        Animal animal1 = new Animal("Capivara", "Mamífero", 5);

        System.out.println(animal1);

        Calculadora calculadora = new Calculadora(10.0, 5.0);

        System.out.println("Soma: " + calculadora.somar());
        System.out.println("Subtração: " + calculadora.subtrair());
        System.out.println("Multiplicação: " + calculadora.multiplicar());

        try {
            System.out.println("Divisão: " + calculadora.dividir());
        } catch (ArithmeticException e) {
            System.out.println("Erro: " + e.getMessage());
        }

        Biblioteca minhaBiblioteca = new Biblioteca();

        // Dados da biblioteca
        minhaBiblioteca.setEndereco("Praça Cívica");
        minhaBiblioteca.setNome("LivrosLivraria");

        // Livro
        Livro meuLivro = new Livro("Principe", "Nicolau Maquiavel", 1943, "Ação");
        Livro meuLivro1 = new Livro("Principe2", "Nicolau Maquiavel", 1943, "Jornalistico");
        Livro meuLivro2 = new Livro("Principe3", "Nicolau Maquiavel", 1943, "Romance");
        Livro meuLivro3 = new Livro("Principe4", "Nicolau Maquiavel", 1943, "Comedia");

        // Lista de Livros
        List<Livro> estanteDeLivros = new ArrayList<>();

        // Adicionando os livros a lista

        estanteDeLivros.add(meuLivro);
        estanteDeLivros.add(meuLivro1);
        estanteDeLivros.add(meuLivro2);
        estanteDeLivros.add(meuLivro3);
        estanteDeLivros.add(new Livro("QualquerLivro", "Ferrari", 2023, "Horror"));

        // Levando a estante para a biblioteca
        minhaBiblioteca.setLivros(estanteDeLivros);

        // Mostrar os livroos na biblioteca

        minhaBiblioteca.listarLivros();

    }

}
