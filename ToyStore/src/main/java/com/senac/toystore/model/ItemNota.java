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
    private int idNota;
    private int idProduto;
    private String dscProduto;
    private double vlrProduto;
    private int qtdProduto;
    private double vlrTotal;
    
    public ItemNota() {
    }

    public double getVlrTotal() {
        return vlrTotal;
    }

    public void setVlrTotal(double vlrTotal) {
        this.vlrTotal = vlrTotal;
    }


    public ItemNota(int idNota, int idProduto, int qtdProduto, double vlrProduto, double vlrTotal) {
        this.idNota = idNota;
        this.idProduto = idProduto;
        this.qtdProduto = qtdProduto;
        this.vlrProduto = vlrProduto;
        this.vlrTotal = vlrTotal;
    }

    public int getIdItemNota() {
        return idItemNota;
    }

    public void setIdItemNota(int idItemNota) {
        this.idItemNota = idItemNota;
    }

    public int getIdNota() {
        return idNota;
    }

    public void setIdNota(int idNota) {
        this.idNota = idNota;
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

    public String getDscProduto() {
        return dscProduto;
    }

    public void setDscProduto(String dscProduto) {
        this.dscProduto = dscProduto;
    }

    public double getVlrProduto() {
        return vlrProduto;
    }

    public void setVlrProduto(double vlrProduto) {
        this.vlrProduto = vlrProduto;
    }
}
