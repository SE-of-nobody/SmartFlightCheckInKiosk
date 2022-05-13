package group16.smartflightcheckinkiosk.Controller;

import group16.smartflightcheckinkiosk.Jumpto;
import group16.smartflightcheckinkiosk.StageManager;
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
        //获取用户输入的姓名和ID号，存入变量
        String Surname = surnameField.getText();
        String IDnumber = id_numField.getText();
        //测试代码，后端代码添加后即可删除
        System.out.println("Surname: " + Surname);
        System.out.println("ID Number: " + IDnumber);

        //页面跳转
        Jumpto jumpto = new Jumpto();
        jumpto.set("MainMenu.fxml", "Hello");
        Stage stage = new Stage();

        //Close this window
        Stage stage_old = (Stage) toSurnamePage.getScene().getWindow();
        stage_old.close();
        //Close login window
        StageManager.STAGE.get("login").close();
        StageManager.STAGE.remove("login");
        //Open next window
        jumpto.start(stage);
    }
    @FXML
    void back(){
        //关闭当前窗口
        Stage stage = (Stage) back.getScene().getWindow();
        stage.close();

    }

}

