import java.awt.*;

public class Produto {
    public String nomeProduto;
    public String descProduto;
    public int qtdEstoque;
    public double precoProduto;
    public String SKU;

    public Produto (String nomeProduto, String descProduto, int qtdEstoque, double precoProduto, String SKU){
        this.nomeProduto = nomeProduto;
        this.descProduto = descProduto;
        this.qtdEstoque = qtdEstoque;
        this.precoProduto = precoProduto;
        this.SKU = SKU;
    }

    public String getNomeProduto() {
        return nomeProduto;
    }

    public void setNomeProduto(String nomeProduto) {
        this.nomeProduto = nomeProduto;
    }

    public String getDescProduto() {
        return descProduto;
    }

    public void setDescProduto(String descProduto) {
        this.descProduto = descProduto;
    }

    public int getQtdEstoque() {
        return qtdEstoque;
    }

    public void setQtdEstoque(int qtdEstoque) {
        this.qtdEstoque = qtdEstoque;
    }

    public double getPrecoProduto() {
        return precoProduto;
    }

    public void setPrecoProduto(double precoProduto) {
        this.precoProduto = precoProduto;
    }

    public String getSKU() {
        return SKU;
    }

    public void setSKU(String SKU) {
        this.SKU = SKU;
    }
}
