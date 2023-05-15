package com.senac.model;

import java.sql.Blob;

public class Produto {

    private int id;
    private String descricao;
    private String cod_barras;
    private float valorVenda;
    private float valorCusto;
    private String margemLucro;
    private String categoria;
    private String corredor;
    private String pratileira;
    private int quantidade;
    private Blob foto;

    public Produto() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public float valorTotalVenda() {
        float valorTotal = quantidade * valorVenda;
        return valorTotal;
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

    public float getValorCusto() {
        return valorCusto;
    }

    public void setValorCusto(float valorCusto) {
        this.valorCusto = valorCusto;
    }

    public float getValorVenda() {
        return valorVenda;
    }

    public void setValorVenda(float valorVenda) {
        this.valorVenda = valorVenda;
    }

    public String getMargemLucro() {
        return margemLucro;
    }

    public void setMargemLucro(String margemLucro) {
        this.margemLucro = margemLucro;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
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

    public Blob getFoto() {
        return foto;
    }

    public void setFoto(Blob foto) {
        this.foto = foto;
    }

}
