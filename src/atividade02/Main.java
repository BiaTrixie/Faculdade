
package atividade02;

public class Main {
    public static void main(String[] args) {
        Livro livro1 = new Livro("A revolta dos bichos", "George Orwell", 2001, "ficcão");
        Biblioteca b1 = new Biblioteca("A dama e o vagabundo", "sla" );

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

        System.out.println(b1.listarLivros());

    }

}
