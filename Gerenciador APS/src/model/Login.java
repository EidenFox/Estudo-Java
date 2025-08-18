package model;

public class Login {
    public int ID;
    public String nome;
    public String email;
    public String senha;
    public boolean status;
    public String dataCadastro;
    public String dataAtualizacao;

    public Login() {
    }

    public Login(String nome, String email, String senha, String dataCadastro, String dataAtualizacao) {
        this.nome = nome;
        this.email = email;
        this.senha = senha;
        this.status = true;
        this.dataCadastro = dataCadastro;
        this.dataAtualizacao = dataAtualizacao;
    }

    @Override
    public String toString() {
        return "Login{" +
                "ID=" + ID +
                ", nome='" + nome + '\'' +
                ", email='" + email + '\'' +
                ", senha='" + senha + '\'' +
                ", status=" + status +
                ", dataCadastro='" + dataCadastro + '\'' +
                ", dataAtualizacao='" + dataAtualizacao + '\'' +
                '}';
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    public String getDataCadastro() {
        return dataCadastro;
    }

    public void setDataCadastro(String dataCadastro) {
        this.dataCadastro = dataCadastro;
    }

    public String getDataAtualizacao() {
        return dataAtualizacao;
    }

    public void setDataAtualizacao(String dataAtualizacao) {
        this.dataAtualizacao = dataAtualizacao;
    }
}
