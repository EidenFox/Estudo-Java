package Exercicio2e3;

import java.util.ArrayList;

public class Edicao {
    private int NroEdi;
    private int VolumeEdi;
    private ArrayList<Artigo> artigos;

    public Edicao(int nroEdi, int volumeEdi) {
        this.NroEdi = nroEdi;
        this.VolumeEdi = volumeEdi;
        this.artigos = new ArrayList<>();
    }

    public int getNroEdi() {
        return NroEdi;
    }

    public void setNroEdi(int nroEdi) {
        NroEdi = nroEdi;
    }

    public int getVolumeEdi() {
        return VolumeEdi;
    }

    public void setVolumeEdi(int volumeEdi) {
        VolumeEdi = volumeEdi;
    }


    public void adicionarArtigo(Artigo artigo) {
        if (this.artigos.size() < 10) {
            this.artigos.add(artigo);
        } else {
            System.out.println("Limite de 10 artigos atingido.");
        }
    }

    public int Registrar() {
        System.out.println("Edição " + NroEdi + " registrada com sucesso.");
        return 1;
    }

    public int Consultar(int nroEdi, int volEdi) {
        if (this.NroEdi == nroEdi && this.VolumeEdi == volEdi) {
            System.out.println("Número: " + this.NroEdi + " | Volume: " + this.VolumeEdi);
            System.out.println("Artigos nesta edição: " + artigos.size() + " :");
            for (Artigo a : artigos) {
                a.Consultar();
            }
            return 1;
        }else{
            return 0;
        }
    }




}
