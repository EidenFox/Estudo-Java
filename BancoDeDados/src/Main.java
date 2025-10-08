import DAO.Conexao;
import DAO.ProdutoDao;
import Modelo.Produto;

import java.security.Permission;

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


        for (Produto p: produtoDao.listarTodos()){
            System.out.println("\n-------------------------");
            System.out.println("ID: "+ p.getID());
            System.out.println("Produto: "+ p.getNome());
            System.out.println("Quantidade: "+ p.getQuantidade());
            System.out.println("Preço: R$"+ p.getPreco());
            System.out.println("Total: R$"+ p.getPreco() * p.getQuantidade());
            System.out.println();
        }
    }
}