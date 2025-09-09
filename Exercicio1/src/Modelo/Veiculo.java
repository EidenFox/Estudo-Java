package Modelo;

public class Veiculo {

    String marca;
    String modelo;
    int ano;
    double preco;

    public Veiculo(String marca, String modelo, int ano, double preco){
    this.marca = marca;
    this.modelo = modelo;
    this.ano = ano;
    this.preco = preco;
    }


    public String getMarca() {
        return marca;
    }

    public String getModelo() {
        return modelo;
    }

    public int getAno() {
        return ano;
    }

    public double getPreco() {
        return preco;
    }

    public void exibirInformacoes(){

        System.out.println("Marca: "+ getMarca());
        System.out.println("Modelo: "+ getModelo());
        System.out.println("Ano: "+ getAno());
        System.out.println("Preço: "+ getPreco());

    }


}
