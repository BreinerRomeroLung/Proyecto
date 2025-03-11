package modelo;

public class Reserva {

    private String numeroReserva;
    private Pasajero pasajero;
    private Vuelo vuelo;
    private String asiento;
    private boolean confirmado;

    public Reserva(String numeroReserva, Pasajero pasajero, Vuelo vuelo, String asiento) {
        this.numeroReserva = numeroReserva;
        this.pasajero = pasajero;
        this.vuelo = vuelo;
        this.asiento = asiento;
        this.confirmado = false;
    }

    public void confirmarReserva() {
        confirmado = true;
    }

    @Override
    public String toString() {
        return "Reserva: " + numeroReserva + " para pasajero " + pasajero + " en el vuelo " + vuelo;
    }
    
}
