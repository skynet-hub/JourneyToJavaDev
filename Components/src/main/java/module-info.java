module dev.magobolesaomako.components {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.desktop;


    opens dev.magobolesaomako.components to javafx.fxml;
    exports dev.magobolesaomako.components;
}