package dao;

import model.ListaTarefas;

import java.util.ArrayList;

public class ListaTarefasDao {
    public ArrayList<ListaTarefas> list;

    public ListaTarefasDao(){
        list = new ArrayList<>();
        list.add(new ListaTarefas("Terminar o Código", "Termina logo este código", "Daniel", "Administrador", "Pra ontem"));

    }

    public ArrayList<ListaTarefas> getLista() {
        return list;
    }
    public boolean inserirTarefa(ListaTarefas tarefa) {
        return list.add(tarefa);
    }
}
