package Exercicio2e3;

public class Pessoa {
    protected String nome;
    private long cpf;
    public long rg;

    private Endereco endereco;

    public Pessoa(String nome, long cpf, long rg, Endereco endereco) {
        this.nome = nome;
        this.cpf = cpf;
        this.rg = rg;
        this.endereco = endereco;
    }


    public void atualizarDivida() {
        System.out.println("Dívida Calculada.");
    }


    private int atualizarDivida(int valor) {
        System.out.println("Atualizando Divita: " + valor+10);
        return valor + 10;
    }


    protected double atualizarDivida(int valor1, int valor2) {
        double total = valor1 + valor2 * 0.25;
        System.out.println("Atualizando Dívida: " + total);
        return total;
    }


    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public long getCpf() {
        return cpf;
    }

    public void setCpf(long cpf) {
        this.cpf = cpf;
    }

    public long getRg() {
        return rg;
    }

    public void setRg(long rg) {
        this.rg = rg;
    }

    public Endereco getEndereco() {
        return endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }
}