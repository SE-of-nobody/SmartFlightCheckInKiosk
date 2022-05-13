package group16.smartflightcheckinkiosk.Controller;

import javafx.fxml.FXML;
import group16.smartflightcheckinkiosk.Jumpto;
import javafx.event.ActionEvent;
import javafx.scene.control.Button;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;



public class StaffLoginController {

    @FXML
    private VBox StaffLogin;
    @FXML
    private Button b3;
    @FXML
    private Button b4;
    @FXML
    void gotoChooseLogin(ActionEvent event)throws Exception{
        Jumpto jumpto = new Jumpto();
        jumpto.set("ChooseLogin.fxml", "Login");
        Stage stage = new Stage();
        Stage stage_old = (Stage) StaffLogin.getScene().getWindow();
        stage_old.close();
        jumpto.start(stage);
    }
    @FXML
    void gotoEnterFlight(ActionEvent event) throws Exception {
        Jumpto jumpto = new Jumpto();
        jumpto.set("EnterFlight.fxml", "Back-end System");
        Stage stage = new Stage();
        Stage stage_old = (Stage) StaffLogin.getScene().getWindow();
        stage_old.close();
        jumpto.start(stage);
    }

}
