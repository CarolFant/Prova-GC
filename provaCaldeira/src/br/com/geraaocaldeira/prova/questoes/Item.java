package br.com.geraaocaldeira.prova.questoes;

public class Item {
    String nome;
    int quantiddae;

    public Item(String nome){
        this.nome = nome;
        this.quantiddae = 1;
    }

    public Item(String nome, int quantidade) {
        this.nome = nome;
        this.quantiddae = quantidade;
    }

    public static void main(String[] args) {
        Item x = new Item("Caderno");
        Item y = new Item("Caneta", 3);
        System.out.println(x.quantiddae + y.quantiddae);
    }
}
