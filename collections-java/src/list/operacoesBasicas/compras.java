package list.operacoesBasicas;

public class compras {
	private String nome;
	private double preco;
	private int quantidade;

	public compras(String nome, double preco, int quantidade) {
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

	public int getQuant() {
		return quantidade;
	}

	@Override
	public String toString() {
		return  nome + preco + quantidade;
	}
}

