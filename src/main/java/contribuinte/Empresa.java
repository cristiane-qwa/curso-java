package contribuinte;

public class Empresa extends Contribuinte{
    private int quantidadeFuncionarios;

    public Empresa(String nome, double valorAnual, int quantidadeFuncionarios) {
        super(nome, valorAnual);
        this.quantidadeFuncionarios = quantidadeFuncionarios;
    }

    public int getQuantidadeFuncionarios() {
        return quantidadeFuncionarios;
    }

    public void setQuantidadeFuncionarios(int quantidadeFuncionarios) {
        this.quantidadeFuncionarios = quantidadeFuncionarios;
    }

    private double porcentagemImposto(int quantidadeFuncionarios) {
        if(quantidadeFuncionarios > 10) {
            return 14;
        }
        else{
            return 16;
        }
    }
    @Override
    public double resultado() {
        double v = porcentagemImposto(quantidadeFuncionarios);
        return (getValorAnual() * v ) /100;
    }
}
