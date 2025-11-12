package Exercicio1;

public class Chefe extends Empregado{
    private double salarioMensal;
    private double bonus;
    public Chefe(){

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
        return salarioMensal+bonus;
    }
}
