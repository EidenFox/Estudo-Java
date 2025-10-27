public class Estadio {
    private String nome;
    private String local;

    public Estadio(String nome, String local){
        this.setNome(nome);
        this.setLocal(local);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getLocal() {
        return local;
    }

    public void setLocal(String local) {
        this.local = local;
    }

    @Override
    public String toString() {
        return "Estadio{" +
                "nome='" + nome + '\'' +
                ", local='" + local + '\'' +
                '}';
    }
}
