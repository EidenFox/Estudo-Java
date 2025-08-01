import java.util.Scanner;
import pkg.ContaBancaria;

public class Main {
    public static void main(String[] args) {
        ContaBancaria conta = new ContaBancaria();
        Scanner scan = new Scanner(System.in);
        int menu;

        System.out.println("Bem vindo ao Bando\nDigite o nome do Titular: ");
        conta.titular = scan.nextLine();
        System.out.println("Agora digite o seu saldo inicial: ");
        conta.saldo = scan.nextInt();

        scan.nextLine();


        do{
            System.out.println("*------------------------------------*");
            System.out.println("*----------------BANCO---------------*");
            System.out.println("*------------------------------------*");
            System.out.println("1 - Consultar Saldo");
            System.out.println("2 - Depositar");
            System.out.println("3 - Retirar");
            System.out.println("4 - Sair");
            menu = scan.nextInt();
            switch (menu){
                case 1:
                    conta.consulta();
                    break;
                case 2:
                    System.out.println("Digite o valor que deseja depositar: ");
                    conta.depositar(scan.nextDouble());
                    break;
                case 3:
                    System.out.println("Digite o valor que deseja Sacar: ");
                    conta.retirar(scan.nextDouble());
                    break;
                case 4:
                    System.out.println("Saindo");
                    break;
                default:
                    System.out.println("Opção invalida, tente novamente");
                    break;
            }

        }while(menu != 4);


    }
}