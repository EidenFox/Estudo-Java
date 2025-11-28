package Exercicio4;

public class Credito implements TipoPagamento {

    @Override
    public int getDiasFaturamento() {
        return 20;
    }

    @Override
    public double getPorcentagemFinanceiraPaga() {
        return 0.95;
    }

    @Override
    public String toString() {
        return "Cartão de Crédito";
    }
}