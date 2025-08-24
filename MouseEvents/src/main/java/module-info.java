module dev.magobolesaomako.mouseevents {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.xml;


    opens dev.magobolesaomako.mouseevents to javafx.fxml;
    exports dev.magobolesaomako.mouseevents;
}