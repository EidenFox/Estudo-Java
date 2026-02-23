package Exercicio4;

public class exercicio4Main {
    public static void main() {
        double valorVenda = 100.00;

        TipoPagamento[] pagamentos = {new Dinheiro(), new Cheque(), new Credito()};

        System.out.println("Venda: R$ " + valorVenda);

        for (TipoPagamento p : pagamentos) {
            System.out.println("Forma de Pagamento: " + p.toString());
            System.out.println("Dias para receber: " + p.getDiasFaturamento() + " dias");

            double valor = valorVenda * p.getPorcentagemFinanceiraPaga();
            System.out.println("Valor a receber: R$ " + valor);
            System.out.println("-------------------------");
        }
    }
}
