package group16.smartflightcheckinkiosk;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.text.Text;
import javafx.event.ActionEvent;
import javafx.scene.control.Label;
import java.io.IOException;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
public class BoardingpassController {
    @FXML
    private Label Passenger;
    @FXML
    private Label Staff;
    @FXML
    private Label label_ok;
    @FXML
    private Label label_help;
    @FXML
    public void onOKClick() throws IOException {
        Stage primaryStage=(Stage)label_ok.getScene().getWindow();primaryStage.close();
        ticketShow();boardingpassShow();tagShow();
        System.out.println("you choose ok");}
    @FXML
    protected void onHelpClick() {
        System.out.println("you choose help");}
    public void ticketShow() throws IOException{
        Parent root = FXMLLoader.load(getClass().getResource("boardingpass-ticket.fxml"));
        Stage primaryStage=new Stage();
        primaryStage.setScene(new Scene(root,200,400));
        primaryStage.setTitle("Check in book number"); primaryStage.show();
    }
    public void boardingpassShow() throws IOException{
        Parent root = FXMLLoader.load(getClass().getResource("boardingpass-boardingpass.fxml"));
        Stage primaryStage=new Stage();
        primaryStage.setScene(new Scene(root,200,200));
        primaryStage.setTitle("Check in book number"); primaryStage.show();
    }
    public void tagShow() throws IOException{
        Parent root = FXMLLoader.load(getClass().getResource("boardingpass-tag.fxml"));
        Stage primaryStage=new Stage();
        primaryStage.setScene(new Scene(root,200,200));
        primaryStage.setTitle("Check in book number"); primaryStage.show();
    }
}
