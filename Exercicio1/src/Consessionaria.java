import Modelo.Caminhao;
import Modelo.Carro;
import Modelo.Moto;
import Modelo.Veiculo;

import java.util.ArrayList;
import java.util.Scanner;

public class Consessionaria {

    public static void main() {
        ArrayList<Veiculo> listaVeiculo = new ArrayList<>();
        listaVeiculo.add(new Carro("Toyota", "Corolla", 2023 ,25000.00, 4, "Gasolina"));
        listaVeiculo.add(new Carro("Chevrolet", "Cruze", 2022, 98000.00, 4, "Flex"));
        listaVeiculo.add(new Carro("Hyundai", "Creta", 2023, 125000.00, 4, "Gasolina"));
        listaVeiculo.add(new Carro("Fiat", "Pulse", 2024, 89000.00, 4, "Flex"));
        listaVeiculo.add(new Carro("Renault", "Kwid", 2023, 68000.00, 4, "Flex"));
        listaVeiculo.add(new Carro("Volkswagen", "Virtus", 2022, 95000.00, 4, "Flex"));

        listaVeiculo.add(new Moto("Honda", "CB 500F", 2023, 12000.00, 471));
        listaVeiculo.add(new Moto("Yamaha", "MT-03", 2023, 28000.00, 321));
        listaVeiculo.add(new Moto("Suzuki", "GSX-R750", 2022, 55000.00, 750));
        listaVeiculo.add(new Moto("KTM", "RC 390", 2024, 32000.00, 373));
        listaVeiculo.add(new Moto("Triumph", "Tiger 900", 2023, 62000.00, 888));
        listaVeiculo.add(new Moto("Royal Enfield", "Classic 350", 2022, 21000.00, 349));

        listaVeiculo.add(new Caminhao("Mercedes-Benz", "Actros 2651", 2023, 3000000.00, 33.000, 3));
        listaVeiculo.add(new Caminhao("Volvo", "VM 330", 2023, 420000.00, 32.000, 3));
        listaVeiculo.add(new Caminhao("Scania", "P 360", 2022, 390000.00, 30.000, 3));
        listaVeiculo.add(new Caminhao("Iveco", "Tector 260E", 2024, 350000.00, 26.000, 2));
        listaVeiculo.add(new Caminhao("MAN", "TGM 29.330", 2023, 410000.00, 31.000, 3));
        listaVeiculo.add(new Caminhao("Ford", "Cargo 3031", 2022, 370000.00, 28.000, 2));

        Scanner scan = new Scanner(System.in);
        int op = 0;
        boolean sair = false;
        do{
            op = 0;
            System.out.println("--------------------");
            System.out.println("--------MENU--------");
            System.out.println("--------------------");
            System.out.println("[1] Listar Veiculos.");
            System.out.println("[2] Cadastrar Veiculos.");
            System.out.println("[0] Sair.");
            op = scan.nextInt();
            switch (op){
                case 1:
                    System.out.println("Que tipo de veiculo quer listar");
                    System.out.println("[1] Listar Carros.");
                    System.out.println("[2] Listar Motos.");
                    System.out.println("[3] Listar Caminhões.");
                    System.out.println("[4] Listar Todos.");
                    op = scan.nextInt();
                    for (Veiculo v: listaVeiculo){
                        if ((v instanceof Carro) && (op == 1)) v.exibirInformacoes();
                        if ((v instanceof Moto) && (op == 2)) v.exibirInformacoes();
                        if ((v instanceof Caminhao) && (op == 3)) v.exibirInformacoes();
                        if (op == 4) v.exibirInformacoes();
                    }
                    op = 0;
                    break;
                case 2:
                    System.out.println("Que tipo de veiculo quer cadastrar");
                    System.out.println("[1] Cadastrar Carro.");
                    System.out.println("[2] Cadastrar Moto.");
                    System.out.println("[3] Cadastrar Caminhõe.");
                    op = scan.nextInt();
                    scan.nextLine();
                    System.out.println("Digite a Marca: ");
                    String marca = scan.nextLine().trim();
                    System.out.println("Digite o Modelo: ");
                    String modelo = scan.nextLine().trim();
                    System.out.println("Digite o Ano: ");
                    int ano = scan.nextInt();
                    System.out.println("Digite o Preço: ");
                    double preco = scan.nextDouble();
                    switch(op){
                        case 1:
                            System.out.println("Digite o Numero de Portas: ");
                            int numeroPortas = scan.nextInt();
                            System.out.println("Digite o Tipo de Combustível: ");
                            String tipoCombustivel = scan.nextLine().trim();
                            listaVeiculo.add(new Carro(marca, modelo, ano, preco, numeroPortas, tipoCombustivel));
                            System.out.println("Cadastro Efetuado!");
                            break;
                        case 2:
                            System.out.println("Digite o numero de Cilindradas");
                            int cilindradas = scan.nextInt();
                            listaVeiculo.add(new Moto(marca, modelo, ano, preco, cilindradas));
                            System.out.println("Cadastro Efetuado!");
                            break;
                        case 3:
                            System.out.println("Digite o numero de Eixos: ");
                            int numeroEixos = scan.nextInt();
                            System.out.println("Digite a Capacidade de Carga em kilos (apenas numeros): ");
                            double capacidadeCarga = scan.nextDouble();
                            listaVeiculo.add(new Caminhao(marca, modelo, ano, preco, capacidadeCarga, numeroEixos));
                            System.out.println("Cadastro Efetuado!");
                            break;
                        default:
                            System.out.println("\n\nOpção Invalida! Tente novamente\n\n");
                            break;
                    }
                    op = 0;
                    break;
                case 0:
                    System.out.println("Saindo...");
                    sair = true;
                    break;
                default:
                    System.out.println("\n\nOpção Invalida! Tente novamente\n\n");
                    op = 0;
                    break;
            }
        }while (!sair);
    }

}
