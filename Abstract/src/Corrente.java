public class Corrente extends Conta{
    private int numero;
    private int digito;

    public Corrente(String titular, String telefone, double saldo, int numero, int digito) {
        super(titular, telefone, saldo);
        this.digito = digito;
        this.numero = numero;

    }
    public void imprimeExtrato(){
        System.out.println("Titular: "+ this.getTitular());
        System.out.println("Telefone: "+ this.getTelefone());
        System.out.println("Conta corrente: " + this.getNumero() + "-" + this.getDigito());
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


    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public int getDigito() {
        return digito;
    }

    public void setDigito(int digito) {
        this.digito = digito;
    }
}
