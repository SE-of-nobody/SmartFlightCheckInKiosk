package group16.smartflightcheckinkiosk.Controller;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.text.Text;

public class BoardingpassTagController implements Initializable{
    @FXML
    private Text Surname;
    @FXML
    private Text FlightNumber;
    @FXML
    private Text Tag;



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
            }
        }
        catch (IOException e) {
            e.printStackTrace();
        }
        //read flight csv
        String csvFile1 = " src/main/resources/group16.smartflightcheckinkiosk/Luggage.csv";
        String[] luggage= new String[4];
        //match the flight
        try (BufferedReader br = new BufferedReader(new FileReader(csvFile1))) {

            while ((line = br.readLine()) != null) {

                // use comma as separator
                luggage = line.split(cvsSplitBy);
                // check the name
                if (luggage[0].equals(name)) {
                    break;
                }
            }
            if (luggage[0].equals(name)) {
                Tag.setText(luggage[3]);
            }
        }
        catch (IOException e) {
            e.printStackTrace();
        }
    }


}