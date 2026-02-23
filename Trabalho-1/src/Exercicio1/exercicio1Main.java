package Exercicio1;

import java.util.ArrayList;
import java.util.List;

public class exercicio1Main {
    public static void main(){


        Chefe chefe = new Chefe();
        Comissionado comissionado = new Comissionado();


        List<Empregado> empregados = new ArrayList<>();

// Comissionados
        empregados.add(new Comissionado(1230.55, 78, 5, "Pedro", "Rua Pedro 1"));
        empregados.add(new Comissionado(1500.00, 80, 6, "Maria", "Av. Central 45"));
        empregados.add(new Comissionado(980.75, 60, 4, "João", "Rua das Flores 12"));
        empregados.add(new Comissionado(2000.00, 90, 7, "Ana", "Rua Azul 33"));
        empregados.add(new Comissionado(1750.00, 85, 6, "Bruno", "Rua Nova 66"));
        empregados.add(new Comissionado(1600.00, 70, 5, "Patrícia", "Av. das Árvores 99"));
        empregados.add(new Comissionado(1850.00, 95, 8, "Lucas", "Rua Sol 77"));
        empregados.add(new Comissionado(1400.00, 65, 4, "Fernanda", "Av. Norte 21"));

// Chefes
        empregados.add(new Chefe(8334.12, 150.00, "Robson", "Rua Rua, 123"));
        empregados.add(new Chefe(9500.00, 200.00, "Clara", "Av. Brasil 500"));
        empregados.add(new Chefe(8700.50, 180.00, "Carlos", "Rua Verde 88"));
        empregados.add(new Chefe(9100.00, 220.00, "Juliana", "Rua Oeste 55"));
        empregados.add(new Chefe(8800.00, 190.00, "Ricardo", "Av. Leste 101"));
        empregados.add(new Chefe(9900.00, 250.00, "Sofia", "Rua Centro 88"));
        empregados.add(new Chefe(10200.00, 300.00, "Paulo", "Rua Sul 19"));

        System.out.println("CHEFES: ");
        for (Empregado e : empregados){
            if (e instanceof Chefe){
                e.calcularSalario();
            }
        }
        System.out.println("COMISSIONADOS: ");
        for (Empregado e : empregados){

            if (e instanceof Comissionado){
                e.calcularSalario();
            }
        }

//        empregados.add(comissionado);

    }
}
