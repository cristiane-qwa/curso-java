package files_estudos;

public class Produto {
    private String nomeProduto;
    private Double valorUnitario;
    private Integer quantidade;

    public Produto(String nomeProduto, Double valorUnitario, Integer quantidade) {
        this.nomeProduto = nomeProduto;
        this.valorUnitario = valorUnitario;
        this.quantidade = quantidade;
    }

    public String getNomeProduto() {
        return nomeProduto;
    }

    public void setNomeProduto(String nomeProduto) {
        this.nomeProduto = nomeProduto;
    }

    public Double getValorUnitario() {
        return valorUnitario;
    }

    public void setValorUnitario(Double valorUnitario) {
        this.valorUnitario = valorUnitario;
    }

    public Integer getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(Integer quantidade) {
        this.quantidade = quantidade;
    }
    public Double valorTotal() {
        return quantidade * valorUnitario;
    }


}
