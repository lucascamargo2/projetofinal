package br.feevale;

public abstract class Item {
    private String nome;
    private double Preco;
    
    public Item(String nome, double Preco){
        this.nome = nome;
        this.Preco = Preco;
    }

    public String getNome() {return nome;}
    public double getPreco() {return Preco;}

    public void setNome(String nome) {this.nome = nome;}
    public void setPreco(double Preco) {this.Preco = Preco;}
}
