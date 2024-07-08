package set.ordenacao;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class cadastroProduto {
    private Set<produto> produtoSet;

    public cadastroProduto() {
        this.produtoSet = new HashSet<>();
    }

    public void adicionarProduto(long codigo, String nome, double preco, int quantidade) {
        produtoSet.add(new produto(codigo, nome, preco, quantidade));
    }

    public Set<produto> exibirProdutoPorNome() {
        Set<produto> produtoPorNome = new TreeSet<>(produtoSet);
        return produtoPorNome;
    }

    public Set<produto> exibirPorPreco() {
        Set<produto> produtoPorPreco = new TreeSet<>(new ComparatorPorPreco());
        produtoPorPreco.addAll(produtoSet);
        return produtoPorPreco;
    }

    public static void main(String[] args) {
        cadastroProduto cadastroProduto = new cadastroProduto();

        cadastroProduto.adicionarProduto(1L, "produto 1", 15d, 5);
        cadastroProduto.adicionarProduto(2L, "produto 0", 20d, 10);
        cadastroProduto.adicionarProduto(1L, "produto 3", 10d, 2);
        cadastroProduto.adicionarProduto(9L, "produto 9", 2d, 2);

        //System.out.println(cadastroProduto.exibirProdutoPorNome());
        System.out.println(cadastroProduto.exibirPorPreco());
    }

}
