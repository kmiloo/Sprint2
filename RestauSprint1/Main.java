package Pruebas;

import java.io.IOException;

import Restaurant.reserva;

public class Main {
    public static void main(String args[]) throws IOException {

        Cliente c1 = new Cliente();
        Reserva r1 = new Reserva();
        r1.CrearArchivo();
        
        c1.PreguntarNombre();
        c1.PreguntarRut();
        //c1.PreguntarHoraInicio();
        //c1.PreguntarHoraFin();
        //c1.PreguntarVisitante();
        
        c1.Modalidad(c1.PreguntarReserva());
        c1.degustacion();
    
    }
}
