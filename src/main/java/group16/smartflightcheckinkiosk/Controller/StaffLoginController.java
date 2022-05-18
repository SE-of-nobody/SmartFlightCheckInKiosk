package group16.smartflightcheckinkiosk.Controller;

import javafx.fxml.FXML;
import group16.smartflightcheckinkiosk.Jumpto;
import javafx.event.ActionEvent;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;


public class StaffLoginController {

    @FXML
    private VBox StaffLogin;
    @FXML
    private Button b3;
    @FXML
    private Button b4;
    @FXML
    private TextField staffnumField;
    @FXML
    void gotoChooseLogin(ActionEvent event)throws Exception{
        Jumpto jumpto = new Jumpto();
        jumpto.set("ChooseLogin.fxml", "Login");
        Stage stage = new Stage();
        Stage stage_old = (Stage) StaffLogin.getScene().getWindow();
        stage_old.close();
        jumpto.start(stage);
    }
    @FXML
    void gotoEnterFlight(ActionEvent event) throws Exception {
        String staff_num=staffnumField.getText();
        //read the csv
        String csvFile = "src/main/resources/group16/smartflightcheckinkiosk/Staff.csv";
        String line = "";
        String cvsSplitBy = ",";
        String[] staff= new String[2];

        try (BufferedReader br = new BufferedReader(new FileReader(csvFile))) {

            while ((line = br.readLine()) != null) {
                // use comma as separator
                staff = line.split(cvsSplitBy);
                // check the StaffNumber and Password
                if (staff[0].equals(staff_num)) {
                    break;
                }
            }
            if(staff[0].equals(staff_num)){
                Jumpto jumpto = new Jumpto();
                jumpto.set("EnterFlight.fxml", "Back-end System");
                Stage stage = new Stage();
                Stage stage_old = (Stage) StaffLogin.getScene().getWindow();
                stage_old.close();
                jumpto.start(stage);
                System.out.println("Check in");
            }
            else{
                System.out.println("Input is wrong");
                staffnumField.setText("");
            }
        }
        catch (IOException e) {
            e.printStackTrace();
        }

//        Jumpto jumpto = new Jumpto();
//        jumpto.set("EnterFlight.fxml", "Back-end System");
//        Stage stage = new Stage();
//        Stage stage_old = (Stage) StaffLogin.getScene().getWindow();
//        stage_old.close();
//        jumpto.start(stage);
    }

}
