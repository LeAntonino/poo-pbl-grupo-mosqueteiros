package domain;


public class Eletronico extends Pedido {
    
    public Eletronico(long id, String nome, int tamanho) {
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
