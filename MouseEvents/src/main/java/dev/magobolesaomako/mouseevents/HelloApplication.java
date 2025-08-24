package dev.magobolesaomako.mouseevents;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import org.w3c.dom.events.MouseEvent;

import java.io.IOException;

public class HelloApplication extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("hello-view.fxml"));
        Parent root = fxmlLoader.load();
        Scene scene = new Scene(root, 400, 500);
        scene.setOnMouseMoved(event -> {
            HelloController controller = fxmlLoader.getController();
            controller.onMouseMove(event);
        });
        root.requestFocus();
        stage.setTitle("Mouse Events!");
        stage.setScene(scene);
        stage.show();
    }
}
