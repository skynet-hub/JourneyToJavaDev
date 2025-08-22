package dev.magobolesaomako.shapes;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;

import java.io.IOException;

public class HelloApplication extends Application {
    @Override
    public void start(Stage stage) {
        Pane root = new Pane();
        Rectangle rect = new Rectangle();
        rect.setX(50);
        rect.setY(50);
        rect.setWidth(100);
        rect.setHeight(60);
        rect.setFill(Color.GREEN);

        Circle circ = new Circle();
        circ.setCenterX(200);
        circ.setCenterY(200);
        circ.setRadius(20);
        circ.setStroke(Color.BLUE);
        circ.setStrokeWidth(3);
        circ.setFill(Color.WHITE);

        root.getChildren().addAll(rect, circ);
        Scene scene = new Scene(root, 300, 400);
        stage.setScene(scene);
        stage.setTitle("Shapes!");
        stage.show();
    }
}
