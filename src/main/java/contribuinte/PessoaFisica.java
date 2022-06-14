package contribuinte;

public class PessoaFisica extends Contribuinte{
    private double saude;

    public PessoaFisica(String nome, double valorAnual, double saude) {
        super(nome, valorAnual);
        this.saude = saude;
    }

    public boolean verificaGastoSaude(double saude) {
        if(getValorAnual() / 2.0 >= saude) {
            return true;
        }
        return false;
    }
    @Override
    public double resultado() {
        boolean resultado = verificaGastoSaude(saude);
        double valor = getValorAnual();

        if(resultado && valor > 20000.00) {
            return ((valor * .25) - (saude * .50));
        }
        else if(resultado && valor <= 20000.00) {
            return (valor * 25) /100;
        }
        else{
            return (valor * 15) /100;
        }
    }
}
