package group16.smartflightcheckinkiosk;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;

public class BooknumController {

    @FXML
    private TextField booknumField;

    @FXML
    private Label confirm2;

    @FXML
    private Button ok;

    @FXML
    private AnchorPane way1;

    @FXML
    void ok(ActionEvent event) {
        String BookingNumber = booknumField.getText();
        System.out.println("Booking Number: " + BookingNumber);
    }

}
