package domain;

public class Frota {
    private final String nome;
    private int pessoal;

    public Frota(String nome, int pessoal) {
        this.nome = nome;
        this.pessoal = pessoal;
    }

    public String getNome() {
        return nome;
    }

    public int getPessoal() {
        return pessoal;
    }

    public void setPessoal(int pessoal) {
        this.pessoal = pessoal;
    }
    
    
}
