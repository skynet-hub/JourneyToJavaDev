module org.example.gpane {
    requires javafx.controls;
    requires javafx.fxml;


    opens org.example.gpane to javafx.fxml;
    exports org.example.gpane;
}