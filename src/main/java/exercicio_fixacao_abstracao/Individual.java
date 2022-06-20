package exercicio_fixacao_abstracao;

public class Individual extends TaxPayer{
    private Double healthExpenditures;

    public Individual(String name, Double anualIncome, Double healthExpenditures) {
        super(name, anualIncome);
        this.healthExpenditures = healthExpenditures;
    }

    public Double getHealthExpenditures() {
        return healthExpenditures;
    }

    public void setHealthExpenditures(Double healthExpenditures) {
        this.healthExpenditures = healthExpenditures;
    }

    @Override
    public Double tax(){
        if(anualIncome < 20000.00) {
            return (anualIncome * 15) / 100.0;
        }
        else if(anualIncome > 20000.00 && healthExpenditures > 0.0) {
            return ((anualIncome * 25) / 100.0) - ((healthExpenditures * 50) / 100.0);
        }
        else {

            return(anualIncome * 25) / 100.0;
        }
    }

}
