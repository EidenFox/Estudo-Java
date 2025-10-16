public class Main {
    public static void main() {
        Circulo circulo = new Circulo(46.35);
        System.out.println("Area: "+ circulo.calcularArea());
        System.out.println("Perimetro: "+ circulo.calcularComprimento());
        System.out.println("------------------------");

        Retangulo retangulo = new Retangulo(25.32, 16);
        System.out.println("Area: "+ retangulo.calcularArea());
        System.out.println("Perimetro: "+ retangulo.calcularComprimento());

    }
}