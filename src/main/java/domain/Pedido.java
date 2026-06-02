package domain;


abstract class Pedido {
    
    final String nome;
    final int tamanho;

    public Pedido(String nome, int tamanho) {
        this.nome = nome;
        this.tamanho = tamanho;
    }    
    
}
