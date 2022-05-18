package group16.smartflightcheckinkiosk.Controller;

import group16.smartflightcheckinkiosk.Passager.service.OrderInfo;
import group16.smartflightcheckinkiosk.StageManager;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.text.Text;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

public class BoardingpassBoardingpassController implements Initializable {
    @FXML
    private Text Surname;
    @FXML
    private Text FlightNumber;
    @FXML
    private Text Timetable;
    @FXML
    private Text StartPoint;
    @FXML
    private Text Destination;
    @FXML
    private Text SeatNumber;



    @Override
    public void initialize(URL arg0, ResourceBundle arg1) {
        // TODO Auto-generated method stub
        //transport the parameter
//        String name= SurnameController.global_name;
        OrderInfo orderInfo = (OrderInfo) StageManager.CONTROLLER.get("myLoginUserInfo");
        String name = orderInfo.orders.get(orderInfo.orderIndex).getSurname();
        //read passenger csv
        String csvFile = "src/main/resources/group16/smartflightcheckinkiosk/data.csv";
        String line = "";
        String cvsSplitBy = ",";
        String[] passenger= new String[16];
        //match the information
        try (BufferedReader br = new BufferedReader(new FileReader(csvFile))) {

            while ((line = br.readLine()) != null) {

                // use comma as separator
                passenger = line.split(cvsSplitBy);
                // check the name
                if (passenger[2].equals(name)) {
                    break;
                }
            }
            if(passenger[2].equals(name)){
                Surname.setText(name);
                FlightNumber.setText(passenger[11]);
                SeatNumber.setText(passenger[6]);
                Timetable.setText(passenger[14]+" to "+passenger[15]);
                StartPoint.setText(passenger[12]);
                Destination.setText(passenger[13]);
            }
        }
        catch (IOException e) {
            e.printStackTrace();
        }

    }


}