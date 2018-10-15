
package com.desafio.desafio.models;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class DadosDomicilioBancario {

    @SerializedName("codigoBanco")
    @Expose
    private Integer codigoBanco;
    @SerializedName("numeroAgencia")
    @Expose
    private Integer numeroAgencia;
    @SerializedName("numeroContaCorrente")
    @Expose
    private String numeroContaCorrente;

    public Integer getCodigoBanco() {
        return codigoBanco;
    }

    public void setCodigoBanco(Integer codigoBanco) {
        this.codigoBanco = codigoBanco;
    }

    public Integer getNumeroAgencia() {
        return numeroAgencia;
    }

    public void setNumeroAgencia(Integer numeroAgencia) {
        this.numeroAgencia = numeroAgencia;
    }

    public String getNumeroContaCorrente() {
        return numeroContaCorrente;
    }

    public void setNumeroContaCorrente(String numeroContaCorrente) {
        this.numeroContaCorrente = numeroContaCorrente;
    }

}
