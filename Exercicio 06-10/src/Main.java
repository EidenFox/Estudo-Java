import java.util.ArrayList;

public class Main {
    public static void main(){

        ArrayList<CartaoWeb> cartoes = new ArrayList<>();
        cartoes.add(new Aniversario("Nikolas"));
        cartoes.add(new Natal("Daniel"));
        cartoes.add(new DiaDosNamorados("Pedro"));

        for(CartaoWeb c : cartoes){
            c.ShowMessage();
        }


    }
}
