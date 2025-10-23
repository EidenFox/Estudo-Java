public class Main {
    public static void main() {
        Cliente cliente = new Cliente();
        cliente.inserir();
        cliente.localixar();
        cliente.excluir();

        System.out.println("--------------------");

        Fornecedor fornecedor = new Fornecedor();
        fornecedor.inserir();
        fornecedor.excluir();
        fornecedor.localixar();

        System.out.println("--------------------");

        Produto produto = new Produto();
        produto.inserir();
        produto.excluir();
        produto.localixar();
        produto.baixar();

    }
}
