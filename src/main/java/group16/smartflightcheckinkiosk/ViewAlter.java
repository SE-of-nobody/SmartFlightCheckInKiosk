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
        stage.setTitle("XXXX系统");
        gotoChooseLogin();
        stage.show();
    }
    /**
     * 跳转到登录
     */
    public void gotoChooseLogin() {
        try {
            ChooseLoginController view = (ChooseLoginController) replaceSceneContent(StaticResourcesConfig.LOGINCHOOSE_VIEW_PATH);
            view.setApp(this);
        } catch (Exception ex) {
            logger.log(Level.SEVERE, null, ex);
        }
    }
    /**
     * 跳转到选餐
     */
    public void gotoMealChoose() {
        try {
            MealChooseController view = (MealChooseController) replaceSceneContent(StaticResourcesConfig.MEALCHOOSE_VIEW_PATH);
            view.setApp(this);
        } catch (Exception ex) {
            logger.log(Level.SEVERE, null, ex);
        }
    }
    /**
     * 跳转到查看航班详情
     */
    public void gotoBookedFlight() {
        try {
            BookedFlightController view = (BookedFlightController) replaceSceneContent(StaticResourcesConfig.BOOKEDFLIGHT_PATH);
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
            SeatChooseController view = (SeatChooseController) replaceSceneContent(StaticResourcesConfig.SEATCHOOSE_VIEW_PATH);
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
        try {
            AnchorPane page = (AnchorPane) loader.load(in);
            Scene scene = new Scene(page);
            stage.setScene(scene);
            stage.sizeToScene();
        } catch (Exception e) {
            logger.log(Level.SEVERE, "页面加载异常！");
        } finally {
            in.close();
        }
        return (Initializable) loader.getController();
    }}




