import java.util.Scanner;
import java.lang.Integer;

public class infor {
        String IDnumber="";
        String Surname="";
        String planeType="";
        String foodType="";
        String CreditNumber="";
        String balance="";
        String chairType="";
        public static int ale;
        infor(String Surname,String IDnumber,String planeType,String foodType,String CreditNumbe,String balance,String chairType){
                this.Surname=Surname;
                this.IDnumber=IDnumber;
                this.planeType=planeType;
                this.foodType=foodType;
                this.CreditNumber=CreditNumbe;
                this.balance=balance;
                this.chairType=chairType;
        }
         public void add_infor(infor inf,infor []Allinfor) throws NullPointerException{
                ale++;
                Allinfor[ale].IDnumber=inf.IDnumber;
                Allinfor[ale].Surname=inf.Surname;
                Allinfor[ale].foodType=inf.foodType;
                Allinfor[ale].chairType=inf.chairType;
                Allinfor[ale].balance=inf.balance;
                Allinfor[ale].CreditNumber=inf.CreditNumber;
                Allinfor[ale].planeType=inf.planeType;
        }
        void changeChair(int index,infor []Allinfor){
                Scanner scanner=new Scanner(System.in);
                System.out.println("请输入您改之后的座位样式(A-D):");
                String s=scanner.nextLine();
                Allinfor[index].chairType=s;
                System.out.println("修改成功!");

        }
        int menu(){
                Scanner scanner=new Scanner(System.in);
                System.out.println("1 修改座位样式");
                System.out.println("2 修改飞机餐种类");
                System.out.println("3 结算价格");
                System.out.println("4 读取到文件");
                System.out.println("5 退出程序");
                int temp=scanner.nextInt();
                return temp;
        }
        int isPrice(String cho){
                if(cho.equals("A")){
                        return 80;
                }else if(cho.equals("B")){
                        return 60;
                }
                else if(cho.equals("C")){
                        return 40;
                }else if(cho.equals("D")){
                        return 20;
                }
                return 0;
        }
        void allPrice(int index,infor []Allinfor){
                System.out.println("请输入您买票时的卡号:");
                Scanner scanner=new Scanner(System.in);
                String idcard=scanner.nextLine();
                if(Allinfor[index].CreditNumber.equals(idcard)){
                        System.out.println("验证成功!");
                        int sum=isPrice(Allinfor[index].foodType)+isPrice(Allinfor[index].chairType);
                        int temp= Integer.parseInt(Allinfor[index].balance);
                        if(temp>=sum) {
                               Allinfor[index].balance=Integer.toString(temp-sum);
                                System.out.println("支付成功!");
                                return;
                        }else{
                                System.out.println("您的余额不足!无法完成支付!");
                                return;
                        }

                }
                System.out.println("验证失败!卡号有误!");
        }
        void changeFood(int index,infor []Allinfor){
                Scanner scanner=new Scanner(System.in);
                System.out.println("请输入您改之后的飞机餐样式(A-D):");
                String s=scanner.nextLine();
                Allinfor[index].foodType=s;
                System.out.println("修改成功!");
        }
        int login(String sur,String id,infor []Allinfor){
                for(int i=1;i<=ale;i++) {
                        if (Allinfor[i].Surname.equals(sur) && Allinfor[i].IDnumber.equals(id)) {
                                return i;
                        }
                }
                return 0;
        }
}
