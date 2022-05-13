package group16.smartflightcheckinkiosk.Controller;

import java.net.URL;
import java.util.ResourceBundle;

import group16.smartflightcheckinkiosk.Jumpto;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TabPane;
import javafx.stage.Stage;

public class MealChooseController implements Initializable {

    public static String[] userInfo;

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
    @FXML
    private TabPane mealpane;
    public MealChooseController() {
        // TODO Auto-generated constructor stub
    }

    @Override
    public void initialize(URL arg0, ResourceBundle arg1) {
        // TODO Auto-generated method stub

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
    public void orderButtonClicked(ActionEvent event) throws Exception {
        Button button = (Button) event.getSource();
        String ChoosedMeal = (String) button.getId();
        System.out.println(ChoosedMeal);
        //这里会跳转回主菜单
        Jumpto jumpto = new Jumpto();
        jumpto.set("MainMenu.fxml", "MainMenu");
        Stage stage = new Stage();
        Stage stage_old = (Stage) mealpane.getScene().getWindow();
        stage_old.close();
        jumpto.start(stage);
    }


}
