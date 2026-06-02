package presentation;

import domain.Eletronico;
import domain.Frota;
import domain.Intinerario;
import domain.Roteiro;

public class main {

    public static void main(String[] args) {
        
        Eletronico e = new Eletronico("computador", 3);
        Roteiro r = new Roteiro("jaragua", 20);
        Frota f = new Frota("os caras de pau", 9);

        Intinerario inti = new Intinerario(r, f, e);
        
        Eletronico eletro = (Eletronico) inti.getPed();
        
        System.out.println(eletro.getNome());
        
    }
}
