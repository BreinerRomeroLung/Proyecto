package modelo;

public class EscalaTecnica {

    private Aeropuerto aeropuertoEscala;
    private int orden;

    public EscalaTecnica(Aeropuerto aeropuertoEscala, int orden) {
        this.aeropuertoEscala = aeropuertoEscala;
        this.orden = orden;
    }

    @Override
    public String toString() {
        return "Escala en " + aeropuertoEscala + " (Orden: " + orden + ")";
    }
    
}
