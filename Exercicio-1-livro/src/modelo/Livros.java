package modelo;

public class Livros {
    public String titulo;
    public String autor;
    public int anoPublicacao;


    public void exibirinformacoes(){
        System.out.println("-------------Livro-Cadastrado---------------");
        System.out.println("Título do Livro: " + this.titulo);
        System.out.println("Autor do Livro: "+ this.autor);
        System.out.println("Ano de Publicação: "+ this.anoPublicacao);
        System.out.println("--------------------------------------------");

    }
}