package modelo;

public class Pasajero {

    private String nombre;
    private String numeroPasaporte;
    private String contacto;
    private String preferencias;

    public Pasajero(String nombre, String numeroPasaporte, String contacto, String preferencias) {
        this.nombre = nombre;
        this.numeroPasaporte = numeroPasaporte;
        this.contacto = contacto;
        this.preferencias = preferencias;
    }

    @Override
    public String toString() {
        return nombre + " - Pasaporte: " + numeroPasaporte;
    }
    
}
