
package com.desafio.desafio.models;

import com.desafio.desafio.util.GsonTransformer;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class ExtratoModel {

    @SerializedName("dataDoLancamento")
    @Expose
    private String dataDoLancamento;
    @SerializedName("descricao")
    @Expose
    private String descricao;
    @SerializedName("numero")
    @Expose
    private String numero;
    @SerializedName("situacao")
    @Expose
    private String situacao;
    @SerializedName("dataDeConfirmacao")
    @Expose
    private String dataDeConfirmacao;
    @SerializedName("dadosBancarios")
    @Expose
    private String dadosBancarios;
    @SerializedName("valorFinal")
    @Expose
    private Double valorFinal;

    public String getDataDoLanAmento() {
        return dataDoLancamento;
    }

    public void setDataDoLancamento(String dataDoLancamento) {
        this.dataDoLancamento = dataDoLancamento;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public String getSituacao() {
        return situacao;
    }

    public void setSituacao(String situacao) {
        this.situacao = situacao;
    }

    public String getDataDeConfirmacao() {
        return dataDeConfirmacao;
    }

    public void setDataDeConfirmacao(String dataDeConfirmacao) {
        this.dataDeConfirmacao = dataDeConfirmacao;
    }

    public String getDadosBancarios() {
        return dadosBancarios;
    }

    public void setDadosBancarios(String dadosBancarios) {
        this.dadosBancarios = dadosBancarios;
    }

    public Double getValorFinal() {
        return valorFinal;
    }

    public void setValorFinal(Double valorFinal) {
        this.valorFinal = valorFinal;
    }
    
    @Override
    public String toString() {
    	return GsonTransformer.toJson(this);
    }

}
