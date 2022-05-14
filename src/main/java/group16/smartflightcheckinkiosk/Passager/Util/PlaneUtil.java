package group16.smartflightcheckinkiosk.Passager.util;

import service.Order;

import java.io.*;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.*;

//工具类
public class PlaneUtil {


    //测试方法
    public static void main(String[] args) {
    }

    //设置座位
    public static void setSeat(Order order, Scanner scanner){
        System.out.println("请输入您改之后的座位样式(A-D):");
        String newType =scanner.nextLine();
        if(!inspect(newType)) {
            System.out.println("无效座位样式");
            return;
        }
        order.setSeat(newType.toUpperCase());
        //记得修改价格
        setSeatPrice(order);
        System.out.println("修改座位样式成功！");
    }

    //设置餐品
    public static void setMeal(Order order, Scanner scanner){
        System.out.println("请输入您改之后的餐品样式(A-D):");
        String newType =scanner.nextLine();
        if(!inspect(newType)) {
            System.out.println("无效餐品样式");
            return;
        }
        order.setMeal(newType.toUpperCase());
        //记得修改价格
        setMealPrice(order);
        System.out.println("修改餐品类别成功");
    }


    //结算价格
    public static void payment(Order order, Scanner scanner){
        //判断是否已支付
        if(order.getPayed() == 1){
            System.out.println("您已经支付过了哦!!");
            return;
        }
        System.out.println("请输入您买票时的卡号:");
        String idCard = scanner.nextLine();
        //判断输入的是否等于该订单的卡号
        if(order.getCreditNumber().equals(idCard)){
            //总消费
            double totalCost = order.getBagFee() + order.getSeatFee() + order.getMealFee();
            //余额
            double balance = order.getBalance();
            if(balance >= totalCost) {
                //减去总消费
                order.setBalance(balance-totalCost);
                //修改为已支付
                order.setPayed((byte) 1);
                System.out.println("支付成功! O(∩_∩)O");
            }
            else System.out.println("余额不足!");
        }
        else System.out.println("卡号有误!");
    }

    //读取到文件
    public static void writeDisk(List<Order> orders, String path, String charset, Scanner scanner){
        System.out.println("您确认要存档吗(输入\"yes\": 确认, else: 取消)");
        String operation = scanner.nextLine();
        if ("yes".equals(operation)){
            if(setOrdersToCsv(orders, path, charset)) System.out.println("存档成功!");
            else System.out.println("存档失败 o(╥﹏╥)o");
        }
        else System.out.println("已取消存档操作");
    }

    //检查输入的餐品和座位种类是否合法
    public static boolean inspect(String input){
        //范围A-D
        input = input.toUpperCase();
        if(!"A".equals(input) && !"B".equals(input) && !"C".equals(input) && !"D".equals(input)){
            return false;
        }
        //表示在范围内返回true
        return true;
    }

    //将order里面的数据存回csv文件中
    public static boolean setOrdersToCsv(List<Order> orders, String path, String charset){
        File file = new File(path);
        //设置为可读
        file.setWritable(true);
        //字符串拼接变量
        StringBuffer sbf = new StringBuffer();
        FileOutputStream fos = null;
        try {
            fos = new FileOutputStream(file, false);
            for (Order order : orders) {
                //将每一条写进文件中
                fos.write(order.getCsvString().getBytes(Charset.forName(charset)));
            }
            return true;
        } catch (IOException e) {
            e.printStackTrace();
        }

        if(fos != null){
            //刷出然后关闭
            try {
                fos.flush();
                fos.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        //出现错误才会到这行，return false
        return false;
    }


    //从login。csv里面都数据
    public static List<Order> getOrdersFromLoginCsv(String path, String charset){
        File file = new File(path);
        //设置为可读
        file.setReadable(true);
        //数据将读取到这个集合里面
        List<Order> orders = new ArrayList<>();

        BufferedReader bfr = null;
        try {
            bfr = new BufferedReader(new InputStreamReader(new FileInputStream(file), charset));
        } catch (FileNotFoundException | UnsupportedEncodingException e) {
            e.printStackTrace();
        }
        if (bfr == null) return null;
        //储存读到的每一行的数据的字符串变量
        String str = "";
        String[] temp;
        try {
            //没有了直接退出
            while((str = bfr.readLine()) != null){
                //添加解析好的数据到集合中
                temp = str.split(",");
                orders.add(new Order(temp[0], temp[1], temp[2]));
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        try {
            //关闭
            if(bfr != null){
                bfr.close();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return orders;
    }

    //使用java的bufferReader从csv文件中读取
    public static List<Order> getOrdersFromCsv(String path, String charset){
        File file = new File(path);
        //设置为可读
        file.setReadable(true);
        //数据将读取到这个集合里面
        List<Order> orders = new ArrayList<>();

        BufferedReader bfr = null;
        try {
            bfr = new BufferedReader(new InputStreamReader(new FileInputStream(file), charset));
        } catch (FileNotFoundException | UnsupportedEncodingException e) {
            e.printStackTrace();
        }
        if (bfr == null) return null;
        //储存读到的每一行的数据的字符串变量
        String str = "";
        String[] temp;
        try {
            //没有了直接退出
            while((str = bfr.readLine()) != null){
                //添加解析好的数据到集合中
                temp = str.split(",");
                orders.add(new Order(temp[0], temp[1], temp[2], temp[3],temp[4],
                        Double.parseDouble(temp[5]),temp[6],Double.parseDouble(temp[7]), Byte.parseByte(temp[8]),
                        Double.parseDouble(temp[9]), Double.parseDouble(temp[10])));
                //设置指定类型餐品和座位的价格
//                setMealPrice(orders.get(orders.size() - 1));
//                setSeatPrice(orders.get(orders.size() - 1));
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        try {
            //关闭
            if(bfr != null){
                bfr.close();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return orders;
    }

    //初始化订单的餐品价格
    public static void setMealPrice(Order order){

        double mealPrice = 0.0;
        switch (order.getMeal().toUpperCase()){
            case "A":
                mealPrice = VarUtil.MEAL_A;
                break;
            case "B":
                mealPrice = VarUtil.MEAL_B;
                break;
            case "C":
                mealPrice = VarUtil.MEAL_C;
                break;
            case "D":
                mealPrice = VarUtil.MEAL_D;
                break;
        }
        order.setMealFee(mealPrice);
    }

    //初始化订单的餐品价格
    public static void setSeatPrice(Order order){
        double seatPrice = 0.0;
        switch (order.getSeat().toUpperCase()){
            case "A":
                seatPrice = VarUtil.SEAT_A;
                break;
            case "B":
                seatPrice = VarUtil.SEAT_B;
                break;
            case "C":
                seatPrice = VarUtil.SEAT_C;
                break;
            case "D":
                seatPrice = VarUtil.SEAT_D;
                break;
        }
        order.setSeatFee(seatPrice);
    }


}
