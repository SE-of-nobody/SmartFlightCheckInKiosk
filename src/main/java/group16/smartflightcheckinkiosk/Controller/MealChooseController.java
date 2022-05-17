package group16.smartflightcheckinkiosk.Controller;

import java.net.URL;
import java.util.List;
import java.util.Map;
import java.util.ResourceBundle;
import java.util.Scanner;

import group16.smartflightcheckinkiosk.Jumpto;
import group16.smartflightcheckinkiosk.Passager.service.OrderInfo;
import group16.smartflightcheckinkiosk.Passager.util.PlaneUtil;
import group16.smartflightcheckinkiosk.StageManager;
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

    public void MealChooseController(ActionEvent event) {
        // TODO Auto-generated constructor stub
        Button button = (Button) event.getSource();
        String mealPage = (String) button.getId();
        String meal = null;

        switch (mealPage){
            case "OrderMeal1":
                meal = LabelMeal1.getText();
                break;
            case "OrderMeal2":
                meal = LabelMeal2.getText();
                break;
            case "OrderMeal3":
                meal = LabelMeal3.getText();
                break;
        }

        //传来的用户数据
        OrderInfo orderInfo = (OrderInfo) StageManager.CONTROLLER.get("myLoginUserInfo");
        if (orderInfo == null) System.out.println("非法登录!!!");


        //获取用户选择的餐品名和价格
        String mealName = meal.substring(0, meal.indexOf("$"));
        Double mealPrice = Double.parseDouble(meal.substring(meal.indexOf("$") + 1, meal.length()));

        orderInfo.orders.get(orderInfo.orderIndex).setMeal(mealName);
        orderInfo.orders.get(orderInfo.orderIndex).setMealFee(mealPrice);
        //选择正确的路径
        PlaneUtil.setOrdersToCsv(orderInfo.orders , "src/main/resources/group16/smartflightcheckinkiosk/data.csv", "UTF-8");

        System.out.println("选择餐品成功");
    }



    @Override
    public void initialize(URL arg0, ResourceBundle arg1) {
        // TODO Auto-generated method stub
        setMeal(1, "西红柿炒蛋", 123.0);
        setMeal(2, "香菜肉丝", 3.0);
        setMeal(3, "黄瓜鸭血", 55.0);
    }


    @FXML
    public void setMeal(int type,String name, double price){
        switch(type){
            case 1:
                LabelMeal1.setText(name+"$"+price);
            case 2:
                LabelMeal2.setText(name+"$"+price);
            case 3:
                LabelMeal3.setText(name+"$"+price);
        }
    }


    @FXML
    public void orderButtonClicked(ActionEvent event){
        MealChooseController(event);
    }
    @FXML
    public void gotoMainMenu(ActionEvent event) throws Exception {
        Jumpto jumpto = new Jumpto();
        jumpto.set("MainMenu.fxml", "MainMenu");
        Stage stage = new Stage();
        Stage stage_old = (Stage) mealpane.getScene().getWindow();
        stage_old.close();
        jumpto.start(stage);
    }



}
