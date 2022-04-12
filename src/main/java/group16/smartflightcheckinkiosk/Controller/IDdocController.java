package group16.smartflightcheckinkiosk.Controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;

public class IDdocController {

    @FXML
    private Label confirm4;

    @FXML
    private TextField id_docField;

    @FXML
    private Button ok;

    @FXML
    private AnchorPane way3;

    @FXML
    void ok(ActionEvent event) {
        String ID_doc = id_docField.getText();
        System.out.println("ID Documnet: " + ID_doc);
    }

}
