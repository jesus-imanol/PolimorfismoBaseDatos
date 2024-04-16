module com.jesuscast.polimorfismo {
    requires javafx.controls;
    requires javafx.fxml;

    requires net.synedra.validatorfx;
    requires org.kordamp.bootstrapfx.core;

    opens com.jesuscast.polimorfismo to javafx.fxml;
    exports com.jesuscast.polimorfismo;
    exports com.jesuscast.polimorfismo.controllers;
    opens com.jesuscast.polimorfismo.controllers to javafx.fxml;
    exports com.jesuscast.polimorfismo.models;
    opens com.jesuscast.polimorfismo.models to javafx.fxml;
}