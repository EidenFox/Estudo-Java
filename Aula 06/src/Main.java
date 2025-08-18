import static java.lang.Thread.sleep;
import pkt.Registros;

import java.util.ArrayList;
import java.util.Scanner;


public class Main {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        ArrayList<Registros> listarCarros = new ArrayList<>();

        boolean sair = false;

        do{
            System.out.println("\n********************");
            System.out.println("********MENU********");
            System.out.println("********************");
            System.out.println("1. Adicionar Carro");
            System.out.println("3. Resgatar Carro");
            System.out.println("4. Alterar Registro");
            System.out.println("5. Listar Disponiveis");
            System.out.println("6. Sair");
            System.out.println("********************\n");
            System.out.println("\n");
            int menu = scan.nextInt();
            switch(menu){
                case 1:
                    Registros carro = new Registros();


                    break;
                case 2:
                    break;
                case 3:
                    break;
                case 4:
                    break;
                case 5:
                    System.out.println("\n--------------------\n");
                    System.out.println("Produtos Disponiveis para aluguel: ");
                    for (int i = 0; i < listarCarros.size(); i++){
                        listarCarros.get(i);
                    }
                    break;
                case 6:
                    System.out.println("Saindo");
                    sair = true;
                    break;
                default:
                    System.out.println("Opção Invalida, Tente novamente");
                    break;
            }



        }while (sair != true);
    }
}