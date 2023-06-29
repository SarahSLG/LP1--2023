package model;

import repository.ExibirInterface;

public class Pedido extends Orcamento implements ExibirInterface {
    private String dataDeEntrega;
    private boolean entregue;

    //construtor
    public Pedido(String dataDeEntrega) {
        this.dataDeEntrega = dataDeEntrega;
        entregue = false;
    }

    public void setDataDeEntrega(String dataDeEntrega) {
        this.dataDeEntrega = dataDeEntrega;
    }


    @Override
    public void exibir(boolean e) {

    }
}
