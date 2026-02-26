import java.util.ArrayList;

public class AssalariadoComissionado extends Funcionario{
    protected double salarioMensal = 1621.00;
    public int totalVendas;
    public double percentual = 5;
    private ArrayList<Double> vendas = new ArrayList<>();

public AssalariadoComissionado(){

}


    public int getTotalVendas() {
        return totalVendas;
    }

    public void setTotalVendas(int totalVendas) {
        this.totalVendas = totalVendas;
    }

    public void adicionarVenda(double valor) {
        vendas.add(valor);
        totalVendas += valor;
    }

    @Override
    public double calcularSalário() {
        return (salarioMensal + (this.totalVendas*percentual/100));
    }
}
