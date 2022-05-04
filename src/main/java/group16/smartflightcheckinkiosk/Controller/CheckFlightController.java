package group16.smartflightcheckinkiosk.Controller;

import javafx.fxml.FXML;
import group16.smartflightcheckinkiosk.Jumpto;
import javafx.event.ActionEvent;
import javafx.scene.control.Button;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;



public class CheckFlightController {

    @FXML
    private VBox CheckFlight;
    @FXML
    private Button b5;
    @FXML
    private Button b6;
    @FXML
    void gotoEnterFlight(ActionEvent event)throws Exception{
        Jumpto jumpto = new Jumpto();
        jumpto.set("EnterFlight.fxml", "Back-end System");
        Stage stage = new Stage();
        Stage stage_old = (Stage) CheckFlight.getScene().getWindow();
        stage_old.close();
        jumpto.start(stage);
    }
    @FXML
    void gotoFlightList(ActionEvent event) throws Exception {
        Jumpto jumpto = new Jumpto();
        jumpto.set("FlightList.fxml", "Back-end System");
        Stage stage = new Stage();
        Stage stage_old = (Stage) CheckFlight.getScene().getWindow();
        stage_old.close();
        jumpto.start(stage);
    }

}