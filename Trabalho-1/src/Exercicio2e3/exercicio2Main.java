package Exercicio2e3;

public class exercicio2Main {
    public static void main() {

        Endereco endereco = new Endereco("Av. Brasil", 100, "Apto.2", "Centro", "99099-999");
        Pessoa autor = new Pessoa("Dante", 1234567890, 123456789, endereco);

        System.out.println("--- Autor Cadastrado ---");
        System.out.println("Nome: " + autor.getNome());
        System.out.println("RG: " + autor.getRg());
        System.out.println("CPF: " + autor.getCpf());
        System.out.println("Endereço: " + autor.getEndereco().toString());

        autor.atualizarDivida();
        autor.atualizarDivida(100, 50);



        RevistaCientifica revista = new RevistaCientifica(123, "ICSenac Technology");


        Edicao edicao1 = new Edicao(1, 1);

        System.out.println("\nAdicionando artigos...");
        edicao1.adicionarArtigo(new Artigo("Inteligência Artificial em Java", 1));
        edicao1.adicionarArtigo(new Artigo("Modelagem UML Prática", 15));
        edicao1.adicionarArtigo(new Artigo("Estruturas de Dados", 30));
        edicao1.adicionarArtigo(new Artigo("Algoritmos de Ordenação", 45));
        edicao1.adicionarArtigo(new Artigo("Segurança da Informação", 60));
        edicao1.adicionarArtigo(new Artigo("Computação em Nuvem", 75));

        revista.adicionarEdicao(edicao1);

        System.out.println("-----Consultas-----");
        revista.Consultar(123);
        edicao1.Consultar(1, 1);
    }
}