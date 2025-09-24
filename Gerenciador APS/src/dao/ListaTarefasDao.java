package dao;

import model.ListaTarefas;

import java.util.ArrayList;

public class ListaTarefasDao {
    public ArrayList<ListaTarefas> list;

    public ListaTarefasDao(){
        list = new ArrayList<>();
        list.add(new ListaTarefas("Terminar o Código", "Termina logo este código", "Daniel", "Administrador", "Pra ontem"));
        list.add(new ListaTarefas("Fazer o Código funcionar", "Pelo amor de Deus FUNCIONAAA", "Admin", "Administrador", "Antes do fim dos Tempos"));

    }

    public ArrayList<ListaTarefas> getListaT() {
        return list;
    }
    public boolean inserirTarefa(ListaTarefas tarefa) {
        return list.add(tarefa);
    }
}
