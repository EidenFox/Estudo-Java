public class Circulo implements I_FiguraGeometrica{
    public double raio;
    static public final double PI = 3.14;

    public Circulo(double raio){
        this.setRaio(raio);
    }


    @Override
    public double calcularArea() {
        double areaCirculo = PI * Math.pow(this.getRaio(), 2);
        return areaCirculo;
    }

    @Override
    public double calcularComprimento() {
        return (2*PI*this.getRaio());
    }

    public double getRaio() {
        return raio;
    }

    public void setRaio(double raio) {
        this.raio = raio;
    }
}
