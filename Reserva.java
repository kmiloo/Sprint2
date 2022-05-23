package Usuario;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Reserva {


    public void CrearArchivoAl() throws IOException{
        File archivo = new File("Alimentos.csv");
        if(archivo.createNewFile()){
            FileWriter escribirReserva = new FileWriter("Alimentos.csv");
            escribirReserva.write("Alimento:,Fecha:");
            escribirReserva.close();
        }
    }
    public void CrearArchivoCl() throws IOException{
        File archivo = new File("Clientes.csv");
        if(archivo.createNewFile()){
            FileWriter escribirReserva = new FileWriter("Clientes.csv");
            escribirReserva.write("Clientes:,Rut:,horaInicio:,horaFin:,cantPersonas:");
            escribirReserva.close();
        }
    }
    public void CrearArchivoAuxZona() throws IOException{
        File archivo = new File("Zonas.csv");
        if(archivo.createNewFile()){
            FileWriter escribirReserva = new FileWriter("Zonas.csv");
            escribirReserva.write("Zonas:");
            escribirReserva.close();
        }
    }
    public void CrearArchivoCoper() throws IOException{
        File archivo = new File("Coperos.csv");
        if(archivo.createNewFile()){
            FileWriter escribirReserva = new FileWriter("Coperos.csv");
            escribirReserva.write("Plato:,Taza:,Vaso:,Extra:");
            escribirReserva.close();
        }
    }
    public void CrearArchivoMetre() throws IOException{
        File archivo = new File("Metre.csv");
        if(archivo.createNewFile()){
            FileWriter escribirReserva = new FileWriter("Metre.csv");
            escribirReserva.write("Mesa:,Capacidad:");
            escribirReserva.close();
        }
    }



    public void guardarAlimentos(String alimento,String fecha) throws IOException{
        try{
            File archivo = new File("Alimentos.csv");
            Scanner lector = new Scanner(archivo);
            //convertir float to string
            
            boolean a = false;
            while(lector.hasNextLine()){
                //ver linea
                String linea = lector.nextLine();
                //asignar lista
                String[] valor = linea.split(",");
                if(alimento.equals(valor[0])){
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
                FileWriter escribirReserva = new FileWriter("Alimentos.csv", true);
                escribirReserva.append("\n"+alimento+","+fecha);
                escribirReserva.close();
                
            }
            }catch(IOException e){
                System.out.println("Ocurrió un error en la escritura del archivo");
                e.printStackTrace();
            }
    }
    public void guardarClientes(String nombre,String rut,String horaLleg,String horaSal,String numPers) throws IOException{
        try{
            File archivo = new File("Clientes.csv");
            Scanner lector = new Scanner(archivo);
            //convertir float to string
            
            boolean a = false;
            while(lector.hasNextLine()){
                //ver linea
                String linea = lector.nextLine();
                //asignar lista
                String[] valor = linea.split(",");
                if(rut.equals(valor[1])){
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
                FileWriter escribirReserva = new FileWriter("Clientes.csv", true);
                escribirReserva.append("\n"+nombre+","+rut+","+horaLleg+","+horaSal+","+numPers);
                escribirReserva.close();
                
            }
            }catch(IOException e){
                System.out.println("Ocurrió un error en la escritura del archivo");
                e.printStackTrace();
            }
    }

    public void guardarauxServ(String zona) throws IOException{
        try{
            File archivo = new File("Zonas.csv");
            Scanner lector = new Scanner(archivo);
            //convertir float to string
            
            boolean a = false;
            while(lector.hasNextLine()){
                //ver linea
                String linea = lector.nextLine();
                //asignar lista
                String[] valor = linea.split(",");
                if(zona.equals(valor[0])){
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
                FileWriter escribirReserva = new FileWriter("Zonas.csv", true);
                escribirReserva.append("\n"+zona);
                escribirReserva.close();
                
            }
            }catch(IOException e){
                System.out.println("Ocurrió un error en la escritura del archivo");
                e.printStackTrace();
            }
    }
    public void guardarCoperos(String plato,String cubierto,String taza,String vaso,String extra) throws IOException{
        try{
            File archivo = new File("Coperos.csv");
            Scanner lector = new Scanner(archivo);
            //convertir float to string
            
            boolean a = false;
            while(lector.hasNextLine()){
                //ver linea
                String linea = lector.nextLine();
                //asignar lista
                String[] valor = linea.split(",");
                
            }
            lector.close();
            if(a){    
            }
            else{
                FileWriter escribirReserva = new FileWriter("Coperos.csv", true);
                escribirReserva.append("\n"+plato+","+cubierto+","+taza+","+vaso+","+extra);
                escribirReserva.close();
                
            }
            }catch(IOException e){
                System.out.println("Ocurrió un error en la escritura del archivo");
                e.printStackTrace();
            }
    }
    public void guardarMetre(String mesa, String capacidad) throws IOException{
        try{
            File archivo = new File("Zonas.csv");
            Scanner lector = new Scanner(archivo);
            //convertir float to string
            
            boolean a = false;
            while(lector.hasNextLine()){
                //ver linea
                String linea = lector.nextLine();
                //asignar lista
                String[] valor = linea.split(",");
                if(mesa.equals(valor[0])){
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
                FileWriter escribirReserva = new FileWriter("Metre.csv", true);
                escribirReserva.append("\n"+mesa+","+capacidad);
                escribirReserva.close();
                
            }
        }catch(IOException e){
            System.out.println("Ocurrió un error en la escritura del archivo");
            e.printStackTrace();
        }
    }
}
