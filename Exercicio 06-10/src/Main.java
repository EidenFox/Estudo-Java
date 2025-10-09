import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(){

        ArrayList<CartaoWeb> cartoes = new ArrayList<>();
        cartoes.add(new Aniversario("Nikolas", "Mensagem de Aniversário"));
        cartoes.add(new Natal("Daniel", "Mensagem de Natal"));
        cartoes.add(new DiaDosNamorados("Pedro", "Mensagem de Dia dos Namorados"));

        cartoes.add(new Aniversario("Arthur", "Feliz aniversário, aproveite muito o seu dia!"));
        cartoes.add(new Natal("Juliana", "Que seu Natal seja cheio de luz e alegria!"));
        cartoes.add(new DiaDosNamorados("Murilo", "Obrigado por estar ao meu lado, feliz Dia dos Namorados!"));
        cartoes.add(new Natal("Bianca", "Desejo um Natal mágico e cheio de amor!"));
        cartoes.add(new Aniversario("Carlos", "Que seu novo ciclo venha com muitas conquistas!"));
        cartoes.add(new DiaDosNamorados("Fernanda", "Você torna todos os meus dias especiais!"));
        cartoes.add(new Natal("Eduardo", "Boas festas! Que o espírito natalino te envolva com carinho."));
        cartoes.add(new DiaDosNamorados("Gabriela", "Feliz Dia dos Namorados, meu amor eterno."));
        cartoes.add(new Aniversario("Helena", "Parabéns! Muita saúde, paz e felicidade sempre."));
        cartoes.add(new DiaDosNamorados("Isabela", "Estar com você é meu melhor presente."));
        cartoes.add(new Aniversario("João", "Feliz aniversário! Continue brilhando por onde passar."));
        cartoes.add(new Natal("Larissa", "Um Natal repleto de amor, paz e momentos inesquecíveis."));


        int op;

        do {
            System.out.println("Selecione a opção desejada:");
            System.out.println("[1] Listar Todas");
            System.out.println("[2] Listar Aniversarios");
            System.out.println("[3] Listar Natal");
            System.out.println("[4] Listar Dia dos Namorados");
            Scanner scan = new Scanner(System.in);

            op = scan.nextInt();

            switch (op) {
                case 1:
//                    for (CartaoWeb c : cartoes) {
//                        c.ShowMessage();
//                    }
                    listar(cartoes, null);
                    break;
                case 2:
                    listar(cartoes, Aniversario.class);
                    break;
                case 3:
                    listar(cartoes, Natal.class);
                    break;
                case 4:
                    listar(cartoes, DiaDosNamorados.class);
                    break;
                case 0:
                    System.out.println("Saindo");
                    break;
                default:
                    System.out.println("INVALIDO");
                    break;
            }
        }while(op != 0);
    }

    public static void listar(ArrayList<CartaoWeb> cartoes, Class<?> obj){
        for (CartaoWeb c : cartoes) {
            if (obj == null || obj.isInstance(c)) c.ShowMessage();
        }
    }
}
