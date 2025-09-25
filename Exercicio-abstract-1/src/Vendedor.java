public class Vendedor extends Funcionario{
    private double comissao;

    public Vendedor(String nome, String matricula, double salario_base, double comissao){
        super(nome, matricula, salario_base);
        this.setComissao(comissao);
    }

    @Override
    public double calcularSalario(){
        return this.getSalario_base() + (this.getSalario_base() * this.getComissao());
    }

    public double getComissao() {
        return comissao;
    }

    public void setComissao(double comissao) {
        this.comissao = comissao/100;
    }
}
