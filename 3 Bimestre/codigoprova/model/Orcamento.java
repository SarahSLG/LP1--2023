package model;

import repository.ExibirInterface;

import java.util.ArrayList;
import java.util.List;

public class Orcamento implements ExibirInterface {
    private static long idBase = 0L;
    private long id = 0L;
    List<ItemPedido> itens = new ArrayList<>();
    private double valorTotal;
    private Object ItemPedido;

    public Orcamento() {

    }

    //getts
    public static long getIdBase() {
        return idBase;
    }

    public long getId() {
        return id;
    }

    public List<ItemPedido> getItens() {
        return itens;
    }

    public double getValorTotal() {
        return valorTotal;
    }

    //interface
    @Override
    public void exibir(boolean e) {

    }

    public void addItem(ItemPedido itens){
       addItem(itens);
    }




}
