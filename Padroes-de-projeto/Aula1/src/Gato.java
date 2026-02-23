public class Gato extends Animal implements QuatroPatas, RespOxigenio{
    private String padrão;

    public Gato(String padrão){
        this.padrão = padrão;
    }
    public Gato (){

    }

    public Gato (String padrão, int peso){
        this.padrão = padrão;
        this.setPeso(peso);
    }

    @Override
    public int getPeso() {
        return super.getPeso();
    }

    @Override
    public void setPeso(int peso) {
        super.setPeso(peso);
    }


    public String getPadrão() {
        return padrão;
    }

    public void setPadrão(String padrão) {
        this.padrão = padrão;
    }

    @Override
    public void correr(String destino) {
        System.out.println("Estou correndo para "+ destino);
    }

    @Override
    public void respirar() {
        for(int i=0; i>3; i++){
            System.out.println("***Inspira***");;
            System.out.println("***Expira***");
        }
    }
}
