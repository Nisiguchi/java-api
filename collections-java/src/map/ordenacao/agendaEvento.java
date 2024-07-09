package map.ordenacao;

import java.time.LocalDate;
import java.time.Month;
import java.util.*;

public class agendaEvento {
    private Map<LocalDate, evento> eventoMap;

    public agendaEvento() {
        this.eventoMap = new HashMap<>();
    }

    public void adicionarEvento(LocalDate data, String nome, String atracao) {
        //evento evento = new evento(atracao, nome);
        eventoMap.put(data, new evento(atracao, nome));
    }

    public void exibirAgenda() {
         Map<LocalDate, evento> eventoTreeMap = new TreeMap<>(eventoMap);
         System.out.println(eventoTreeMap);
    }

    public void obterProximoEvento() {
        /*Set<LocalDate> dateSet = eventoMap.keySet();
        Collection<evento> values = eventoMap.values();*/

        LocalDate dataAtual = LocalDate.now();
        Map<LocalDate, evento> eventoTreeMap = new TreeMap<>(eventoMap);
        for(Map.Entry<LocalDate , evento> entry : eventoTreeMap.entrySet()) {
            if(entry.getKey().isEqual(dataAtual) || entry.getKey().isAfter(dataAtual)) {
                System.out.println("Proximo evento sera:" + entry.getValue() + entry.getKey());
                break;
            }
        }
    }

    public static void main(String[] args) {
        agendaEvento agenda = new agendaEvento();

        System.out.println(LocalDate.now());

        agenda.adicionarEvento(LocalDate.of(2022, Month.JULY, 15), "Evento 1", "atracao 1");
        agenda.adicionarEvento(LocalDate.of(2022, 7, 9), "Evento 2", "atracao 2");
        agenda.adicionarEvento(LocalDate.of(2000, Month.JANUARY, 10), "Evento 3", "atracao 3");
        agenda.adicionarEvento(LocalDate.of(2025, Month.JANUARY, 10), "Evento 3", "atracao 3");


        agenda.exibirAgenda();

        agenda.obterProximoEvento();
    }
    
}
