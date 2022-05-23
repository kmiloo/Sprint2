package Usuario;

import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;

// Constructor
public class TablaCaducidad {
    public TablaCaducidad(String alimento, String fecha) {
        this.fecha = new SimpleStringProperty(this, "fecha", fecha);
        this.alimento = new SimpleStringProperty(this, "alimento", alimento);
    }

    private final StringProperty alimento;
    private final StringProperty fecha;

    // Getter, setter y property de alimento
    public final String getAlimento(){
        return this.alimento.get();
    }

    public final void setAlimento(String value) {
        this.alimento.set(value);
    }

    public final StringProperty alimentoProperty() {
        return this.alimento;
    }

    // getter, setter y property de fecha
    public final String getfecha() {
        return this.fecha.get();
    }

    public final void setfecha(String value) {
        this.fecha.set(value);
    }

    public final StringProperty fechaProperty() {
        return this.fecha;
    }
}

