package set.ordenacao;

import java.util.Comparator;

public class produto implements Comparable<produto> {
    private String nome;
    private long codigo;
    private double preco;
    private int quantidade;

    public produto(long codigo, String nome, double preco, int quantidade) {
        this.codigo = codigo;
        this.nome = nome;
        this.preco = preco;
        this.quantidade = quantidade;
    }

    @Override
    public int compareTo(produto p) {
        return nome.compareToIgnoreCase(p.getNome());
    }

    public String getNome() {
        return nome;
    }

    public long getCodigo() {
        return codigo;
    }

    public double getPreco() {
        return preco;
    }

    public int getQuantidade() {
        return quantidade;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final produto other = (produto) obj;
        return this.codigo == other.codigo;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 29 * hash + (int) (this.codigo ^ (this.codigo >>> 32));
        return hash;
    }
    

    @Override
    public String toString() {
        return nome + " " + codigo + " " + preco + " " + quantidade;
    }

}

class ComparatorPorPreco implements Comparator<produto> {

    @Override
    public int compare(produto p1, produto p2) {
        return Double.compare(p1.getPreco(), p2.getPreco());
    }
}
