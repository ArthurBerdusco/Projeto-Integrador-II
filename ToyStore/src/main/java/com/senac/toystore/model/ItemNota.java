/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.senac.toystore.model;

/**
 *
 * @author Alex
 */
public class ItemNota {
    

    private int idItemNota;
    private int numeroNota;
    private int idProduto;
    private double vlrProduto;
    private int qtdProduto;
    private String descricaoProduto;

    public String getDescricaoProduto() {
        return descricaoProduto;
    }

    public void setDescricaoProduto(String descricaoProduto) {
        this.descricaoProduto = descricaoProduto;
    }
    
    public ItemNota() {
    }

    public int getIdItemNota() {
        return idItemNota;
    }

    public void setIdItemNota(int idItemNota) {
        this.idItemNota = idItemNota;
    }

    public int getIdNota() {
        return numeroNota;
    }

    public void setIdNota(int idNota) {
        this.numeroNota = idNota;
    }

    public int getIdProduto() {
        return idProduto;
    }

    public void setIdProduto(int idProduto) {
        this.idProduto = idProduto;
    }

    public int getQtdProduto() {
        return qtdProduto;
    }

    public void setQtdProduto(int qtdProduto) {
        this.qtdProduto = qtdProduto;
    }

    public double getVlrProduto() {
        return vlrProduto;
    }

    public void setVlrProduto(double vlrProduto) {
        this.vlrProduto = vlrProduto;
    }
    
    public float valorTotal(){
        float valorTotal = (float)this.vlrProduto * this.qtdProduto;
        return valorTotal;
    }
}
