package group16.smartflightcheckinkiosk.Controller;

import group16.smartflightcheckinkiosk.Jumpto;
import group16.smartflightcheckinkiosk.Passager.service.OrderInfo;
import group16.smartflightcheckinkiosk.StageManager;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

public class IDdocController {

    @FXML
    private Label confirm4;

    @FXML
    private CheckBox id_docField;

    @FXML
    private Button ok;

    @FXML
    private Button back;

    @FXML
    private AnchorPane toIDdocPage;

    private static final OrderInfo orderInfo = new OrderInfo();

    @FXML
    void ok(ActionEvent event) throws Exception{
        Boolean ID_doc = id_docField.isSelected();
        System.out.println("ID Documnet: " + ID_doc);
        Jumpto jumpto = new Jumpto();

        //登录失败
        if((orderInfo.orderIndex = orderInfo.checkWithFile()) < 0||ID_doc==false){
            System.out.println("登录失败");
            jumpto.set("Warning.fxml", "WARNING");
            return;
        }

        jumpto.set("MainMenu.fxml", "Hello");
        Stage stage = new Stage();

        //Close this window
        Stage stage_old = (Stage) toIDdocPage.getScene().getWindow();
        stage_old.close();
        //Close login window
        System.out.println(StageManager.STAGE);
        StageManager.STAGE.get("login").close();
        StageManager.STAGE.remove("login");
        //Open next window

        //close login page
        if(StageManager.STAGE.get("loginPage") != null){
            StageManager.STAGE.get("loginPage").close();
            StageManager.STAGE.remove("loginPage");
        }

        //register the login information
        StageManager.CONTROLLER.put("myLoginUserInfo", orderInfo);

        jumpto.start(stage);

    }
    @FXML
    void back(){
        Stage stage = (Stage) back.getScene().getWindow();
        stage.close();

    }

}
