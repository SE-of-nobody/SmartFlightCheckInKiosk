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
import java.util.ArrayList;
import java.util.ResourceBundle;


public class FlightListController implements Initializable {

    @FXML
    private VBox FlightList;
    @FXML
    private Button b7;
    @FXML
    private Text Namefield1, Namefield2, Namefield3, Namefield4;
    @FXML
    private Text Gender1, Gender2, Gender3, Gender4;
    @FXML
    private Text Seatfield1, Seatfield2, Seatfield3, Seatfield4;
    @FXML
    private Text Statusfield1, Statusfield2, Statusfield3, Statusfield4;

    @FXML
    void gotoCheckFlight(ActionEvent event) throws Exception {
        Jumpto jumpto = new Jumpto();
        jumpto.set("CheckFlight.fxml", "Back-end System");
        Stage stage = new Stage();
        Stage stage_old = (Stage) FlightList.getScene().getWindow();
        stage_old.close();
        jumpto.start(stage);
    }

    @FXML
    public void initialize(URL arg0, ResourceBundle arg1) {
        String flightNum = EnterFlightController.flight_num;
        ArrayList<Text> namelist = new ArrayList<>();
        namelist.add(Namefield1);
        namelist.add(Namefield2);
        namelist.add(Namefield3);
        namelist.add(Namefield4);
        ArrayList<Text> genderlist = new ArrayList<>();
        genderlist.add(Gender1);
        genderlist.add(Gender2);
        genderlist.add(Gender3);
        genderlist.add(Gender4);
        ArrayList<Text> seatlist = new ArrayList<>();
        seatlist.add(Seatfield1);
        seatlist.add(Seatfield2);
        seatlist.add(Seatfield3);
        seatlist.add(Seatfield4);
        ArrayList<Text> statuslist = new ArrayList<>();
        statuslist.add(Statusfield1);
        statuslist.add(Statusfield2);
        statuslist.add(Statusfield3);
        statuslist.add(Statusfield4);


        //read passenger csv
        String csvFile = "src/main/resources/group16/smartflightcheckinkiosk/data.csv";
        String line = "";
        String cvsSplitBy = ",";
        String[] passenger = new String[16];
        int i=0;
        //match the information
        try (BufferedReader br = new BufferedReader(new FileReader(csvFile))) {

            while ((line = br.readLine()) != null) {
                // use comma as separator
                passenger = line.split(cvsSplitBy);
                // check the name
                if (passenger[11].equals(flightNum)) {
                    namelist.get(i).setText(passenger[2]);
                    seatlist.get(i).setText(passenger[6]);
                    statuslist.get(i).setText("yes");
                    i++;
                }
            }
            System.out.println("over");
        }  catch (IOException e) {
            e.printStackTrace();
        }

        //read passenger csv
        String csvFile2 = "src/main/resources/group16/smartflightcheckinkiosk/PassengerInfo.csv";
        String[] flight= new String[6];
        String line2 = "";
        String cvsSplitBy2 = ",";
        int i1=0;
        //match the information
        try (BufferedReader br2 = new BufferedReader(new FileReader(csvFile2))) {

            while ((line2 = br2.readLine()) != null) {

                // use comma as separator
                flight = line2.split(cvsSplitBy2);
                // check the name
                if(flight[3].equals(flightNum)){
                    genderlist.get(i1).setText(flight[4]);
                    i1++;
                }
            }
        }
        catch (IOException e) {
            e.printStackTrace();
        }

    }
}