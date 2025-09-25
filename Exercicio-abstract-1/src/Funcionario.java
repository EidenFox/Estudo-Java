
abstract public class Funcionario {
    String Nome;
    String matricula;
    double salario_base;

    public Funcionario(String nome, String matricula, double salario_base) {
        this.setNome(nome);
        this.setMatricula(matricula);
        this.setSalario_base(salario_base);
    }
    
    abstract double calcularSalario();

    public String getNome() {
        return Nome;
    }

    public void setNome(String nome) {
        Nome = nome;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public double getSalario_base() {
        return salario_base;
    }

    public void setSalario_base(double salario_base) {
        this.salario_base = salario_base;
    }
}
    

