package dev.magobolesaomako.todoapp.controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class TaskCardController {
    @FXML
    public Label taskName;
    @FXML
    public Label taskTimeStamp;
    @FXML
    public Label taskStatus;

    @FXML
    public void handleView(ActionEvent actionEvent) {
        System.out.println("Viewing task: " + taskName.getText());
        // TODO: add viewing task logic
    }

    public void setTaskDetails(String name, LocalDateTime timeStamp, String status){
        taskName.setText(name);
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("hh:mm a, dd.MM.yyyy");
        taskTimeStamp.setText(timeStamp.format(formatter));
        taskStatus.setText(status);
    }
}
