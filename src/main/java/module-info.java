module com.example.hw_22_java {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.hw_22_java to javafx.fxml;
    exports com.example.hw_22_java;
}