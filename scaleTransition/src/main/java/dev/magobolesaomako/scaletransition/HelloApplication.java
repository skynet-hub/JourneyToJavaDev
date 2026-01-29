package dev.magobolesaomako.scaletransition;

import javafx.animation.ScaleTransition;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.StackPane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;
import javafx.util.Duration;

import java.io.IOException;

public class HelloApplication extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        // Create a node to scale
        Rectangle recty = new Rectangle(100, 100, Color.BLUE);

        ScaleTransition scaleTransition = new ScaleTransition();
        scaleTransition.setDuration(Duration.seconds(2));
        scaleTransition.setNode(recty);
        scaleTransition.setByX(2);
        scaleTransition.setByY(2);
        scaleTransition.setCycleCount(ScaleTransition.INDEFINITE);
        scaleTransition.isAutoReverse();
//        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("hello-view.fxml"));
        StackPane root = new StackPane(recty);
        Scene scene = new Scene(root, 400, 500);
        stage.setTitle("Scaling Recty");
        stage.setScene(scene);
        stage.show();

        //Play the animation
        scaleTransition.play();
    }
}
