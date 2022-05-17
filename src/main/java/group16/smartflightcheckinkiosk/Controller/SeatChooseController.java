package group16.smartflightcheckinkiosk.Controller;

import java.net.URL;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.ResourceBundle;

import group16.smartflightcheckinkiosk.Jumpto;
import group16.smartflightcheckinkiosk.Passager.service.OrderInfo;
import group16.smartflightcheckinkiosk.Passager.util.PlaneUtil;
import group16.smartflightcheckinkiosk.StageManager;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.fxml.Initializable;
import javafx.stage.Stage;


public class SeatChooseController implements Initializable {
    public static String[] userInfo;
    @FXML
    private Button A1;
    @FXML
    private Button A2;
    @FXML
    private Button A3;
    @FXML
    private Button B1;
    @FXML
    private Button B2;
    @FXML
    private Button B3;
    @FXML
    private Button C1;
    @FXML
    private Button C2;
    @FXML
    private Button C3;
    @FXML
    private Button D1;
    @FXML
    private Button D2;
    @FXML
    private Button D3;

    static  final Map<String, Button> buttonMap = new HashMap<>();



    public void SeatChooseController(ActionEvent event) {
        // TODO Auto-generated constructor stub
        Button button = (Button) event.getSource();
        String type = (String) button.getId();

        String seat = getText(type).getText();
        if (seat == null) System.out.println("不存在的座位");

        //传来的用户数据
        OrderInfo orderInfo = (OrderInfo) StageManager.CONTROLLER.get("myLoginUserInfo");
        if (orderInfo == null) System.out.println("非法登录!!!");

        //用户选择座位号
        String seatName = seat.substring(0, seat.indexOf("$"));
        Double seatPrice = Double.parseDouble(seat.substring(seat.indexOf("$") + 1, seat.length()));
        orderInfo.orders.get(orderInfo.orderIndex).setSeat(seatName);
        orderInfo.orders.get(orderInfo.orderIndex).setSeatFee(seatPrice);
        //选择正确的路径
        PlaneUtil.setOrdersToCsv(orderInfo.orders, "src/main/resources/group16/smartflightcheckinkiosk/data.csv", "UTF-8");
        System.out.println("选择座位成功");
    }

    @Override
    public void initialize(URL arg0, ResourceBundle arg1) {
//         TODO Auto-generated method stub
//        A1.setId("A1");
//        A1.setText("10.12");
//        A2.setId("A2");
//        A2.setText("11.12");
//        B1.setId("B1");
//        B1.setText("153.2");
//        B2.setId("B2");
//        B2.setText("");
//        C1.setId("A1");
//        C1.setText("");
//        C2.setId("A1");
//        C2.setText("");
//
        buttonMap.put("A1", A1);
        buttonMap.put("A2", A2);
        buttonMap.put("A3", A3);
        buttonMap.put("B1", B1);
        buttonMap.put("B2", B2);
        buttonMap.put("B3", B3);
        buttonMap.put("C1", C1);
        buttonMap.put("C2", C2);
        buttonMap.put("C3", C3);
        buttonMap.put("D1", D1);
        buttonMap.put("D2", D2);
        buttonMap.put("D3", D3);

        setSeat("A1",  10.12);
        setSeat("A2",  102.2);
        setSeat("A3",  10234.224);
        setSeat("B1",  5023.666);
        setSeat("B2",  120.2);
        setSeat("B3",  23.1);
        setSeat("C1",  1340.12);
        setSeat("C2",  102.22);
        setSeat("C3",  10234.324);
        setSeat("D1",  50223.666);
        setSeat("D2",  120.223);
        setSeat("D3",  2243.2431);

    }

    public void setSeat(String type, double price){
        buttonMap.get(type).setText(type + "$" + String.valueOf(price) );
    }

    Button getText(String type){
        return buttonMap.get(type);
    }


@FXML
public void ButtonClicked(ActionEvent event){
    SeatChooseController(event);
}







}