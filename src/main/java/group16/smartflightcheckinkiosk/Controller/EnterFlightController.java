package group16.smartflightcheckinkiosk.Controller;

import group16.smartflightcheckinkiosk.Jumpto;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;


public class EnterFlightController {
    @FXML
    private VBox EnterFlight;
    @FXML
    private TextField FlightnumField;
    @FXML
    private Button b3;
    @FXML
    private Button b4;

    public static String flight_num;

    @FXML
    void gotoStaffLogin(ActionEvent event)throws Exception{
        Jumpto jumpto = new Jumpto();
        jumpto.set("StaffLogin.fxml", "Login");
        Stage stage = new Stage();
        Stage stage_old = (Stage) EnterFlight.getScene().getWindow();
       stage_old.close();
       jumpto.start(stage);
    }
    @FXML
    void gotoCheckFlight(ActionEvent event) throws Exception {
        String flightNum=FlightnumField.getText();
        flight_num=flightNum;
        //read passenger csv
        String csvFile = "src/main/resources/group16/smartflightcheckinkiosk/PassengerInfo.csv";
        String line = "";
        String cvsSplitBy = ",";
        String[] flight= new String[6];
        //match the information
        try (BufferedReader br = new BufferedReader(new FileReader(csvFile))) {

            while ((line = br.readLine()) != null) {

                // use comma as separator
                flight = line.split(cvsSplitBy);
                // check the name
                if (flight[3].equals(flightNum)) {
                    break;
                }
            }
            if(flight[3].equals(flightNum)){
                System.out.println("Flight is found");
                Jumpto jumpto = new Jumpto();
                jumpto.set("CheckFlight.fxml", "Check Flight");
                Stage stage = new Stage();
                Stage stage_old = (Stage) EnterFlight.getScene().getWindow();
                stage_old.close();
                jumpto.start(stage);
            }
            else{
                System.out.println("Input is wrong");
                FlightnumField.setText("");
            }
        }
        catch (IOException e) {
            e.printStackTrace();
        }
//        Jumpto jumpto = new Jumpto();
//        jumpto.set("CheckFlight.fxml", "Check Flight");
//        Stage stage = new Stage();
//        Stage stage_old = (Stage) EnterFlight.getScene().getWindow();
//        stage_old.close();
//        jumpto.start(stage);
    }

}