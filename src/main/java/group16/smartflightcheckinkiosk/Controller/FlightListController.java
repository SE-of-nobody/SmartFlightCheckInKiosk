package group16.smartflightcheckinkiosk.Controller;

import javafx.fxml.FXML;
import group16.smartflightcheckinkiosk.Jumpto;
import javafx.event.ActionEvent;
import javafx.scene.control.Button;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;



public class FlightListController {

    @FXML
    private VBox FlightList;
    @FXML
    private Button b7;
    @FXML
    void gotoCheckFlight(ActionEvent event)throws Exception{
        Jumpto jumpto = new Jumpto();
        jumpto.set("CheckFlight.fxml", "Back-end System");
        Stage stage = new Stage();
        Stage stage_old = (Stage) FlightList.getScene().getWindow();
        stage_old.close();
        jumpto.start(stage);
    }

}