package group16.smartflightcheckinkiosk.Controller;

import java.io.*;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import java.util.ResourceBundle;

import group16.smartflightcheckinkiosk.Passager.service.OrderInfo;
import group16.smartflightcheckinkiosk.Passager.util.PlaneUtil;
import group16.smartflightcheckinkiosk.Passager.util.VarUtil;
import group16.smartflightcheckinkiosk.StageManager;
//import group16.smartflightcheckinkiosk.ViewAlter;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import service.Order;

public class BookedFlightController implements Initializable{
    public static String[] userInfo;
    @FXML
    private Label BookingFlight;
    @FXML
    private Label BookingNumber;
    @FXML
    private Label Surname;
    @FXML
    private Label DepatureTime;
    @FXML
    private Label ArrivingTime;
    @FXML
    private Label DepatureCity;
    @FXML
    private Label ArrivingCity;


     public void ChangeText(){
         BookingFlight.setText(userInfo[0]);
         BookingNumber.setText(userInfo[1]);
         Surname.setText(userInfo[2]);
         DepatureTime.setText(userInfo[3]);
         ArrivingTime.setText(userInfo[4]);
         DepatureCity.setText(userInfo[5]);
         ArrivingCity.setText(userInfo[6]);
     }

    //private ViewAlter viewAlter;

    public BookedFlightController() {
        // TODO Auto-generated constructor stub
        //there is nothing to write, this page for just showing right?
    }

    @Override
    public void initialize(URL arg0, ResourceBundle arg1) {
        // TODO Auto-generated method stub
        userInfo = new String[7];
        OrderInfo orderInfo = (OrderInfo) StageManager.CONTROLLER.get("myLoginUserInfo");
        if(orderInfo == null){
            System.out.println("非法登录");
            return;
        }
        userInfo[0] = orderInfo.orders.get(orderInfo.orderIndex).getBookingFlight();
        userInfo[1] = orderInfo.orders.get(orderInfo.orderIndex).getBookingNumber();
        userInfo[2] = orderInfo.orders.get(orderInfo.orderIndex).getSurname();
        userInfo[3] = orderInfo.orders.get(orderInfo.orderIndex).getDepatureTime();
        userInfo[4] = orderInfo.orders.get(orderInfo.orderIndex).getArrivingTime();
        userInfo[5] = orderInfo.orders.get(orderInfo.orderIndex).getDepatureCity();
        userInfo[6] = orderInfo.orders.get(orderInfo.orderIndex).getArrivingCity();
        ChangeText();
    }

//    public void setApp(ViewAlter viewAlter) {
//        this.viewAlter = viewAlter;
//    }
}
