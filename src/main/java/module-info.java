module org.example.lab3 {
    requires javafx.controls;
    requires javafx.fxml;


    opens org.example.lab3 to javafx.fxml;
    exports org.example.lab3;
    exports org.example.lab3.Controller;
    opens org.example.lab3.Controller to javafx.fxml;
    exports org.example.lab3.Factories;
    opens org.example.lab3.Factories to javafx.fxml;
}