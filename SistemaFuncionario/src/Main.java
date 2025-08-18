import models.Funcionario;

import javax.swing.*;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        String nome = JOptionPane.showInputDialog("Informe o seu nome: ");
        String cpf = JOptionPane.showInputDialog("Informe o CPF: ");
        String funcao = JOptionPane.showInputDialog("Informe sua função: ");
        String dataAdmissao = JOptionPane.showInputDialog("Informe a data da sua admissão: ");
        String dataNascimento = JOptionPane.showInputDialog("Informe sua data de nascimento: ");
        String numeroCTPS = JOptionPane.showInputDialog("Informe o número so seu CTPS: ");
        double salarioBase = Double.parseDouble(JOptionPane.showInputDialog("Informe seu salário Base: "));


        if (nome != null && !nome.isEmpty() && cpf != null && !cpf.isEmpty() && funcao != null && !funcao.isEmpty()) {

            //funcionarioNovo.setNome("Rafael");
            //funcionarioNovo.setCpf("123456789-78");

            //System.out.println(funcionarioNovo.getNome());
            // System.out.println(funcionarioNovo.getCpf());
            // funcionarioNovo.salarioBase = 45000.00;
            // System.out.println("Salario R$ " + funcionarioNovo.salarioBase);

            //System.out.println(funcionarioNovo.imprimirFuncionario());

            Funcionario funcionarioNovo = new Funcionario(nome, cpf, funcao, dataAdmissao, dataNascimento, numeroCTPS, salarioBase);
            ArrayList<Funcionario> func = new ArrayList<Funcionario>();
            func.add(funcionarioNovo);

            System.out.println(func.get(0));
            //Funcionario newFuncionario = new Funcionario();

            JOptionPane.showMessageDialog(null, func.get(0));
        }else{
            JOptionPane.showMessageDialog(null, "Campo não foi preenchido");
        }
    }
}