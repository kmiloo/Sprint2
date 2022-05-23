package Usuario;

import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;

public class TablaInventario {
    public TablaInventario(String plato, String cubierto, String taza, String vaso, String extra) {
        this.plato = new SimpleStringProperty(this, "plato", plato);
        this.cubierto = new SimpleStringProperty(this, "cubierto", cubierto);
        this.taza = new SimpleStringProperty(this, "taza", taza);
        this.vaso = new SimpleStringProperty(this, "vaso", vaso);
        this.extra = new SimpleStringProperty(this, "extra", extra);
    }

    private final StringProperty plato;
    private final StringProperty cubierto;
    private final StringProperty taza;
    private final StringProperty vaso;
    private final StringProperty extra;

    public final String getPlato() {
        return this.plato.get();
    }

    public final void setPlato(String value) {
        this.plato.set(value);
    }

    public final StringProperty platosProperty() {
        return this.plato;
    }

    public final String getCubierto() {
        return this.cubierto.get();
    }

    public final void setCubierto(String value) {
        this.cubierto.set(value);
    }

    public final StringProperty cubiertosProperty() {
        return this.cubierto;
    }

    public final String getTaza() {
        return this.taza.get();
    }

    public final void setTaza(String value) {
        this.taza.set(value);
    }

    public final StringProperty tazasProperty() {
        return this.taza;
    }

    public final String getVaso() {
        return this.vaso.get();
    }

    public final void setVaso(String value) {
        this.vaso.set(value);
    }

    public final StringProperty vasosProperty() {
        return this.vaso;
    }

    public final String getExtra() {
        return this.extra.get();
    }

    public final void setExtra(String value) {
        this.extra.set(value);
    }

    public final StringProperty extrasProperty() {
        return this.extra;
    }

}
