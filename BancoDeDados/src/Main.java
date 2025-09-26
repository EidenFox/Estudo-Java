import DAO.Conexao;
import DAO.ProdutoDao;
import Modelo.Produto;

import java.security.Permission;

public class Main {
    public static void main() {
        Produto produto = new Produto("Açucar 5km", 15.98, 2);

        ProdutoDao produtoDao = new ProdutoDao();
        produtoDao.inserir(produto);
    }
}