package sample;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class Controller {

    @FXML
    private Label text;

    @FXML
    private TextField input;

    public void sayHi(ActionEvent event){
        //String defaultValue = text.getText();
        String defaultValue = input.getText();
        if(defaultValue!=null && !defaultValue.equals("")) {
            text.setText("Labas " + defaultValue);
        }else {
            Alert alert = new Alert(Alert.AlertType.WARNING);
            alert.setContentText("Blogas vartotojo vardas");
            alert.show();
        }
    }
}
