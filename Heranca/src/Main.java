public class Main {
    public static void main() {

        Pessoa pessoa = new Pessoa("Daniel", "daniel@teste.com", "12345678910");

        Funcionario Dante = new Funcionario("Dante", "dante@teste.com", "12345678910", "123", "Administradora", 1500.00);


        System.out.println("---------------------------------");
        System.out.println(Dante.getSetor());
        System.out.println("---------------------------------");
        System.out.println("Nome: "+ Dante.getNome());
        System.out.println("Email: "+ Dante.getEmail());
        System.out.println("CPF: "+ Dante.getCPF());
        System.out.println("---------------------------------");
        System.out.println("Matricula: "+ Dante.getMatricula());
        System.out.println("Salário Base: "+ Dante.getSalarioBase());
        System.out.println("\n---------------------------------");



    }
}