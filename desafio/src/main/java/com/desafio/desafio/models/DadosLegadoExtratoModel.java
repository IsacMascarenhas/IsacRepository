
package com.desafio.desafio.models;

import java.util.List;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class DadosLegadoExtratoModel {

    @SerializedName("totalControleLancamento")
    @Expose
    private TotalControleLancamento totalControleLancamento;
    @SerializedName("listaControleLancamento")
    @Expose
    private List<ListaControleLancamento> listaControleLancamento = null;
    @SerializedName("indice")
    @Expose
    private Integer indice;
    @SerializedName("tamanhoPagina")
    @Expose
    private Integer tamanhoPagina;
    @SerializedName("totalElements")
    @Expose
    private Integer totalElements;

    public TotalControleLancamento getTotalControleLancamento() {
        return totalControleLancamento;
    }

    public void setTotalControleLancamento(TotalControleLancamento totalControleLancamento) {
        this.totalControleLancamento = totalControleLancamento;
    }

    public List<ListaControleLancamento> getListaControleLancamento() {
        return listaControleLancamento;
    }

    public void setListaControleLancamento(List<ListaControleLancamento> listaControleLancamento) {
        this.listaControleLancamento = listaControleLancamento;
    }

    public Integer getIndice() {
        return indice;
    }

    public void setIndice(Integer indice) {
        this.indice = indice;
    }

    public Integer getTamanhoPagina() {
        return tamanhoPagina;
    }

    public void setTamanhoPagina(Integer tamanhoPagina) {
        this.tamanhoPagina = tamanhoPagina;
    }

    public Integer getTotalElements() {
        return totalElements;
    }

    public void setTotalElements(Integer totalElements) {
        this.totalElements = totalElements;
    }

}
