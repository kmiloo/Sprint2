package Usuario;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.*;
import javafx.geometry.*;
import javafx.stage.Stage;

public class Main extends Application{
    Stage ventana;
    Button boton,boton2;
    Label label,label2;
    TextField tf,tf2;

    public static void main(String[] args){
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws Exception{
        ventana = primaryStage;
        ventana.setTitle("Restaurant");

        GridPane panel = new GridPane();
        panel.setPadding(new Insets(10,10,10,10));
        panel.setVgap(20);
        panel.setHgap(3);

        //texto de lugar para ingresar texto
        label = new Label("Nombre:");
        label2 = new Label("Rut");
        //lugar para ingresar texto
        tf = new TextField("");
        tf.setMaxWidth(100);
        tf2 = new TextField("");
        tf2.setMaxWidth(100);
        //boton
        boton = new Button("Ingresar");
        
        boton.setOnAction(e -> {
            Usu.mostrar("reserva", "Usted no tiene reservas");
        });

        boton2 = new Button("Trabajador");

        boton2.setOnAction(e -> {
            Trabajador.TrabajStart(ventana);
        });
        GridPane.setConstraints(boton2, 3, 10);
        GridPane.setConstraints(boton, 2, 3);


        //Variable A
        TextField A = new TextField();
        A.setPromptText("Ingrese su nombre:");
        GridPane.setConstraints(A, 0,2);
        TextField B = new TextField();
        B.setPromptText("Ingrese su rut");
        GridPane.setConstraints(B, 2,2);

        GridPane.setConstraints(label, 0, 1);
        GridPane.setConstraints(label2, 1, 1);

        panel.getChildren().addAll(A,B,label,label2,boton2,boton);
        Scene tema = new Scene(panel, 450, 350);

        /**Sección de la ventana */
        ventana.setScene(tema);
        ventana.show();
    }
}