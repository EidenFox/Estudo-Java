public class Main {
    public static void main() {
        Poupanca poup1 = new Poupanca("Daniel", "44 98747-2534", 45000.00, 51);
        poup1.imprimeExtrato();
        System.out.println("-----------------------");
        if(poup1.depositar(5000.00)) System.out.println("Depositado com sucesso");
        else System.out.println("Deposito falhou");
        poup1.imprimeExtrato();
        System.out.println("-----------------------");

    }
}