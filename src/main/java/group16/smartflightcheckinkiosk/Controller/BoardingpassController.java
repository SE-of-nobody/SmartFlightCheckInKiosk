package group16.smartflightcheckinkiosk.Controller;
import group16.smartflightcheckinkiosk.Jumpto;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.text.Text;
import javafx.event.ActionEvent;
import javafx.scene.control.Label;
import java.io.IOException;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
public class BoardingpassController {
    @FXML
    private Label Passenger;
    @FXML
    private Label Staff;
    @FXML
    private Label label_ok;
    @FXML
    private Label label_help;

    @FXML
    protected void onHelpClick() {
        System.out.println("you choose help");
        Stage stage = (Stage) label_help.getScene().getWindow();
        stage.close();
    }
    @FXML
    void onOKClick() throws Exception{
        Jumpto jumpto2 = new Jumpto();
        jumpto2.set("boardingpass-tag.fxml", "Booked Flight");
        Stage stage2 = new Stage();
        jumpto2.start(stage2);


        Jumpto jumpto1 = new Jumpto();
        jumpto1.set("boardingpass-boardingpass.fxml", "Booked Flight");
        Stage stage1 = new Stage();
        jumpto1.start(stage1);

        Jumpto jumpto3 = new Jumpto();
        jumpto3.set("boardingpass-ticket.fxml", "Booked Flight");
        Stage stage3 = new Stage();
        jumpto3.start(stage3);

        Stage stage4 = (Stage) label_ok.getScene().getWindow();
        stage4.close();
    }

}
