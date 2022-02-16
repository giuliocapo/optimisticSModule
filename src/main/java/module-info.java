module com.example.optimistics {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.optimistics to javafx.fxml;
    exports com.example.optimistics;
}