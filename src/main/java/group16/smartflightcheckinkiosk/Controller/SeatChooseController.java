package group16.smartflightcheckinkiosk.Controller;

import java.io.InputStream;
import java.net.URL;
import java.util.ResourceBundle;

import group16.smartflightcheckinkiosk.Jumpto;
import group16.smartflightcheckinkiosk.ViewAlter;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.fxml.Initializable;
import javafx.scene.control.ScrollPane;
import javafx.stage.Stage;


public class SeatChooseController implements Initializable {
    private ViewAlter viewAlter;

    public SeatChooseController() {
        // TODO Auto-generated constructor stub
    }

    @Override
    public void initialize(URL arg0, ResourceBundle arg1) {
        // TODO Auto-generated method stub

    }

    public void setApp(ViewAlter viewAlter) {

        this.viewAlter = viewAlter;
    }

    public void A1() { //Allinfor[3].setSeat("A1");
        System.out.print("assa");
        //asdsa.changefood();
    }

@FXML
    void gotoMealChoose(ActionEvent event) throws Exception {
        Jumpto jumpto = new Jumpto();
        jumpto.set("MealChoose.fxml", "Meal Choose");
        Stage stage = new Stage();

        jumpto.start(stage);
    }




}