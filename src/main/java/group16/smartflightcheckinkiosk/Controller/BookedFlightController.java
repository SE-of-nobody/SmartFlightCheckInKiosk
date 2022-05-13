package group16.smartflightcheckinkiosk.Controller;

import java.net.URL;
import java.util.ResourceBundle;

import group16.smartflightcheckinkiosk.ViewAlter;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;

public class BookedFlightController implements Initializable{
    public static String[] userInfo;
    @FXML
    private Label BookingFlight;
    @FXML
    private Label BookingNumber;
    @FXML
    private Label Surname;
    @FXML
    private Label DepatureTime;
    @FXML
    private Label ArrivingTime;
    @FXML
    private Label DepatureCity;
    @FXML
    private Label ArrivingCity;
     public void ChangeText(){
         BookingFlight.setText(String.valueOf(userInfo[0]));
         BookingNumber.setText(String.valueOf(userInfo[1]));
         Surname.setText(String.valueOf(userInfo[2]));
         DepatureTime.setText(String.valueOf(userInfo[3]));
         ArrivingTime.setText(String.valueOf(userInfo[4]));
         DepatureCity.setText(String.valueOf(userInfo[5]));
         ArrivingCity.setText(String.valueOf(userInfo[6]));
     }

    private ViewAlter viewAlter;

    public BookedFlightController() {
        // TODO Auto-generated constructor stub
    }

    @Override
    public void initialize(URL arg0, ResourceBundle arg1) {
        // TODO Auto-generated method stub

    }

    public void setApp(ViewAlter viewAlter) {
        this.viewAlter = viewAlter;
    }
}
