package dev.magobolesaomako.todoapp.controller;

import dev.magobolesaomako.todoapp.dto.TaskDTO;
import dev.magobolesaomako.todoapp.managers.TaskList;
import io.github.palexdev.materialfx.controls.MFXComboBox;
import io.github.palexdev.materialfx.controls.MFXTextField;
import javafx.concurrent.Task;
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
    public VBox taskListVBox;

    private TaskList taskList;

    @FXML
    public void initialize(){
        taskList = new TaskList();
        statusComboBox.getItems().addAll("All", "Todo", "InProgress", "Done");
        statusComboBox.setValue("All");

        addTask("Create a JavaFx Project", "Build a very cool JavaFX Application",LocalDateTime.now().minusMinutes(3), "InProgress");
        addTask("Learn SpringBoot", "SpringBoot is crucial for my career",LocalDateTime.now(), "Todo");
        addTask("Create a Todo App", "Just follow the instructions and build!",LocalDateTime.now().minusMinutes(10), "Done");

    }

    @FXML
    public void handleAddTask(ActionEvent actionEvent) {
        addTask("New Task", "Our very first Task!", LocalDateTime.now(), "ToDo");
    }

    public void addTask(String title, String description, LocalDateTime dateAdded, String status){
        TaskDTO newTask = new TaskDTO(title, description, dateAdded, status);

        taskList.addTask(newTask);
        displayTask(newTask);
    }

    public void displayTask(TaskDTO task){
        try{
            FXMLLoader loader = new FXMLLoader(
                    getClass().getResource(
                            "/dev/magobolesaomako/todoapp/task-card.fxml"));
            HBox taskCard = loader.load();
            TaskCardController controller = loader.getController();
            controller.setTaskDetails(task.getTitle(), task.getDateAdded(), task.getStatus());
            taskListVBox.getChildren().add(taskCard);
        } catch (Exception e){
            e.printStackTrace();
        }
    }
}
