package group16.smartflightcheckinkiosk.Controller;

import java.net.URL;
import java.util.ResourceBundle;

import group16.smartflightcheckinkiosk.Jumpto;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.fxml.Initializable;
import javafx.scene.control.ScrollPane;
import javafx.stage.Stage;


public class SeatChooseController implements Initializable {
    public static String[] userInfo;

    @FXML
    private Button A1;
    @FXML
    private Button A2;
    @FXML
    private Button B1;
    @FXML
    private Button B2;
    @FXML
    private Button C1;
    @FXML
    private Button C2;
    @FXML
    private ScrollPane SeatChoosePane;

    public SeatChooseController() {
        // TODO Auto-generated constructor stub
    }

    @Override
    public void initialize(URL arg0, ResourceBundle arg1) {
        // TODO Auto-generated method stub

    }



    @FXML
    public String ButtonClicked(ActionEvent event){
        Button button = (Button) event.getSource();
        String ChoosedSeat = (String) button.getId();
        System.out.println(ChoosedSeat);
        return ChoosedSeat;


    }


    @FXML
    public void gotoMainMenu(ActionEvent event) throws Exception {
        Jumpto jumpto = new Jumpto();
        jumpto.set("MainMenu.fxml", "MainMenu");
        Stage stage = new Stage();
        Stage stage_old = (Stage) SeatChoosePane.getScene().getWindow();
        stage_old.close();
        jumpto.start(stage);
    }




}