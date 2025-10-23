import DAO.DAO;

public class Produto implements DAO {
    private int numero;
    private String descricao;

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    @Override
    public void inserir() {
        System.out.println("Produto Inserir");
    }

    @Override
    public void excluir() {
        System.out.println("Produto Excluir");
    }

    @Override
    public void localixar() {
        System.out.println("Produto Localizar");
    }


    public void baixar(){
        System.out.println("Produto Baixar ");
    }

}
