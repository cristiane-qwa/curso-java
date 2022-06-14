package geometria;

public abstract class Shape {
    private Color color;
    private String tipo;

    public Shape(Color color) {
        this.color = color;
    }

    public Shape(String tipo) {
        this.tipo = tipo;
    }

    public Color getColor() {
        return color;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public abstract double area();

}
