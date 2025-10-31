import java.util.ArrayList;
import java.util.Date;

public class Pedido {
    public int idPedido;
    public Date data;
    public double valorDesconto;
    public ArrayList<ItemPedido> itemPedidos;


    public Pedido(Date data /*, double valorDesconto*/) {
        this.data = data;
//        this.valorDesconto = valorDesconto;
        itemPedidos = new ArrayList<>();


    }

    public void adicionarItemPedido(){

        String descricao = "Arroz 5kg";
        int quantidade = 2;
        double valorUnitario = 35.68;

        ItemPedido itemPedido = new ItemPedido(descricao, quantidade, valorUnitario);
        itemPedidos.add(itemPedido);
    }

    public void adicionarItemPedido(){

    }



    public int getIdPedido() {
        return idPedido;
    }

    public void setIdPedido(int idPedido) {
        this.idPedido = idPedido;
    }

    public Date getData() {
        return data;
    }

    public void setData(Date data) {
        this.data = data;
    }

    public double getValorDesconto() {
        return valorDesconto;
    }

    public void setValorDesconto(double valorDesconto) {
        this.valorDesconto = valorDesconto;
    }
}
