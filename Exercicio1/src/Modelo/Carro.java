package Modelo;

public class Carro extends Veiculo{
    int numeroPortas;
    String tipoCombustivel;

    public Carro(String marca, String modelo, int ano, double preco, int numeroPortas, String tipoCombustivel) {
        super(marca, modelo, ano, preco);
        this.numeroPortas = numeroPortas;
        this.tipoCombustivel = tipoCombustivel;
    }

    public int getNumeroPortas() {
        return numeroPortas;
    }

    public String getTipoCombustivel() {
        return tipoCombustivel;
    }

    public void exibirInformacoes(){
        System.out.println("-----------------------");
        System.out.println("Informações do Carro:");
        super.exibirInformacoes();
        System.out.println("Numero de Portas: "+ getNumeroPortas());
        System.out.println("Tipo de Combustivel: "+ getTipoCombustivel());

    }
}