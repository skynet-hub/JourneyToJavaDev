package dev.magobolesaomako.switchstages;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.stage.Stage;
import java.io.IOException;
public class HelloController {
    @FXML
    private Label headingLabel;
    private Stage stage;
    public void setStage(Stage stage) {
        this.stage = stage;
    }
    @FXML
    private void switchToScene2() throws IOException {
        loadScene("/dev/magobolesaomako/switchstages/scene2.fxml", "Scene 1");
    }

    @FXML
    private void switchToScene1() throws IOException {
        loadScene("/dev/magobolesaomako/switchstages/scene1.fxml", "Scene 2");
    }

    private void loadScene(String fxmlFile, String sceneTitle) throws IOException {
        FXMLLoader loader = new FXMLLoader(getClass().getResource(fxmlFile));
        Parent root = loader.load();
        HelloController controller = loader.getController();
        controller.setStage(stage);
        Scene scene = new Scene(root);
        stage.setScene(scene);
        stage.setTitle(sceneTitle);
        stage.show();
    }

    @FXML
    void stopApplication(){
        stage.close();
    }
}