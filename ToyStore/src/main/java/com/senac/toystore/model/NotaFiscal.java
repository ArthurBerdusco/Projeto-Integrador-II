/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.senac.toystore.model;

import java.util.ArrayList;

/**
 *
 * @author Alex
 */
public class NotaFiscal {
    
    private int idNota;
    private int numeroNota;
    private double valorTotal;
    private String codBarra;
    private int quatidade;
    
    private ArrayList<ItemNota> listaItens = null;
    
    public NotaFiscal(){
        
    }

    public ArrayList<ItemNota> getListaItens() {
        return listaItens;
    }

    public void setListaItens(ArrayList<ItemNota> listaItens) {
        this.listaItens = listaItens;
    }
    
    
    public NotaFiscal(int idNota, int numeroNota, double valorTotal, String codBarra, int quatidade, double valorUnitario) {
        this.idNota = idNota;
        this.numeroNota = numeroNota;
        this.valorTotal = valorTotal;
        this.codBarra = codBarra;
        this.quatidade = quatidade;
        this.valorUnitario = valorUnitario;
    }
    
    public int getIdNota() {
        return idNota;
    }

    public void setIdNota(int idNota) {
        this.idNota = idNota;
    }

    public int getNumeroNota() {
        return numeroNota;
    }

    public void setNumeroNota(int numeroNota) {
        this.numeroNota = numeroNota;
    }

    public double getValorTotal() {
        return valorTotal;
    }

    public void setValorTotal(double valorTotal) {
        this.valorTotal = valorTotal;
    }

    public String getCodBarra() {
        return codBarra;
    }

    public void setCodBarra(String codBarra) {
        this.codBarra = codBarra;
    }

    public int getQuatidade() {
        return quatidade;
    }

    public void setQuatidade(int quatidade) {
        this.quatidade = quatidade;
    }

    public double getValorUnitario() {
        return valorUnitario;
    }

    public void setValorUnitario(double valorUnitario) {
        this.valorUnitario = valorUnitario;
    }
    private double valorUnitario;

    
}
