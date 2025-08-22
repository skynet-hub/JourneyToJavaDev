module dev.magobolesaomako.shapes {
    requires javafx.controls;
    requires javafx.fxml;


    opens dev.magobolesaomako.shapes to javafx.fxml;
    exports dev.magobolesaomako.shapes;
}