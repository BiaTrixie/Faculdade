package atividade03;

public class Main {
    public static void main(String[] args) {
        Cadastro cadastro1 = new Cadastro();
        Produto produto1 = new Produto(01, "Fone", 80.00);

        cadastro1.adicionarProduto(produto1);

        System.out.println(cadastro1.listarProdutos());

    }
}
