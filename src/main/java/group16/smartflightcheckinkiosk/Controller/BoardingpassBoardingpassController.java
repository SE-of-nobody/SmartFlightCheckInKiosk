package group16.smartflightcheckinkiosk.Controller;

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
                FlightNumber.setText(passenger[3]);
                SeatNumber.setText(passenger[4]);
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
                StartPoint.setText(flight[2]);
                Destination.setText(flight[1]);
            }
        }
        catch (IOException e) {
            e.printStackTrace();
        }
    }


}