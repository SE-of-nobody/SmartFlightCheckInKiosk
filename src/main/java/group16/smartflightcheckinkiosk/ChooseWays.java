package group16.smartflightcheckinkiosk;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class ChooseWays extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        FXMLLoader root = new FXMLLoader(getClass().getResource("Login.fxml"));
        Scene scene = new Scene(root.load());
        stage.setTitle("Login");
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }

    public static class MainMenu extends Application {
        Stage stage=new Stage();

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

        public void  showWindow() throws Exception {
            start(stage);
        }
    }
}