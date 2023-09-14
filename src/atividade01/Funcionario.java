package atividade01;

public class Funcionario {
    // Atributos
    private String nome;
    private double salario;
    private String cargo;

    // Construtor
    public Funcionario(String nome, double salario, String cargo) {
        this.nome = nome;
        this.salario = salario;
        this.cargo = cargo;
    }

    // Métodos Getters e Setters
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public void aumentarSalario(double percentualAumento) {
        if (percentualAumento > 0) {
            double aumento = (percentualAumento / 100) * salario;
            salario += aumento;
            System.out.println("O salário de " + nome + " foi aumentado em " + percentualAumento + "%.");
        } else {
            System.out.println("O percentual de aumento deve ser maior que zero.");
        }
    }
}
