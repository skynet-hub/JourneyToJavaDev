module dev.magobolesaomako.switchstages {
    requires javafx.controls;
    requires javafx.fxml;


    opens dev.magobolesaomako.switchstages to javafx.fxml;
    exports dev.magobolesaomako.switchstages;
}