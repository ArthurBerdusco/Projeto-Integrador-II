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
    
    private int numeroNota;
    private int idCliente;
    private String nomeVendedor;

    public int getIdCliente() {
        return idCliente;
    }

    public void setIdCliente(int idCliente) {
        this.idCliente = idCliente;
    }

    public String getNomeVendedor() {
        return nomeVendedor;
    }

    public void setNomeVendedor(String nomeVendedor) {
        this.nomeVendedor = nomeVendedor;
    }
    private double valorTotal;
    
    private ArrayList<ItemNota> listaItens = null;
    
    public NotaFiscal(){
        
    }

    public ArrayList<ItemNota> getListaItens() {
        return listaItens;
    }

    public void setListaItens(ArrayList<ItemNota> listaItens) {
        this.listaItens = listaItens;
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

    public double getValorUnitario() {
        return valorUnitario;
    }

    public void setValorUnitario(double valorUnitario) {
        this.valorUnitario = valorUnitario;
    }
    private double valorUnitario;

    
}
