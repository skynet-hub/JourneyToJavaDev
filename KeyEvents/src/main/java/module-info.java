module dev.magobolesaomako.keyevents {
    requires javafx.controls;
    requires javafx.fxml;


    opens dev.magobolesaomako.keyevents to javafx.fxml;
    exports dev.magobolesaomako.keyevents;
}