package dev.magobolesaomako.movingshape;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.input.KeyEvent;
import javafx.scene.shape.Circle;

public class HelloController {
    @FXML
    private Circle movableCircle;

    @FXML
    public void handleKeyPress(KeyEvent event) {
        switch (event.getCode()) {
            case UP:
                System.out.println("Moving up by 10");
                movableCircle.setCenterY(movableCircle.getCenterY() - 10);
                break;
            case DOWN:
                movableCircle.setCenterY(movableCircle.getCenterY() + 10);
                break;
            case LEFT:
                movableCircle.setCenterX(movableCircle.getCenterX() - 10);
                break;
            case RIGHT:
                movableCircle.setCenterX(movableCircle.getCenterX() + 10);
                break;
            default:
                break;
        }
    }
}
