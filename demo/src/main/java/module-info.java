module dev.magobolesaomako.demo {
    requires javafx.controls;
    requires javafx.fxml;


    opens dev.magobolesaomako.demo to javafx.fxml;
    exports dev.magobolesaomako.demo;
}