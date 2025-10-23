import DAO.DAO;

public class Fornecedor implements DAO {
    private String cnpj;
    private String razaoSocial;


    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    public String getRazaoSocial() {
        return razaoSocial;
    }

    public void setRazaoSocial(String razaoSocial) {
        this.razaoSocial = razaoSocial;
    }

    @Override
    public void inserir() {
        System.out.println("Funcionário Inserir");
    }

    @Override
    public void excluir() {
        System.out.println("Funcionãrio Excluir");
    }

    @Override
    public void localixar() {
        System.out.println("Funcionário Localizar");
    }
}
