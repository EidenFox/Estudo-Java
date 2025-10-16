public class Retangulo implements I_FiguraGeometrica{
    public double base, altura;

    public Retangulo(double base, double altura){
        this.setBase(base);
        this.setAltura(altura);
    }

    @Override
    public double calcularArea() {
        return (this.getBase() * this.getAltura());
    }

    @Override
    public double calcularComprimento() {
        return (2*(this.getBase() + this.getAltura()));
    }

    public double getBase() {
        return base;
    }

    public void setBase(double base) {
        this.base = base;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

}
