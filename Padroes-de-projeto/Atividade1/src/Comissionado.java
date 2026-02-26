import java.lang.reflect.Array;
import java.util.ArrayList;

public class Comissionado extends Funcionario{
    public double percentual = 5;
    public double totalVendas;
    private ArrayList<Double> vendas = new ArrayList<>();



    public Comissionado() {

    }



    public double getTotalVendas() {
        return totalVendas;
    }


    public void adicionarVenda(double valor) {
        vendas.add(valor);
        totalVendas += valor;
    }


    public void setTotalVendas(double totalVendas) {
        this.totalVendas = totalVendas;
    }

    @Override
    public double calcularSalário() {
        return this.totalVendas*percentual/100;
    }
}
