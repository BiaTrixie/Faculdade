package atividade01;

import java.util.Scanner;

public class Carro {
    // Atributos
    private String marca;
    private String modelo;
    private int ano;
    private double quilometragem;

    // Construtor
    public Carro(String marca, String modelo, int ano, double quilometragem) {
        this.marca = marca;
        this.modelo = modelo;
        this.ano = ano;
        this.quilometragem = quilometragem;
    }

    // Métodos Getters e Setters
    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public double getQuilometragem() {
        return quilometragem;
    }

    public void setQuilometragem(double quilometragem) {
        this.quilometragem = quilometragem;
    }

    void exibirInfo() {
		try (Scanner console = new Scanner(System.in)) {
			System.out.print("Marca: ");
			marca = console.nextLine();
			System.out.print("Modelo: ");
			modelo = console.nextLine();
			System.out.print("Ano: ");
			ano = console.nextInt();
			System.out.print("Quilometragem ");
			quilometragem = console.nextInt();
		}
	}
}
