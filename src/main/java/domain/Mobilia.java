package domain;


public class Mobilia extends Pedido {
    
    public Mobilia(String nome, int tamanho) {
        super(nome, tamanho);
    }
    
    public String getNome() {
        return nome;
    }

    public int getTamanho() {
        return tamanho;
    }
    
}
