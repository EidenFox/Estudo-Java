public class Assalariado extends Funcionario {
    protected double salarioMensal = 1621.00;

    public Assalariado(){

    }

    @Override
    public double calcularSalário() {
        return this.salarioMensal;
    }
}
