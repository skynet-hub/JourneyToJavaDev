package dev.magobolesaomako.movingshape;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class HelloApplication extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("hello-view.fxml"));
        Parent root = fxmlLoader.load();
        root.requestFocus();
        Scene scene = new Scene(root, 400, 550);
        scene.setOnKeyPressed((event -> {
            HelloController controller = fxmlLoader.getController();
            controller.handleKeyPress(event);
        }));

        stage.setTitle("Moving Shapes");
        stage.setScene(scene);
        stage.show();
        stage.setResizable(false);
    }
}
