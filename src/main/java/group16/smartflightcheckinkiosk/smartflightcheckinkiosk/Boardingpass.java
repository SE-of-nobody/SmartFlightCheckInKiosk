package group16.smartflightcheckinkiosk;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;


public class Boardingpass extends Application {
    @Override
    public void start(Stage primaryStage) throws Exception {

        Parent root = FXMLLoader.load(getClass().getResource("boardingpass.fxml"));
        primaryStage.setScene(new Scene(root,400,400));
        primaryStage.setTitle("Check in book number");

        primaryStage.show();
    }
    public static void main(String[] args) {

        launch(args);
    }
}

