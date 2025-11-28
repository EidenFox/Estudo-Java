package Exercicio2e3;

import java.util.ArrayList;

public class RevistaCientifica {
    private long ISSNRev;
    private String TitRev;
    private ArrayList<Edicao> edicoes;


    public RevistaCientifica(long ISSNRev, String titRev) {
        this.ISSNRev = ISSNRev;
        this.TitRev = titRev;
        this.edicoes = new ArrayList<>();
    }

    public long getISSNRev() {
        return ISSNRev;
    }

    public void setISSNRev(long ISSNRev) {
        this.ISSNRev = ISSNRev;
    }

    public String getTitRev() {
        return TitRev;
    }

    public void setTitRev(String titRev) {
        TitRev = titRev;
    }

    public void adicionarEdicao(Edicao edicao) {
        this.edicoes.add(edicao);
    }



    public void Registrar() {
        System.out.println("Revista " + TitRev + "\nISSN: " + ISSNRev + " registrada.");
    }

    public int Consultar(long issnConsulta) {
        if (this.ISSNRev == issnConsulta) {
            System.out.println("Revista Encontrada: " + this.TitRev);
            System.out.println("Quantidade de edições: " + this.edicoes.size());
            return 1;
        }else{
         return 0;
        }
    }



}
