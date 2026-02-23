package Exercicio4;

public class Dinheiro implements TipoPagamento {

    @Override
    public int getDiasFaturamento() {
        return 0;
    }

    @Override
    public double getPorcentagemFinanceiraPaga() {
        return 1.0;
    }

    @Override
    public String toString() {
        return "Dinheiro";
    }
}