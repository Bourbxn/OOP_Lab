module com.javafx.lab09_1 {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.javafx.lab09_1 to javafx.fxml;
    exports com.javafx.lab09_1;
}