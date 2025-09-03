public class Pessoa {
    protected String nome;
    protected String email;
    protected String CPF;

    public Pessoa(String nome, String email, String CPF){
        this.nome = nome;
        this.CPF = CPF;
        this.email = email;
    }

    public String getNome() {
        return nome;
    }

    public String getEmail() {
        return email;
    }

    public String getCPF() {
        return CPF;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setCPF(String CPF) {
        this.CPF = CPF;
    }
}
