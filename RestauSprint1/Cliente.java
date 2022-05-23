package Pruebas;
import java.io.IOException;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class Cliente {

    protected String nombre;
    protected int rut;
    private float horaInicio;
    private float horaFin;
    private int cantidadPersonasReserva;
    private int cantidadMesasReserva;
    private int cantidadPlatosEspeciales;
    private int cantidadServiciosExtras;
    private String elMenuEspecial;
    private String revisar_reserva;
    private String areaElegida;

    
    public Cliente(){

    }
    public Cliente(String nombre, int rut){
        this.nombre = nombre;
        this.rut = rut;
    }

    public String PreguntarNombre(){
        nombre = JOptionPane.showInputDialog("Escriba su nombre completo para comenzar a registrar su reserva");
		    Pattern pattern = Pattern.compile("[0-9]",Pattern.CASE_INSENSITIVE);
        Matcher matcher = pattern.matcher(nombre);
        boolean matchFound = matcher.find();
        while(matchFound){
          nombre = JOptionPane.showInputDialog("Escriba su nombre completo para comenzar a registrar su reserva");
          matcher = pattern.matcher(nombre);
          matchFound = matcher.find();
        }
        return nombre;
	}
    public float PreguntarRut(){
        rut = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el RUT SIN DIGITO VERIFICADOR"));
        while(rut>26000000 || rut<16000000){
          rut = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el RUT SIN DIGITO VERIFICADOR"));
        }
      return rut;
        
    }
    public float PreguntarHoraInicio(){
        horaInicio = Float.parseFloat(JOptionPane.showInputDialog("Escriba la hora a la cual llegara, por ejemplo:   16.30"));
        while((horaInicio < 5 || horaInicio > 5.59 && horaInicio < 6 || horaInicio > 6.59 && horaInicio < 7 || horaInicio > 7.59 && horaInicio < 
         8 || horaInicio > 8.59 && horaInicio < 9 || horaInicio > 9.59 && horaInicio < 10 || horaInicio > 10.59 && horaInicio < 11 || horaInicio > 
            11.59 && horaInicio < 12 || horaInicio >  12.59 && horaInicio < 13 || horaInicio > 13.59 && horaInicio < 14 || horaInicio > 
            14.59 && horaInicio < 15 || horaInicio > 15.59 && horaInicio < 16 || horaInicio > 16.59 && horaInicio < 17 || horaInicio > 
            17.59 && horaInicio < 18 || horaInicio > 18.59 && horaInicio < 19 || horaInicio > 19.59 && horaInicio < 20 || horaInicio > 
            20.59 && horaInicio < 21 || horaInicio > 21.59 && horaInicio < 22 || horaInicio > 22.59 && horaInicio < 23)){
            horaInicio = Float.parseFloat(JOptionPane.showInputDialog("Escriba la hora a la cual llegara, por ejemplo:   16.30"));
        }
      
        return horaInicio;
    }
    public float PreguntarHoraFin(){
        horaFin = Float.parseFloat(JOptionPane.showInputDialog("Escriba la hora a la cual finalizará su reserva, por ejemplo:  19.50"));
        while(horaInicio>horaFin){
            horaFin = Float.parseFloat(JOptionPane.showInputDialog("Escriba la hora a la cual finalizará su reserva, por ejemplo:  19.50"));
        }
      return horaFin;
    }

    public boolean PreguntarVisitante(){
      Object [] visitante = {"Si", "No"};
      Object revisar_visitante = JOptionPane.showInputDialog(null, "¿Estas usando el servicio de hotel?", "Reservacion", 
      JOptionPane.QUESTION_MESSAGE, null, visitante, visitante[0]);
      if(revisar_visitante.equals("si")){
        return true;
      }
      else{
        return false;
      }
    }
    public Object PreguntarReserva(){
      Object [] tipo_reserva = {"Normal", "Evento", "Matrimonio"};
      Object revisar_reserva = JOptionPane.showInputDialog(null, "¿Que tipo de reserva quiere realizar?", "Reservacion",     
      JOptionPane.QUESTION_MESSAGE, null, tipo_reserva, tipo_reserva[0]);
      
      return revisar_reserva;
    }



  
    public void Modalidad(Object tipo) throws IOException{
        if(tipo =="Normal"){
            Object [] opciones_areas = {"Central", "Sala Varas", "Sala Montt", "Terraza"};
            cantidadPersonasReserva = Integer.parseInt(JOptionPane.showInputDialog("¿Cuantas personas asistiran dentro de su reserva?"));
            cantidadMesasReserva = Integer.parseInt(JOptionPane.showInputDialog("¿Cuantas mesas usara para su reserva? - Las mesas se pueden de a 2, 3 y 5 personas"));
            Object areaElegida = JOptionPane.showInputDialog(null, "¿Que plan de comida desea?", "Reservacion - Evento", 
            JOptionPane.QUESTION_MESSAGE, null, opciones_areas, opciones_areas[0]);
        }
        else{
            if(tipo == "Evento"){
                Object [] modalidad_reserva = {"Abierta", "Semicerrada", "Cerrada"};
                Object [] opciones_areas = {"Central", "Sala Varas", "Sala Montt", "Terraza"};
                Object modalidad = JOptionPane.showInputDialog(null, "¿Que modalidad desea?", "Reservacion", 
                JOptionPane.QUESTION_MESSAGE, null, modalidad_reserva, modalidad_reserva[0]);

                // Modalidad ABIERTA
                if(modalidad==modalidad_reserva[0]){
                    Object area_elegida = JOptionPane.showInputDialog(null, "¿Que area reservara?", "Reservacion - Evento", 
                    JOptionPane.QUESTION_MESSAGE, null, opciones_areas, opciones_areas[0]);
                    cantidadPersonasReserva = Integer.parseInt(JOptionPane.showInputDialog("¿Cuantas personas asistiran dentro de su reserva?"));
                    Object [] menuEspecial = {"Si", "No"};
                    Object confirmarMenu = JOptionPane.showInputDialog(null, "¿Desea hacer un menu especial?, este tendra un costo establecido por el chef", "Reservacion - Evento", 
                    JOptionPane.QUESTION_MESSAGE, null, menuEspecial, menuEspecial[0]);
            
                    if(confirmarMenu==menuEspecial[0]){
                        cantidadPlatosEspeciales = Integer.parseInt(JOptionPane.showInputDialog("¿Cuantos menu especial desea realizar?"));
                        int i=0;
                        for(i=0;i<cantidadPlatosEspeciales;i++){
                            elMenuEspecial = JOptionPane.showInputDialog("¿Ingrese el plato numero " + (i+1)+ " especial que desea?");
                        }
                    }
                    Object [] serviciosEspeciales = {"Si", "No"};
                    Object serviciosExtra = JOptionPane.showInputDialog(null, "¿Desea tener servicios extra? - (DJ y sistemas de Sonido, Anfitrion del Evento/Espectaculo, Fotografia y estudios externos e internos, decoracion al gusto del cliente y seguridad)", "Reservacion - Evento", 
                    JOptionPane.QUESTION_MESSAGE, null, serviciosEspeciales, serviciosEspeciales[0]);
                    if(serviciosExtra==serviciosEspeciales[0]){
                        cantidadServiciosExtras = Integer.parseInt(JOptionPane.showInputDialog("¿Cuantos servicios especiales desea tener en su evento?"));
                        int i=0;
                        for(i=0;i<cantidadServiciosExtras;i++){
                            Object [] opcionesServiciosExtra = {"DJ y sistemas de sonido", "Anfitrion", "Fotografia y estudios", "Decoracion", "Seguridad"};
                            Object servicioContratado = JOptionPane.showInputDialog(null, "Servicio numero "+(i+1)+" a contratar:", "Reservacion - Evento", 
                            JOptionPane.QUESTION_MESSAGE, null, opcionesServiciosExtra, opcionesServiciosExtra[0]);                        
                        }              
                    }
                    // Llenado del constructor con los datos obtenidos de la reserva para posteriormente guardarlo en archivo.txt
                    Reserva EventoAbierto = new Reserva((String)nombre, (int)rut, (float)horaInicio, (float)horaFin, (String)revisar_reserva, (String)modalidad, (int)cantidadPersonasReserva, (String)area_elegida);
                    EventoAbierto.GuardarReserva();
                }
                           
            
                // Modalidad SEMICERRADA
                if(modalidad==modalidad_reserva[1]){               
                    cantidadPersonasReserva = Integer.parseInt(JOptionPane.showInputDialog("¿Cuantas personas asistiran dentro de su reserva?"));
                    int i=0;        
                    Object [] opcionesAreasSemicerrado = {"Central", "Sala Varas", "Sala Montt", "Terraza"};
                    Object [] segundasOpcionesAreasSemicerrado = {"Central", "Sala Varas", "Sala Montt", "Terraza", "Ninguna area mas"};
                    Object primeraAreaElegida = JOptionPane.showInputDialog(null, "¿Que area reservara?", "Reservacion - Evento", 
                    JOptionPane.QUESTION_MESSAGE, null, opcionesAreasSemicerrado, opcionesAreasSemicerrado[0]);                         
                    Object segundaAreaElegida = JOptionPane.showInputDialog(null,"Elija otra area en caso de que sea necesaria en su reserva, de lo contrario, opte por 'Ninguna area mas'", "Reservacion - Evento", 
                    JOptionPane.QUESTION_MESSAGE, null, segundasOpcionesAreasSemicerrado, segundasOpcionesAreasSemicerrado[0]);             
                    Object [] menuEspecial = {"Si", "No"};
                    Object confirmarMenu = JOptionPane.showInputDialog(null, "¿Desea hacer un menu especial?, este tendra un costo establecido por el chef", "Reservacion - Evento", 
                    JOptionPane.QUESTION_MESSAGE, null, menuEspecial, menuEspecial[0]);
                    if (confirmarMenu==menuEspecial[0]){
                        cantidadPlatosEspeciales = Integer.parseInt(JOptionPane.showInputDialog("¿Cuantos menu especial desea realizar?"));
                        for(i=0;i<cantidadPlatosEspeciales;i++){
                            elMenuEspecial = JOptionPane.showInputDialog("¿Ingrese el plato numero " + (i+1)+ " especial que desea?");
                        }
                    }
                    Object [] serviciosEspeciales = {"Si", "No"};
                    Object serviciosExtra = JOptionPane.showInputDialog(null, "¿Desea tener servicios extra? - (DJ y sistemas de Sonido, Anfitrion del Evento/Espectaculo, Fotografia y estudios externos e internos, decoracion al gusto del cliente y seguridad)", "Reservacion - Evento", 
                    JOptionPane.QUESTION_MESSAGE, null, serviciosEspeciales, serviciosEspeciales[0]);
                    if(serviciosExtra==serviciosEspeciales[0]){
                        cantidadServiciosExtras = Integer.parseInt(JOptionPane.showInputDialog("¿Cuantos servicios especiales desea tener en su evento?"));
                        for(i=0;i<cantidadServiciosExtras;i++){
                            Object [] opcionesServiciosExtra = {"DJ y sistemas de sonido", "Anfitrion", "Fotografia y estudios", "Decoracion", "Seguridad"};
                            Object servicioContratado = JOptionPane.showInputDialog(null, "Servicio numero "+(i+1)+" a contratar:", "Reservacion - Evento", 
                            JOptionPane.QUESTION_MESSAGE, null, opcionesServiciosExtra, opcionesServiciosExtra[0]);                        
                        }              
                    }
                    Reserva ReservaEventoSemicerrado = new Reserva((String)nombre, (int)rut, (float)horaInicio, (float)horaFin, 
                    (String)revisar_reserva, (String)modalidad, (int)cantidadPersonasReserva, (String)primeraAreaElegida, (String)segundaAreaElegida);
                    ReservaEventoSemicerrado.GuardarReserva(); 
                }
                // Modalidad CERRADA
                if(modalidad==modalidad_reserva[2]){
                    cantidadPersonasReserva = Integer.parseInt(JOptionPane.showInputDialog("¿Cuantas personas asistiran dentro de su reserva?"));
                    Object [] menuEspecial = {"Si", "No"};
                    Object confirmarMenu = JOptionPane.showInputDialog(null, "¿Desea hacer un menu especial?, este tendra un costo establecido por el chef", "Reservacion - Evento", 
                    JOptionPane.QUESTION_MESSAGE, null, menuEspecial, menuEspecial[0]);
                    if (confirmarMenu==menuEspecial[0]){
                        cantidadPlatosEspeciales = Integer.parseInt(JOptionPane.showInputDialog("¿Cuantos menu especial desea realizar?"));
                        int i=0;
                        for(i=0;i<cantidadPlatosEspeciales;i++){
                            elMenuEspecial = JOptionPane.showInputDialog("¿Ingrese el plato numero " + (i+1)+ " especial que desea?");
                        }
                    }
                    // Llenado del constructor con los datos obtenidos de la reserva para posteriormente guardarlo en archivo.txt
                    Reserva EventoCerrado = new Reserva((String)nombre, (int)rut, (float)horaInicio, (float)horaFin, (String)revisar_reserva, (String)modalidad, (int)cantidadPersonasReserva, "Todas");
                    EventoCerrado.GuardarReserva();
                    Object [] serviciosEspeciales = {"Si", "No"};
                    Object serviciosExtra = JOptionPane.showInputDialog(null, "¿Desea tener servicios extra? - (DJ y sistemas de Sonido, Anfitrion del Evento/Espectaculo, Fotografia y estudios externos e internos, decoracion al gusto del cliente y seguridad)", "Reservacion - Evento", 
                    JOptionPane.QUESTION_MESSAGE, null, serviciosEspeciales, serviciosEspeciales[0]);
                    if(serviciosExtra==serviciosEspeciales[0]){
                        cantidadServiciosExtras = Integer.parseInt(JOptionPane.showInputDialog("¿Cuantos servicios especiales desea tener en su evento?"));
                        int i=0;
                        for(i=0;i<cantidadServiciosExtras;i++){
                            Object [] opcionesServiciosExtra = {"DJ y sistemas de sonido", "Anfitrion", "Fotografia y estudios", "Decoracion", "Seguridad"};
                            Object servicioContratado = JOptionPane.showInputDialog(null, "Servicio numero "+(i+1)+" a contratar:", "Reservacion - Evento", 
                            JOptionPane.QUESTION_MESSAGE, null, opcionesServiciosExtra, opcionesServiciosExtra[0]);        
                        }                
                    }              
                }
                            
            }
            else{  
                if(tipo == "Matrimonio"){
                    Object [] confirmarMatrimonio = {"Si", "No"};
                    Object ConfirmaPago = JOptionPane.showInputDialog(null, "Para realizar esta reserva debe pagar $200.000. ¿Desea confirmar pago?", "Reservacion - Matrimonio", 
                    JOptionPane.QUESTION_MESSAGE, null, confirmarMatrimonio, confirmarMatrimonio[0]);
                    
                    
                    // Llenado del constructor con los datos obtenidos de la reserva para posteriormente guardarlo en archivo.txt
                    Reserva ReservaMatrimonio = new Reserva((String)nombre, (int)rut, (float)horaInicio, (float)horaFin, (String)revisar_reserva);
                    
                    
                }else{
                    JFrame jFrame = new JFrame();
                    JOptionPane.showMessageDialog(jFrame, "Pago y reservacion cancelada.");
                }
            }
        }
    }
    public void degustacion() throws IOException{
        // Comidas y degustaciones
        int i=0;
        Object [] planes_comida = {"Incial: Incluye el plato principal de una comida (almuerzo o cena) del menu diario a gusto del chef. ($20.000)", "Intermedio: Incluye una comida de tres tiempos (entrada, fondo y postre) del menu diario a gusto del chef ($45.000).", "Avanzado: Incluye dos comidas, almuerzo y cena, de tres tiempos del menu abierto de especialidad del chef. ($60.000)", "Ninguno"};
        Object [] planes_degustacion = {"Locales: Incluye tres platos locales en una interpretacion unica. ($30.000)","Internacionales: Incluye tres platos internacionales en una interpretacion unica. ($36.000)", "Cocina Fusion: Incluye tres platos creados en base a alimentos locales, pero utilizando tecnicas de otros paises enuna interpretacion unica. ($40.000)", "Ninguno"};
        for(i=0;i<cantidadPersonasReserva;i++){
            Object PlanComidaElegida = JOptionPane.showInputDialog(null, "¿Que plan de comida desea?", "Reservacion - Evento", 
            JOptionPane.QUESTION_MESSAGE, null, planes_comida, planes_comida[0]);
            if(PlanComidaElegida==planes_comida[0]){
                PlanComidaElegida = "Inicial";
            }
            if(PlanComidaElegida==planes_comida[1]){
                PlanComidaElegida = "Intermedio";
            }
            if(PlanComidaElegida==planes_comida[2]){
                PlanComidaElegida = "Avanzado";
            }
            Object PlanDegustacionElegida = JOptionPane.showInputDialog(null, "¿Que plan de degustacion desea?", "Reservacion", 
            JOptionPane.QUESTION_MESSAGE, null, planes_degustacion, planes_degustacion[0]);
            if(PlanDegustacionElegida==planes_degustacion[0]){
                PlanDegustacionElegida = "Local";
            }
            if(PlanDegustacionElegida==planes_degustacion[1]){
                PlanDegustacionElegida = "Internacional";
            }
            if(PlanDegustacionElegida==planes_degustacion[2]){
                PlanDegustacionElegida = "Cocina fusion";
            }
        }
        
        // Llenado del constructor con los datos obtenidos de la reserva para posteriormente guardarlo en archivo.txt
        Reserva ReservaNormal = new Reserva((String)nombre, (int)rut, (float)horaInicio, (float)horaFin, (int)cantidadPersonasReserva, (int)cantidadMesasReserva,
        (String)revisar_reserva, (String)areaElegida);
        ReservaNormal.GuardarReserva();   
    }
    public String getNombre() {
        return nombre;
    }
    public float getHoraFin() {
        return horaFin;
    }
    public void setHoraFin(float horaFin) {
        this.horaFin = horaFin;
    }
    public float getHoraInicio() {
        return horaInicio;
    }
    public void setHoraInicio(float horaInicio) {
        this.horaInicio = horaInicio;
    }
    public int getRut(){
        return rut;
    }
    
}