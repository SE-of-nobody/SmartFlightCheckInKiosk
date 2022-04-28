package group16.smartflightcheckinkiosk.Controller;

import group16.smartflightcheckinkiosk.ViewAlter;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.text.Text;

import java.net.URL;
import java.util.ResourceBundle;

public class BoardingpassBoardingpassController implements Initializable {
    @FXML
    private Text Surname;
//    @FXML
//    private Text IDnumber;
    @FXML
    private Text BookingNumber;
    @FXML
    private Text FlightNumber;
    @FXML
    private Text Timetable;
    @FXML
    private Text StartPoint;
    @FXML
    private Text Destination;
    private ViewAlter viewAlter;


    @Override
    public void initialize(URL arg0, ResourceBundle arg1) {
        // TODO Auto-generated method stub

    }

    public void setApp(ViewAlter viewAlter) {
        this.viewAlter = viewAlter;
    }
}