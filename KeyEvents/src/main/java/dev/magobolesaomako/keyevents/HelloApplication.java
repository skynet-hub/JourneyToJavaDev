package dev.magobolesaomako.keyevents;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.input.KeyEvent;
import javafx.stage.Stage;

import java.io.IOException;

public class HelloApplication extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("hello-view.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 320, 240);
        scene.setOnKeyPressed(keyEvent -> {
            HelloController controller = new HelloController();
            controller.onKeyPress(keyEvent);
        });
        stage.setTitle("Hello!");
        stage.setScene(scene);
        stage.show();
    }
}
