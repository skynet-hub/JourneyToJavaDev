package dev.magobolesaomako.rotatetransition;

import javafx.animation.RotateTransition;
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
        Rectangle rectangle = new Rectangle(100, 100, Color.BLUE);
        RotateTransition rotateTransition = new RotateTransition();
        rotateTransition.setDuration(Duration.seconds(3));
        rotateTransition.setNode(rectangle);
        rotateTransition.setByAngle(360);
        rotateTransition.setCycleCount(RotateTransition.INDEFINITE);
        rotateTransition.setAutoReverse(true);


        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("hello-view.fxml"));
        StackPane root = new StackPane();
        root.getChildren().add(rectangle);
        Scene scene = new Scene(root, 300, 400);
        stage.setTitle("Rotate Transition");
        stage.setScene(scene);
        stage.show();

        // Where I start rotating
        rotateTransition.play();
    }
}
