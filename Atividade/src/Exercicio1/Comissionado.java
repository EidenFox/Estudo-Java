package Exercicio1;

public class Comissionado extends Empregado{
    private double salarioBase;
    private double comissao;
    private int quantidade;

    public Comissionado (){

    }

    public Comissionado(double salarioBase, double comissao, int quantidade, String nome, String endereco){
        super(nome, endereco);
        this.setSalarioBase(salarioBase);
        this.setQuantidade(quantidade);
        this.setComissao(comissao);
    }


    public double getSalarioBase() {
        return salarioBase;
    }

    public void setSalarioBase(double salarioBase) {
        this.salarioBase = salarioBase;
    }

    public double getComissao() {
        return comissao;
    }

    public void setComissao(double comissao) {
        this.comissao = comissao;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    @Override
    public double calcularSalario() {
        double SF = (salarioBase + (comissao * quantidade));
        System.out.println("-----Comissionado-----");
        System.out.println("Salário Final: "+ SF);
        System.out.println("----------------------");
        return SF;
    }


    @Override
    public String toString() {
        return "Comissionado{" +
                "salarioBase=" + salarioBase +
                ", comissao=" + comissao +
                ", quantidade=" + quantidade +
                '}';
    }
}
