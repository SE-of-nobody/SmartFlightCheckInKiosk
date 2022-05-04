package group16.smartflightcheckinkiosk.Controller;
import group16.smartflightcheckinkiosk.CsvReader;
import group16.smartflightcheckinkiosk.Jumpto;
import group16.smartflightcheckinkiosk.ViewAlter;
import javafx.fxml.FXML;
import javafx.scene.text.Text;
import javafx.event.ActionEvent;
import javafx.scene.control.Label;
import javafx.stage.Stage;

public class ChooseLoginController {

    private ViewAlter viewAlter;
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
    public void setApp(ViewAlter viewAlter) {
        this.viewAlter = viewAlter;
    }
}





