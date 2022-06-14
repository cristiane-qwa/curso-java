package contribuinte;

public abstract class Contribuinte {
    private String nome;

    public Contribuinte(String nome, double valorAnual) {
        this.nome = nome;
        this.valorAnual = valorAnual;
    }

    private double valorAnual;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getValorAnual() {
        return valorAnual;
    }

    public void setValorAnual(double valorAnual) {
        this.valorAnual = valorAnual;
    }

    public abstract double resultado();

}
