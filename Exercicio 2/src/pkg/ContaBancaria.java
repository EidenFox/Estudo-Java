package pkg;

public class ContaBancaria {
    public String titular;
    public double saldo;



    public void depositar(double x){
        this.saldo = this.saldo + x;
        consulta();
    }

    public void retirar(double x){
        if (saldo - x >= 0 ){
            this.saldo -= x;
        }else{
            System.out.println("SALDO INSUFICIENTE!");
        }
        consulta();
    }

    public void consulta(){
        System.out.println("*-------------Consulta---------------*");
        System.out.println("Titular: "+ this.titular);
        System.out.println("Saldo: "+ this.saldo+"\n");
        System.out.println("*------------------------------------*");
    }

}
