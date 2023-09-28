package atividade03;

import java.util.*;
// >> SistemaCadastro
// >>> List<Produto> = new ArrayList<>();
// >>> adicionarProduto(Produto p)
// >>> listarProdutos()
// >>> listarProduto(int codigo)
// >>> alterarProduto(int codigo)
// >>> excluirProduto(int codigo)

public class Cadastro {
    List<Produto> produtos = new ArrayList<>();

    public void adicionarProduto(Produto produto) {
        produtos.add(produto);
    }

    public String listarProdutos() {
        String resultado = "";

        for(int posicao = 0; posicao < produtos.size(); posicao ++){
            Produto produto = produtos.get(posicao);
            resultado += "Produto" + (posicao + 1) + ";" + produto.exibirProduto();
        }

        return resultado;
    }

}
