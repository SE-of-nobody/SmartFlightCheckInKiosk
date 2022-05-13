package group16.smartflightcheckinkiosk.Controller;

import java.net.URL;
import java.util.ResourceBundle;

import group16.smartflightcheckinkiosk.Jumpto;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class BookedFlightController implements Initializable{
    public static String[] userInfo;
    @FXML
    private Label BookingFlight;
    @FXML
    private Label BookingNumber;
    @FXML
    private Label Surname;
    @FXML
    private Label DepatureTime;
    @FXML
    private Label ArrivingTime;
    @FXML
    private Label DepatureCity;
    @FXML
    private Label ArrivingCity;
    @FXML
    private GridPane Flightpane;
     public void ChangeText(){
         BookingFlight.setText(String.valueOf(userInfo[0]));
         BookingNumber.setText(String.valueOf(userInfo[1]));
         Surname.setText(String.valueOf(userInfo[2]));
         DepatureTime.setText(String.valueOf(userInfo[3]));
         ArrivingTime.setText(String.valueOf(userInfo[4]));
         DepatureCity.setText(String.valueOf(userInfo[5]));
         ArrivingCity.setText(String.valueOf(userInfo[6]));
     }


    public BookedFlightController() {
        // TODO Auto-generated constructor stub
    }

    @Override
    public void initialize(URL arg0, ResourceBundle arg1) {
        // TODO Auto-generated method stub

    }

    @FXML
    public void gotoMainMenu(ActionEvent event) throws Exception {
        Jumpto jumpto = new Jumpto();
        jumpto.set("MainMenu.fxml", "MainMenu");
        Stage stage = new Stage();
        Stage stage_old = (Stage) Flightpane.getScene().getWindow();
        stage_old.close();
        jumpto.start(stage);
    }
}
