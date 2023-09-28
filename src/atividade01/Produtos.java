package atividade01;

public class Produtos {
    // Atributos
    private String nome;
    private double preco;
    private int quantidadeEmEstoque;

    // Construtor
    public Produtos(String nome, double preco, int quantidadeEmEstoque) {
        this.nome = nome;
        this.preco = preco;
        this.quantidadeEmEstoque = quantidadeEmEstoque;
    }

    // Métodos Getters e Setters
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public int getQuantidadeEmEstoque() {
        return quantidadeEmEstoque;
    }

    public void setQuantidadeEmEstoque(int quantidadeEmEstoque) {
        this.quantidadeEmEstoque = quantidadeEmEstoque;
    }

    // Método para vender produtos
    public double vender(int quantidadeVendida) {
        if (quantidadeVendida > 0 && quantidadeVendida <= quantidadeEmEstoque) {
            quantidadeEmEstoque -= quantidadeVendida;
            return quantidadeVendida * preco; // Retorna o valor total da venda
        } else {
            System.out.println("Quantidade inválida ou insuficiente em estoque.");
            return 0.0; // Retorna 0 se a venda não for bem-sucedida
        }
    }
}
