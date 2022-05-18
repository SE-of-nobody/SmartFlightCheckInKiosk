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
        String[] passenger= new String[18];
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
                Date.setText(passenger[16]);
                Time.setText(passenger[14]+" to "+passenger[15]);
                Startpoint.setText(passenger[12]);
                Destination.setText(passenger[13]);
            }
            else{System.out.println("not found");}
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