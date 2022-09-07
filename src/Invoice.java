public class Invoice {
    private Integer numeroItemFaturado;
    private String descricaoItemFaturado;
    private Integer quantidadeComprada;
    private Double precoUnitario;

    public Invoice(
            Integer numeroItemFaturadoRecebido,
            String descricaoItemFaturadoRecebida,
            Integer quantidadeCompradaRecebida,
            Double precoUnitarioRecebido
    ) {

        this.numeroItemFaturado = numeroItemFaturadoRecebido;
        this.descricaoItemFaturado = descricaoItemFaturadoRecebida;

        if(quantidadeCompradaRecebida <0 ){
            this.quantidadeComprada = 0;
        } else {
            this.quantidadeComprada = quantidadeCompradaRecebida;
        }

        if(precoUnitarioRecebido <0 ){
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

    public Integer getQuantidadeComprada() {
        return quantidadeComprada;
    }
    public void setQuantidadeComprada(Integer quantidadeComprada) {
        this.quantidadeComprada = quantidadeComprada;
    }

    public Double getPrecoUnitario() {
        return precoUnitario;
    }
    public void setPrecoUnitario(Double precoUnitario) {
        this.precoUnitario = precoUnitario;
    }

    public Double getInvoiceAmount() {
        return this.quantidadeComprada * this.precoUnitario;
    }

}
