package Usuario;

import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;

public class TablaMetre {
    public TablaMetre(String mesa, String capacidad) {
        this.mesa = new SimpleStringProperty(this, "mesa", mesa);
        this.capacidad = new SimpleStringProperty(this, "capacidad", capacidad);
    }

    private final StringProperty mesa;
    private final StringProperty capacidad;

    public final String getMesa() {
        return this.mesa.get();
    }

    public final void setMesa(String value) {
        this.mesa.set(value);
    }

    public final StringProperty mesaProperty() {
        return this.mesa;
    }

    public final String getCapacidad() {
        return this.capacidad.get();
    }

    public final void setCapacidad(String value) {
        this.capacidad.set(value);
    }

    public final StringProperty capacidadProperty() {
        return this.capacidad;
    }
}
