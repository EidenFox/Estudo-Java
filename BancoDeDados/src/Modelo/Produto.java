package Modelo;

public class Produto {
    private int ID;
    private String nome;
    private double preco;
    private int quantidade;

    public Produto (){

    }

    public Produto (String nome, double preco, int quantidade){
        this.setNome(nome);
        this.setQuantidade(quantidade);
        this.setPreco(preco);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }
}
