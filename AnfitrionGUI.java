package Usuario;


import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.*;
import javafx.scene.text.Font;
import javafx.scene.text.FontPosture;
import javafx.scene.text.FontWeight;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

import javafx.geometry.*;
import javafx.stage.Stage;

public class AnfitrionGUI {
    
    public static void start(Stage ventana){

        ventana.setTitle("Anfitrion");

        Button volver = new Button("Back");
        volver.setOnAction(e -> {
            Trabajador.TrabajStart(ventana);
        });
        GridPane.setConstraints(volver, 0, 0);

        GridPane panel = new GridPane();
        panel.setPadding(new Insets(10,10,10,10));
        panel.setVgap(20);
        panel.setHgap(7);
        panel.setStyle("-fx-background-color: #C0C0C0;");

        Label textNombre = new Label("Nombre: ");
        textNombre.setStyle("-fx-font-weight: bold;");
        GridPane.setConstraints(textNombre, 5, 2);
        Label textRut = new Label("Rut: ");
        textRut.setStyle("-fx-font-weight: bold;");
        GridPane.setConstraints(textRut, 5, 3);
        Label textHoraInicio = new Label("Hora llegada: ");
        textHoraInicio.setStyle("-fx-font-weight: bold;");
        GridPane.setConstraints(textHoraInicio, 5, 4);
        Label textHoraFin = new Label("Hora salida: ");
        textHoraFin.setStyle("-fx-font-weight: bold;");
        GridPane.setConstraints(textHoraFin, 5, 5);
        Label textCantPersonas = new Label("Num. Personas: ");
        textCantPersonas.setStyle("-fx-font-weight: bold;");
        GridPane.setConstraints(textCantPersonas, 5, 6);

        TextField entradaNombre = new TextField(null);
        GridPane.setConstraints(entradaNombre, 6, 2);
        TextField entradaRut = new TextField(null);
        GridPane.setConstraints(entradaRut, 6, 3);
        TextField entradaHoraInicio = new TextField(null);
        GridPane.setConstraints(entradaHoraInicio, 6, 4);
        TextField entradaHoraFin = new TextField(null);
        GridPane.setConstraints(entradaHoraFin, 6, 5);
        TextField entradaCantidadPersonas = new TextField(null);
        GridPane.setConstraints(entradaCantidadPersonas, 6, 6);


        /* Lo siguiente que esta comentado creo que puede servir para transformar los datos recibidos en las entradas de texto
        pero se rompe el programa si es que los datos que esten el cuadro de texto no son numeros*/
        
        
        
        
    

        Button guardar = new Button("Guardar datos");
        Reserva arch = new Reserva();
        File archivo = new File("Alimentos.csv");
        try {
            arch.CrearArchivoCl();
        } catch (IOException e2) {
            // TODO Auto-generated catch block
            e2.printStackTrace();
        }

        GridPane.setConstraints(guardar, 6, 7);

                

        Label Subtitulo = new Label("Anfitrion");
        Subtitulo.setStyle("-fx-font-size: 30px; -fx-font-family: 'Segoe UI Semibold';");
        GridPane.setConstraints(Subtitulo, 0, 1);

        Label ColNombre = new Label("NOMBRE");
        GridPane.setConstraints(ColNombre, 0, 2);
        ColNombre.setStyle("-fx-background-color: #E5E5E5;");
        ColNombre.setFont(Font.font("Verdana", FontWeight.BOLD, FontPosture.REGULAR, 18));

        Label ColRUT = new Label("RUT");
        GridPane.setConstraints(ColRUT, 1, 2);
        ColRUT.setStyle("-fx-background-color: #E5E5E5;");
        ColRUT.setFont(Font.font("Verdana", FontWeight.BOLD, FontPosture.REGULAR, 18));

        Label ColHoraInicio = new Label("HORA LLEGADA");
        GridPane.setConstraints(ColHoraInicio, 2, 2);
        ColHoraInicio.setStyle("-fx-background-color: #E5E5E5;");
        ColHoraInicio.setFont(Font.font("Verdana", FontWeight.BOLD, FontPosture.REGULAR, 18));

        Label ColHoraFin = new Label("HORA SALIDA");
        GridPane.setConstraints(ColHoraFin, 3, 2);
        ColHoraFin.setStyle("-fx-background-color: #E5E5E5;");
        ColHoraFin.setFont(Font.font("Verdana", FontWeight.BOLD, FontPosture.REGULAR, 18));

        Label ColCantidadPersonas = new Label("Cant. Personas");
        GridPane.setConstraints(ColCantidadPersonas, 4, 2);
        ColCantidadPersonas.setStyle("-fx-background-color: #E5E5E5;");
        ColCantidadPersonas.setFont(Font.font("Verdana", FontWeight.BOLD, FontPosture.REGULAR, 18));

        Label name1 = new Label("Espacio para nombre");
        GridPane.setConstraints(name1, 0, 3);
        Label rut1 = new Label("Espacio para rut");
        GridPane.setConstraints(rut1, 1, 3);
        Label horaInicio1 = new Label("Espacio hora");
        GridPane.setConstraints(horaInicio1, 2, 3);
        Label horaFin1 = new Label("Espacio hora");
        GridPane.setConstraints(horaFin1, 3, 3);
        Label CantPersonas1 = new Label("Num personas");
        GridPane.setConstraints(CantPersonas1, 4, 3);

        Label name2 = new Label("Espacio para nombre");
        GridPane.setConstraints(name2, 0, 4);
        Label rut2 = new Label("Espacio para rut");
        GridPane.setConstraints(rut2, 1, 4);
        Label horaInicio2 = new Label("Espacio hora");
        GridPane.setConstraints(horaInicio2, 2, 4);
        Label horaFin2 = new Label("Espacio hora");
        GridPane.setConstraints(horaFin2, 3, 4);
        Label CantPersonas2 = new Label("Num personas");
        GridPane.setConstraints(CantPersonas2, 4, 4);

        Label name3 = new Label("Espacio para nombre");
        GridPane.setConstraints(name3, 0, 5);
        Label rut3 = new Label("Espacio para rut");
        GridPane.setConstraints(rut3, 1, 5);
        Label horaInicio3 = new Label("Espacio hora");
        GridPane.setConstraints(horaInicio3, 2, 5);
        Label horaFin3 = new Label("Espacio hora");
        GridPane.setConstraints(horaFin3, 3, 5);
        Label CantPersonas3 = new Label("Num personas");
        GridPane.setConstraints(CantPersonas3, 4, 5);

        Label name4 = new Label("Espacio para nombre");
        GridPane.setConstraints(name4, 0, 6);
        Label rut4 = new Label("Espacio para rut");
        GridPane.setConstraints(rut4, 1, 6);
        Label horaInicio4 = new Label("Espacio hora");
        GridPane.setConstraints(horaInicio4, 2, 6);
        Label horaFin4 = new Label("Espacio hora");
        GridPane.setConstraints(horaFin4, 3, 6);
        Label CantPersonas4 = new Label("Num personas");
        GridPane.setConstraints(CantPersonas4, 4, 6);

        Label name5 = new Label("Espacio para nombre");
        GridPane.setConstraints(name5, 0, 7);
        Label rut5 = new Label("Espacio para rut");
        GridPane.setConstraints(rut5, 1, 7);
        Label horaInicio5 = new Label("Espacio hora");
        GridPane.setConstraints(horaInicio5, 2, 7);
        Label horaFin5 = new Label("Espacio hora");
        GridPane.setConstraints(horaFin5, 3, 7);
        Label CantPersonas5 = new Label("Num personas");
        GridPane.setConstraints(CantPersonas5, 4, 7);

        Label name6 = new Label("Espacio para nombre");
        GridPane.setConstraints(name6, 0, 8);
        Label rut6 = new Label("Espacio para rut");
        GridPane.setConstraints(rut6, 1, 8);
        Label horaInicio6 = new Label("Espacio hora");
        GridPane.setConstraints(horaInicio6, 2, 8);
        Label horaFin6 = new Label("Espacio hora");
        GridPane.setConstraints(horaFin6, 3, 8);
        Label CantPersonas6 = new Label("Num personas");
        GridPane.setConstraints(CantPersonas6, 4, 8);

        Label name7 = new Label("Espacio para nombre");
        GridPane.setConstraints(name7, 0, 9);
        Label rut7 = new Label("Espacio para rut");
        GridPane.setConstraints(rut7, 1, 9);
        Label horaInicio7 = new Label("Espacio hora");
        GridPane.setConstraints(horaInicio7, 2, 9);
        Label horaFin7 = new Label("Espacio hora");
        GridPane.setConstraints(horaFin7, 3, 9);
        Label CantPersonas7 = new Label("Num personas");
        GridPane.setConstraints(CantPersonas7, 4, 9);

        Label name8 = new Label("Espacio para nombre");
        GridPane.setConstraints(name8, 0, 10);
        Label rut8 = new Label("Espacio para rut");
        GridPane.setConstraints(rut8, 1, 10);
        Label horaInicio8 = new Label("Espacio hora");
        GridPane.setConstraints(horaInicio8, 2, 10);
        Label horaFin8 = new Label("Espacio hora");
        GridPane.setConstraints(horaFin8, 3, 10);
        Label CantPersonas8 = new Label("Num personas");
        GridPane.setConstraints(CantPersonas8, 4, 10);

        Label name9 = new Label("Espacio para nombre");
        GridPane.setConstraints(name9, 0, 11);
        Label rut9 = new Label("Espacio para rut");
        GridPane.setConstraints(rut9, 1, 11);
        Label horaInicio9 = new Label("Espacio hora");
        GridPane.setConstraints(horaInicio9, 2, 11);
        Label horaFin9 = new Label("Espacio hora");
        GridPane.setConstraints(horaFin9, 3, 11);
        Label CantPersonas9 = new Label("Num personas");
        GridPane.setConstraints(CantPersonas9, 4, 11);

        ////////////////asda/////////

        guardar.setOnAction(e -> {
            try {
                int a = 0;
                Scanner lector = new Scanner(archivo);
                arch.guardarClientes(entradaNombre.getText(), entradaRut.getText(),entradaHoraInicio.getText(),entradaHoraFin.getText(),entradaCantidadPersonas.getText());
                
                while(lector.hasNextLine()){
                    
                    //ver linea
                    String linea = lector.nextLine();
                    //asignar lista
                    String[] valor = linea.split(",");
                    if(valor[0]==null){
        
                    }
                    else{
                        if(a>0){
                            
                            System.out.println(valor[0]);
                            name1.setText(valor[0]);
                            rut1.setText(valor[1]);
                            horaInicio1.setText(valor[2]);
                            horaFin2.setText(valor[3]);
                            CantPersonas1.setText(valor[4]);
                        }
                    }
                    a++;
                }
                

            } catch (IOException e1) {
                // TODO Auto-generated catch block
                e1.printStackTrace();
            }
            
        });

        // Si se pueden añadir mas espacios
    
        panel.getChildren().addAll(volver, Subtitulo, 
        ColNombre, ColRUT, ColHoraInicio, ColHoraFin, ColCantidadPersonas, 
        name1, rut1, horaInicio1, horaFin1, CantPersonas1,
        name2, rut2, horaInicio2, horaFin2, CantPersonas2,
        name3, rut3, horaInicio3, horaFin3, CantPersonas3,
        name4, rut4, horaInicio4, horaFin4, CantPersonas4,
        name5, rut5, horaInicio5, horaFin5, CantPersonas5,
        name6, rut6, horaInicio6, horaFin6, CantPersonas6,
        name7, rut7, horaInicio7, horaFin7, CantPersonas7,
        name8, rut8, horaInicio8, horaFin8, CantPersonas8,
        name9, rut9, horaInicio9, horaFin9, CantPersonas9,
        textNombre, textRut, textHoraInicio, textHoraFin, textCantPersonas,
        entradaNombre, entradaRut, entradaHoraInicio, entradaHoraFin, entradaCantidadPersonas,
        guardar);
        
        Scene tema = new Scene(panel, 1200,800);
        ventana.setScene(tema);
        ventana.show();
    }

}