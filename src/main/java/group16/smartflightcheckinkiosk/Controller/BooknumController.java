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
        //获取用户输入的Booking Number，存入变量
        String BookingNumber = booknumField.getText();
        //测试代码，后端代码添加后即可删除
        System.out.println("Booking Number: " + BookingNumber);
        //页面跳转
        Jumpto jumpto = new Jumpto();
        jumpto.set("MainMenu.fxml", "Hello");
        Stage stage = new Stage();

        //Close this window
        Stage stage_old = (Stage) toBookNumPage.getScene().getWindow();
        stage_old.close();
        //Close login window
        StageManager.STAGE.get("login").close();
        StageManager.STAGE.remove("login");
        //Open next window
        jumpto.start(stage);
    }
    @FXML
    void back() {
        //关闭当前窗口
        Stage stage = (Stage) back.getScene().getWindow();
        stage.close();
    }


}
