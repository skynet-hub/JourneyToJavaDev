package dev.magobolesaomako.keyevents;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.input.KeyEvent;

import static javafx.scene.input.KeyCode.UP;

public class HelloController {
    @FXML
    private Label welcomeText;

    @FXML
    protected void onHelloButtonClick() {
        welcomeText.setText("Welcome to JavaFX Application!");
    }

    public void onKeyPress(KeyEvent event){
        switch (event.getCode()){
            case UP:
                System.out.println("Up key has been pressed");
                break;
            default:
                System.out.println("This key has not been handled");
        }

    }
}
