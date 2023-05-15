
package com.senac.toystore.view.venda;


public class Vendas {
    
    private String nomeCliete;
    private String vendedor;
    private String numeroVenda;
    private String dataVenda;
    private String cpf;
    private String codigoProduto;
    private float valorTotal;
    private float desconto;
    private int quantidade;

    public Vendas(String nomeCliete, String vendedor, String numeroVenda, String dataVenda, String cpf, String codigoProduto, float valorTotal, float desconto, int quantidade) {
        this.nomeCliete = nomeCliete;
        this.vendedor = vendedor;
        this.numeroVenda = numeroVenda;
        this.dataVenda = dataVenda;
        this.cpf = cpf;
        this.codigoProduto = codigoProduto;
        this.valorTotal = valorTotal;
        this.desconto = desconto;
        this.quantidade = quantidade;
    }

    public String getNomeCliete() {
        return nomeCliete;
    }

    public void setNomeCliete(String nomeCliete) {
        this.nomeCliete = nomeCliete;
    }

    public String getVendedor() {
        return vendedor;
    }

    public void setVendedor(String vendedor) {
        this.vendedor = vendedor;
    }

    public String getNumeroVenda() {
        return numeroVenda;
    }

    public void setNumeroVenda(String numeroVenda) {
        this.numeroVenda = numeroVenda;
    }

    public String getDataVenda() {
        return dataVenda;
    }

    public void setDataVenda(String dataVenda) {
        this.dataVenda = dataVenda;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getCodigoProduto() {
        return codigoProduto;
    }

    public void setCodigoProduto(String codigoProduto) {
        this.codigoProduto = codigoProduto;
    }

    public float getValorTotal() {
        return valorTotal;
    }

    public void setValorTotal(float valorTotal) {
        this.valorTotal = valorTotal;
    }

    public float getDesconto() {
        return desconto;
    }

    public void setDesconto(float desconto) {
        this.desconto = desconto;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    
    
}
