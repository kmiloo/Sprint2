package Usuario;


import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;
import javafx.util.Callback;
public class MantencionAlimentosGUI{
    
    public static void start(Stage ventana) {
    ventana.setTitle("Mantencion de alimentos");
     
    // Espacios para datos (filas)
    ObservableList <TablaCaducidad> data = FXCollections.observableArrayList(
    new TablaCaducidad("", null),
    new TablaCaducidad("", null),
    new TablaCaducidad("", null),
    new TablaCaducidad("", null),
    new TablaCaducidad("", null),
    new TablaCaducidad("", null),
    new TablaCaducidad("", null),
    new TablaCaducidad("", null),
    new TablaCaducidad("", null),
    new TablaCaducidad("", null),
    new TablaCaducidad("", null),
    new TablaCaducidad("", null),
    new TablaCaducidad("", null),
    new TablaCaducidad("", null),
    new TablaCaducidad("", null),
    new TablaCaducidad("", null),
    new TablaCaducidad("", null),
    new TablaCaducidad("", null),
    new TablaCaducidad("", null),
    new TablaCaducidad("", null),
    new TablaCaducidad("", null),
    new TablaCaducidad("", null),
    new TablaCaducidad("", null),
    new TablaCaducidad("", null),
    new TablaCaducidad("", null),
    new TablaCaducidad("", null),
    new TablaCaducidad("", null),
    new TablaCaducidad("", null),
    new TablaCaducidad("", null),
    new TablaCaducidad("", null),
    new TablaCaducidad("", null),
    new TablaCaducidad("", null),
    new TablaCaducidad("", null)     
    );

    TableView<TablaCaducidad> tableView = new TableView<>(data);
    
    // Columna de los alimentos
    TableColumn<TablaCaducidad, String> AlimentoColumn = new TableColumn<>("Alimento");
    AlimentoColumn.setCellValueFactory(new Callback<TableColumn.CellDataFeatures<TablaCaducidad,
    String>, ObservableValue<String>>() {
        @Override
        public ObservableValue<String> call(TableColumn.CellDataFeatures<TablaCaducidad, String>param) {
            return param.getValue().alimentoProperty();
        }
    });
    AlimentoColumn.setMinWidth(320);
    
    // Columna para las fechas
    TableColumn<TablaCaducidad, String> FechasColumn = new TableColumn<>("Fecha");
    FechasColumn.setCellValueFactory(new Callback<TableColumn.CellDataFeatures<TablaCaducidad,String>, ObservableValue<String>>() {
        @Override
        public ObservableValue<String> call(TableColumn.CellDataFeatures<TablaCaducidad, String>param) {
        return param.getValue().fechaProperty();
        }
    });
    FechasColumn.setMinWidth(320);
    
    // Poner las columnas y filas en la tabla
    tableView.getColumns().addAll(AlimentoColumn, FechasColumn);
    TextField alimento = new TextField();
    TextField fecha = new TextField();
    
    // Eventos
    Button guardarCambios = new Button("Guardar cambios");
    Button volver = new Button("Volver el menu");

    volver.setOnAction(e -> {
        Trabajador.TrabajStart(ventana);

    });
    Reserva al = new Reserva();
    try {
        al.CrearArchivoAl();
    } catch (IOException e2) {
        // TODO Auto-generated catch block
        e2.printStackTrace();
    }
    guardarCambios.setOnAction(e -> {
        TablaCaducidad p = tableView.getSelectionModel().getSelectedItem();
        p.setAlimento(alimento.getText());
        p.setfecha(fecha.getText());
        try {
            
            al.guardarAlimentos(alimento.getText(), fecha.getText());
            
        } catch (IOException e1) {
            // TODO Auto-generated catch block
            e1.printStackTrace();
        }
        
    });

    // Guardar los datos de los textfield en la tabla
    tableView.getSelectionModel().selectedItemProperty().addListener(new ChangeListener<TablaCaducidad>(){
        @Override
        public void changed(ObservableValue<? extends TablaCaducidad> observable, TablaCaducidad anterior,TablaCaducidad nuevosDatos) {
            guardarCambios.setDisable(nuevosDatos == null);
            if (nuevosDatos != null) {
                alimento.setText(nuevosDatos.getAlimento());
                fecha.setText(nuevosDatos.getfecha());
            }
        }
    });

    // HBox, VBox y escenas
    HBox cambios = new HBox(5, new Label("Alimento:"), alimento, new Label("Fecha: "), fecha,guardarCambios);
    VBox tabla = new VBox(10, tableView, cambios, volver);
    Scene scene = new Scene(tabla);
    ventana.setScene(scene);
    ventana.show();
    
    }

    
    
    
}


