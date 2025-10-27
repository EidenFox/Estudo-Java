public class Time {
    private String nome;
    private Estadio estadio;
    private SocioTorcedor socioTorcedor;

    public Time(String nome, Estadio estadio, SocioTorcedor socioTorcedor){
     this.setNome(nome);
     this.setEstadio(estadio);

     this.setSocioTorcedor(socioTorcedor);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Estadio getEstadio() {
        return estadio;
    }

    public void setEstadio(Estadio estadio) {
        this.estadio = estadio;
    }

    public SocioTorcedor getSocioTorcedor() {
        return socioTorcedor;
    }

    public void setSocioTorcedor(SocioTorcedor socioTorcedor) {
        this.socioTorcedor = socioTorcedor;
    }

    @Override
    public String toString() {
        return "Time{" +
                "nome='" + nome + '\'' +
                ", estadio=" + estadio +
                ", socioTorcedor=" + socioTorcedor +
                '}';
    }
}
