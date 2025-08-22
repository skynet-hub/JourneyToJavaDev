package org.example.learnjavafx;

import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.Label;

public class HelloController {
    @FXML
    private Label welcomeText;

    @FXML
    protected void onHelloButtonClick() {
        welcomeText.setText("Welcome to JavaFX Application!");
    }

    @FXML
    protected void onHelloButtonEntered(){
        Alert alert = new Alert(Alert.AlertType.INFORMATION);
        alert.setTitle("This is an alert");
        alert.setHeaderText("Some Header Text");
        alert.setContentText("What are you doing?");
        alert.showAndWait();
    }
}
