package group16.smartflightcheckinkiosk;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.fxml.Initializable;

public class MealChooseController implements Initializable {
    private ViewAlter viewAlter;
    public MealChooseController() {
        // TODO Auto-generated constructor stub
    }

    @Override
    public void initialize(URL arg0, ResourceBundle arg1) {
        // TODO Auto-generated method stub

    }

    public void setApp(ViewAlter viewAlter) {
        this.viewAlter = viewAlter;
    }

}
