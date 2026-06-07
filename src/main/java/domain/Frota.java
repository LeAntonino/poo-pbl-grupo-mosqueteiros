package domain;

public class Frota {
    private final String nome;
    private final int pessoal;

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
   
}
