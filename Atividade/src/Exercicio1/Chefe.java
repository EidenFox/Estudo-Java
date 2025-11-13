package Exercicio1;

public class Chefe extends Empregado{
    private double salarioMensal;
    private double bonus;
    public Chefe(){

    }
    public Chefe(double salarioMensal, double bonus, String nome, String endereco){
        super(nome, endereco);
        this.setBonus(bonus);
        this.setSalarioMensal(salarioMensal);
    }

    public double getSalarioMensal() {
        return salarioMensal;
    }

    public void setSalarioMensal(double salarioMensal) {
        this.salarioMensal = salarioMensal;
    }

    public double getBonus() {
        return bonus;
    }

    public void setBonus(double bonus) {
        this.bonus = bonus;
    }

    @Override
    public double calcularSalario() {
        double SF = salarioMensal + bonus;
        System.out.println("---------CHEFE--------");
        System.out.println("Salário Final: "+ SF);
        System.out.println("----------------------");
        return SF;
    }

    @Override
    public String toString() {
        return "Chefe{" +
                "salarioMensal=" + salarioMensal +
                ", bonus=" + bonus +
                '}';
    }
}
