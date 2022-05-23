package Usuario;

import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.*;
import javafx.scene.text.Font;
import javafx.scene.text.FontPosture;
import javafx.scene.text.FontWeight;
import javafx.geometry.*;
import javafx.stage.Stage;

public class RunnerGUI{
    public static void start(Stage ventana) {

        ventana.setTitle("Runner");

        Button volver = new Button("Back");
        volver.setOnAction(e -> {
            Trabajador.TrabajStart(ventana);
        });
        GridPane.setConstraints(volver, 0, 0);

        GridPane panel = new GridPane();
        panel.setPadding(new Insets(10,10,10,10));
        panel.setVgap(20);
        panel.setHgap(2);
        panel.setStyle("-fx-background-color: #C0C0C0;");
        

        Label Subtitulo = new Label("Runner");
        Subtitulo.setStyle("-fx-font-size: 30px; -fx-font-family: 'Segoe UI Semibold';");
        GridPane.setConstraints(Subtitulo, 0, 1);

        Label Comanda = new Label("PEDIDOS");
        GridPane.setConstraints(Comanda, 0, 2);
        Comanda.setStyle("-fx-background-color: #E5E5E5;");
        Comanda.setFont(Font.font("Verdana", FontWeight.BOLD, FontPosture.REGULAR, 18));

        Label NumMesa = new Label("Numero de mesa");
        GridPane.setConstraints(NumMesa, 1, 2);
        NumMesa.setStyle("-fx-background-color: #E5E5E5;");
        NumMesa.setFont(Font.font("Verdana", FontWeight.BOLD, FontPosture.REGULAR, 18));

        Label Comanda1 = new Label("Espacio para comanda");
        GridPane.setConstraints(Comanda1, 0, 3);
        Comanda1.setStyle("-fx-background-color: #FFFFFF;");
        Label NumMesa1 = new Label("Espacio Num. mesa");
        GridPane.setConstraints(NumMesa1, 1, 3);
        NumMesa1.setStyle("-fx-background-color: #FFFFFF;");

        Label Comanda2 = new Label("Espacio para comanda");
        GridPane.setConstraints(Comanda2, 0, 4);
        Comanda2.setStyle("-fx-background-color: #FFFFFF;");
        Label NumMesa2 = new Label("Espacio Num. mesa");
        GridPane.setConstraints(NumMesa2, 1, 4);
        NumMesa2.setStyle("-fx-background-color: #FFFFFF;");

        Label Comanda3 = new Label("Espacio para comanda");
        GridPane.setConstraints(Comanda3, 0, 5);
        Comanda3.setStyle("-fx-background-color: #FFFFFF;");
        Label NumMesa3 = new Label("Espacio Num. mesa");
        GridPane.setConstraints(NumMesa3, 1, 5);
        NumMesa3.setStyle("-fx-background-color: #FFFFFF;");

        Label Comanda4 = new Label("Espacio para comanda");
        GridPane.setConstraints(Comanda4, 0, 6);
        Comanda4.setStyle("-fx-background-color: #FFFFFF;");
        Label NumMesa4 = new Label("Espacio Num. mesa");
        GridPane.setConstraints(NumMesa4, 1, 6);
        NumMesa4.setStyle("-fx-background-color: #FFFFFF;");

        Label Comanda5 = new Label("Espacio para comanda");
        GridPane.setConstraints(Comanda5, 0, 7);
        Comanda5.setStyle("-fx-background-color: #FFFFFF;");
        Label NumMesa5 = new Label("Espacio Num. mesa");
        GridPane.setConstraints(NumMesa5, 1, 7);
        NumMesa5.setStyle("-fx-background-color: #FFFFFF;");

        Label Comanda6 = new Label("Espacio para comanda");
        GridPane.setConstraints(Comanda6, 0, 8);
        Comanda6.setStyle("-fx-background-color: #FFFFFF;");
        Label NumMesa6 = new Label("Espacio Num. mesa");
        GridPane.setConstraints(NumMesa6, 1, 8);
        NumMesa6.setStyle("-fx-background-color: #FFFFFF;");

        Label Comanda7 = new Label("Espacio para comanda");
        GridPane.setConstraints(Comanda7, 0, 9);
        Comanda7.setStyle("-fx-background-color: #FFFFFF;");
        Label NumMesa7 = new Label("Espacio Num. mesa");
        GridPane.setConstraints(NumMesa7, 1, 9);
        NumMesa7.setStyle("-fx-background-color: #FFFFFF;");

        // Se pueden agregar mas        

        panel.getChildren().addAll(Subtitulo, volver, 
        Comanda, NumMesa,
        Comanda1, NumMesa1,
        Comanda2, NumMesa2,
        Comanda3, NumMesa3,
        Comanda4, NumMesa4,
        Comanda5, NumMesa5,
        Comanda6, NumMesa6,
        Comanda7, NumMesa7
        );
        
        Scene tema = new Scene(panel, 900,600);
        ventana.setScene(tema);
        ventana.show();
    }

}