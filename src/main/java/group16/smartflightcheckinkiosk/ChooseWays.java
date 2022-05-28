package group16.smartflightcheckinkiosk;

import group16.smartflightcheckinkiosk.StageManager;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class ChooseWays extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        //打开login界面
        FXMLLoader root = new FXMLLoader(getClass().getResource("PassengerLogin.fxml"));
        Scene scene = new Scene(root.load());
        stage.setTitle("Login");
        stage.setScene(scene);
        stage.show();

        // Store login stage
        StageManager.STAGE.put("login", stage);
        StageManager.CONTROLLER.put("chooseWays", this);
    }

    public static void main(String[] args) {
        launch();
    }
}