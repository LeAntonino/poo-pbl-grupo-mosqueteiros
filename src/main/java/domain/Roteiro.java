package domain;


public class Roteiro {
    
    private final String nome;
    private final double distancia;
    
    public Roteiro(String nome, double distancia) {
        this.nome = nome;
        this.distancia = distancia;

    }

    public String getNome() {
        return nome;
    }

    public double getDistancia() {
        return distancia;
    }  
    
}
