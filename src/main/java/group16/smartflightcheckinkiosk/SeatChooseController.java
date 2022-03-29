package group16.smartflightcheckinkiosk;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.fxml.Initializable;

public class SeatChooseController implements Initializable {
    public SeatChooseController() {
        // TODO Auto-generated constructor stub
    }

    @Override
    public void initialize(URL arg0, ResourceBundle arg1) {
        // TODO Auto-generated method stub

    }

    public void changeWindow() throws Exception {
        group16.smartflightcheckinkiosk.SeatChoose seatchoose=new SeatChoose();
        seatchoose.showWindow();


    }

}
