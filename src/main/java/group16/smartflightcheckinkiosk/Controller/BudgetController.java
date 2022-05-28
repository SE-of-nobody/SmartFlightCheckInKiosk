package group16.smartflightcheckinkiosk.Controller;

import group16.smartflightcheckinkiosk.Jumpto;
import group16.smartflightcheckinkiosk.Passager.service.OrderInfo;
import group16.smartflightcheckinkiosk.Passager.util.PlaneUtil;
import group16.smartflightcheckinkiosk.StageManager;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;
import javafx.scene.text.Text;
import javafx.stage.Stage;
import service.Order;

import java.net.URL;
import java.util.List;
import java.util.ResourceBundle;

public class BudgetController implements Initializable {
    @FXML
    private Text meal;
    @FXML
    private Text meal_pay;
    @FXML
    private Text seat;
    @FXML
    private Text seat_pay;
    //    @FXML
//    private Text luggage_pay;
    @FXML
    private Text total_pay;
    @FXML
    private TextField cardnumField;
    @FXML
    private Text not_balance;
    @FXML
    private Text not_correct;
    @FXML
    private Text success;

    @FXML
    private Button back;

    @FXML
    private Button ok;

    private OrderInfo orderInfo;


    @FXML
    void ok(ActionEvent event) throws Exception{

        String cardNum = cardnumField.getText();
        if(orderInfo == null){
            System.out.println("尚未初始化");
            return;
        }
        Order order = orderInfo.orders.get(orderInfo.orderIndex);

        if(cardNum == null || !cardNum.equals(order.getCreditNumber())){
            clear();
            not_correct.setText("sorry, your car number is not correct");//如果card number 不对执行它
        }
        else if(order.getBalance() < order.getMealFee() + order.getSeatFee()){
            clear();
            not_balance.setText("sorry, your balance is not enough");//如果balance不够执行它
        }
        else if(order.getPayed() == 1){
            System.out.println("您已经支付过了");
        }
        else{
            //支付流程
            order.setBalance(order.getBalance() - (order.getMealFee() + order.getSeatFee()));
            order.setPayed((byte)1);
            //页面展示
            clear();
            cardnumField.setText("");
            success.setText("支付成功!O(∩_∩)O");
            System.out.println("支付成功!!");
            //取消可点击事件
            ok.setDisable(true);
            ok.setText("paid");
            //写入到文件
            PlaneUtil.setOrdersToCsv(orderInfo.orders , "src/main/resources/group16/smartflightcheckinkiosk/data.csv", "UTF-8");
        }
    }

    private void clear(){
        not_balance.setText("");
        not_correct.setText("");
        success.setText("");
    }


    @FXML
    void back() {
        Stage stage = (Stage) back.getScene().getWindow();
        stage.close();
    }

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        //传来的用户数据
        OrderInfo orderInfo = (OrderInfo) StageManager.CONTROLLER.get("myLoginUserInfo");
        if (orderInfo == null) {
            System.out.println("非法登录!!!");
            return;
        }

        this.orderInfo = orderInfo;
        //填入用户信息
        Order order = orderInfo.orders.get(orderInfo.orderIndex);
        //餐品
        meal.setText(order.getMeal());
        meal_pay.setText(String.valueOf(order.getMealFee()));
        //座位
        seat.setText(order.getSeat());
        seat_pay.setText(String.valueOf(order.getSeatFee()));
        //总价
        total_pay.setText(String.valueOf(order.getMealFee() + order.getSeatFee()));
        //已支付了
        if(order.getPayed() == 1){
            ok.setDisable(true);
            ok.setText("paid");
        }
    }
}
