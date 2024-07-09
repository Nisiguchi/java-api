package map.pesquisa;

public class produto {
    private String nome;
    private double preco;
    private int quantidade;

    public produto(String nome, double preco, int quantidade) {
        this.nome = nome;
        this.preco = preco;
        this.quantidade = quantidade;
    }

    public String getNome() {
        return nome;
    }

    public double getPreco() {
        return preco;
    }

    public int getQuantidade() {
        return quantidade;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(" produto { ");
        sb.append(" nome = ").append(nome);
        sb.append(" , preco = ").append(preco);
        sb.append(" , quantidade = ").append(quantidade);
        sb.append(" } ");
        return sb.toString();
    }


}
