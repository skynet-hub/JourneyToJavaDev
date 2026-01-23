package dev.magobolesaomako.fadetransitiondemo;

import javafx.animation.FadeTransition;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.util.Duration;

public class FadeTranslationController {

    @FXML
    private Label welcomeText;

    private boolean isVisible = false;

    @FXML
    private void initialize(){
        welcomeText.setText("");
        welcomeText.setOpacity(0.0);
    }

    public void onButtonClick(){
        System.out.println("Button clicked");

        FadeTransition fadeTransition = new FadeTransition(Duration.seconds(1), welcomeText);

        if(isVisible){
            fadeTransition.setFromValue(1.0);
            fadeTransition.setToValue(0.0);
        } else {
            welcomeText.setText("Hello, JavaFx!");
            fadeTransition.setFromValue(0.0);
            fadeTransition.setToValue(1.0);
        }

        fadeTransition.play();
        isVisible = !isVisible;

        if(!isVisible){
            fadeTransition.setOnFinished( event -> {
                welcomeText.setText("");
            });
        }
    }
}
