public class Poupanca extends Conta{
    private int variacao;
    public Poupanca(String titular, String telefone, double saldo, int variacao) {
        super(titular, telefone, saldo);
        this.setVariacao(variacao);
    }

    public void imprimeExtrato(){
        System.out.println("Titular: "+ this.getTitular());
        System.out.println("Telefone: "+ this.getTelefone());
        System.out.println("Conta poupança: ");
        System.out.println("Variação: "+ this.getVariacao());
        System.out.println("Saldo Atual: "+ this.getSaldo());
    }

    public boolean depositar(double valor) {
        if (valor > 0){
            this.setSaldo(this.getSaldo() + valor);
            return true;
        }else return false;
    }
    public boolean sacar(double valor){
        if (this.getSaldo() >= valor){
            this.setSaldo(this.getSaldo() - valor);
            return true;
        }
        else{
            System.out.println("Pobre de mais para a transação");
            return false;
        }
    }

    public int getVariacao() {
        return variacao;
    }

    public void setVariacao(int variacao) {
        this.variacao = variacao;
    }
}
