package group16.smartflightcheckinkiosk.Controller;

import java.net.URL;
import java.util.ResourceBundle;

import group16.smartflightcheckinkiosk.ViewAlter;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;

public class MealChooseController implements Initializable {
    private ViewAlter viewAlter;
    @FXML
    private Label LabelMeal1;
    @FXML
    private Label LabelMeal2;
    @FXML
    private Label LabelMeal3;
    @FXML
    private Label LabelMealPic1;
    @FXML
    private Label LabelMealPic2;
    @FXML
    private Label LabelMealPic3;
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
    @FXML
    public void setMeal(int type,String name, double price){
        switch(type){
            case 1:
                LabelMeal1.setText(name+price+"$");
            case 2:
                LabelMeal2.setText(name+price+"$");
            case 3:
                LabelMeal3.setText(name+price+"$");
        }
    }
    @FXML
    public int ChooseMeal1() {
        return 1;
    }
    @FXML
    public int ChooseMeal2() {
        return 2;
    }
    @FXML
    public int ChooseMeal3() {
        return 3;
    }

}
