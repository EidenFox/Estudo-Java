public class Adicao implements Calculadora{
    private double a, b;

    public double getA() {
        return a;
    }

    public void setA(double a) {
        this.a = a;
    }

    public double getB() {
        return b;
    }

    public void setB(double b) {
        this.b = b;
    }

    public Adicao(double a, double b){
        this.setA(a);
        this.setB(b);
    }



    @Override
    public double calcula(double a, double b) {
        return (a + b);
    }

}
