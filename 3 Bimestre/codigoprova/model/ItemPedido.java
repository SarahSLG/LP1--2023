package model;

import repository.ExibirInterface;

public class ItemPedido implements ExibirInterface {
    private static long idBase = 0L;
    private String peca;
    private String modelo;
    private String tamanho;
    private double valor;
    private long id = 0L;

    //construtor
    public ItemPedido(String peca, String modelo, String tamanho, double valor) {
        this.peca = peca;
        this.modelo = modelo;
        this.tamanho = tamanho;
        this.valor = valor;
        idz();
    }

    public static long getIdBase() {
        return idBase;
    }

    public static void setIdBase(long idBase) {
        ItemPedido.idBase = idBase;
    }

    public String getPeca() {
        return peca;
    }

    public void setPeca(String peca) {
        this.peca = peca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getTamanho() {
        return tamanho;
    }

    public void setTamanho(String tamanho) {
        this.tamanho = tamanho;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public long idz() {
        id = idBase++;
        return id;
    }

    //interface
    @Override
    public void exibir(boolean info) {

    }



}
