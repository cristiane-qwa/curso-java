package produtos;

import java.text.SimpleDateFormat;
import java.util.Date;

public class ProdutoUsado extends Produto {
    private SimpleDateFormat dataFabricacao;

    public ProdutoUsado(String nomeProduto, Double preco, SimpleDateFormat dataFabricacao) {
        super(nomeProduto, preco);
        this.dataFabricacao = dataFabricacao;
    }

    public SimpleDateFormat getDataFabricacao() {
        return dataFabricacao;
    }

    public void setDataFabricacao(SimpleDateFormat dataFabricacao) {
        this.dataFabricacao = dataFabricacao;
    }

    @Override
    public String priceTag() {
        return getNomeProduto()
                + " R$ "
                + String.format("%.2f", getPreco())
                + " Data: "+ dataFabricacao;
    }

}
