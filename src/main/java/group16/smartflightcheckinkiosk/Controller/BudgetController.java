package group16.smartflightcheckinkiosk.Controller;

import group16.smartflightcheckinkiosk.Jumpto;
import group16.smartflightcheckinkiosk.Passager.service.OrderInfo;
import group16.smartflightcheckinkiosk.StageManager;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;
import javafx.scene.text.Text;
import javafx.stage.Stage;

import java.util.List;

public class BudgetController {
    @FXML
    private Text meal;
    @FXML
    private Text meal_pay;
    @FXML
    private Text seat;
    @FXML
    private Text seat_pay;
    @FXML
    private Text total_pay;
    @FXML
    private TextField cardnumField;
    @FXML
    private Text not_balance;
    @FXML
    private Text not_correct;

    @FXML
    private Button back;

    @FXML
    private Button ok;



    @FXML
    void ok(ActionEvent event) throws Exception{
        not_balance.setText("sorry, your balance is not enough");//如果balance不够执行它
        not_correct.setText("sorry, your car number is not correct");//如果card number 不对执行它

    }
    @FXML
    void back() {
        Stage stage = (Stage) back.getScene().getWindow();
        stage.close();
    }
}
