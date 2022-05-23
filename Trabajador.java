package Usuario;


import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.*;
import javafx.geometry.*;
import javafx.stage.Stage;

public class Trabajador{
    

    public static void TrabajStart(Stage ventana){
        
        ventana.setTitle("Administracion - Restaurante");
        Image icono = new Image("Usuario/img/LOGOULA.png");
        ventana.getIcons().add(icono);
        
        GridPane panel = new GridPane();
        panel.setPadding(new Insets(10,10,10,10));
        panel.setVgap(3);
        panel.setHgap(3);
        panel.setStyle("-fx-background-color: #C0C0C0;");


        Label textoUsuario = new Label("Complejo turistico reloncavi");
        textoUsuario.setStyle("-fx-font-size: 30px; -fx-font-family: 'Segoe UI Semibold';");
        GridPane.setConstraints(textoUsuario, 2, 0);
        Image imagen = new Image("Usuario/img/LOGOULA.png");
        ImageView logoULAGOS = new ImageView(imagen);
        GridPane.setConstraints(logoULAGOS, 0, 0);



        Button metre = new Button("Metre");
        Button coperos = new Button("Coperos");
        Button runner = new Button("Runner");
        Button mantencionAlimentos = new Button("Mantencion alimentos");
        Button AuxAseo = new Button("Auxiliar de aseo");
        Button Cocinero_chef = new Button("Cocinero/Chef");
        Button Anfitrion = new Button("Anfitrion");
        Button Barman = new Button("Barman/woman");

        metre.setPadding(new Insets(10, 42, 10, 42));
        coperos.setPadding(new Insets(10, 30, 10, 30));
        mantencionAlimentos.setPadding(new Insets(10, 10, 10, 10));
        AuxAseo.setPadding(new Insets(10, 10, 10, 10));
        Cocinero_chef.setPadding(new Insets(10, 10, 10, 10));
        runner.setPadding(new Insets(10, 15, 10, 15));
        Anfitrion.setPadding(new Insets(10, 10, 10, 10));
        Barman.setPadding(new Insets(10, 32, 10, 32));
        
        GridPane.setConstraints(metre, 0, 2);
        GridPane.setConstraints(coperos, 1, 2);
        GridPane.setConstraints(runner, 2, 2);
        GridPane.setConstraints(mantencionAlimentos, 3, 2);
        GridPane.setConstraints(AuxAseo, 0, 3);
        GridPane.setConstraints(Cocinero_chef, 1, 3);
        GridPane.setConstraints(Anfitrion, 2, 3);
        GridPane.setConstraints(Barman, 3, 3);
        metre.setOnAction(e -> {
            MetreGUI.start(ventana);
        });
        coperos.setOnAction(e -> {
            CoperosGUI.coperosStart(ventana);
            
        });
        runner.setOnAction(e -> {
            RunnerGUI.start(ventana);
            
        });
        mantencionAlimentos.setOnAction(e -> {
            MantencionAlimentosGUI.start(ventana);
            
        });
        AuxAseo.setOnAction(e -> {
            AuxiliaresGUI.auxStart(ventana);
        });
        Cocinero_chef.setOnAction(e -> {
            CocinerosGUI.start(ventana);
            
        });
        Anfitrion.setOnAction(e -> {
            AnfitrionGUI.start(ventana);

        });
        Barman.setOnAction(e -> {
            BarmanGUI.start(ventana);
            
        });
        

        //,logoULAGOS
        panel.getChildren().addAll(textoUsuario,metre, coperos, runner, mantencionAlimentos, AuxAseo, Cocinero_chef, Anfitrion, Barman,logoULAGOS);
        
        
        Scene tema = new Scene(panel, 900,600);
        ventana.setScene(tema);
        ventana.show();
    }

}