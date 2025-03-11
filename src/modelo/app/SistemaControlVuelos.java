package modelo.app;

import java.util.Arrays;
import modelo.*;
import java.util.Date;

public class SistemaControlVuelos {

     public static void main(String[] args) {
        Aeropuerto madrid = new Aeropuerto("MAD", "Barajas", "Madrid", "España");
        Aeropuerto sydney = new Aeropuerto("SYD", "Caudell", "Sydney", "Australia");

        Avion avion1 = new Avion("Boeing 777", 300);

        ProgramaDeVuelo programa1 = new ProgramaDeVuelo("555", "Iberia", Arrays.asList("Lunes", "Jueves"), madrid, sydney);

        Vuelo vuelo1 = new Vuelo(new Date(), 200, avion1, programa1);

        Pasajero pasajero1 = new Pasajero("Juan Pérez", "A12345678", "juanperez@mail.com", "Vegetariano");
        Reserva reserva1 = new Reserva("R001", pasajero1, vuelo1, "12A");
        reserva1.confirmarReserva();

        System.out.println(vuelo1);
        System.out.println(reserva1);
    }
    
}
