package group16.smartflightcheckinkiosk.Controller;

import group16.smartflightcheckinkiosk.Jumpto;
import javafx.fxml.FXML;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.text.Text;
import javafx.stage.Stage;
/**
 * @author  Xiaoyi Liang
 * @version jdk15.0.2
 */
public class HelloController {
    @FXML
    private Text Sign;

    @FXML
    private TextField usernameField;

    @FXML
    private PasswordField passwordField;

    /**
     * button click event
     * @throws Exception click no response
     */
    @FXML
    protected void onSignButtonClick() throws Exception {
        Sign.setText("login failed");

        String username = usernameField.getText();
        String password = passwordField.getText();


        Jumpto jumpto = new Jumpto();
        jumpto.set("MainMenu.fxml", "MainMenu");
        Stage stage = new Stage();
        jumpto.start(stage);
    }

}