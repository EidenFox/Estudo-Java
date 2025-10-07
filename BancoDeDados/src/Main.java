import DAO.Conexao;
import DAO.ProdutoDao;
import Modelo.Produto;

import java.security.Permission;

public class Main {
    public static void main() {
//        Produto produto = new Produto("Açucar 5km", 15.98, 2);

        ProdutoDao produtoDao = new ProdutoDao();
//        produtoDao.inserir(produto);

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