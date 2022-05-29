package group16.smartflightcheckinkiosk.Passager.service;

import group16.smartflightcheckinkiosk.Passager.util.PlaneUtil;
import group16.smartflightcheckinkiosk.Passager.util.VarUtil;
import group16.smartflightcheckinkiosk.Passager.service.Order;

import java.util.Arrays;
import java.util.List;
import java.util.ResourceBundle;
import java.util.Scanner;

public class OrderInfo {



    public int orderIndex = -1;

    public List<Order> orders;

    public OrderInfo(){
        orders = this.getCSV(VarUtil.DATAPATH, VarUtil.CHARSET);
    }

    //业务方法
    public void startService(){
        Scanner scanner =new Scanner(System.in);
        System.out.println("请选择登陆模式(1 booking number, 2 用户名和ID, 3 核对csv文件): ");
        String choose = scanner.nextLine();
        //调用选择登陆模式的方法
        while(!chooseWays(choose, scanner)){
            System.out.println("\n登录失败，请重新选择(1/2/3)，或输入\"exit\"退出: ");
            choose = scanner.nextLine();
            if("exit".equals(choose)){
                System.exit(0);
            }
        }
        while(true){
            menu();
            choose = scanner.nextLine();
            switch (choose){
                case "1":{
                    this.setSeat(scanner);
                    break;
                }
                case "2":{
                    this.setMeal(scanner);
                    break;
                }
                case "3":{
                    this.payment(scanner);
                    break;
                }
                case "4":{
                    this.writeDisk(scanner);
                    break;
                }
                case "5":{
                    showInfo();
                    break;
                }
                case "6":{
                    System.out.println("bye bye (ಥ﹏ಥ)");
                    System.exit(0);
                    break;
                }
                default:
                    System.out.println("不要乱输，谢谢");
                    break;
            }
        }
    }

    //总菜单显示
    void menu(){
        System.out.println("** 请选择您需要的服务编号(1-6): ");
        System.out.println("*** 1 修改座位样式");
        System.out.println("*** 2 修改飞机餐种类");
        System.out.println("*** 3 结算价格");
        System.out.println("*** 4 保存到文件");
        System.out.println("*** 5 查看当前用户信息");
        System.out.println("*** 6 退出程序");
    }

    //修改座位样式
    void setSeat(Scanner scanner){
        PlaneUtil.setSeat(orders.get(orderIndex), scanner);
    }

    //修改飞机餐种类
    void setMeal(Scanner scanner){
        PlaneUtil.setMeal(orders.get(orderIndex), scanner);
    }

    //结算价格
    void payment(Scanner scanner){
        PlaneUtil.payment(orders.get(orderIndex), scanner);
    }

    //读取到文件
    void writeDisk(Scanner scanner){
        //写入到文件SAVEPATH
        PlaneUtil.writeDisk(orders, VarUtil.SAVEPATH, VarUtil.CHARSET, scanner);
    }

    //从CSV里面读取数据
    private List<Order> getCSV(String PATH, String  CHARSET){
        //调用工具类里面的方法
        return PlaneUtil.getOrdersFromCsv(PATH, CHARSET);
    }

    //选择登陆方式
    private boolean chooseWays(String choose, Scanner scanner){
        switch (choose){
            //根据飞机号查找
            case "1":
                System.out.println("请输入booking number:");
                String bookingNum = scanner.nextLine();
                orderIndex = checkBookingNumber(bookingNum);
                return orderIndex > -1;
            //根据用户名和ID查找
            case "2":
                System.out.println("请输入您的用户名:");
                String username = scanner.nextLine();
                System.out.println("请输入您的ID:");
                String id = scanner.nextLine();
                orderIndex = checkUsernameAndID(username, id);
                return orderIndex > -1;
            //到文件里面查找
            case "3":
                orderIndex = checkWithFile();
                return orderIndex > -1;
            //不合法的输入
            default:
                System.out.println("不合法的输入，只能输入1-3的数字");
                return false;
        }
    }

    //用户文件登录
    public int checkWithFile(){
        List<Order> list = PlaneUtil.getOrdersFromLoginCsv(VarUtil.LOGINPATH, VarUtil.CHARSET);
        if(list.size() < 1) return -1;
        Order userInfo = list.get(0);
        System.out.println(userInfo);
        for (int i = 0; i < orders.size(); i++) {
            //遍历加判断
            if(orders.get(i).getSurname().equals(userInfo.getSurname())
                    && orders.get(i).getIDNumber().equals(userInfo.getIDNumber())
                    && orders.get(i).getBookingNumber().equals(userInfo.getBookingNumber())){
                //登陆成功友好提示
                loginSuccessMsg(userInfo.getSurname());
                return i;
            }
        }
        //没找到则返回-1
        System.out.println("有户名或密码或booking number错误");
        return -1;
    }

    //验证用户名和密码
    public int checkUsernameAndID(String username, String id){
        for (int i = 0; i < orders.size(); i++) {
            //遍历加判断
            if(orders.get(i).getSurname().equals(username) && orders.get(i).getIDNumber().equals(id)){
                //登陆成功友好提示
                loginSuccessMsg(username);
                return i;
            }
        }
        //没找到则返回-1
        System.out.println("对不起，有户名或密码可能不存在或错误");
        return -1;
    }

    //验证booking number是否存在
    public int checkBookingNumber(String bookingNum){
        for (int i = 0; i < orders.size(); i++) {
            //遍历加判断
            if(orders.get(i).getBookingNumber().equals(bookingNum)){
                //登陆成功友好提示
                loginSuccessMsg(orders.get(i).getSurname());
                return i;
            }
        }
        //没找到则返回-1
        System.out.println("对不起，没有找到该booking number");
        return -1;
    }

    //查看当前用户信息
    void showInfo(){
        if(orderIndex > -1){
            System.out.println(orders.get(orderIndex));
        }
    }

    //登陆成功欢迎提升
    private void loginSuccessMsg(String username){
        System.out.println("登陆成功! 尊敬的("+username+"), 欢迎使用本飞行服务系统");
    }
}
