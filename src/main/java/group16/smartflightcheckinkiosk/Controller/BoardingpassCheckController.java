package group16.smartflightcheckinkiosk.Controller;

import javafx.fxml.FXML;
import javafx.scene.text.Text;

public class BoardingpassCheckController {
    @FXML
    private Text Surname;
    @FXML
    private Text idNumber;
    @FXML
    private Text BookingNumber;
    @FXML
    private Text FlightNumber;
    @FXML
    private Text Timetable;
    @FXML
    protected void onNextClick() {
        System.out.println("next button pressed");}
    @FXML
    protected void onPrevClick() {
        System.out.println("prev button pressed");}
}