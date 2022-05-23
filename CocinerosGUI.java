package Usuario;


import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.*;
import javafx.scene.text.Font;
import javafx.scene.text.FontPosture;
import javafx.scene.text.FontWeight;
import javafx.geometry.*;
import javafx.stage.Stage;

public class CocinerosGUI {
    
    public static void start(Stage ventana){

        ventana.setTitle("Chef/Cocineros");

        Button volver = new Button("Back");
        volver.setOnAction(e -> {
            Trabajador.TrabajStart(ventana);
        });
        GridPane.setConstraints(volver, 0, 0);

        GridPane panel = new GridPane();
        panel.setPadding(new Insets(10,10,10,10));
        panel.setVgap(20);
        panel.setHgap(5);
        panel.setStyle("-fx-background-color: #C0C0C0;");
        

        Label textoUsuario = new Label("Chef - Cocineros");
        textoUsuario.setStyle("-fx-font-size: 30px; -fx-font-family: 'Segoe UI Semibold';");
        GridPane.setConstraints(textoUsuario, 0, 1);

        Label Columna1 = new Label("PEDIDOS");
        GridPane.setConstraints(Columna1, 0, 2);
        Columna1.setStyle("-fx-background-color: #E5E5E5;");
        Columna1.setFont(Font.font("Verdana", FontWeight.BOLD, FontPosture.REGULAR, 18));

        Label ColPreparando = new Label("Status: Preparando");
        GridPane.setConstraints(ColPreparando, 1, 2);
        ColPreparando.setStyle("-fx-background-color: #E5E5E5;");
        ColPreparando.setFont(Font.font("Verdana", FontWeight.BOLD, FontPosture.REGULAR, 18));

        Label ColCocinando = new Label("Status: Cocinando");
        GridPane.setConstraints(ColCocinando, 2, 2);
        ColCocinando.setStyle("-fx-background-color: #E5E5E5;");
        ColCocinando.setFont(Font.font("Verdana", FontWeight.BOLD, FontPosture.REGULAR, 18));

        Label ColTerminado = new Label("Status: Terminado");
        GridPane.setConstraints(ColTerminado, 3, 2);
        ColTerminado.setStyle("-fx-background-color: #E5E5E5;");
        ColTerminado.setFont(Font.font("Verdana", FontWeight.BOLD, FontPosture.REGULAR, 18));

        Label pedido1 = new Label("ESPACIO PEDIDO 1");
        GridPane.setConstraints(pedido1, 0, 3);
        pedido1.setStyle("-fx-background-color: #FFFFFF;");
        
        Label pedido2 = new Label("ESPACIO PEDIDO 2");
        GridPane.setConstraints(pedido2, 0, 4);
        pedido2.setStyle("-fx-background-color: #FFFFFF;");

        Label pedido3 = new Label("ESPACIO PEDIDO 3");
        GridPane.setConstraints(pedido3, 0, 5);
        pedido3.setStyle("-fx-background-color: #FFFFFF;");

        Label pedido4 = new Label("ESPACIO PEDIDO 4");
        GridPane.setConstraints(pedido4, 0, 6);
        pedido4.setStyle("-fx-background-color: #FFFFFF;");

        Label pedido5 = new Label("ESPACIO PEDIDO 5");
        GridPane.setConstraints(pedido5, 0, 7);
        pedido5.setStyle("-fx-background-color: #FFFFFF;");

        Label pedido6 = new Label("ESPACIO PEDIDO 6");
        GridPane.setConstraints(pedido6, 0, 8);
        pedido6.setStyle("-fx-background-color: #FFFFFF;");

        Label pedido7 = new Label("ESPACIO PEDIDO 7");
        GridPane.setConstraints(pedido7, 0, 9);
        pedido7.setStyle("-fx-background-color: #FFFFFF;");

        Label pedido8 = new Label("ESPACIO PEDIDO 8");
        GridPane.setConstraints(pedido8, 0, 10);
        pedido8.setStyle("-fx-background-color: #FFFFFF;");

        Label pedido9 = new Label("ESPACIO PEDIDO 9");
        GridPane.setConstraints(pedido9, 0, 11);
        pedido9.setStyle("-fx-background-color: #FFFFFF;");
        
        


        Button Preparando1 = new Button("Preparando");
        GridPane.setConstraints(Preparando1, 1, 3);
        Preparando1.setStyle("-fx-background-color: #F79400;"); 
        Button Cocinando1 = new Button("Cocinando");
        GridPane.setConstraints(Cocinando1, 2, 3);
        Cocinando1.setStyle("-fx-background-color: #F3E007;"); 
        Button Terminado1 = new Button("Terminado");
        GridPane.setConstraints(Terminado1, 3, 3);
        Terminado1.setStyle("-fx-background-color: #00F700;");
        Button blancoo = new Button("");
        blancoo.setStyle("-fx-background-color: #FFFFFF;");
        Preparando1.setOnAction(e -> {
            Cocinando1.setText("");
            Cocinando1.setStyle("-fx-background-color: #C0C0C0;");
            Terminado1.setText("");
            Terminado1.setStyle("-fx-background-color: #C0C0C0;");
            
        });
        Cocinando1.setOnAction(e -> {
            Preparando1.setText("");
            Preparando1.setStyle("-fx-background-color: #C0C0C0;");
            Terminado1.setText("");
            Terminado1.setStyle("-fx-background-color: #C0C0C0;");
        });
        Terminado1.setOnAction(e -> {
            Preparando1.setText("");
            Preparando1.setStyle("-fx-background-color: #C0C0C0;");
            Cocinando1.setText("");
            Cocinando1.setStyle("-fx-background-color: #C0C0C0;");
        });
        

        Button Preparando2 = new Button("Preparando");
        GridPane.setConstraints(Preparando2, 1, 4);
        Preparando2.setStyle("-fx-background-color: #F79400;");
        Button Cocinando2 = new Button("Cocinando");
        GridPane.setConstraints(Cocinando2, 2, 4);
        Cocinando2.setStyle("-fx-background-color: #F3E007;"); 
        Button Terminado2 = new Button("Terminado");
        GridPane.setConstraints(Terminado2, 3, 4);
        Terminado2.setStyle("-fx-background-color: #00F700;");
        Preparando2.setOnAction(e -> {
            Cocinando2.setText("");
            Cocinando2.setStyle("-fx-background-color: #C0C0C0;");
            Terminado2.setText("");
            Terminado2.setStyle("-fx-background-color: #C0C0C0;");
            
        });
        Cocinando2.setOnAction(e -> {
            Preparando2.setText("");
            Preparando2.setStyle("-fx-background-color: #C0C0C0;");
            Terminado2.setText("");
            Terminado2.setStyle("-fx-background-color: #C0C0C0;");
        });
        Terminado2.setOnAction(e -> {
            Preparando2.setText("");
            Preparando2.setStyle("-fx-background-color: #C0C0C0;");
            Cocinando2.setText("");
            Cocinando2.setStyle("-fx-background-color: #C0C0C0;");
        });
        
        Button Preparando3 = new Button("Preparando");
        GridPane.setConstraints(Preparando3, 1, 5);
        Preparando3.setStyle("-fx-background-color: #F79400;");
        Button Cocinando3 = new Button("Cocinando");
        GridPane.setConstraints(Cocinando3, 2, 5);
        Cocinando3.setStyle("-fx-background-color: #F3E007;"); 
        Button Terminado3 = new Button("Terminado");
        GridPane.setConstraints(Terminado3, 3, 5);
        Terminado3.setStyle("-fx-background-color: #00F700;");
        Preparando3.setOnAction(e -> {
            Cocinando3.setText("");
            Cocinando3.setStyle("-fx-background-color: #C0C0C0;");
            Terminado3.setText("");
            Terminado3.setStyle("-fx-background-color: #C0C0C0;");
            
        });
        Cocinando3.setOnAction(e -> {
            Preparando3.setText("");
            Preparando3.setStyle("-fx-background-color: #C0C0C0;");
            Terminado3.setText("");
            Terminado3.setStyle("-fx-background-color: #C0C0C0;");
        });
        Terminado3.setOnAction(e -> {
            Preparando3.setText("");
            Preparando3.setStyle("-fx-background-color: #C0C0C0;");
            Cocinando3.setText("");
            Cocinando3.setStyle("-fx-background-color: #C0C0C0;");
        });

        Button Preparando4 = new Button("Preparando");
        GridPane.setConstraints(Preparando4, 1, 6);
        Preparando4.setStyle("-fx-background-color: #F79400;");
        Button Cocinando4 = new Button("Cocinando");
        GridPane.setConstraints(Cocinando4, 2, 6);
        Cocinando4.setStyle("-fx-background-color: #F3E007;"); 
        Button Terminado4 = new Button("Terminado");
        GridPane.setConstraints(Terminado4, 3, 6);
        Terminado4.setStyle("-fx-background-color: #00F700;");
        Preparando4.setOnAction(e -> {
            Cocinando4.setText("");
            Cocinando4.setStyle("-fx-background-color: #C0C0C0;");
            Terminado4.setText("");
            Terminado4.setStyle("-fx-background-color: #C0C0C0;");
            
        });
        Cocinando4.setOnAction(e -> {
            Preparando4.setText("");
            Preparando4.setStyle("-fx-background-color: #C0C0C0;");
            Terminado4.setText("");
            Terminado4.setStyle("-fx-background-color: #C0C0C0;");
        });
        Terminado4.setOnAction(e -> {
            Preparando4.setText("");
            Preparando4.setStyle("-fx-background-color: #C0C0C0;");
            Cocinando4.setText("");
            Cocinando4.setStyle("-fx-background-color: #C0C0C0;");
        });

        Button Preparando5 = new Button("Preparando");
        GridPane.setConstraints(Preparando5, 1, 7);
        Preparando5.setStyle("-fx-background-color: #F79400;");
        Button Cocinando5 = new Button("Cocinando");
        GridPane.setConstraints(Cocinando5, 2, 7);
        Cocinando5.setStyle("-fx-background-color: #F3E007;"); 
        Button Terminado5 = new Button("Terminado");
        GridPane.setConstraints(Terminado5, 3, 7);
        Terminado5.setStyle("-fx-background-color: #00F700;");
        Preparando5.setOnAction(e -> {
            Cocinando5.setText("");
            Cocinando5.setStyle("-fx-background-color: #C0C0C0;");
            Terminado5.setText("");
            Terminado5.setStyle("-fx-background-color: #C0C0C0;");
            
        });
        Cocinando5.setOnAction(e -> {
            Preparando5.setText("");
            Preparando5.setStyle("-fx-background-color: #C0C0C0;");
            Terminado5.setText("");
            Terminado5.setStyle("-fx-background-color: #C0C0C0;");
        });
        Terminado5.setOnAction(e -> {
            Preparando5.setText("");
            Preparando5.setStyle("-fx-background-color: #C0C0C0;");
            Cocinando5.setText("");
            Cocinando5.setStyle("-fx-background-color: #C0C0C0;");
        });
        

        Button Preparando6 = new Button("Preparando");
        GridPane.setConstraints(Preparando6, 1, 8);
        Preparando6.setStyle("-fx-background-color: #F79400;");
        Button Cocinando6 = new Button("Cocinando");
        GridPane.setConstraints(Cocinando6, 2, 8);
        Cocinando6.setStyle("-fx-background-color: #F3E007;"); 
        Button Terminado6 = new Button("Terminado");
        GridPane.setConstraints(Terminado6, 3, 8);
        Terminado6.setStyle("-fx-background-color: #00F700;");
        Preparando6.setOnAction(e -> {
            Cocinando6.setText("");
            Cocinando6.setStyle("-fx-background-color: #C0C0C0;");
            Terminado6.setText("");
            Terminado6.setStyle("-fx-background-color: #C0C0C0;");
            
        });
        Cocinando6.setOnAction(e -> {
            Preparando6.setText("");
            Preparando6.setStyle("-fx-background-color: #C0C0C0;");
            Terminado6.setText("");
            Terminado6.setStyle("-fx-background-color: #C0C0C0;");
        });
        Terminado6.setOnAction(e -> {
            Preparando6.setText("");
            Preparando6.setStyle("-fx-background-color: #C0C0C0;");
            Cocinando6.setText("");
            Cocinando6.setStyle("-fx-background-color: #C0C0C0;");
        });
        Button Preparando7 = new Button("Preparando");
        GridPane.setConstraints(Preparando7, 1, 9);
        Preparando7.setStyle("-fx-background-color: #F79400;");
        Button Cocinando7 = new Button("Cocinando");
        GridPane.setConstraints(Cocinando7, 2, 9);
        Cocinando7.setStyle("-fx-background-color: #F3E007;"); 
        Button Terminado7 = new Button("Terminado");
        GridPane.setConstraints(Terminado7, 3, 9);
        Terminado7.setStyle("-fx-background-color: #00F700;");

        Preparando7.setOnAction(e -> {
            Cocinando7.setText("");
            Cocinando7.setStyle("-fx-background-color: #C0C0C0;");
            Terminado7.setText("");
            Terminado7.setStyle("-fx-background-color: #C0C0C0;");
            
        });
        Cocinando7.setOnAction(e -> {
            Preparando7.setText("");
            Preparando7.setStyle("-fx-background-color: #C0C0C0;");
            Terminado7.setText("");
            Terminado7.setStyle("-fx-background-color: #C0C0C0;");
        });
        Terminado7.setOnAction(e -> {
            Preparando7.setText("");
            Preparando7.setStyle("-fx-background-color: #C0C0C0;");
            Cocinando7.setText("");
            Cocinando7.setStyle("-fx-background-color: #C0C0C0;");
        });

        Button Preparando8 = new Button("Preparando");
        GridPane.setConstraints(Preparando8, 1, 10);
        Preparando8.setStyle("-fx-background-color: #F79400;");
        Button Cocinando8 = new Button("Cocinando");
        Cocinando8.setStyle("-fx-background-color: #F3E007;"); 
        GridPane.setConstraints(Cocinando8, 2, 10);
        Button Terminado8 = new Button("Terminado");
        GridPane.setConstraints(Terminado8, 3, 10);
        Terminado8.setStyle("-fx-background-color: #00F700;");

        Preparando8.setOnAction(e -> {
            Cocinando8.setText("");
            Cocinando8.setStyle("-fx-background-color: #C0C0C0;");
            Terminado8.setText("");
            Terminado8.setStyle("-fx-background-color: #C0C0C0;");
            
        });
        Cocinando8.setOnAction(e -> {
            Preparando8.setText("");
            Preparando8.setStyle("-fx-background-color: #C0C0C0;");
            Terminado8.setText("");
            Terminado8.setStyle("-fx-background-color: #C0C0C0;");
        });
        Terminado8.setOnAction(e -> {
            Preparando8.setText("");
            Preparando8.setStyle("-fx-background-color: #C0C0C0;");
            Cocinando8.setText("");
            Cocinando8.setStyle("-fx-background-color: #C0C0C0;");
        });

        Button Preparando9 = new Button("Preparando");
        GridPane.setConstraints(Preparando9, 1, 11);
        Preparando9.setStyle("-fx-background-color: #F79400;");
        Button Cocinando9 = new Button("Cocinando");
        GridPane.setConstraints(Cocinando9, 2, 11);
        Cocinando9.setStyle("-fx-background-color: #F3E007;"); 
        Button Terminado9 = new Button("Terminado");
        GridPane.setConstraints(Terminado9, 3, 11);
        Terminado9.setStyle("-fx-background-color: #00F700;");

        Preparando9.setOnAction(e -> {
            Cocinando9.setText("");
            Cocinando9.setStyle("-fx-background-color: #C0C0C0;");
            Terminado9.setText("");
            Terminado9.setStyle("-fx-background-color: #C0C0C0;");
            
        });
        Cocinando9.setOnAction(e -> {
            Preparando9.setText("");
            Preparando9.setStyle("-fx-background-color: #C0C0C0;");
            Terminado9.setText("");
            Terminado9.setStyle("-fx-background-color: #C0C0C0;");
        });
        Terminado9.setOnAction(e -> {
            Preparando9.setText("");
            Preparando9.setStyle("-fx-background-color: #C0C0C0;");
            Cocinando9.setText("");
            Cocinando9.setStyle("-fx-background-color: #C0C0C0;");
        });

        panel.getChildren().addAll(textoUsuario, Columna1, ColPreparando, ColCocinando, ColTerminado, pedido1, Preparando1, Cocinando1, Terminado1, pedido2, Preparando2, 
        Cocinando2, Terminado2, pedido3, Preparando3, Cocinando3, Terminado3, pedido4, Preparando4, Cocinando4, Terminado4, 
        pedido5, Preparando5, Cocinando5, Terminado5, pedido6, Preparando6, Cocinando6, Terminado6, pedido7, Preparando7, Cocinando7, Terminado7, 
        pedido8, Preparando8, Cocinando8, Terminado8, pedido9, Preparando9, Cocinando9, Terminado9, volver);
        
        Scene tema = new Scene(panel, 900,600);
        ventana.setScene(tema);
        ventana.show();
    }

}