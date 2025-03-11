package modelo;

public class Aeropuerto {

    private String codigo;
    private String nombre;
    private String ubicacion;
    private String pais;

    public Aeropuerto(String codigo, String nombre, String ubicacion, String pais) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.ubicacion = ubicacion;
        this.pais = pais;
    }

    @Override
    public String toString() {
        return nombre + " (" + codigo + ") en " + ubicacion + ", " + pais;
    }
    
}
