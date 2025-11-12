import DAO.CategoriaDao;
import Modelo.Categoria;

public class MainForm {

    public static void main() {
        FormGerenciadorEstoque formGerenciadorEstoque = new FormGerenciadorEstoque();
        formGerenciadorEstoque.setVisible(true);



//        categoriaDao.inserir(new Categoria("Acessórios de impressoras", "Items para impressoras"));



        CategoriaDao categoriaDao = new CategoriaDao();
        for(Categoria c : categoriaDao.categoriaList(true)){
            System.out.println(c);
        }
    }

}
