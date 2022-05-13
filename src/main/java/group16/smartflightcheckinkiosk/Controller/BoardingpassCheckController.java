package group16.smartflightcheckinkiosk.Controller;
import javafx.event.ActionEvent;
import group16.smartflightcheckinkiosk.Jumpto;
import javafx.fxml.FXML;
import javafx.scene.text.Text;
import javafx.stage.Stage;
import javafx.scene.control.Label;
import javafx.scene.control.Button;

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
        String name="";

        //read passenger csv
        String csvFile = " src/main/resources/group16.smartflightcheckinkiosk/PassengerInfo.csv";
        String line = "";
        String cvsSplitBy = ",";
        String[] passenger= new String[5];
        //match the information
        try (BufferedReader br = new BufferedReader(new FileReader(csvFile))) {

            while ((line = br.readLine()) != null) {

                // use comma as separator
                passenger = line.split(cvsSplitBy);
                // check the name
                if (passenger[0].equals(name)) {
                    break;
                }
            }
            if(passenger[0].equals(name)){
               Surname.setText(name);
               idNumber.setText(passenger[2]);
               BookingNumber.setText(passenger[1]);
               FlightNumber.setText(passenger[3]);
            }
        }
        catch (IOException e) {
            e.printStackTrace();
        }
        String flightNumber=passenger[3];
        //read flight csv
        String csvFile1 = " src/main/resources/group16.smartflightcheckinkiosk/Flight.csv";
        String[] flight= new String[4];
        //match the flight
        try (BufferedReader br = new BufferedReader(new FileReader(csvFile1))) {

            while ((line = br.readLine()) != null) {

                // use comma as separator
                flight = line.split(cvsSplitBy);
                // check the FlghtNumber
                if (flight[0].equals(flightNumber)) {
                    break;
                }
            }
            if (flight[0].equals(flightNumber)) {
                Timetable.setText(flight[3]);
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