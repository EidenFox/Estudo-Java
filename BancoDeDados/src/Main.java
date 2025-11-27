import DAO.CategoriaDao;
import DAO.ProdutoDao;
import Modelo.Categoria;
import Modelo.Produto;

import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main() {

        ProdutoDao produtoDao = new ProdutoDao();
        CategoriaDao categoriaDao = new CategoriaDao();
        Scanner scan = new Scanner(System.in);
        int op, id;
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
                    System.out.println("\n--- Cadastrar Novo Produto ---");
                    System.out.println("Informe os dados do produto");
                    scan.nextLine();

                    System.out.println("Digite o Nome do Produto: ");
                    produto.setNome(scan.nextLine());
                    System.out.println("Digite o Preço: ");
                    produto.setPreco(scan.nextDouble());
                    System.out.println("Digite a Quantidade: ");
                    produto.setQuantidade(scan.nextInt());

                    Categoria catSelecionada = selecionarCategoria(scan, categoriaDao);
                    produto.setCategoria(catSelecionada);

                    if(produtoDao.inserir(produto)){
                        System.out.println("Produto cadastrado com sucesso!");
                    }
                    break;
                case 2:
                    System.out.println("\n--- Alterar Produto ---");
                    System.out.print("Digite o ID do produto que deseja alterar: ");
                    id = scan.nextInt();

                    //Implementar Validação de ID e colocar o resultado no if.

                    if(true) {
                        Produto produtoAtt = new Produto();
                        produtoAtt.setID(id);

                        scan.nextLine();
                        System.out.print("Digite o novo Nome: ");
                        produtoAtt.setNome(scan.nextLine());


                        System.out.print("Digite o novo Preço: ");
                        produtoAtt.setPreco(scan.nextDouble());

                        System.out.print("Digite a nova Quantidade: ");
                        produtoAtt.setQuantidade(scan.nextInt());

                        Categoria catEditada = selecionarCategoria(scan, categoriaDao);
                        produtoAtt.setCategoria(catEditada);

                        if(produtoDao.atualizar(produtoAtt)){
                            System.out.println("Produto atualizado com sucesso!");
                        } else {
                            System.out.println("Erro ao atualizar ou ID não encontrado.");
                        }
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
                            for (Produto p: produtoDao.listarTodos(true)){
                                System.out.println("\n-------------------------");
                                System.out.println("ID: "+ p.getID());
                                System.out.println("Produto: "+ p.getNome());
                                System.out.println("Quantidade: "+ p.getQuantidade());
                                System.out.println("Preço: R$"+ p.getPreco());
                                System.out.println("Total: R$"+ p.getPreco() * p.getQuantidade());
                            }
                            break;
                        case 2:
                            for (Produto p: produtoDao.listarTodos(false)){
                                System.out.println("\n-------------------------");
                                System.out.println("ID: "+ p.getID());
                                System.out.println("Produto: "+ p.getNome());
                                System.out.println("Quantidade: "+ p.getQuantidade());
                                System.out.println("Preço: R$"+ p.getPreco());
                                System.out.println("Total: R$"+ p.getPreco() * p.getQuantidade());
                            }
                            break;
                        case 3:
                            for (boolean estado : new boolean[]{true, false}) {
                                System.out.println(estado ? "=====PRODUTOS=ATIVOS=====" : "====PRODUTOS=INATIVOS====");
                                for (Produto p : produtoDao.listarTodos(estado)) {
                                    System.out.println("\n-------------------------");
                                    System.out.println("ID: " + p.getID());
                                    System.out.println("Produto: " + p.getNome());
                                    System.out.println("Quantidade: " + p.getQuantidade());
                                    System.out.println("Preço: R$" + p.getPreco());
                                    System.out.println("Total: R$" + (p.getPreco() * p.getQuantidade()));
                                }
                            }
                            break;
                    }
                    break;
                case 4:
                    System.out.println("Digite o ID do produto que deseja Inativar: ");
                    id = scan.nextInt();
                    produtoDao.excluir(id);
                    break;
                case 5:
                    System.out.println("Digite o ID do produto que deseja Reativar: ");
                    id = scan.nextInt();
                    produtoDao.reativar(id);
                    break;
                case 0:
                    break;
                default:
                    System.out.println("Opção Inválida! Tente Novamente");
                    break;
            }

        }while (op != 0);
    }

    public static Categoria selecionarCategoria(Scanner scan, CategoriaDao dao) {
        List<Categoria> categorias = dao.categoriaList();

        System.out.println("\n--- Selecione uma Categoria ---");
        for (Categoria c : categorias) {
            System.out.println("[" + c.getID() + "] - " + c.getNome());
        }

        while (true) {
            System.out.print("Digite o ID da categoria desejada: ");
            int idCat = scan.nextInt();

            for (Categoria c : categorias) {
                if (c.getID() == idCat) {
                    return c;
                }
            }
            System.out.println("ID inválido! Escolha um ID da lista acima.");
        }
    }

}