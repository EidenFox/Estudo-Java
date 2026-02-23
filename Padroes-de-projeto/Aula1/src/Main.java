public class Main {
    public static void main(String[] args) {
        Gato tom = new Gato ();
        Gato frajola = new Gato("frajola");
        Gato garfield = new Gato("rajado", 15);

        tom.setPadrão("persa");
        tom.setPeso(8);

        frajola.setPeso(10);

        tom.correr("Pegar o Jerry!");

        System.out.println("Tom é um gato "+ tom.getPadrão() +" de "+ tom.getPeso() +" Kilos.");
        System.out.println("Frajola é um gato "+ frajola.getPadrão() +" de "+ frajola.getPeso() +" Kilos.");
        System.out.println("Garfield é um gato "+ garfield.getPadrão() +" de "+ garfield.getPeso() +" Kilos.");
    }
}