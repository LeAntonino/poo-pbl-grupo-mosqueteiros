package domain;


public abstract class Pedido {
    
    protected final long id;
    protected final String nome;
    protected final int tamanho;

    public Pedido(long id, String nome, int tamanho) {
        this.id = id;
        this.nome = nome;
        this.tamanho = tamanho;
    }    

    public long getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    public int getTamanho() {
        return tamanho;
    }
    
    
    
}
