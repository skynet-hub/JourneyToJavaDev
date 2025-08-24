package dev.magobolesaomako.mouseevents;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.input.KeyEvent;
import javafx.scene.input.MouseEvent;

public class HelloController {
    @FXML
    private Label ycord;
    @FXML
    private Label welcomeText;
    @FXML
    private Label xcord;


    @FXML
    protected void onHelloButtonClick() {
        welcomeText.setText("Welcome to JavaFX Application!");
    }

    @FXML
    public void onMouseMove(MouseEvent event){
        double x_cord = event.getX();
        double y_cord = event.getY();

        xcord.setText("Xcord: " + x_cord);
        ycord.setText("Ycord: " + y_cord);
    }
}
