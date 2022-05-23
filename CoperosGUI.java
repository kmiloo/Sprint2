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

public class CoperosGUI{
    public static void coperosStart(Stage ventana) {
        ventana.setTitle("Coperos");

        ObservableList<TablaInventario> data = FXCollections.observableArrayList(
                new TablaInventario("", "", "", "", null),
                new TablaInventario("", "", "", "", null),
                new TablaInventario("", "", "", "", null),
                new TablaInventario("", "", "", "", null),
                new TablaInventario("", "", "", "", null),
                new TablaInventario("", "", "", "", null),
                new TablaInventario("", "", "", "", null),
                new TablaInventario("", "", "", "", null),
                new TablaInventario("", "", "", "", null),
                new TablaInventario("", "", "", "", null),
                new TablaInventario("", "", "", "", null),
                new TablaInventario("", "", "", "", null),
                new TablaInventario("", "", "", "", null),
                new TablaInventario("", "", "", "", null),
                new TablaInventario("", "", "", "", null),
                new TablaInventario("", "", "", "", null),
                new TablaInventario("", "", "", "", null),
                new TablaInventario("", "", "", "", null),
                new TablaInventario("", "", "", "", null),
                new TablaInventario("", "", "", "", null),
                new TablaInventario("", "", "", "", null),
                new TablaInventario("", "", "", "", null),
                new TablaInventario("", "", "", "", null),
                new TablaInventario("", "", "", "", null),
                new TablaInventario("", "", "", "", null),
                new TablaInventario("", "", "", "", null));
        TableView<TablaInventario> tableView = new TableView<>(data);

        // Columna N° Platos
        TableColumn<TablaInventario, String> PlatosColumn = new TableColumn<>("N° Platos");
        PlatosColumn.setCellValueFactory(
                new Callback<TableColumn.CellDataFeatures<TablaInventario, String>, ObservableValue<String>>() {
                    @Override
                    public ObservableValue<String> call(TableColumn.CellDataFeatures<TablaInventario, String> param) {
                        return param.getValue().platosProperty();
                    }
                });
        PlatosColumn.setMinWidth(320);

        // Columna N° Cubiertos

        TableColumn<TablaInventario, String> CubiertosColumn = new TableColumn<>("N° Cubiertos");
        CubiertosColumn.setCellValueFactory(
                new Callback<TableColumn.CellDataFeatures<TablaInventario, String>, ObservableValue<String>>() {
                    @Override
                    public ObservableValue<String> call(TableColumn.CellDataFeatures<TablaInventario, String> param) {
                        return param.getValue().cubiertosProperty();
                    }
                });
        CubiertosColumn.setMinWidth(320);

        // Columna N° Tazas

        TableColumn<TablaInventario, String> TazasColumn = new TableColumn<>("N° Tazas");
        TazasColumn.setCellValueFactory(
                new Callback<TableColumn.CellDataFeatures<TablaInventario, String>, ObservableValue<String>>() {
                    @Override
                    public ObservableValue<String> call(TableColumn.CellDataFeatures<TablaInventario, String> param) {
                        return param.getValue().tazasProperty();
                    }
                });
        TazasColumn.setMinWidth(320);

        // Columna N° Vasos
        TableColumn<TablaInventario, String> VasosColumn = new TableColumn<>("N° Vasos");
        VasosColumn.setCellValueFactory(
                new Callback<TableColumn.CellDataFeatures<TablaInventario, String>, ObservableValue<String>>() {
                    @Override
                    public ObservableValue<String> call(TableColumn.CellDataFeatures<TablaInventario, String> param) {
                        return param.getValue().vasosProperty();
                    }
                });
        VasosColumn.setMinWidth(320);

        // Columna N° Extras

        TableColumn<TablaInventario, String> ExtrasColumn = new TableColumn<>("N° Extras");
        ExtrasColumn.setCellValueFactory(
                new Callback<TableColumn.CellDataFeatures<TablaInventario, String>, ObservableValue<String>>() {
                    @Override
                    public ObservableValue<String> call(TableColumn.CellDataFeatures<TablaInventario, String> param) {
                        return param.getValue().extrasProperty();
                    }
                });
        ExtrasColumn.setMinWidth(320);

        // Colocar las columnas y filas en la tabla

        tableView.getColumns().addAll(PlatosColumn, CubiertosColumn, TazasColumn, VasosColumn, ExtrasColumn);
        TextField plato = new TextField();
        TextField cubierto = new TextField();
        TextField taza = new TextField();
        TextField vaso = new TextField();
        TextField extra = new TextField();

        // Eventos

        Button guardarCambios = new Button("Guardar cambios");
        Button volver = new Button("Volver el menu");
        volver.setOnAction(e -> {
            Trabajador.TrabajStart(ventana);
        });
        Reserva res = new Reserva();
        try {
            res.CrearArchivoCoper();
        } catch (IOException e1) {
            // TODO Auto-generated catch block
            e1.printStackTrace();
        }
        guardarCambios.setOnAction(e -> {
            TablaInventario p = tableView.getSelectionModel().getSelectedItem();
            p.setPlato(plato.getText());
            p.setCubierto(cubierto.getText());
            p.setTaza(taza.getText());
            p.setVaso(vaso.getText());
            p.setExtra(extra.getText());
            try {
                res.guardarCoperos(plato.getText(), cubierto.getText(), taza.getText(), vaso.getText(), extra.getText());
            } catch (IOException e1) {
                // TODO Auto-generated catch block
                e1.printStackTrace();
            }
        });
        

        // Guardar los datos de la textfield en la tabla

        tableView.getSelectionModel().selectedItemProperty().addListener(new ChangeListener<TablaInventario>() {
            @Override
            public void changed(ObservableValue<? extends TablaInventario> observable, TablaInventario anterior,
                    TablaInventario nuevosDatos) {
                guardarCambios.setDisable(nuevosDatos == null);
                if (nuevosDatos != null) {
                    plato.setText(nuevosDatos.getPlato());
                    cubierto.setText(nuevosDatos.getCubierto());
                    taza.setText(nuevosDatos.getTaza());
                    vaso.setText(nuevosDatos.getVaso());
                    extra.setText(nuevosDatos.getExtra());
                }
            }
        });
        // HBox, VBox y escenas
        HBox cambios = new HBox(5, new Label("N° Platos: "), plato, new Label("N° Cubiertos: "), cubierto,
                new Label("N° Tazas: "), taza, new Label("N° Vasos: "), vaso, new Label("N° Extras: "), extra,
                guardarCambios);
        VBox tabla = new VBox(10, tableView, cambios, volver);
        Scene scene = new Scene(tabla);
        ventana.setScene(scene);
        ventana.show();

    }
}
