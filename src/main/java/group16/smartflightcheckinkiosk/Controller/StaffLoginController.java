package group16.smartflightcheckinkiosk.Controller;

import group16.smartflightcheckinkiosk.ViewAlter;
import javafx.fxml.FXML;
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
