package group16.smartflightcheckinkiosk;

import javafx.fxml.FXML;
import javafx.scene.text.Text;

public class BoardingpassCheckController {
    @FXML
    private Text Surname;
    @FXML
    private Text IDnumber;
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
