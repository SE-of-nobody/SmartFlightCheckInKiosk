package group16.smartflightcheckinkiosk.Controller;
import group16.smartflightcheckinkiosk.Jumpto;
import javafx.fxml.FXML;
import javafx.stage.Stage;

public class ChooseLoginController {


//    @FXML
//    private Label Passenger;
//    @FXML
//    private Label Staff;
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
    jumpto.set("Login.fxml", "login");
    Stage stage = new Stage();
    jumpto.start(stage);
}
    @FXML
    public void gotoStaffLogin() throws Exception {
        Jumpto jumpto = new Jumpto();
        jumpto.set("StaffLogin.fxml", "Staff Login");
        Stage stage = new Stage();
        jumpto.start(stage);
    }

}





