package group16.smartflightcheckinkiosk;

import javafx.stage.Stage;

import java.util.HashMap;
import java.util.Map;

//不用研究这个，我也不是很懂，用就完事了，具体用法去看IDdocController,SurnameController和BooknumController这三个代码
//主要是用来存储stage的，方便在任何位置控制存储的stage
public class StageManager {
    public static Map<String, Stage> STAGE=new HashMap<String, Stage>();
    public static Map<String, Object> CONTROLLER=new HashMap<String, Object>();
}