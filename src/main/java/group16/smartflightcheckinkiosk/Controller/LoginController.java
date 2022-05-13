package group16.smartflightcheckinkiosk.Controller;

import group16.smartflightcheckinkiosk.StageManager;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;
import group16.smartflightcheckinkiosk.Jumpto;

import java.io.IOException;

public class LoginController {
    public Label confirm;
    @FXML
    private Button booknum_button;
    @FXML
    private Button iddoc_button;
    @FXML
    private Button surname_button;
    @FXML
    private Button back;
    @FXML
    void toBookNumPage(ActionEvent event) throws Exception {
        Jumpto jumpto = new Jumpto();
        jumpto.set("BookNum.fxml", "Booking Number");
        Stage stage = new Stage();
        StageManager.STAGE.put("login", stage);
        jumpto.start(stage);
    }

    @FXML
    void toSurnamePage(ActionEvent event) throws Exception {
        Jumpto jumpto = new Jumpto();
        jumpto.set("Surname.fxml", "Surname & ID Number");
        Stage stage = new Stage();
        StageManager.STAGE.put("login", stage);
        jumpto.start(stage);
    }

    @FXML
    void toIDdocPage(ActionEvent event) throws Exception{
        Jumpto jumpto = new Jumpto();
        jumpto.set("IDdoc.fxml", "ID Documnet");
        Stage stage = new Stage();
        StageManager.STAGE.put("login", stage);
        jumpto.start(stage);
    }


    @FXML
    void back(){
        Stage stage = (Stage) back.getScene().getWindow();
        stage.close();
    }

}
