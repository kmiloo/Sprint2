package Usuario;

import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;

public class TablaAuxiliares {
    public TablaAuxiliares(String area) {
        this.area = new SimpleStringProperty(this, "area", area);
    }

    private final StringProperty area;

    public final String getArea() {
        return this.area.get();
    }

    public final void setArea(String value) {
        this.area.set(value);
    }

    public final StringProperty areaProperty() {
        return this.area;
    }

}
