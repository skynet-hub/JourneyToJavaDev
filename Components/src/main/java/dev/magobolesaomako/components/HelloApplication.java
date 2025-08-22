package dev.magobolesaomako.components;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

import javax.swing.*;
import java.io.IOException;

public class HelloApplication extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        VBox box = new VBox();
        box.setAlignment(Pos.CENTER);
        Button button = new Button("Click Me");
        Label label = new Label("");
        box.getChildren().addAll(label, button);
        StackPane root = new StackPane(box);
        Scene scene = new Scene(root, 300, 400);
        stage.setScene(scene);
        stage.setTitle("My World!");
        stage.show();

        //Let us work on some functionality
        button.setOnAction(actionEvent -> label.setText("Hello word"));
    }
}
