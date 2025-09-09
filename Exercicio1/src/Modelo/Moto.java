package Modelo;

public class Moto extends Veiculo{
    int cilindradas;
    public Moto(String marca, String modelo, int ano, double preco, int cilindradas){
        super(marca, modelo, ano, preco);
        this.cilindradas = cilindradas;

    }

    public int getCilindradas() {
        return cilindradas;
    }
    public void exibirInformacoes(){
        System.out.println("-----------------------");
        System.out.println("Informações da Moto:");
        super.exibirInformacoes();
        System.out.println("Numero de Cilindradas: "+ getCilindradas());

    }
}
