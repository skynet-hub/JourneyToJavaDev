module dev.magobolesaomako.scaletransition {
    requires javafx.controls;
    requires javafx.fxml;


    opens dev.magobolesaomako.scaletransition to javafx.fxml;
    exports dev.magobolesaomako.scaletransition;
}