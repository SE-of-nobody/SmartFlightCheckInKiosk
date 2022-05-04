package group16.smartflightcheckinkiosk.Controller;

import group16.smartflightcheckinkiosk.ViewAlter;
import javafx.fxml.FXML;
<<<<<<< HEAD
import group16.smartflightcheckinkiosk.Jumpto;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.ScrollPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;



public class StaffLoginController {

    @FXML
    private VBox StaffLogin;
    @FXML
    private Button b3;
    @FXML
    private Button b4;
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
        Jumpto jumpto = new Jumpto();
        jumpto.set("EnterFlight.fxml", "Back-end System");
        Stage stage = new Stage();
        Stage stage_old = (Stage) StaffLogin.getScene().getWindow();
        stage_old.close();
        jumpto.start(stage);
    }

}
=======
import javafx.scene.control.TextField;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;


public class StaffLoginController {
    private ViewAlter viewAlter;

    @FXML
    private TextField staffnumField;

    @FXML
    protected void gotoEnterFlight() {
        //get text
        String staffNumber=staffnumField.getText();
        //read passenger csv
        String csvFile = " src/main/resources/group16.smartflightcheckinkiosk/Staff.csv";
        String line = "";
        String cvsSplitBy = ",";
        String[] staff= new String[2];
        //match the information
        try (BufferedReader br = new BufferedReader(new FileReader(csvFile))) {

            while ((line = br.readLine()) != null) {

                // use comma as separator
                staff = line.split(cvsSplitBy);
                // check the name
                if (staff[0].equals(staffNumber)) {
                    break;
                }
            }
            if(staff[0].equals(staffNumber)){
                //Page jump

            }
        }
        catch (IOException e) {
            e.printStackTrace();
        }

        System.out.println("Log in successfully!");}
    public void setApp(ViewAlter viewAlter) {
        this.viewAlter = viewAlter;
    }

}
>>>>>>> 160a3813b44c0c84fd5e778ac1fa9b8823558b8e
