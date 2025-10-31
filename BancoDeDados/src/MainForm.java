import DAO.CategoriaDao;
import Modelo.Categoria;

public class MainForm {

    public static void main() {
//        FormGerenciadorEstoque formGerenciadorEstoque = new FormGerenciadorEstoque();
//        formGerenciadorEstoque.setVisible(true);
        CategoriaDao categoriaDao = new CategoriaDao();



//        categoriaDao.inserir(new Categoria("Acessórios de impressoras", "Items para impressoras"));



        for(Categoria c : categoriaDao.categoriaList(true)){
            System.out.println(c.getID() + c.getNome() + c.getDescicao() +  c.isState());
        }

        System.out.println("--------------");
        categoriaDao.alterarEstado(1, false);
        System.out.println("--------------");

        for(Categoria c : categoriaDao.categoriaList(true)){
            System.out.println(c.getID() + c.getNome() + c.getDescicao() +  c.isState());
        }
    }

}
