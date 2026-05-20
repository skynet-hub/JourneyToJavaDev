package dev.magobolesaomako.todoapp.controller;

import io.github.palexdev.materialfx.controls.MFXComboBox;
import io.github.palexdev.materialfx.controls.MFXTextField;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class TodoController {

    @FXML
    public MFXComboBox<String> statusComboBox;
    @FXML
    public VBox taskList;

    @FXML
    public void initialize(){
        statusComboBox.getItems().addAll("All", "Todo", "InProgress", "Done");
        statusComboBox.setValue("All");

        addTask("Create a JavaFx Project", LocalDateTime.now().minusMinutes(3), "InProgress");
        addTask("Learn SpringBoot", LocalDateTime.now(), "Todo");
        addTask("Create a Todo App", LocalDateTime.now().minusMinutes(10), "Done");

    }

    @FXML
    public void handleAddTask(ActionEvent actionEvent) {
        addTask("New Task", LocalDateTime.now(), "ToDo");
    }

    public void addTask(String taskName, LocalDateTime timeStamp, String status){
        try{
            FXMLLoader loader = new FXMLLoader(
                    getClass().getResource(
                            "/dev/magobolesaomako/todoapp/task-card.fxml"));
            HBox taskCard = loader.load();
            TaskCardController controller = loader.getController();
            controller.setTaskDetails(taskName, timeStamp, status);
            taskList.getChildren().add(taskCard);
        } catch (Exception e){
            e.printStackTrace();
        }
    }
}
