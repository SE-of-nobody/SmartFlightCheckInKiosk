package group16.smartflightcheckinkiosk;

import javafx.fxml.FXML;
import javafx.scene.text.Text;
import javafx.event.ActionEvent;
import javafx.scene.control.Label;
public class ChooseLoginController {
    private ViewAlter viewAlter;
//    @FXML
//    private Label Passenger;
//    @FXML
//    private Label Staff;
    @FXML
    protected void onPassengerClick() {
        gotoPassengerLogin();}
    @FXML
    protected void onStaffClick() {
        gotostaffLogin();}
    @FXML
    protected void gotoPassengerLogin() {
        System.out.println("you choose passenger");}
    @FXML
    protected void gotostaffLogin() {
        System.out.println("you choose staff");}
    public void setApp(ViewAlter viewAlter) {
        this.viewAlter = viewAlter;
    }
}





