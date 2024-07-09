package map.operacaoBasica;

import java.util.HashMap;
import java.util.Map;

public class agendaContato {
    private Map<String, Integer> agendaContatoMap;

    public agendaContato() {
        this.agendaContatoMap = new HashMap<>();
    }

    public void adicionarContato(String nome, Integer telefone) {
        agendaContatoMap.put(nome, telefone);
    }

    public void removerContato(String nome) {
        if(!agendaContatoMap.isEmpty()) {
            agendaContatoMap.remove(nome);
        }
    }

    public void exibirContato() {
        System.out.println(agendaContatoMap);
    }

    public Integer pesquisarPorNome(String nome) {
        Integer numeroPorNome = null;
        if(!agendaContatoMap.isEmpty()) {
           numeroPorNome = agendaContatoMap.get(nome);
        }
        return numeroPorNome;
    }

    public static void main(String[] args) {
        agendaContato agendaContato = new agendaContato();

        agendaContato.adicionarContato("Camila", 123456);
        agendaContato.adicionarContato("Camila", 5665);
        agendaContato.adicionarContato("Camila caval", 111111);
        agendaContato.adicionarContato("Camila dio", 654987);
        agendaContato.adicionarContato("Maria silva", 111111);

        agendaContato.exibirContato();

        agendaContato.removerContato("Maria silva");

        agendaContato.exibirContato();
    }


}
