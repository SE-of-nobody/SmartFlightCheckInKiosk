package service;

import java.util.Scanner;
import java.lang.Integer;


public class Order {

        //变量定义
        String BookingNumber = "";    //飞机号
        String IDNumber = "";    //用户id
        String Surname = "";     //用户名
        String Meal="";          //餐品种类 A-D
        String CreditNumber="";  //信用卡卡号
        double balance;    //余额
        String Seat="";    //座位款式选择
        double bagFee;     //行李费
        double mealFee;    //餐品费
        double seatFee;    //座位费
        byte payed;


        public Order(String bookingNumber, String IDNumber, String surname, String meal, String creditNumber, double balance, String seat, double bagFee, byte payed, double mealFee, double seatFee) {
                BookingNumber = bookingNumber;
                this.IDNumber = IDNumber;
                Surname = surname;
                Meal = meal;
                CreditNumber = creditNumber;
                this.balance = balance;
                Seat = seat;
                this.bagFee = bagFee;
                this.payed = payed;
                this.mealFee = mealFee;
                this.seatFee = seatFee;
        }

        public Order(String bookingNumber, String IDNumber, String surname, String meal, String creditNumber, double balance, String seat, double bagFee, byte payed) {
                BookingNumber = bookingNumber;
                this.IDNumber = IDNumber;
                Surname = surname;
                Meal = meal;
                CreditNumber = creditNumber;
                this.balance = balance;
                Seat = seat;
                this.bagFee = bagFee;
                this.payed = payed;
        }

        public Order(String bookingNumber, String IDNumber, String surname) {
                BookingNumber = bookingNumber;
                this.IDNumber = IDNumber;
                Surname = surname;
        }

        @Override
        public String toString() {
                return "Order{" +
                        "BookingNumber='" + BookingNumber + '\'' +
                        ", IDNumber='" + IDNumber + '\'' +
                        ", Surname='" + Surname + '\'' +
                        ", Meal='" + Meal + '\'' +
                        ", CreditNumber='" + CreditNumber + '\'' +
                        ", balance=" + balance +
                        ", Seat='" + Seat + '\'' +
                        ", bagFee=" + bagFee +
                        ", meatFee=" + mealFee +
                        ", seatFee=" + seatFee +
                        ", payed=" + payed +
                        '}';
        }

        //返回可以直接存储到csv文件中的字符串格式
        public String getCsvString(){
                return BookingNumber + "," + IDNumber + "," + Surname + "," +
                        Meal + "," + CreditNumber + "," + balance + "," +
                        Seat + "," + bagFee + "," + payed + "," + mealFee + "," + seatFee + "\n";
        }

        public String getBookingNumber() {
                return BookingNumber;
        }

        public void setBookingNumber(String bookingNumber) {
                BookingNumber = bookingNumber;
        }

        public String getIDNumber() {
                return IDNumber;
        }

        public void setIDNumber(String IDNumber) {
                this.IDNumber = IDNumber;
        }

        public String getSurname() {
                return Surname;
        }

        public void setSurname(String surname) {
                Surname = surname;
        }

        public String getMeal() {
                return Meal;
        }

        public void setMeal(String meal) {
                Meal = meal;
        }

        public String getCreditNumber() {
                return CreditNumber;
        }

        public void setCreditNumber(String creditNumber) {
                CreditNumber = creditNumber;
        }

        public double getBalance() {
                return balance;
        }

        public void setBalance(double balance) {
                this.balance = balance;
        }

        public String getSeat() {
                return Seat;
        }

        public void setSeat(String seat) {
                Seat = seat;
        }

        public double getBagFee() {
                return bagFee;
        }

        public void setBagFee(double bagFee) {
                this.bagFee = bagFee;
        }

        public double getMealFee() {
                return mealFee;
        }

        public void setMealFee(double mealFee) {
                this.mealFee = mealFee;
        }

        public double getSeatFee() {
                return seatFee;
        }

        public void setSeatFee(double seatFee) {
                this.seatFee = seatFee;
        }

        public byte getPayed() {
                return payed;
        }

        public void setPayed(byte payed) {
                this.payed = payed;
        }
}
