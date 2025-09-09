package Modelo;

public class Caminhao extends Veiculo{
    double capacidadeCarga;
    int numeroEixos;

    public Caminhao(String marca, String modelo, int ano, double preco, double capacidadeCarga, int numeroEixos){
        super(marca, modelo, ano, preco);

    }

    public double getCapacidadeCarga() {
        return capacidadeCarga;
    }

    public int getNumeroEixos() {
        return numeroEixos;
    }

    public void exibirInformacoes(){
        System.out.println("-----------------------");
        System.out.println("Informações do Caminhão:");
        super.exibirInformacoes();
        System.out.println("Numero de Eixos: "+ getNumeroEixos());
        System.out.println("Capacidade de Carga: "+ getCapacidadeCarga());

    }
}

