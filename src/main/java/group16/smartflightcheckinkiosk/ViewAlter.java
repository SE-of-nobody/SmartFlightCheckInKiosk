package group16.smartflightcheckinkiosk;



import java.io.InputStream;
import java.util.logging.Level;
import java.util.logging.Logger;

import group16.smartflightcheckinkiosk.Controller.BookedFlightController;
import group16.smartflightcheckinkiosk.Controller.ChooseLoginController;
import group16.smartflightcheckinkiosk.Controller.MealChooseController;
import group16.smartflightcheckinkiosk.Controller.SeatChooseController;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.fxml.JavaFXBuilderFactory;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;




public class ViewAlter extends Application{
    private static final Logger logger = Logger.getLogger(ViewAlter.class.getName());
    private Stage stage;
    @Override
    public void start(Stage primaryStage) throws Exception {
        stage = primaryStage;
        stage.setTitle("FXML Login Sample");
        gotoChooseLogin();
        stage.show();
    }
    /**
     * 跳转到登录
     */
    public void gotoChooseLogin() {
        try {
            ChooseLoginController chooseLogin = (ChooseLoginController) replaceSceneContent("choose-login.fxml");
            chooseLogin.setApp(this);
        } catch (Exception ex) {
            logger.log(Level.SEVERE, null, ex);
        }
    }
    /**
     * 跳转到选餐
     */
    public void gotoMealChoose() {
        try {
            MealChooseController mealchoose = (MealChooseController) replaceSceneContent("MealChoose.fxml");
            mealchoose.setApp(this);
        } catch (Exception ex) {
            logger.log(Level.SEVERE, null, ex);
        }
    }
    /**
     * 跳转到查看航班详情
     */
    public void gotoBookedFlight() {
        try {
            BookedFlightController view = (BookedFlightController) replaceSceneContent("BookedFlight.fxml");
            view.setApp(this);
        } catch (Exception ex) {
            logger.log(Level.SEVERE, null, ex);
        }
    }

    /**
     * 跳转到选座
     */
    public void gotoSeatChoose() {
        try {
            SeatChooseController seatchoose = (SeatChooseController) replaceSceneContent("SeatChoose.fxml");
            seatchoose.setApp(this);
        } catch (Exception ex) {
            logger.log(Level.SEVERE, null, ex);
        }
    }
    /**
     * 跳转到EnterFlight页面(从StaffLogin页面)
     */
    public void gotoEnterFlight() {
        try {
            EnterFlightController view = (EnterFlightController) replaceSceneContent(StaticResourcesConfig.ENTERFLIGHT_PATH);
            view.setApp(this);
        } catch (Exception ex) {
            logger.log(Level.SEVERE, null, ex);
        }
    }
    /**
     * 跳转到CheckFlight页面(从EnterFlight页面)
     */
    public void gotoCheckFlight() {
        try {
            StaffLoginController view = (StaffLoginController) replaceSceneContent(StaticResourcesConfig.CHECKFLIGHT_PATH);
            view.setApp(this);
        } catch (Exception ex) {
            logger.log(Level.SEVERE, null, ex);
        }
    }
    /**
     * 跳转到FlightList页面(从CheckFlight页面)
     */
    public void gotoFlightList() {
        try {
            StaffLoginController view = (StaffLoginController) replaceSceneContent(StaticResourcesConfig.FLIGHTLIST_PATH);
            view.setApp(this);
        } catch (Exception ex) {
            logger.log(Level.SEVERE, null, ex);
        }
    }

    /**
     * 替换场景
     * @param fxml
     * @return
     * @throws Exception
     */
    private Initializable replaceSceneContent(String fxml) throws Exception {
        FXMLLoader loader = new FXMLLoader();
        InputStream in = ViewAlter.class.getResourceAsStream(fxml);
        loader.setBuilderFactory(new JavaFXBuilderFactory());
        loader.setLocation(ViewAlter.class.getResource(fxml));
        AnchorPane page;
        try {
            page = (AnchorPane) loader.load(in);
        } finally {
            in.close();
        }
        Scene scene = new Scene(page);
        stage.setScene(scene);
        stage.sizeToScene();
        return (Initializable) loader.getController();}

    public static void main(String[] args) {
        launch(args);
    }
}




