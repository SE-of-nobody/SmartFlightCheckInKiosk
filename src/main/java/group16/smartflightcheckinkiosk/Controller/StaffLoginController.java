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
public class StaffLoginController {

    @FXML
    private VBox StaffLogin;
    @FXML
    private TextField staffnumField;
    public String staff_num;
    public int test=0;

    /**
     * back button event
     * @throws Exception click no response
     */
    @FXML
    void gotoChooseLogin() throws Exception{
        Jumpto jumpto = new Jumpto();
        jumpto.set("ChooseLogin.fxml", "Login");
        Stage stage = new Stage();
        Stage stage_old = (Stage) StaffLogin.getScene().getWindow();
        stage_old.close();
        jumpto.start(stage);
    }

    /**
     * next button event
     * @throws Exception click no response
     */
    @FXML
    public void gotoEnterFlight() throws Exception {
        staff_num= staffnumField.getText();
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
                test=1;
            }
            else{
                System.out.println("Input is wrong");
                staffnumField.setText("");
            }
        }
        catch (IOException e) {
            e.printStackTrace();
        }

    }

}
