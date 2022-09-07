public class Invoice {
    private Integer numeroItemFaturado;
    private String descricaoItemFaturado;
    private Integer quantidadeItemComprada;
    private Double precoUnitario;

    public Invoice(
            Integer numeroItemFaturadoRecebido,
            String descricaoItemFaturadoRecebida,
            Integer quantidadeCompradaRecebida,
            Double precoUnitarioRecebido
    )
        {
        this.numeroItemFaturado = numeroItemFaturadoRecebido;
        this.descricaoItemFaturado = descricaoItemFaturadoRecebida;

        if(quantidadeCompradaRecebida < 0 ){
            this.quantidadeItemComprada = 0;
        }
        else {
            this.quantidadeItemComprada = quantidadeCompradaRecebida;
        }

        if(precoUnitarioRecebido < 0 ){
            this.precoUnitario = 0.0;
        } else {
            this.precoUnitario = precoUnitarioRecebido;
        }

    }
    public Invoice(){}

    public Integer getNumeroItemFaturado() {
        return numeroItemFaturado;
    }
    public void setNumeroItemFaturado(Integer numeroItemFaturado) {
        this.numeroItemFaturado = numeroItemFaturado;
    }

    public String getDescricaoItemFaturado() {
        return descricaoItemFaturado;
    }
    public void setDescricaoItemFaturado(String descricaoItemFaturado) {
        this.descricaoItemFaturado = descricaoItemFaturado;
    }

    public Integer getQuantidadeItemComprada() {
        return quantidadeItemComprada;
    }
    public void setQuantidadeItemComprada(Integer quantidadeItemComprada) {
        this.quantidadeItemComprada = quantidadeItemComprada;
    }

    public Double getPrecoUnitario() {
        return precoUnitario;
    }
    public void setPrecoUnitario(Double precoUnitario) {
        this.precoUnitario = precoUnitario;
    }

    public Double getInvoiceAmount() {
        return this.quantidadeItemComprada * this.precoUnitario;
    }

}
