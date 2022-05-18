package group16.smartflightcheckinkiosk.Controller;
import group16.smartflightcheckinkiosk.Jumpto;
import group16.smartflightcheckinkiosk.Passager.service.OrderInfo;
import group16.smartflightcheckinkiosk.StageManager;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.text.Text;
import javafx.stage.Stage;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;


public class BoardingpassCheckController {
    @FXML
    private Text Surname;
    @FXML
    private Text idNumber;
    @FXML
    private Text BookingNumber;
    @FXML
    private Text FlightNumber;
    @FXML
    private Text Timetable;

    @FXML
    private Button back;
    @FXML
    private Button next;
    @FXML
    void onNextClick()throws Exception{
        //transport the parameter
        OrderInfo orderInfo = (OrderInfo) StageManager.CONTROLLER.get("myLoginUserInfo");
        String name = orderInfo.orders.get(orderInfo.orderIndex).getSurname();
        //String name= SurnameController.global_name;
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
               idNumber.setText(passenger[1]);
               BookingNumber.setText(passenger[0]);
               FlightNumber.setText(passenger[11]);
               Timetable.setText(passenger[14]+" to "+passenger[15]);
            }
        }
        catch (IOException e) {
            e.printStackTrace();
        }

        System.out.println("next button pressed");
        Jumpto jumpto = new Jumpto();
        jumpto.set("boardingpass.fxml", "boaringpass-printing");
        Stage stage = new Stage();
        jumpto.start(stage);
        Stage stage2 = (Stage) next.getScene().getWindow();
        stage2.close();
    }
    @FXML
    void onPrevClick() {
        System.out.println("prev button pressed");
        Stage stage = (Stage) back.getScene().getWindow();
        stage.close();
    }
}