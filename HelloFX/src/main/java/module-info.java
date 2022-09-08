module com.example.hellofx {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.controlsfx.controls;
    requires org.kordamp.bootstrapfx.core;
    requires java.sql;

    opens com.example.hellofx to javafx.fxml;
    exports com.example.hellofx;
}