package group16.smartflightcheckinkiosk.Controller;

import group16.smartflightcheckinkiosk.Jumpto;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

public class BooknumController {

    @FXML
    private TextField booknumField;

    @FXML
    private Label confirm2;

    @FXML
    private Button ok;

    @FXML
    private Button back;

    @FXML
    private AnchorPane toBookNumPage;

    @FXML
    void ok(ActionEvent event) throws Exception{
        String BookingNumber = booknumField.getText();
        System.out.println("Booking Number: " + BookingNumber);
        Jumpto jumpto = new Jumpto();
        jumpto.set("MainMenu.fxml", "Hello");
        Stage stage = new Stage();
        Stage stage_old = (Stage) toBookNumPage.getScene().getWindow();
        stage_old.close();
        jumpto.start(stage);
    }
    @FXML
    void back() {
        Stage stage = (Stage) back.getScene().getWindow();
        stage.close();
    }

}
