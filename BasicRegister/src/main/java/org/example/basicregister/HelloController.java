package org.example.basicregister;

import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.Button;
import javafx.scene.control.ButtonType;
import javafx.scene.control.TextField;
import javafx.stage.Stage;
import java.util.Optional;

public class HelloController {

    @FXML
    private TextField firstNameField;

    @FXML
    private TextField lastNameField;

    @FXML
    private TextField emailField;

    @FXML
    private Button submitButton;

    @FXML
    private Button cancelButton;

    @FXML
    public void initialize() {
        submitButton.setOnAction(event -> handleSubmit());
        cancelButton.setOnAction(event -> handleCancel());
    }

    private void handleSubmit() {
        if (firstNameField.getText().isEmpty() || lastNameField.getText().isEmpty() || emailField.getText().isEmpty()) {
            // COMPLETE THIS: Show an alert if the form is incomplete
            Alert alert = new Alert(AlertType.ERROR);
            alert.setHeaderText("Incomplete");
            alert.setContentText("    Form Incomplete\n" +
                    "    Please fill in all fields.");
            alert.showAndWait();
        } else {
            // COMPLETE THIS: Show a confirmation dialog
            showConfirmationDialog();
            //Clear the fields once data has been confirmed
            firstNameField.clear();
            lastNameField.clear();
            emailField.clear();
        }
    }

    private void handleCancel() {
        Stage stage = (Stage) cancelButton.getScene().getWindow();
        stage.close();
    }

    private void showConfirmationDialog() {
        // COMPLETE THIS: Implement the confirmation dialog logic
        String firstName = firstNameField.getText();
        String lastName = lastNameField.getText();
        String email = emailField.getText();
        Alert alert = new Alert(AlertType.CONFIRMATION);
        alert.setHeaderText("Confirm your details!");
        alert.setContentText("Confirm Submission" + "\n" +
                "Please confirm your details:" + "\n" +
                "First Name: " + firstName + "\n" +
                "Last Name: " +  lastName + "\n" +
                "Email: " + email
        );
        alert.showAndWait();
    }
}