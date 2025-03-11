package modelo;

public class Avion {

    private String modelo;
    private int capacidad;

    public Avion(String modelo, int capacidad) {
        this.modelo = modelo;
        this.capacidad = capacidad;
    }

    @Override
    public String toString() {
        return "Modelo: " + modelo + ", Capacidad: " + capacidad;
    }
    
}
