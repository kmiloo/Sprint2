package Usuario;

import java.io.IOException;

import Restaurant.reserva;
import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
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

public class MetreGUI{

    
    public static void start(Stage ventana) {
        ventana.setTitle("Metre");

        ObservableList<TablaMetre> data = FXCollections.observableArrayList(
                new TablaMetre("", ""),
                new TablaMetre("", ""),
                new TablaMetre("", ""),
                new TablaMetre("", ""),
                new TablaMetre("", ""),
                new TablaMetre("", ""),
                new TablaMetre("", ""),
                new TablaMetre("", ""),
                new TablaMetre("", ""),
                new TablaMetre("", ""),
                new TablaMetre("", ""),
                new TablaMetre("", ""),
                new TablaMetre("", ""),
                new TablaMetre("", ""));

        TableView<TablaMetre> tableView = new TableView<>(data);

        TableColumn<TablaMetre, String> MesasColumn = new TableColumn<>("N° Mesa");
        MesasColumn.setCellValueFactory(
                new Callback<TableColumn.CellDataFeatures<TablaMetre, String>, ObservableValue<String>>() {
                    @Override
                    public ObservableValue<String> call(TableColumn.CellDataFeatures<TablaMetre, String> param) {
                        return param.getValue().mesaProperty();
                    }
                });
        MesasColumn.setMinWidth(320);

        TableColumn<TablaMetre, String> CapacidadColumn = new TableColumn<>("Capacidad");
        CapacidadColumn.setCellValueFactory(
                new Callback<TableColumn.CellDataFeatures<TablaMetre, String>, ObservableValue<String>>() {
                    @Override
                    public ObservableValue<String> call(TableColumn.CellDataFeatures<TablaMetre, String> param) {
                        return param.getValue().capacidadProperty();
                    }
                });
        CapacidadColumn.setMinWidth(320);

        tableView.getColumns().addAll(MesasColumn, CapacidadColumn);
        TextField mesa = new TextField();
        TextField capacidad = new TextField();

        // Eventos

        Button guardarCambios = new Button("Guardar cambios");
        Button volver = new Button("Volver el menu");
        volver.setOnAction(e -> {
            Trabajador.TrabajStart(ventana);
        });
        Reserva res = new Reserva();
        try {
            res.CrearArchivoMetre();
        } catch (IOException e1) {
            // TODO Auto-generated catch block
            e1.printStackTrace();
        }
        guardarCambios.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                TablaMetre p = tableView.getSelectionModel().getSelectedItem();
                p.setMesa(mesa.getText());
                p.setCapacidad(capacidad.getText());
                try {
                    res.guardarMetre(mesa.getText(), capacidad.getText());
                } catch (IOException e) {
                    // TODO Auto-generated catch block
                    e.printStackTrace();
                }
            }
        });

        tableView.getSelectionModel().selectedItemProperty().addListener(new ChangeListener<TablaMetre>() {
            @Override
            public void changed(ObservableValue<? extends TablaMetre> observable, TablaMetre anterior,
                    TablaMetre nuevosDatos) {
                guardarCambios.setDisable(nuevosDatos == null);
                if (nuevosDatos != null) {
                    mesa.setText(nuevosDatos.getMesa());
                    capacidad.setText(nuevosDatos.getCapacidad());
                }
            }
        });

        // HBox, VBox y escenas
        HBox cambios = new HBox(5, new Label("N° Mesa: "), mesa, new Label("Capacidad: "), capacidad, guardarCambios);
        VBox tabla = new VBox(10, tableView, cambios, volver);
        Scene scene = new Scene(tabla);
        ventana.setScene(scene);
        ventana.show();
    }

}
