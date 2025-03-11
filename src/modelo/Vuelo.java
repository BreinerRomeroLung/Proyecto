package modelo;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Vuelo {

     private Date fecha;
    private int plazasVacias;
    private Avion modeloAvion;
    private ProgramaDeVuelo programaDeVuelo;
    private List<EscalaTecnica> escalas;

    public Vuelo(Date fecha, int plazasVacias, Avion modeloAvion, ProgramaDeVuelo programaDeVuelo) {
        this.fecha = fecha;
        this.plazasVacias = plazasVacias;
        this.modeloAvion = modeloAvion;
        this.programaDeVuelo = programaDeVuelo;
        this.escalas = new ArrayList<>();
    }

    public void agregarEscala(EscalaTecnica escala) {
        escalas.add(escala);
    }

    @Override
    public String toString() {
        return "Vuelo del programa: " + programaDeVuelo + " con modelo: " + modeloAvion;
    }
    
}
