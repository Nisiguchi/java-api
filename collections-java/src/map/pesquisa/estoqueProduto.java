package map.pesquisa;

import java.util.HashMap;
import java.util.Map;

public class estoqueProduto {
    private Map<Long, produto> estoqueProdutoMap;

    public estoqueProduto() {
        this.estoqueProdutoMap = new HashMap<>();
    }

    public void adicionarProduto(Long cod, String nome, int quantidade, double preco) {
        estoqueProdutoMap.put(cod, new produto(nome, preco, quantidade));
    }

    public void exibirProduto() {
        System.out.println(estoqueProdutoMap);
    }

    public double calcularValorTotalEstoque() {
        double valorTotalEstoque = 0d;
        if(!estoqueProdutoMap.isEmpty()) {
            for(produto p : estoqueProdutoMap.values()) {
                valorTotalEstoque += p.getQuantidade() * p.getPreco();
            }
        }
        return valorTotalEstoque;
    }

    public produto obterProdutoMaisCaro() {
        produto produtoMaisCaro = null;
        double maiorPreco = Double.MIN_VALUE;
        if(!estoqueProdutoMap.isEmpty()) {
            for(produto p : estoqueProdutoMap.values()) {
              if(p.getPreco() > maiorPreco) {
                    produtoMaisCaro = p;
                }
            }
        }
        return produtoMaisCaro;
    }

    /*public produto obterProdutoMaisBarato() {
        produto produtoMaisBarato = null;
        double menorPreco = Double.MAX_VALUE;
        if(!estoqueProdutoMap.isEmpty()) {
            for(produto b : estoqueProdutoMap.values()) {
                if(b.getPreco() < menorPreco) {
                    produtoMaisBarato = b;
                }
            }
        }
        return produtoMaisBarato;
    }*/

    public static void main(String[] args) {
        estoqueProduto estoque = new estoqueProduto();
        estoque.exibirProduto();

        estoque.adicionarProduto(1L, "Produto A", 10, 5.0);
        estoque.adicionarProduto(2L, "Produto B", 5, 10.0);
        estoque.adicionarProduto(3L, "Produto C", 2, 15.0);
        estoque.adicionarProduto(8L, "Produto D", 2, 20.0);

        estoque.exibirProduto();

        System.out.println("Valor total: " + estoque.calcularValorTotalEstoque());
        System.out.println("Produto mais caro:" + estoque.obterProdutoMaisCaro());
        //System.out.println("Produto mais barato:" + estoque.obterProdutoMaisBarato());
    }
}
