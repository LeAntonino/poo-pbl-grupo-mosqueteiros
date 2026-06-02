package domain;


public class Eletronico extends Pedido {
    
    public Eletronico(String nome, int tamanho) {
        super(nome, tamanho);
    }
    
    public String getNome() {
        return nome;
    }

    public int getTamanho() {
        return tamanho;
    }
    
}
