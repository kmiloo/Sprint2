package Usuario;

//* significa que importa todo lo que contiene el paquete indicado

import javafx.stage.*;
import javafx.geometry.Pos;
import javafx.scene.*;
import javafx.scene.layout.*;
import javafx.scene.control.*;

public class Usu{
    static boolean respuesta;

    public static boolean mostrar(String titulo, String mensaje){
        Stage ventana = new Stage();
        //Indicar que la ventana es emergente
        ventana.initModality(Modality.APPLICATION_MODAL);
        ventana.setTitle(titulo);
        ventana.setMinWidth(250);

        Label texto = new Label(mensaje);


        
        Button cerrrar = new Button("Cerrar");

        
        cerrrar.setOnAction(e -> {
            respuesta = false;
            ventana.close();
        });

        VBox capa = new VBox();
        capa.getChildren().addAll(texto,cerrrar);
        capa.setAlignment(Pos.CENTER);

        Scene tema = new Scene(capa);
        ventana.setScene(tema);
        ventana.showAndWait();

        return respuesta;
    }
} 