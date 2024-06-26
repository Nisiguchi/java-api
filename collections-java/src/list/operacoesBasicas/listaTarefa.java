package list.operacoesBasicas;

import java.util.ArrayList;
import java.util.List;

public class listaTarefa {
    private List<tarefa> tarefaList;

    public listaTarefa() {
        this.tarefaList = new ArrayList<>();
    }

    public void adicionarTarefa(String descricao) {
        tarefaList.add(new tarefa(descricao));
    }

    public void removerTarefa(String descricao) {
        List<tarefa> tarefasRemover = new ArrayList<>();
        for(tarefa t : tarefaList) {
            if(t.getDescricao().equalsIgnoreCase(descricao)) {
                tarefasRemover.add(t);
            }
        }
        tarefaList.removeAll(tarefasRemover);
    }

    public int obterNumeroTotalTarefas() {
        return tarefaList.size();
    }
    public void obterDescricoesTarefas() {
        System.out.println(tarefaList);
    }

    public static void main(String[] args) {

        listaTarefa listaTarefa = new listaTarefa();
        System.out.println("O numero total de elementos na lista é " + listaTarefa.obterNumeroTotalTarefas());

        listaTarefa.adicionarTarefa("Tarefa 1");
        listaTarefa.adicionarTarefa("Tarefa 1");
        System.out.println("O numero total de elementos na lista é " + listaTarefa.obterNumeroTotalTarefas());

        listaTarefa.obterDescricoesTarefas();

    }
}
