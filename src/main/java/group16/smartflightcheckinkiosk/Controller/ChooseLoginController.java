package group16.smartflightcheckinkiosk.Controller;

import group16.smartflightcheckinkiosk.CsvReader;
import group16.smartflightcheckinkiosk.Jumpto;
import group16.smartflightcheckinkiosk.StageManager;
//import group16.smartflightcheckinkiosk.ViewAlter;
import javafx.fxml.FXML;
import javafx.scene.text.Text;
import javafx.event.ActionEvent;
import javafx.scene.control.Label;
import javafx.stage.Stage;

public class ChooseLoginController {

//    private ViewAlter viewAlter;

    //    @FXML
//    private Label Passenger;
    @FXML
    private Label confirm4;
    /*
    @FXML
    protected void onPassengerClick() {
        viewAlter.gotoPassengerLogin();}
    @FXML
    protected void onStaffClick() {
        viewAlter.gotostaffLogin();}
    */
    @FXML
    public void gotoPassengerLogin() throws Exception {
        Jumpto jumpto = new Jumpto();
        jumpto.set("PassengerLogin.fxml", "login");
        Stage stage = new Stage();
        StageManager.STAGE.put("loginPage", stage);
        jumpto.start(stage);
        Stage stage_old = (Stage) confirm4.getScene().getWindow();
        stage_old.close();
    }

    @FXML
    public void gotoStaffLogin() throws Exception {
        Jumpto jumpto = new Jumpto();
        jumpto.set("StaffLogin.fxml", "Staff Login");
        Stage stage = new Stage();
        StageManager.STAGE.put("loginPage", stage);
        jumpto.start(stage);
        Stage stage_old = (Stage) confirm4.getScene().getWindow();
        stage_old.close();
    }

//    public void setApp(ViewAlter viewAlter) {
//        this.viewAlter = viewAlter;
//    }
}





