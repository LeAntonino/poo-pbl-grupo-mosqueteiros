package application;

import domain.Intinerario;
import java.util.ArrayList;

public class Cadastrador {

    private final ArrayList<Intinerario> itinerarios;

    public Cadastrador() {
        itinerarios = new ArrayList<>();
    }

    public void cadastrarItinerario(Intinerario itinerario) {
        itinerarios.add(itinerario);
    }

    public ArrayList<Intinerario> getItinerarios() {
        return itinerarios;
    }
}
