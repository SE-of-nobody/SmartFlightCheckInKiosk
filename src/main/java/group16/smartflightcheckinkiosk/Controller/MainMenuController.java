package group16.smartflightcheckinkiosk.Controller;

import group16.smartflightcheckinkiosk.Jumpto;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.ScrollPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class MainMenuController {



    @FXML
    private VBox rootLayout;
    @FXML
    void quit(ActionEvent event)throws Exception{
        Jumpto jumpto = new Jumpto();
        jumpto.set("choose-login.fxml", "Login");
        Stage stage = new Stage();
        Stage stage_old = (Stage) rootLayout.getScene().getWindow();
        stage_old.close();
        jumpto.start(stage);
    }
    @FXML
    void gotoMealChoose(ActionEvent event) throws Exception {
        Jumpto jumpto = new Jumpto();
        jumpto.set("MealChoose.fxml", "Meal Choose");
        Stage stage = new Stage();
        jumpto.start(stage);
    }
    @FXML
    void gotoSeatChoose(ActionEvent event) throws Exception {
        Jumpto jumpto = new Jumpto();
        jumpto.set("SeatChoose.fxml", "Seat Choose");
        Stage stage = new Stage();
        jumpto.start(stage);
    }

    @FXML
    void gotoBookedFlight(ActionEvent event) throws Exception {
        Jumpto jumpto = new Jumpto();
        jumpto.set("BookedFlight.fxml", "Booked Flight");
        Stage stage = new Stage();
        jumpto.start(stage);
    }

}
