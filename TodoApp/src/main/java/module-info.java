module dev.magobolesaomako.todoapp {
    requires javafx.controls;
    requires javafx.fxml;
    requires jdk.compiler;
    requires MaterialFX;


    opens dev.magobolesaomako.todoapp to javafx.fxml;
    exports dev.magobolesaomako.todoapp;
    exports dev.magobolesaomako.todoapp.controller;
    opens dev.magobolesaomako.todoapp.controller to javafx.fxml;
}