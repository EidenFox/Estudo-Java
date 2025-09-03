package model;

public class Login {
    public int ID;
    public String nome;
    public String email;
    public String senha;
    public boolean status;
    public String dataCadastro;
    public String dataAtualizacao;
    public String cargo;

    public Login() {
    }

    public Login(String nome, String email, String senha, String dataCadastro, String dataAtualizacao, String cargo, int ID) {
        this.ID = ID;
        this.nome = nome;
        this.email = email;
        this.senha = senha;
        this.status = true;
        this.dataCadastro = dataCadastro;
        this.dataAtualizacao = dataAtualizacao;
        this.cargo = cargo;

    }

    @Override
    public String toString() {
        return "Login{" +
                "ID=" + ID +
                ", nome='" + nome + '\'' +
                ", email='" + email + '\'' +
                ", senha='" + senha + '\'' +
                ", status=" + status +
                ", cargo= " + cargo +
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
            throw new NumberFormatException("ID Deve ser maior do que 0");
        }
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        if (!nome.isEmpty() && !(nome.length() > 50)){
            this.nome = nome.trim();
        }
        else throw new IllegalArgumentException("Nome não pode ser vazio nem conter mais do que 50 caracteres!");
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        if (!email.isBlank() && email.contains("@")){
            this.email = email.trim().toLowerCase();
        }else{
            throw new IllegalArgumentException("O e-mail não pode estar vazio ou o seu formato está incorreto!");
        }

    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        if (senha.length() >= 4) this.senha = senha;
        else
            throw new IllegalArgumentException("Senha deve conter pelo menos 4 caracteres!");
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

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }
}
