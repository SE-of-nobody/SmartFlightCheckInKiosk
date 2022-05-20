package group16.smartflightcheckinkiosk.Controller;
import group16.smartflightcheckinkiosk.Jumpto;
import group16.smartflightcheckinkiosk.StageManager;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.text.Text;
import javafx.event.ActionEvent;
import javafx.scene.control.Label;
import java.io.IOException;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;
public class BoardingpassController {
    @FXML
    private Label Passenger;
    @FXML
    private Label Staff;
    @FXML
    private Button label_ok;
    @FXML
    private Button label_help;

//    @FXML
//    protected void onHelpClick() {
//        System.out.println("you choose help");
//        Stage stage = (Stage) label_help.getScene().getWindow();
//        stage.close();
//    }
    @FXML
    void onHelpClick() throws Exception {
        System.out.println("you choose prev");
        Jumpto jumpto = new Jumpto();
        jumpto.set("boardingpass-check.fxml", "MainMenu");
        Stage stage = new Stage();System.out.println("Stage stage = new Stage();");
        Stage stage_old = (Stage) label_help.getScene().getWindow();
        stage_old.close();
        jumpto.start(stage);
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
