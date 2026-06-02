package domain;


public class Textil extends Pedido {    
        
    public Textil(String nome, int tamanho) {
        super(nome, tamanho);
    }
    
    public String getNome() {
        return nome;
    }

    public int getTamanho() {
        return tamanho;
    }
    
}
