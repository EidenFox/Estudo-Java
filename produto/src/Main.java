import modelo.Produto;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        ArrayList<Produto> listaProdutos = new ArrayList<Produto>();

        Produto produto = new Produto();
        Scanner scan = new Scanner(System.in);
        int opcao;
        do {

            System.out.println("\n\nEscolha uma das opções abaixo");
            System.out.println("1 - Cadastrar produto");
            System.out.println("2 - Listar produto");
            System.out.println("3 - Ativar produto");
            System.out.println("4 - Inativar produto");
            System.out.println("5 - Sair");
            System.out.println("Digite a opção desejada: ");
            opcao = scan.nextInt();

            switch (opcao) {
                case 1:
                    Produto novoProduto = new Produto();
                    novoProduto.cadastroProduto(scan);
                    listaProdutos.add(novoProduto);
                    break;
                case 2:
                    System.out.println("\nListando produto cadastrado\n");
                    if (listaProdutos.size() > 0){

                        for(int i = 0; i < listaProdutos.size(); i++){
                            listaProdutos.get(i).listarProduto();
                        }
                        System.out.println("\nHá "+ listaProdutos.size() +" Produtos Registrados.");
                    }else{
                        System.out.println("Não existem produtos cadastrados");
                    }
                    break;
                case 3:
                    boolean encontrado = false;
                    if (listaProdutos.size() > 0){
                        System.out.println("Informe o código do Produto: ");
                        int codigo = scan.nextInt();
                        for(int i = 0; i < listaProdutos.size(); i++){
                            if (codigo == listaProdutos.get(i).codigo){
                                listaProdutos.get(i).alterarStatus(true);
                                encontrado = true;
                                break;
                            }
                        }
                        if (!encontrado){
                            System.out.println("Produto não encontrado, tente novamente!\n");
                        }

                    }else{
                        System.out.println("Não existem produtos cadastrados");
                    }

                    break;
                case 4:
                    boolean encontrado = false;
                    if (listaProdutos.size() > 0){
                        System.out.println("Informe o código do Produto: ");
                        int codigo = scan.nextInt();
                        for(int i = 0; i < listaProdutos.size(); i++){
                            if (codigo == listaProdutos.get(i).codigo){
                                listaProdutos.get(i).alterarStatus(false);
                                encontrado = true;
                                break;
                            }
                        }
                        if (!encontrado){
                            System.out.println("Produto não encontrado, tente novamente!\n");
                        }

                    }else{
                        System.out.println("Não existem produtos cadastrados");
                    }

                    break;
                case 5:
                    System.out.println("Saindo do sistema.");
                    break;
                default:
                    System.out.println("Opção inválida, tente novamente!");
                    break;
            }
        } while (opcao != 5);

        scan.close();
    }
}
