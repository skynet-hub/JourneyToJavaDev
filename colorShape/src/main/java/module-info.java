module dev.magobolesaomako.colorshape {
    requires javafx.controls;
    requires javafx.fxml;


    opens dev.magobolesaomako.colorshape to javafx.fxml;
    exports dev.magobolesaomako.colorshape;
}