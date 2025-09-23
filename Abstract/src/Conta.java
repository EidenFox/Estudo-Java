 abstract public class Conta {
    private String titular;
    private String telefone;
    private  double saldo;

    public  Conta(String titular, String telefone, double saldo){
        this.setTitular(titular);
        this.setTelefone(telefone);
        this.setSaldo(saldo);
    }

    public abstract void imprimeExtrato();
    public abstract boolean depositar(double valor);
    public abstract boolean sacar(double valor);


    public String getTitular() {
        return titular;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }
}
