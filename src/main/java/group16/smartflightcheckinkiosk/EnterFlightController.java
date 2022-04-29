package group16.smartflightcheckinkiosk;

import javafx.fxml.FXML;

public class EnterFlightController {
    private ViewAlter viewAlter;
    @FXML
    protected void gotoCheckFlight() {
        System.out.println("Check Flight");}
    public void setApp(ViewAlter viewAlter) {
        this.viewAlter = viewAlter;
    }

}
