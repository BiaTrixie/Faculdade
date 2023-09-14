package atividade01;


public class Main {
    public static void main(String[] args) {

        // Criando um objeto Carro
        Carro carro1 = new Carro("Toyota", "Corolla", 2023, 15000.0);

        // Exibindo informações do carro
        System.out.println("Informações do Carro:");
        carro1.exibirInfo();

        // Criando um objeto Funcionario
        Funcionario funcionario1 = new Funcionario("João", 3000.0, "Analista");

        // Exibindo informações do funcionário
        System.out.println("Informações do Funcionário:");
        System.out.println("Nome: " + funcionario1.getNome());
        System.out.println("Salário: R$" + funcionario1.getSalario());
        System.out.println("Cargo: " + funcionario1.getCargo());

        // Aumentando o salário em 10%
        funcionario1.aumentarSalario(10);

        // Exibindo o novo salário
        System.out.println("Novo Salário: R$" + funcionario1.getSalario());

        // Criando um objeto Produto
        Produto produto1 = new Produto("Camiseta", 29.99, 100);

        // Testando os métodos
        System.out.println("Nome do produto: " + produto1.getNome());
        System.out.println("Preço do produto: $" + produto1.getPreco());
        System.out.println("Quantidade em estoque: " + produto1.getQuantidadeEmEstoque());

        double valorVenda = produto1.vender(5);
        System.out.println("Valor total da venda: $" + valorVenda);
        System.out.println("Quantidade em estoque após a venda: " + produto1.getQuantidadeEmEstoque());
    }
}
