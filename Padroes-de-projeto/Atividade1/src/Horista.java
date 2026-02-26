public class Horista extends Funcionario{
    private double salarioPorHora = 10;
    protected double horasTrabalhadas;

    public Horista(){

    }

    public double getHorasTrabalhadas() {
        return horasTrabalhadas;
    }

    public void setHorasTrabalhadas(double horasTrabalhadas) {
        this.horasTrabalhadas = horasTrabalhadas;
    }

    @Override
    public double calcularSalário() {
        if (this.horasTrabalhadas < 160){
            return ((salarioPorHora*160) + (salarioPorHora*1.5*(this.horasTrabalhadas-160)));

        }

        return salarioPorHora*this.horasTrabalhadas;
    }
}
