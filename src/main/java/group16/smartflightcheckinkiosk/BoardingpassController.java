package group16.smartflightcheckinkiosk;
import javafx.fxml.FXML;
import javafx.scene.text.Text;
import javafx.event.ActionEvent;
import javafx.scene.control.Label;
public class BoardingpassController {
    @FXML
    private Label Passenger;
    @FXML
    private Label Staff;
    @FXML
    protected void onOKClick() {
        System.out.println("you choose ok");}
    @FXML
    protected void onHelpClick() {
        System.out.println("you choose help");}
}
