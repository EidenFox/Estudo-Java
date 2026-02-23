import java.util.Scanner;
import modelo.Livros;

public class Main {
    public static void main(){
        Livros livro = new Livros();
        Scanner scan = new Scanner(System.in);

        System.out.println("Olá, Cadastre os dados do Livro");
        System.out.println("Primeiro, digite o Titulo do livro: ");
        livro.titulo = scan.nextLine();

        System.out.println("Agora digite o nome do Autor: ");
        livro.autor = scan.nextLine();

        System.out.println("Agora digire o ano de publicação: ");
        livro.anoPublicacao = scan.nextInt();

        livro.exibirinformacoes();



    }
}