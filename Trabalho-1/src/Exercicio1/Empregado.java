package Exercicio1;

public abstract class Empregado {
    private String nome;
    private String endereço;


    public Empregado(){

    }
    public Empregado(String nome, String endereço){
        this.setNome(nome);
        this.setEndereço(endereço);
    }

    public abstract double calcularSalario();

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEndereço() {
        return endereço;
    }

    public void setEndereço(String endereço) {
        this.endereço = endereço;
    }


    @Override
    public String toString() {
        return "Empregado{" +
                "nome='" + nome + '\'' +
                ", endereço='" + endereço + '\'' +
                '}';
    }
}
