package group16.smartflightcheckinkiosk;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class CheckFlight extends Application {
    Stage stage=new Stage();

    @Override
    public void start(Stage stage) throws Exception {
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("CheckFlight.fxml"));
        Scene scene = new Scene(fxmlLoader.load());
        stage.setTitle("Check Flight");
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
