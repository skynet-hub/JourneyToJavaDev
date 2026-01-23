package dev.magobolesaomako.translatetransitiondemo;

import javafx.animation.TranslateTransition;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.shape.Circle;
import javafx.util.Duration;

public class TranslateTransitionController {
   @FXML
    private Circle myCircle;

   @FXML
    private Button button;

   private TranslateTransition initialRightTransition;
   private TranslateTransition leftTransition;
   private TranslateTransition rightTransition;
   private boolean isAnimating;
   private boolean isInitialAnimationDone;

   public void initialize(){
       initialRightTransition = new TranslateTransition();
       initialRightTransition.setNode(myCircle);
       initialRightTransition.setDuration(Duration.seconds(2));
       initialRightTransition.setToX(150);

       leftTransition = new TranslateTransition();
       rightTransition = new TranslateTransition();

       leftTransition.setNode(myCircle);
       rightTransition.setNode(myCircle);
       leftTransition.setDuration(Duration.seconds(2));
       leftTransition.setToX(-150);
       rightTransition.setDuration(Duration.seconds(2));
       rightTransition.setToX(150);

       initialRightTransition.setOnFinished(
               event -> {
                   isInitialAnimationDone = true;
                   leftTransition.play();
               }
       );

       leftTransition.setOnFinished(
               event -> {
                   rightTransition.play();
               }
       );

       rightTransition.setOnFinished(
               event -> {
                   leftTransition.play();
               }
       );

       button.setOnAction(
               event -> {
                   if (!isAnimating){
                       startAnimation();
                   } else {
                       stopAnimation();
                   }
               }
       );

   }

    private void startAnimation(){
       if (isAnimating) return;
       initialRightTransition.play();
       isAnimating = true;
       button.setText("Stop");
    }

    private void stopAnimation(){
        if (isInitialAnimationDone){
            leftTransition.stop();
            rightTransition.stop();
        } else {
            initialRightTransition.stop();
        }
        isAnimating = false;
        button.setText("Animate!");
    }
}
