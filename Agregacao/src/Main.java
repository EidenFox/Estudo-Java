import java.util.ArrayList;

public class Main {
    public static void main() {
//        Time Fox = new Time("Fox",
//                new Estadio("Arena SENAC", "Maringa"),
//                new SocioTorcedor("Dante", "Master")
//        );

        Estadio arenaSenac = new Estadio("Arena SENAC", "Maringa");

        ArrayList<SocioTorcedor> listaSocioTorcedor = new ArrayList<>();

        listaSocioTorcedor.add(new SocioTorcedor("Dante", "Master"));
        listaSocioTorcedor.add(new SocioTorcedor("Eiden", "Admin"));

        Time Fox = new Time("Fox", arenaSenac, listaSocioTorcedor.get(1));

        System.out.println(Fox);



    }
}