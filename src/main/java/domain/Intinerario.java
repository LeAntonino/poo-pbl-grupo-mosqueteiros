package domain;

public class Intinerario {

    private final Roteiro rot;
    private final Frota fot;
    private final Pedido ped;

    public Intinerario(Roteiro rot, Frota fot, Eletronico ped) {
        this.rot = rot;
        this.fot = fot;
        this.ped = ped;
    }

    public Intinerario(Roteiro rot, Frota fot, Mobilia ped) {
        this.rot = rot;
        this.fot = fot;
        this.ped = ped;
    }

    public Intinerario(Roteiro rot, Frota fot, Textil ped) {
        this.rot = rot;
        this.fot = fot;
        this.ped = ped;
    }

    public Roteiro getRot() {
        return rot;
    }

    public Frota getFot() {
        return fot;
    }

    public Pedido getPed() {
        switch (ped) {
            case Eletronico eletronico -> {
                return eletronico;
            }
            case Textil textil -> {
                return textil;
            }
            case Mobilia mobilia -> {
                return mobilia;
            }
            default -> {
                return null;
            }
        }
        
    }

}
