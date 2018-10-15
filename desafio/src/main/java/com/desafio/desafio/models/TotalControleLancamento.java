
package com.desafio.desafio.models;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class TotalControleLancamento {

    @SerializedName("quantidadeLancamentos")
    @Expose
    private Integer quantidadeLancamentos;
    @SerializedName("quantidadeRemessas")
    @Expose
    private Integer quantidadeRemessas;
    @SerializedName("valorLancamentos")
    @Expose
    private Double valorLancamentos;

    public Integer getQuantidadeLancamentos() {
        return quantidadeLancamentos;
    }

    public void setQuantidadeLancamentos(Integer quantidadeLancamentos) {
        this.quantidadeLancamentos = quantidadeLancamentos;
    }

    public Integer getQuantidadeRemessas() {
        return quantidadeRemessas;
    }

    public void setQuantidadeRemessas(Integer quantidadeRemessas) {
        this.quantidadeRemessas = quantidadeRemessas;
    }

    public Double getValorLancamentos() {
        return valorLancamentos;
    }

    public void setValorLancamentos(Double valorLancamentos) {
        this.valorLancamentos = valorLancamentos;
    }

}
