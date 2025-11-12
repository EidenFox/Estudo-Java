package Modelo;

public class Categoria {
    private int ID;
    private String nome;
    private String descicao;
    private boolean state;

    public Categoria(String nome, String descicao){
        this.setNome(nome);
        this.setDescicao(descicao);
    }

    public Categoria (){

    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDescicao() {
        return descicao;
    }

    public void setDescicao(String descicao) {
        this.descicao = descicao;
    }

    public boolean isState() {
        return state;
    }

    public void setState(boolean state) {
        this.state = state;
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }


    @Override
    public String toString() {
        return nome;
    }
}
