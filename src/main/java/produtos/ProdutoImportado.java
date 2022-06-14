package produtos;

public class ProdutoImportado extends Produto{

    private Double alfandega;

    public ProdutoImportado(String nomeProduto, Double preco, Double alfandega) {
        super(nomeProduto, preco);
        this.alfandega = alfandega;
    }

    public Double getAlfandega() {
        return alfandega;
    }

    public void setAlfandega(Double alfandega) {
        this.alfandega = alfandega;
    }

    public Double precoTag() {
        return getPreco() * alfandega;
    }

    @Override
    public String priceTag() {
        return getNomeProduto()
                + String.format(" Preço: R$ %.2f", getPreco()) +
                String.format(" Valor Alfandega: R$ %.2f", alfandega);
    }
}
