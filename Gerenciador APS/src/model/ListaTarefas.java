package model;

public class ListaTarefas {
    public int ID;
    public String tarefa;
    public String descricao;
    public String responsavel;
    public String cargoRes;
    public String prazo;

    public ListaTarefas(){
    }

    public ListaTarefas(String tarefa, String descricao, String responsavel, String cargoRes, String prazo){
        this.tarefa = tarefa;
        this.descricao = descricao;
        this.responsavel = responsavel;
        this.cargoRes = cargoRes;
        this.prazo = prazo;
    }

    @Override
    public String toString() {
        return "ListaTarefas{" +
                "ID=" + ID +
                ", tarefa='" + tarefa + '\'' +
                ", descricao='" + descricao + '\'' +
                ", responsavel='" + responsavel + '\'' +
                ", cargoRes='" + cargoRes + '\'' +
                ", prazo='" + prazo + '\'' +
                '}';
    }

    public String getPrazo() {
        return prazo;
    }

    public void setPrazo(String prazo) {
        this.prazo = prazo;
    }

    public String getCargoRes() {
        return cargoRes;
    }

    public void setCargoRes(String cargoRes) {
        this.cargoRes = cargoRes;
    }

    public String getResponsavel() {
        return responsavel;
    }

    public void setResponsavel(String responsavel) {
        this.responsavel = responsavel;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public String getTarefa() {
        return tarefa;
    }

    public void setTarefa(String tarefa) {
        this.tarefa = tarefa;
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }
}
