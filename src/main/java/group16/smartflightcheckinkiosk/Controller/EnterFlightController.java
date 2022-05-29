package group16.smartflightcheckinkiosk.Controller;

import group16.smartflightcheckinkiosk.Jumpto;
import javafx.fxml.FXML;
import javafx.scene.control.TextField;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

/**
 * @author Ziding Lin, Liya Zhong
 * @version jdk-17
 */
public class EnterFlightController {
    @FXML
    private VBox EnterFlight;
    @FXML
    private TextField FlightnumField;

    public  String flightNum;
    public  int test=0;
    public static String flight_num;

    /**
     * back button event
     * @throws Exception click no response
     */
    @FXML
    void gotoStaffLogin()throws Exception{
        Jumpto jumpto = new Jumpto();
        jumpto.set("StaffLogin.fxml", "Login");
        Stage stage = new Stage();
        Stage stage_old = (Stage) EnterFlight.getScene().getWindow();
       stage_old.close();
       jumpto.start(stage);
    }

    /**
     * next button event
     * @throws Exception click no response
     */
    @FXML
    void gotoCheckFlight() throws Exception {
        flightNum=FlightnumField.getText();
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
                Jumpto jumpto = new Jumpto();
                jumpto.set("CheckFlight.fxml", "Check Flight");
                Stage stage = new Stage();
                Stage stage_old = (Stage) EnterFlight.getScene().getWindow();
                stage_old.close();
                jumpto.start(stage);
                test=1;
            }
            else{
                System.out.println("Input is wrong");
                FlightnumField.setText("");
            }
        }
        catch (IOException e) {
            e.printStackTrace();
        }

    }

}