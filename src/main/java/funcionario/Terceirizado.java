package funcionario;

public class Terceirizado extends Funcionario {
    private Double valorDespesa;

    public Terceirizado(String nome, Integer horasTrabalhadas, Double valorHora, Double valorDespesa) {
        super(nome, horasTrabalhadas, valorHora);
        this.valorDespesa = valorDespesa;
    }

    public Double getValorDespesa() {
        return valorDespesa;
    }

    public void setValorDespesa(Double valorDespesa) {
        this.valorDespesa = valorDespesa;
    }

    @Override
    public Double calculaSalario() {
        return super.calculaSalario() + valorDespesa * 1.1;
    }
}
