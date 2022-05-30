package group16.smartflightcheckinkiosk.Controller;

import group16.smartflightcheckinkiosk.Data.Passager.service.OrderInfo;
import group16.smartflightcheckinkiosk.StageManager;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;

import java.net.URL;
import java.util.ResourceBundle;

/**
 * booked flight
 * @author Zhishang Yu, Xiaoyi Liang
 * @version jdk15.0.2
 */
public class BookedFlightController implements Initializable{
    /**
     * user information
     */
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

    /**
     * change the text
     */
     public void ChangeText(){
         BookingFlight.setText(userInfo[0]);
         BookingNumber.setText(userInfo[1]);
         Surname.setText(userInfo[2]);
         DepatureTime.setText(userInfo[3]);
         ArrivingTime.setText(userInfo[4]);
         DepatureCity.setText(userInfo[5]);
         ArrivingCity.setText(userInfo[6]);
     }


    /**
     * constructor
     */
    public BookedFlightController() {
        // TODO Auto-generated constructor stub
        //there is nothing to write, this page for just showing right?
    }

    /**
     * initialize the information
     * @param arg0 URL
     * @param arg1 ResourceBundle
     */
    @Override
    public void initialize(URL arg0, ResourceBundle arg1) {
        // TODO Auto-generated method stub
        userInfo = new String[7];
        OrderInfo orderInfo = (OrderInfo) StageManager.CONTROLLER.get("myLoginUserInfo");
        if(orderInfo == null){
            System.out.println("The illegal log in");
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

}
