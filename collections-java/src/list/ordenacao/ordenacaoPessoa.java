package list.ordenacao;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ordenacaoPessoa {
    private List<pessoa> pessoaList;

    public ordenacaoPessoa() {
        this.pessoaList = new ArrayList<>();
    }

    public void adicionarPessoa(String nome, int idade, double altura) {
        pessoaList.add(new pessoa(nome, idade, altura));
    }

    public List<pessoa> ordenarPorIdade() {
        List<pessoa> pessoaPorIdade = new ArrayList<>(pessoaList);
        Collections.sort(pessoaPorIdade);
        return pessoaPorIdade;
    }

    public List<pessoa> ordenarPorAltura() {
        List<pessoa> pessoaPorALtura = new ArrayList<>(pessoaList);
        Collections.sort(pessoaPorALtura, new ComparatorPorAltura());
        return pessoaPorALtura;
    }

    public static void main(String[] args) {
        ordenacaoPessoa ordenacaoPessoa = new ordenacaoPessoa();
        ordenacaoPessoa.adicionarPessoa("Nome 1", 18, 1.56);
        ordenacaoPessoa.adicionarPessoa("Nome 2", 40, 1.80);
        ordenacaoPessoa.adicionarPessoa("Nome 3", 23, 1.70);
        ordenacaoPessoa.adicionarPessoa("Nome 4", 21, 1.55);

        System.out.println(ordenacaoPessoa.ordenarPorIdade());
        System.out.println(ordenacaoPessoa.ordenarPorAltura());


    }
}
