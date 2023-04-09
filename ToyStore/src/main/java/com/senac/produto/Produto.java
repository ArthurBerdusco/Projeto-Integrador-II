package com.senac.produto;

public class Produto {

    private String descricao;
    private String cod_barras;
    private String localFoto;
    private String valorVenda;
    private String valorCusto;
    private String margemLucro;
    private String categoria;
    private String corredor;
    private String pratileira;
    private String quantidade;
    
    public Produto(){};

    public Produto(String descricao, String cod_barras, String localFoto, String valorVenda, String valorCusto, String margemLucro, String categoria, String corredor, String pratileira, String quantidade) {
        this.descricao = descricao;
        this.cod_barras = cod_barras;
        this.localFoto = localFoto;
        this.valorVenda = valorVenda;
        this.valorCusto = valorCusto;
        this.margemLucro = margemLucro;
        this.categoria = categoria;
        this.corredor = corredor;
        this.pratileira = pratileira;
        this.quantidade = quantidade;
    }



    public String getCod_barras() {
        return cod_barras;
    }

    public void setCod_barras(String cod_barras) {
        this.cod_barras = cod_barras;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public String getValorCusto() {
        return valorCusto;
    }

    public void setValorCusto(String valorCusto) {
        this.valorCusto = valorCusto;
    }

    public String getValorVenda() {
        return valorVenda;
    }

    public void setValorVenda(String valorVenda) {
        this.valorVenda = valorVenda;
    }

    public String getMargemLucro() {
        return margemLucro;
    }

    public void setMargemLucro(String margemLucro) {
        this.margemLucro = margemLucro;
    }

    public String getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(String quantidade) {
        this.quantidade = quantidade;
    }

    public String getLocalFoto() {
        return localFoto;
    }

    public void setLocalFoto(String localFoto) {
        this.localFoto = localFoto;
    }

    public String getCorredor() {
        return corredor;
    }

    public void setCorredor(String corredor) {
        this.corredor = corredor;
    }

    public String getPratileira() {
        return pratileira;
    }

    public void setPratileira(String pratileira) {
        this.pratileira = pratileira;
    }

}
