package group16.smartflightcheckinkiosk;

import javafx.fxml.FXML;


public class StaffLoginController {
    private ViewAlter viewAlter;
    @FXML
    protected void gotoEnterFlight() {
        System.out.println("Log in successfully!");}
    public void setApp(ViewAlter viewAlter) {
        this.viewAlter = viewAlter;
    }

}
