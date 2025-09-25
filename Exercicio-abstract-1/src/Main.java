public class Main {
    public static void main() {
        Gerente antonio = new Gerente("Antonio F", "002", 2500.50);
        Vendedor robson = new Vendedor("Robson", "544", 2500.50, 150);
        Assistente paulo = new Assistente("Paulo", "6784", 2500.50);
        System.out.println("-------------------");
        System.out.println("------GERENTE------");
        System.out.println("-------------------");
        System.out.println("Funcionário: "+ antonio.getNome());
        System.out.println("Salário Base: R$"+ antonio.getSalario_base());
        System.out.println("Novo Salario: R$"+ antonio.calcularSalario());
        System.out.println("-------------------");
        System.out.println("\n");
        System.out.println("-------------------");
        System.out.println("------VENDEDOR-----");
        System.out.println("-------------------");
        System.out.println("Funcionário: "+ robson.getNome());
        System.out.println("Salário Base: R$"+ robson.getSalario_base());
        System.out.println("Novo Salario: R$"+ robson.calcularSalario());
        System.out.println("\n");
        System.out.println("-------------------");
        System.out.println("-----ASSISTENTE----");
        System.out.println("-------------------");
        System.out.println("Funcionário: "+ paulo.getNome());
        System.out.println("Salário Base: R$"+ paulo.getSalario_base());
        System.out.println("Novo Salario: R$"+ paulo.calcularSalario());

    }
}