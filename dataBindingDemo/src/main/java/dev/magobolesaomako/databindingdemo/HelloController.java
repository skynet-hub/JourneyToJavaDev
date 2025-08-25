package dev.magobolesaomako.databindingdemo;

import javafx.beans.binding.Bindings;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class HelloController {
    @FXML
    private TextField firstNum;

    @FXML
    private TextField secondNum;

    @FXML
    private Label sumLabel;

    @FXML
    public void initialize(){
        sumLabel.textProperty().bind(Bindings.createStringBinding(
                () -> {
                      String num1 = firstNum.getText();
                      String num2 = secondNum.getText();

                      boolean condition = num1 == null || num1.trim().isEmpty() || num2 == null || num2.trim().isEmpty();

                      if (condition){
                          return "Enter Valid numbers";
                      }

                      try {
                          double numOne = Double.parseDouble(num1);
                          double numTwo = Double.parseDouble(num2);

                          double result = numTwo + numOne;
                          return "Sum: " + result;
                      } catch (NumberFormatException e){
                          return "Enter Valid Numbers";
                      }
                }, firstNum.textProperty(), secondNum.textProperty()
        ));
    }
}
