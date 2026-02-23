package Exercicio4;

public class Cheque implements TipoPagamento {

    @Override
    public int getDiasFaturamento() {
        return 7;
    }

    @Override
    public double getPorcentagemFinanceiraPaga() {
        return 1.0;
    }

    @Override
    public String toString() {
        return "Cheque";
    }
}