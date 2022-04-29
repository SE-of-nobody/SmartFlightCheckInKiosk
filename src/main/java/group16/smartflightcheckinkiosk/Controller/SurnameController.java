package group16.smartflightcheckinkiosk.Controller;

import group16.smartflightcheckinkiosk.Jumpto;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

public class SurnameController {

    @FXML
    private Label confirm3;

    @FXML
    private Label id_num;

    @FXML
    private TextField id_numField;

    @FXML
    private Button ok;

    @FXML
    private Button back;

    @FXML
    private Label surname;

    @FXML
    private TextField surnameField;

    @FXML
    private AnchorPane toSurnamePage;

    @FXML
    void ok(ActionEvent event) throws Exception{
        String Surname = surnameField.getText();
        String IDnumber = id_numField.getText();
        System.out.println("Surname: " + Surname);
        System.out.println("ID Number: " + IDnumber);
        Jumpto jumpto = new Jumpto();

        jumpto.set("MainMenu.fxml", "Hello");
        Stage stage = new Stage();
        Stage stage_old = (Stage) toSurnamePage.getScene().getWindow();
        stage_old.close();
        jumpto.start(stage);
    }
    @FXML
    void back(){
        Stage stage = (Stage) back.getScene().getWindow();
        stage.close();

    }

}

