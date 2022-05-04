package group16.smartflightcheckinkiosk.Controller;

import group16.smartflightcheckinkiosk.ViewAlter;
import javafx.fxml.FXML;
import javafx.scene.control.TextField;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class EnterFlightController {
    private ViewAlter viewAlter;
    @FXML
    private TextField FlightnumField;
    @FXML
    protected void gotoCheckFlight() {
        //get text
        String flightNumber=FlightnumField.getText();
        // Test
        System.out.println("hhh:"+ flightNumber);
        //read passenger csv
        String csvFile = " src/main/resources/group16.smartflightcheckinkiosk/Flight.csv";
        String line = "";
        String cvsSplitBy = ",";
        String[] flight= new String[4];
        //match the information
        try (BufferedReader br = new BufferedReader(new FileReader(csvFile))) {

            while ((line = br.readLine()) != null) {

                // use comma as separator
                flight = line.split(cvsSplitBy);
                // check the name
                if (flight[0].equals(flightNumber)) {
                    break;
                }
            }
            if(flight[0].equals(flightNumber)){
                //Page jump

            }
        }
        catch (IOException e) {
            e.printStackTrace();
        }

        System.out.println("Check Flight");}
    public void setApp(ViewAlter viewAlter) {
        this.viewAlter = viewAlter;
    }

}
