package group16.smartflightcheckinkiosk.Controller;

import java.net.URL;
import java.util.ResourceBundle;

import group16.smartflightcheckinkiosk.ViewAlter;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.text.Text;

public class BoardingpassTagController implements Initializable{
    @FXML
    private Text Surname;
    @FXML
    private Text FlightNumber;
    @FXML
    private Text Tag;
    private ViewAlter viewAlter;


    @Override
    public void initialize(URL arg0, ResourceBundle arg1) {
        // TODO Auto-generated method stub

    }

    public void setApp(ViewAlter viewAlter) {
        this.viewAlter = viewAlter;
    }
}