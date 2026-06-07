package domain;


public class Textil extends Pedido {    
        
    public Textil(long id, String nome, int tamanho) {
        super(id, nome, tamanho);
    }
    
    @Override
    public long getId(){
        return id;
    }
    
    @Override
    public String getNome() {
        return nome;
    }

    @Override
    public int getTamanho() {
        return tamanho;
    }
    
}
