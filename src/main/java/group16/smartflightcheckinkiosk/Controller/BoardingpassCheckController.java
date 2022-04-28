package group16.smartflightcheckinkiosk.Controller;
import javafx.event.ActionEvent;
import group16.smartflightcheckinkiosk.Jumpto;
import javafx.fxml.FXML;
import javafx.scene.text.Text;
import javafx.stage.Stage;
import javafx.scene.control.Label;


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
    private Label back;
    @FXML
    private Label next;
    @FXML
    void onNextClick()throws Exception{
        System.out.println("next button pressed");
        Jumpto jumpto = new Jumpto();
        jumpto.set("boardingpass.fxml", "boaringpass-printing");
        Stage stage = new Stage();
        jumpto.start(stage);
        Stage stage2 = (Stage) next.getScene().getWindow();
        stage2.close();
    }
    @FXML
    void onPrevClick() {
        System.out.println("prev button pressed");
        Stage stage = (Stage) back.getScene().getWindow();
        stage.close();
    }
}