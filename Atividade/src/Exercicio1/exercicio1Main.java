package Exercicio1;

import java.util.ArrayList;
import java.util.List;

public class exercicio1Main {
    public static void main(){

        List<Empregado> empregados =  new ArrayList<>(){
        };
        Chefe chefe = new Chefe();
        Comissionado comissionado = new Comissionado();


        chefe.setNome("Robson");
        chefe.setEndereço("Rua rua, 123");
        chefe.setSalarioMensal(8334.12);
        chefe.setBonus(150.00);
        empregados.add(chefe);

        empregados.add(new Comissionado(1230.55, 78, 5, "Pedro", "Rua pedro 1"));



        for (Empregado e : empregados){
//            System.out.println("Nome: "+ e.getNome());
//            System.out.println("Endereço: "+ e.getEndereço());
//            System.out.println("Salario Total: "+ e.);
            e.calcularSalario();
        }

//        empregados.add(comissionado);

    }
}
