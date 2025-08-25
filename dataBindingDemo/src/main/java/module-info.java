module dev.magobolesaomako.databindingdemo {
    requires javafx.controls;
    requires javafx.fxml;


    opens dev.magobolesaomako.databindingdemo to javafx.fxml;
    exports dev.magobolesaomako.databindingdemo;
}