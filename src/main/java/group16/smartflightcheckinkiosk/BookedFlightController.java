package group16.smartflightcheckinkiosk;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.Initializable;

public class BookedFlightController implements Initializable{
    public BookedFlightController() {
        // TODO Auto-generated constructor stub
    }

    @Override
    public void initialize(URL arg0, ResourceBundle arg1) {
        // TODO Auto-generated method stub

    }

    public void changeWindow() throws Exception {
        group16.smartflightcheckinkiosk.BookedFlight bookedflight=new BookedFlight();
        bookedflight.showWindow();


    }
}
