package group16.smartflightcheckinkiosk;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

import java.io.IOException;

public class LoginController {
    public AnchorPane login;
    public Label confirm;
    @FXML
    private Button booknum_button;
    @FXML
    private Button iddoc_button;
    @FXML
    private Button surname_button;

    @FXML
    void way1(ActionEvent event) throws IOException {
        FXMLLoader fxml1 = new FXMLLoader(getClass().getResource("BookNum.fxml"));
        Scene scene = new Scene(fxml1.load());
        Stage stage = new Stage();
        stage.setTitle("Booking Number");
        stage.setScene(scene);
        stage.show();
    }

    @FXML
    void way2(ActionEvent event) throws IOException {
        FXMLLoader fxml2 = new FXMLLoader(getClass().getResource("Surname.fxml"));
        Scene scene = new Scene(fxml2.load());
        Stage stage = new Stage();
        stage.setTitle("Surname & ID Number");
        stage.setScene(scene);
        stage.show();
    }

    @FXML
    void way3(ActionEvent event) throws IOException{
        FXMLLoader fxml3 = new FXMLLoader(getClass().getResource("IDdoc.fxml"));
        Scene scene = new Scene(fxml3.load());
        Stage stage = new Stage();
        stage.setTitle("ID Document");
        stage.setScene(scene);
        stage.show();
    }

}
