package exercicio_fixacao_polimorfismo;

public class ImportedProduct extends Product{
    private Double customsFee;

    public ImportedProduct(String name, Double price, Double customsFee) {
        super(name, price);
        this.customsFee = customsFee;
    }

    public Double getCustomsFee() {
        return customsFee;
    }

    public void setCustomsFee(Double customsFee) {
        this.customsFee = customsFee;
    }

    private Double totalPrice() {
        return price + customsFee;
    }

    @Override
    public String priceTag() {
        return name + " $ " + String.format("%.2f", totalPrice()) + " " + "Customs fee: $ " +  String.format("%.2f", customsFee);
    }
}