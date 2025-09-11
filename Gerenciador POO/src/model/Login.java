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
    public Login(int ID, String nome, String email, String senha, String dataCadastro, String dataAtualizacao) {
        this.ID = ID;
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
        if (ID > 0){
            this.ID = ID;
        }
        else{
            throw new NumberFormatException("ID Deve ser maior que 0");
        }
    }

    public String getNome() {
        return nome;
    }

    public boolean setNome(String nome) {
        if (!nome.isEmpty() && !nome.contains(" ")){
            this.nome = nome.trim();
            return true;
        }
        else return false;
    }

    public String getEmail() {
        return email;
    }

    public boolean setEmail(String email) {
        if (!email.isEmpty() && email.contains("@")) this.email = email;
        else return false;
        return true;
    }

    public String getSenha() {
        return senha;
    }

    public boolean setSenha(String senha) {
        if (!senha.isEmpty()) this.senha = senha;
        else return false;
        return true;
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

    public boolean setDataCadastro(String dataCadastro) {
        if (!dataCadastro.isEmpty()) this.dataCadastro = dataCadastro;
        else return false;
        return true;
    }

    public String getDataAtualizacao() {
        return dataAtualizacao;
    }

    public boolean setDataAtualizacao(String dataAtualizacao) {
        if (!dataAtualizacao.isEmpty()) this.dataAtualizacao = dataAtualizacao;
        else return false;
        return true;
    }





}
