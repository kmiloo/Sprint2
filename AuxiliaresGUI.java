package Usuario;

import java.io.IOException;

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

public class AuxiliaresGUI{
    public static void auxStart(Stage ventana) {


        ventana.setTitle("Auxiliares de Aseo");

        ObservableList<TablaAuxiliares> data = FXCollections.observableArrayList(
                new TablaAuxiliares(""),
                new TablaAuxiliares(""),
                new TablaAuxiliares(""),
                new TablaAuxiliares(""),
                new TablaAuxiliares(""),
                new TablaAuxiliares(""),
                new TablaAuxiliares(""),
                new TablaAuxiliares(""),
                new TablaAuxiliares(""),
                new TablaAuxiliares(""),
                new TablaAuxiliares(""),
                new TablaAuxiliares(""),
                new TablaAuxiliares(""));

        TableView<TablaAuxiliares> tableView = new TableView<>(data);

        TableColumn<TablaAuxiliares, String> AreaColumn = new TableColumn<>("Area/zona donde la limpieza es requerida");
        AreaColumn.setCellValueFactory(
                new Callback<TableColumn.CellDataFeatures<TablaAuxiliares, String>, ObservableValue<String>>() {
                    @Override
                    public ObservableValue<String> call(TableColumn.CellDataFeatures<TablaAuxiliares, String> param) {
                        return param.getValue().areaProperty();
                    }
                });
        AreaColumn.setMinWidth(320);

        tableView.getColumns().addAll(AreaColumn);
        TextField area = new TextField();

        // Eventos

        Button guardarCambios = new Button("Guardar cambios");
        Button volver = new Button("Volver el menu");

        volver.setOnAction(e -> {
            Trabajador.TrabajStart(ventana);
        });
        Reserva res = new Reserva();
        try {
            res.CrearArchivoAuxZona();
        } catch (IOException e2) {
            // TODO Auto-generated catch block
            e2.printStackTrace();
        }
        guardarCambios.setOnAction(e -> {
            TablaAuxiliares p = tableView.getSelectionModel().getSelectedItem();
            p.setArea(area.getText());
            try {
                res.guardarauxServ(area.getText());
            } catch (IOException e1) {
                // TODO Auto-generated catch block
                e1.printStackTrace();
            }
        });
        

        

        // Guardar datos
        tableView.getSelectionModel().selectedItemProperty().addListener(new ChangeListener<TablaAuxiliares>() {
            @Override
            public void changed(ObservableValue<? extends TablaAuxiliares> observable, TablaAuxiliares anterior,
                    TablaAuxiliares nuevosDatos) {
                guardarCambios.setDisable(nuevosDatos == null);
                if (nuevosDatos != null) {
                    area.setText(nuevosDatos.getArea());
                }
            }
        });

        // HBox, VBox y escenas
        HBox cambios = new HBox(5, new Label("Area: "), area, guardarCambios);
        VBox tabla = new VBox(10, tableView, cambios, volver);
        Scene scene = new Scene(tabla);
        ventana.setScene(scene);
        ventana.show();
    }

  
}
