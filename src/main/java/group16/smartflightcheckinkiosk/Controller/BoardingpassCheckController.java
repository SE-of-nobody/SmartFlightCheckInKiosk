package group16.smartflightcheckinkiosk.Controller;
import group16.smartflightcheckinkiosk.Jumpto;
import group16.smartflightcheckinkiosk.Passager.service.OrderInfo;
import group16.smartflightcheckinkiosk.StageManager;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.text.Text;
import javafx.stage.Stage;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

/**
 * @author Ziding Lin, Ruoqi Zhang
 * @version jdk-17
 */

public class BoardingpassCheckController implements Initializable {
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
    private Text meal;
    @FXML
    private Text seat;

    @FXML
    private Button back;
    @FXML
    private Button next;

    public int test=0;
    public String name;


    /**
     * Next button event
     * @throws Exception Click no response
     */

    @FXML
    void onNextClick() throws Exception {

        System.out.println("next button pressed");
        Jumpto jumpto = new Jumpto();
        jumpto.set("boardingpass.fxml", "boaringpass-2");
        Stage stage = new Stage();
        jumpto.start(stage);
        Stage stage_old = (Stage)next.getScene().getWindow();
        stage_old.close();
        jumpto.start(stage);
    }

    /**
     * initialize the information
     * @param arg0 URL
     * @param arg1 ResourceBundle
     */
    public void initialize(URL arg0, ResourceBundle arg1){
        //                //transport the parameter
        OrderInfo orderInfo = (OrderInfo) StageManager.CONTROLLER.get("myLoginUserInfo");
        name = orderInfo.orders.get(orderInfo.orderIndex).getSurname();
//        //String name= SurnameController.global_name;
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
                seat.setText(passenger[6]);
                meal.setText(passenger[3]);
                idNumber.setText(passenger[1]);
                BookingNumber.setText(passenger[0]);
                FlightNumber.setText(passenger[11]);
                Timetable.setText(passenger[14]+" to "+passenger[15]);
                test=1;
            }
        }
        catch (IOException e) {
            e.printStackTrace();
        }
    }

    /**
     * Prev button event
     * @throws Exception Click no response
     */

    @FXML
    public void onPrevClick() throws Exception {
        Jumpto jumpto = new Jumpto();
        jumpto.set("MainMenu.fxml", "MainMenu");
        Stage stage = new Stage();
        Stage stage_old = (Stage) back.getScene().getWindow();
        stage_old.close();
        jumpto.start(stage);
    }
}