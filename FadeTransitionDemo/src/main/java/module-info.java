module dev.magobolesaomako.fadetransitiondemo {
    requires javafx.controls;
    requires javafx.fxml;


    opens dev.magobolesaomako.fadetransitiondemo to javafx.fxml;
    exports dev.magobolesaomako.fadetransitiondemo;
}