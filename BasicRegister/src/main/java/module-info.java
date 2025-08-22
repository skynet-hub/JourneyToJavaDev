module org.example.basicregister {
    requires javafx.controls;
    requires javafx.fxml;


    opens org.example.basicregister to javafx.fxml;
    exports org.example.basicregister;
}