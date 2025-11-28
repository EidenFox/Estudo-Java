package Exercicio2e3;

public class Artigo {
    private String titArtigo;
    private int pagInicialArtigo;

    public Artigo(String titArtigo, int pagInicialArtigo) {
        this.titArtigo = titArtigo;
        this.pagInicialArtigo = pagInicialArtigo;
    }

    public String gettitArtigo() {
        return titArtigo;
    }

    public void settitArtigo(String titArtigo) {
        titArtigo = titArtigo;
    }

    public int getpagInicialArtigo() {
        return pagInicialArtigo;
    }

    public void setpagInicialArtigo(int pagInicialArtigo) {
        pagInicialArtigo = pagInicialArtigo;
    }

    public void Registrar() {
        System.out.println("Artigo registrado: " + this.titArtigo);
    }

    public void Consultar() {
        System.out.println("Titulo: " + this.titArtigo + "\nPagina Inicial: " + this.pagInicialArtigo);
    }


}
