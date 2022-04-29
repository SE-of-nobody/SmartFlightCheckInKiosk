package group16.smartflightcheckinkiosk.Controller;

import group16.smartflightcheckinkiosk.Jumpto;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

public class IDdocController {

    @FXML
    private Label confirm4;

    @FXML
    private TextField id_docField;

    @FXML
    private Button ok;

    @FXML
    private Button back;

    @FXML
    private AnchorPane toIDdocPage;

    @FXML
    void ok(ActionEvent event) throws Exception{
        String ID_doc = id_docField.getText();
        System.out.println("ID Documnet: " + ID_doc);
        Jumpto jumpto = new Jumpto();
        jumpto.set("MainMenu.fxml", "Hello");
        Stage stage = new Stage();
        Stage stage_old = (Stage) toIDdocPage.getScene().getWindow();
        stage_old.close();
        jumpto.start(stage);

    }
    @FXML
    void back(){
        Stage stage = (Stage) back.getScene().getWindow();
        stage.close();

    }

}
