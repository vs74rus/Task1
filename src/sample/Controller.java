package sample;

import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.TextField;
import javafx.scene.control.Alert;

public class Controller {
    @FXML
    private MyTextField textField1; //Х
    @FXML
    private MyTextField textField2; //А
    @FXML
    private MyTextField textField3; //В
    @FXML
    public TextField textField4; //Результат
    @FXML

    //Обработчик нажания кнопки Очистить
    public void onclickbtnClear(){
        textField1.clear();
        textField2.clear();
        textField3.clear();
    }

    //Обработчик кнопки Выход
    @FXML
    public void onclickbtnExit(){
        Platform.exit();
    }

    //Обработчик нажатия кнопки Решить
    @FXML
    public void onclickbtnExec(ActionEvent actionEvent) {
       if ( Integer.parseInt(textField1.getText()) <= 7 ) {
           float x = Float.parseFloat(textField1.getText());
           float a = Float.parseFloat(textField2.getText());
           float b = Float.parseFloat(textField3.getText());
           if (a != 0 || b != 0) {
               double y = (x + 4) / (Math.pow (a, 2) + Math.pow (b, 2));
               textField4.setText(String.valueOf(y));
           }
           else
           {
               Alert alert = new Alert(Alert.AlertType.INFORMATION);
               alert.setTitle("Внимание!");
               alert.setHeaderText(null);
               alert.setContentText("При x<=7, А и В не могут одновременно равняться нулю!\nВведите новые значения А и В!");
               alert.showAndWait();
           }
       }
       else {
           float x = Float.parseFloat(textField1.getText());
           float a = Float.parseFloat(textField2.getText());
           float b = Float.parseFloat(textField3.getText());
           double y = x * Math.pow ((a + b), 2);
           textField4.setText(String.valueOf(y));

       }


    }
}

