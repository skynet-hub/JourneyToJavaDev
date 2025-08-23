module dev.magobolesaomako.scenebuilderdemo {
    requires javafx.controls;
    requires javafx.fxml;


    opens dev.magobolesaomako.scenebuilderdemo to javafx.fxml;
    exports dev.magobolesaomako.scenebuilderdemo;
}