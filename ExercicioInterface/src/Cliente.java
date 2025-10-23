import DAO.DAO;

public class Cliente implements DAO {
    private int codigo;
    private String nome;

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    @Override
    public void inserir() {
        System.out.println("Cliente Inserir");
    }

    @Override
    public void excluir() {
        System.out.println("Cliente Excluir");
    }

    @Override
    public void localixar() {
        System.out.println("Cliente Localizar");
    }
}
