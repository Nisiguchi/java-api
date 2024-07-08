package set.pesquisa;

import java.util.HashSet;
import java.util.Set;

public class agendaContato {
    private Set<contato> contatoSet;

    public agendaContato() {
        this.contatoSet = new HashSet<>();
    }

    public void adicionarContato(String nome, int numero) {
        contatoSet.add(new contato(nome, numero));
    }

    public void exibirContato() {
        System.out.println(contatoSet);
    }

    public Set<contato> pesquisarPorNome(String nome) {
        Set<contato> contatoPorNome = new HashSet<>();
        for(contato c : contatoSet) {
            if(c.getNome().startsWith(nome)) {
                contatoPorNome.add(c);
            }
        }
        return contatoPorNome;
    }

    public contato atualizarNumeroContato(String nome, int novoNumero) {
        contato contatoAtualizado = null;
        for(contato c : contatoSet) {
            if(c.getNome().equalsIgnoreCase(nome)) {
                c.setNumero(novoNumero);
                contatoAtualizado = c;
                break;
            }
        }
        return contatoAtualizado;
    }

    public static void main(String[] args) {
        agendaContato agendaContato = new agendaContato();

        agendaContato.exibirContato();

        agendaContato.adicionarContato("Camila", 123456);
        agendaContato.adicionarContato("Camila", 0);
        agendaContato.adicionarContato("Camila Cavalcante", 1111111);
        agendaContato.adicionarContato("Camila dio", 6435342);
        agendaContato.adicionarContato("Camila", 1111111);
        agendaContato.adicionarContato("Maria Silva", 1111111);

        agendaContato.exibirContato();

        System.out.println(agendaContato.pesquisarPorNome("Camilla"));



    }


}
