package lesson_12_02;

import javafx.fxml.FXML;
import javafx.scene.control.Label;

public class Controller {
    @FXML
    public Label number;
    public void ButtonMinus() {
        int bm = Integer.parseInt(number.getText());
        //number.setText(String.valueOf(bm - 1)); это не надо
        bm-=1; //функцыя(способ) 1
        number.setText("" + bm);
    }
    public void ButtonPlus() {
        int bm = Integer.parseInt(number.getText());
        bm++; //функция(способ) 2
        number.setText("" + bm);
    }
}
