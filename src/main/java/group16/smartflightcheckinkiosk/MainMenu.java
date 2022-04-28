package group16.smartflightcheckinkiosk;

import group16.smartflightcheckinkiosk.Controller.BookedFlightController;
import group16.smartflightcheckinkiosk.Controller.MealChooseController;
import group16.smartflightcheckinkiosk.Controller.SeatChooseController;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class MainMenu extends Application {
    Stage stage=new Stage();

    //这里加到登录后第一个页面的启动位置，用来传递所有的参数
    /*
    String[] Info = new String[5];
    public void setPageInfo(String[] Info){
        MealChooseController.userInfo=Info;
        SeatChooseController.userInfo=Info;
        BookedFlightController.userInfo=Info;
    }*/

    @Override
    public void start(Stage stage) throws Exception {
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("MainMenu.fxml"));
        Scene scene = new Scene(fxmlLoader.load());
        stage.setTitle("Hello!");
        stage.setScene(scene);
        stage.show();
    }
    public static void main(String[] args) {
        launch(args);
    }

}