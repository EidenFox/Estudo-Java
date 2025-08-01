package modelo;

import java.util.Scanner;

public class Produto {

    public int codigo;
    public String nome;
    public double preco;
    public int quantidadeEstoque;
    public boolean status = true;

    //Função para Recever o Estado e checar se ja está neste estado ou altera-lo
    public void alterarStatus(boolean estado){
        String mensagem;


        if(this.status == estado){
            mensagem = "Produto ja está neste estado";
        }else{
            mensagem = "Estado Alterado";
            this.status = estado;
        }
        System.out.println(mensagem);
    }

    //Função para cadastrar produtos
    public void cadastroProduto(Scanner scan){
        System.out.println("Digite o Código do Produto: ");
        this.codigo = scan.nextInt();
        scan.nextLine(); // limpabuffer

        System.out.println("Digite o Nome do Poroduto: ");
        this.nome = scan.nextLine();

        System.out.println("Digite o Preço do Produto: ");
        this.preco = scan.nextDouble();

        System.out.println("Digite a Quantidade de Estoque do Produto: ");
        this.quantidadeEstoque = scan.nextInt();


        scan.nextLine(); // limpabuffer
    }

    public double calcularValorProdutoEstoque(){
        return this.preco * this.quantidadeEstoque;
    }

    //Função que lista na tela os dados do produto
    public void listarProduto(){
        System.out.println("\n\nCódigo: "+ this.codigo);
        System.out.println("Nome: "+ this.nome);
        System.out.println("Preço: R$ "+ this.preco);
        System.out.println("Quantidade em Estoque: "+ this.quantidadeEstoque);
        System.out.println("Total: R$ "+ calcularValorProdutoEstoque());

        if(this.status == true) {
            System.out.println("Status: Ativo");
        }else{
            System.out.println("Status: Inativo");
        }


    }

}
