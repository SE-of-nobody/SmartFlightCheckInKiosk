package group16.smartflightcheckinkiosk.Passager.util;

import java.util.HashMap;
import java.util.ResourceBundle;

//存放静态变量的类
public class VarUtil {
    //csv文件路径，和编码
    public static final String DATAPATH = "src/main/resources/group16/smartflightcheckinkiosk/data.csv";
    public static final String LOGINPATH = "src/main/resources/group16/smartflightcheckinkiosk/login.csv";
    public static final String SAVEPATH = "src/main/resources/group16/smartflightcheckinkiosk/data.csv";
    public static final String CHARSET = "UTF-8";

    //各种座位和食物类型的价格
    public static final double MEAL_A = Double.parseDouble(ResourceBundle.getBundle("price").getString("meal_A"));
    public static final double MEAL_B = Double.parseDouble(ResourceBundle.getBundle("price").getString("meal_B"));
    public static final double MEAL_C = Double.parseDouble(ResourceBundle.getBundle("price").getString("meal_C"));
    public static final double MEAL_D = Double.parseDouble(ResourceBundle.getBundle("price").getString("meal_D"));
    public static final double SEAT_A = Double.parseDouble(ResourceBundle.getBundle("price").getString("seat_A"));
    public static final double SEAT_B = Double.parseDouble(ResourceBundle.getBundle("price").getString("seat_B"));
    public static final double SEAT_C = Double.parseDouble(ResourceBundle.getBundle("price").getString("seat_C"));
    public static final double SEAT_D = Double.parseDouble(ResourceBundle.getBundle("price").getString("seat_D"));
}
