package group16.smartflightcheckinkiosk.Controller;

import javafx.fxml.FXML;
import group16.smartflightcheckinkiosk.Jumpto;
import javafx.event.ActionEvent;
import javafx.scene.control.Button;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;


public class EnterFlightController {
    @FXML
    private VBox EnterFlight;
    @FXML
    private Button b3;
    @FXML
    private Button b4;
    @FXML
    void gotoStaffLogin(ActionEvent event)throws Exception{
        Jumpto jumpto = new Jumpto();
        jumpto.set("StaffLogin.fxml", "Login");
        Stage stage = new Stage();
        Stage stage_old = (Stage) EnterFlight.getScene().getWindow();
        stage_old.close();
        jumpto.start(stage);
    }
    @FXML
    void gotoCheckFlight(ActionEvent event) throws Exception {
        Jumpto jumpto = new Jumpto();
        jumpto.set("CheckFlight.fxml", "Check Flight");
        Stage stage = new Stage();
        Stage stage_old = (Stage) EnterFlight.getScene().getWindow();
        stage_old.close();
        jumpto.start(stage);
    }

}