module com.mycompany.javafxmaven {
    requires javafx.controls;
    requires javafx.fxml;

    opens com.mycompany.javafxmaven to javafx.fxml;
    exports com.mycompany.javafxmaven;
}
