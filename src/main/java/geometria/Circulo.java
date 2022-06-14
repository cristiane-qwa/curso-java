package geometria;

public class Circulo extends Shape{

    public Circulo(Color color) {
        super(color);
    }
    private double raio;

    public Circulo(Color color, double radio) {
        super(color);
        this.raio = radio;
    }

    public double getRadio() {
        return raio;
    }

    public void setRadio(double radio) {
        this.raio = radio;
    }

    @Override
    public double area() {
        return Math.PI * raio * raio;
    }
}
