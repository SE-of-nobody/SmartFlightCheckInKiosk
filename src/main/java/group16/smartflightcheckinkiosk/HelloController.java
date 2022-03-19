package group16.smartflightcheckinkiosk;

import javafx.fxml.FXML;

import javafx.scene.text.Text;
import javafx.event.ActionEvent;
import javafx.scene.control.Label;

public class HelloController {
    @FXML
    private Text  Sign;
    @FXML
    protected void onSignButtonClick() {
        Sign.setText("Sign in button pressed");}
}