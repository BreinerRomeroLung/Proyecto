package modelo;

import java.util.List;

public class ProgramaDeVuelo {

    private String numeroVuelo;
    private String aerolinea;
    private List<String> diasOperacion;
    private Aeropuerto origen;
    private Aeropuerto destino;

    public ProgramaDeVuelo(String numeroVuelo, String aerolinea, List<String> diasOperacion, Aeropuerto origen, Aeropuerto destino) {
        this.numeroVuelo = numeroVuelo;
        this.aerolinea = aerolinea;
        this.diasOperacion = diasOperacion;
        this.origen = origen;
        this.destino = destino;
    }

    @Override
    public String toString() {
        return "Vuelo " + numeroVuelo + " de " + aerolinea + " desde " + origen + " hacia " + destino;
    }
    
}
