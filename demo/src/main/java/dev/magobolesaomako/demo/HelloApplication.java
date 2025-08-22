package dev.magobolesaomako.demo;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

import java.io.IOException;

public class HelloApplication extends Application {
    @Override
    public void start(Stage stage) throws IOException {

        Label label = new Label();
        label.setText("Hello David!");
        StackPane pane = new StackPane(label);
        Scene scene = new Scene(pane, 300, 400);
        stage.setScene(scene);
        stage.show();
    }
}
