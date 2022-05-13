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
        //获取csv文件数据，如有需要，可以修改ID_doc的变量类型
        String ID_doc = id_docField.getText();
        //测试代码，后端代码添加后即可删除
        System.out.println("ID Documnet: " + ID_doc);

        //页面跳转
        Jumpto jumpto = new Jumpto();
        jumpto.set("MainMenu.fxml", "Hello");
        Stage stage = new Stage();

        //Close this window
        Stage stage_old = (Stage) toIDdocPage.getScene().getWindow();
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
