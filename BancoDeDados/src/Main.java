import DAO.Conexao;
import DAO.ProdutoDao;
import Modelo.Produto;

import java.security.Permission;
import java.util.Scanner;

public class Main {
    public static void main() {

        ProdutoDao produtoDao = new ProdutoDao();

            //Insere um novo produto
//        Produto produto = new Produto("Sal 5kg", 5.98, 24);
//        produtoDao.inserir(produto);

            //Edita um produto
//        Produto produtoAtualizar = new Produto("Batata frita 1kg", 22.45, 2);
//        produtoAtualizar.setID(3);
//        produtoDao.atualizar(produtoAtualizar);


        Scanner scan = new Scanner(System.in);
        int op;
        boolean estado;
        do{

            System.out.println("--------MENU--------");
            System.out.println("[1] Cadastrar Produto");
            System.out.println("[2] Alterar Produto");
            System.out.println("[3] Listar produtos");
            System.out.println("[4] Inativar Produto");
            System.out.println("[5] Ativar Produto");
            System.out.println("[0] Sair");
            op = scan.nextInt();

            switch(op){
                case 1:
                    Produto produto = new Produto();
                    System.out.println("Informe os dados do produto");
                    scan.nextLine();
                    System.out.println("Digite o Nome do Produto: ");
                    produto.setNome(scan.nextLine());
                    System.out.println("Digite o Preço: ");
                    produto.setPreco(scan.nextDouble());
                    System.out.println("Digite a Quantidade: ");
                    produto.setQuantidade(scan.nextInt());
                    produtoDao.inserir(produto);
                    break;
                case 2:
                    System.out.println("Digite o ID do produto que deseja alterar: ");
                    int id = scan.nextInt();

                    //fazer validação de ID

                    if(true) {
                        Produto produtoAtt = new Produto();

                        produtoAtt.setNome(scan.nextLine());
                        System.out.println("Digite o novo Nome: ");
                        produtoAtt.setNome(scan.nextLine());
                        System.out.println();
                        System.out.println("Digite o Preço: ");
                        produtoAtt.setPreco(scan.nextDouble());
                        System.out.println("Digite a Quantidade: ");
                        produtoAtt.setQuantidade(scan.nextInt());
                        produtoDao.inserir(produtoAtt);
                    }else{
                        System.out.println("Id invalido");
                    }

                    break;
                case 3:
                    System.out.println("Selecione uma opção: ");
                    System.out.println("[1] Listar Ativos");
                    System.out.println("[2] Listar Inativos");
                    System.out.println("[3] Listar Todos");
                    int oplist = scan.nextInt();
                    switch (oplist){
                        case 1:
                            estado = true;
                            break;
                        case 2:
                            break;
                        case 3:
                            break;
                    }


                    estado = true;
                    for (Produto p: produtoDao.listarTodos(estado)){
                        System.out.println("\n-------------------------");
                        System.out.println("ID: "+ p.getID());
                        System.out.println("Produto: "+ p.getNome());
                        System.out.println("Quantidade: "+ p.getQuantidade());
                        System.out.println("Preço: R$"+ p.getPreco());
                        System.out.println("Total: R$"+ p.getPreco() * p.getQuantidade());
                        System.out.println();
                    }
                    break;
                case 4:
                    break;
                case 0:
                    break;
                default:
                    System.out.println("Opção Inválida! Tente Novamente");
                    break;
            }

        }while (op != 0);





    }
}