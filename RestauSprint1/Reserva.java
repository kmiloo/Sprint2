package Pruebas;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Reserva extends Cliente {
    private int invitados;
    private int mesas;
    private float horaInicio;
    private float horaFin;
    private String tipoReserva;
    private String planComida;
    private String planDegustacion;
    private String area;
    private String area2;
    private String modalidad;

    public Reserva(){}

    // Constructor reserva NORMAL
    public Reserva(String nombre, int rut, float horaInicio, float horaFin, int invitados, int mesas, String tipoReserva, String area){
        this.nombre = nombre;
        this.rut = rut;
        this.horaInicio = horaInicio;
        this.horaFin = horaFin;
        this.invitados = invitados;
        this.mesas = mesas;
        this.tipoReserva = tipoReserva;
        this.area = area;
    }

    // Constructor reserva EVENTO ABIERTO y CERRADO
    public Reserva(String nombre, int rut, float horaInicio, float horaFin, String tipoReserva, String modalidad, int invitados, String area){
        this.nombre = nombre;
        this.rut = rut;
        this.horaInicio = horaInicio;
        this.horaFin = horaFin;
        this.tipoReserva = tipoReserva;
        this.modalidad = modalidad;
        this.invitados = invitados;
        this.area = area;
    }

    // Constructor reserva EVENTO SEMICERRADO
    public Reserva(String nombre, int rut, float horaInicio, float horaFin, String tipoReserva, String modalidad, int invitados, String area, String area2){
        this.nombre = nombre;
        this.rut = rut;
        this.horaInicio = horaInicio;
        this.horaFin = horaFin;
        this.tipoReserva = tipoReserva;
        this.modalidad = modalidad;
        this.invitados = invitados;
        this.area = area;
        this.area2 = area2;
    }

    // Constructor MATRIMONIO
    public Reserva(String nombre, int rut, float horaInicio, float horaFin, String tipoReserva){
        this.nombre = nombre;
        this.rut = rut;
        this.horaInicio = horaInicio;
        this.horaFin = horaFin;
        this.tipoReserva = tipoReserva;
    }


    // GETTERS Y SETTERS DE ATRIBUTOS
    // Nombre
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    // Rut
    public int getRut() {
        return rut;
    }
    public void setNombre(int rut) {
        this.rut = rut;
    }

    // Hora inicio
    public float getHoraInicio() {
        return horaInicio;
    }
    public void setHoraInicio(float horaInicio) {
        this.horaInicio = horaInicio;
    }

    // Hora fin
    public float getHoraFin() {
        return horaFin;
    }
    public void setHoraFin(float horaFin) {
        this.horaFin = horaFin;
    }

    // Invitados
    public int getInvitados() {
        return invitados;
    }
    public void setInvitados(int invitados) {
        this.invitados = invitados;
    }

    // Mesas
    public int getMesas() {
        return mesas;
    }
    public void setMesas(int mesas) {
        this.mesas = mesas;
    }

    // Reserva
    public String getTipoReserva() {
        return tipoReserva;
    }
    public void setTipoReserva(String tipoReserva) {
        this.tipoReserva = tipoReserva;
    }

    // Plan de comida
    public String getPlanComida() {
        return planComida;
    }
    public void setPlanComida(String planComida) {
        this.planComida = planComida;
    }

    // Plan de degustacion
    public String getPlanDegustacion() {
        return planDegustacion;
    }
    public void setPlanDegustacion(String planDegustacion) {
        this.planDegustacion = planDegustacion;
    }
    // Modalidad
    public String getModalidad() {
        return modalidad;
    }
    public void setModalidad(String modalidad) {
        this.modalidad = modalidad;
    }

    // Area
    public String getArea() {
        return area;
    }
    public void setArea(String area) {
        this.area = area;
    }

    // Area 2
    public String getArea2() {
        return area2;
    }
    public void setArea2(String area2) {
        this.area2 = area2;
    }
    // Crear archivo csv
    public void CrearArchivo() throws IOException{
        File archivo = new File("Reservas.csv");
        if(archivo.createNewFile()){
            FileWriter escribirReserva = new FileWriter("Reservas.csv");
            escribirReserva.write("Nombre:,Rut:,HoraInicio:,HoraFin:,TotalPersonas:,MesasUsadas:,TipoReserva:,Modalidad:,Area:,Area2:");
            escribirReserva.close();
        }
    }

    // METODOS PARA GUARDAR DATOS
    // Guardar datos de reserva NORMAL
    public void GuardarReserva(){
        try{
        File archivo = new File("Reservas.csv");
        Scanner lector = new Scanner(archivo);
        //convertir float to string
        String strrut = String.valueOf(rut);
        boolean a = false;
        while(lector.hasNextLine()){
            //ver linea
            String linea = lector.nextLine();
            //asignar lista
            String[] valor = linea.split(",");
            if(strrut.equals(valor[1])){
                a = true;
            }
            else{
                a=false;
            }
        }
        lector.close();
        if(a){    
        }
        else{
            FileWriter escribirReserva = new FileWriter("Reservas.csv", true);
            escribirReserva.append("\n"+getNombre()+","+getRut()+","+getHoraInicio()+","+
            getHoraFin()+","+getInvitados()+","+getMesas()+ ","+getTipoReserva()+","+
            getModalidad()+","+getArea()+","+getArea2());
            escribirReserva.close();
            
        }
        }catch(IOException e){
            System.out.println("Ocurrió un error en la escritura del archivo");
            e.printStackTrace();
        }
    }
}