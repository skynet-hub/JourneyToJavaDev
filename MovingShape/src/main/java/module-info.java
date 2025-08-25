module dev.magobolesaomako.movingshape {
    requires javafx.controls;
    requires javafx.fxml;


    opens dev.magobolesaomako.movingshape to javafx.fxml;
    exports dev.magobolesaomako.movingshape;
}