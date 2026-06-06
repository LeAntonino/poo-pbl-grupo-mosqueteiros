package domain;

public class Intinerario {

    private final long id;
    private final Roteiro rot;
    private final Frota fot;
    private final Pedido ped;
    private boolean status = false;

    public Intinerario(long id, Roteiro rot, Frota fot, Eletronico ped) {
        this.id = id;
        this.rot = rot;
        this.fot = fot;
        this.ped = ped;
    }

    public Intinerario(long id, Roteiro rot, Frota fot, Mobilia ped) {
        this.id = id;
        this.rot = rot;
        this.fot = fot;
        this.ped = ped;
    }

    public Intinerario(long id, Roteiro rot, Frota fot, Textil ped) {
        this.id = id;
        this.rot = rot;
        this.fot = fot;
        this.ped = ped;
    }

    public long getId() {
        return id;
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

    public boolean getStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }
    
    

}
