package group16.smartflightcheckinkiosk;
import java.lang.*;
import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        try {
            String filePath = "/home/danny/data.csv";
            int infor;
            infor[] Allinfor;
            Allinfor = new infor[100];
            for(int i=0;i<100;i++){
                Allinfor[i]=new infor("","","","","","","");
            }
            readFile.readCsvFile(filePath,Allinfor);
            System.out.println("请输入您的用户名:");
            Scanner scanner1=new Scanner(System.in);
            String sur=scanner1.nextLine();
            System.out.println("请输入您的密码:");
            Scanner scanner2=new Scanner(System.in);
            String Id=scanner2.nextLine();
            int sig=Allinfor[0].login(sur,Id,Allinfor);
            if(sig==0){
                System.out.println("登录失败!查无此人");
            }else if(sig>0){
                System.out.println("登录成功!");

                while(true){
                    switch (Allinfor[0].menu()){
                        case 1:{
                            Allinfor[0].changeChair(sig,Allinfor);
                            break;
                        }
                        case 2:{
                            Allinfor[0].changeFood(sig,Allinfor);
                            break;
                        }
                        case 3:{
                            Allinfor[0].allPrice(sig,Allinfor);
                            break;
                        }
                        case 4:{
                            readFile.readCsvFile(filePath,Allinfor);
                            break;
                        }
                        case 5:{
                            System.exit(0);
                            break;
                        }
                    }
                }
            }


        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
