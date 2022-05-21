package group16.smartflightcheckinkiosk.Controller;

import group16.smartflightcheckinkiosk.Jumpto;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.layout.VBox;
import javafx.scene.text.Text;
import javafx.stage.Stage;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;


public class CheckFlightController implements Initializable {

    @FXML
    private VBox CheckFlight;
    @FXML
    private Button b5;
    @FXML
    private Button b6;
    @FXML
    private Text FlightNum;
    @FXML
    private Text Time;
    @FXML
    private Text Startpoint;
    @FXML
    private Text Destination;
    @FXML
    private Text Date;
    @FXML
    void gotoEnterFlight(ActionEvent event)throws Exception{
        Jumpto jumpto = new Jumpto();
        jumpto.set("EnterFlight.fxml", "Back-end System");
        Stage stage = new Stage();
        Stage stage_old = (Stage) CheckFlight.getScene().getWindow();
        stage_old.close();
        jumpto.start(stage);
    }

    public void initialize(URL arg0, ResourceBundle arg1){
        String flightNum= EnterFlightController.flight_num;

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
                if (passenger[11].equals(flightNum)) {
                    break;
                }
            }
            if(passenger[11].equals(flightNum)){
                System.out.println("found");
                FlightNum.setText(flightNum);
                Time.setText(passenger[14]+" to "+passenger[15]);
                Startpoint.setText(passenger[12]);
                Destination.setText(passenger[13]);
            }
            else{System.out.println("not found");}
        }
        catch (IOException e) {
            e.printStackTrace();
        }


        //read passenger csv
        String csvFile2 = "src/main/resources/group16/smartflightcheckinkiosk/PassengerInfo.csv";
        String[] flight= new String[6];
        String line2 = "";
        String cvsSplitBy2 = ",";
        //match the information
        try (BufferedReader br2 = new BufferedReader(new FileReader(csvFile2))) {

            while ((line2 = br2.readLine()) != null) {

                // use comma as separator
                flight = line2.split(cvsSplitBy2);
                // check the name
                if (flight[3].equals(flightNum)) {
                    break;
                }
            }
            if(flight[3].equals(flightNum)){
              Date.setText(flight[5]);
            }
        }
        catch (IOException e) {
            e.printStackTrace();
        }
    }
    @FXML
    void gotoFlightList(ActionEvent event) throws Exception {
        Jumpto jumpto = new Jumpto();
        jumpto.set("FlightList.fxml", "Back-end System");
        Stage stage = new Stage();
        Stage stage_old = (Stage) CheckFlight.getScene().getWindow();
        stage_old.close();
        jumpto.start(stage);
    }

}