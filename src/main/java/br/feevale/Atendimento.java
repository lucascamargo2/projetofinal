package br.feevale;

public class Atendimento implements Atualizavel{
    private int numero;
    private String status;
    private Pedido pedido;
    
    
    public Atendimento(int numero, String status, Pedido pedido) {
        this.numero = numero;
        this.status = status;
        this.pedido = pedido;
    }


    public int getNumero() {
        return numero;
    }


    public void setNumero(int numero) {
        this.numero = numero;
    }


    public String getStatus() {
        return status;
    }


    public void setStatus(String status) {
        this.status = status;
    }


    public Pedido getPedido() {
        return pedido;
    }


    public void setPedido(Pedido pedido) {
        this.pedido = pedido;
    }


    @Override
    public void atualizarStatus() {
        if (status.equals("Em preparo")) {
            status = "Pronto";
        } else if (status.equals("Pronto")) {
            status = "Entregue";
        }
    }
}
