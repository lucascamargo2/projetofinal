package br.feevale;

public class Cliente {

    private int id;
    private String nome;

    public Cliente(int id, String nome) {
        this.id = id;
        this.nome = nome;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    // esse método vai iniciar um pedido no futuro
    public void iniciarPedido() {
        // implementação será feita depois conforme o fluxo do sistema
    }
}
