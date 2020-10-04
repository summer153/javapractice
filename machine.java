package ticket;
import java.util.Scanner;
public class machine {
    int price;
    int balance;
    int total;
    Scanner scanner=new Scanner(System.in);
    void setPrice() {
        System.out.println("请输入票价:");
        while (true) {
            int price = scanner.nextInt();
            if (price > 0) {
                this.price = price;
                break;
            } else {
                System.out.println("请重新输入:");
            }
        }
    }
    void insertMoney(){
        System.out.println("请投票:");
        while(true){
            int money = scanner.nextInt();
            if(money>0){
            balance = money;
            break;}
            else{
                System.out.println("请重新投票:");

            }

        }
    }
    void print(){
        System.out.println("请输入打印票数:");
        while(true){
            int amount = scanner.nextInt();
            if(balance >=price*amount){
                for (int i = 0; i < amount; ++i) {
                    System.out.println("===================");
                    System.out.println("票价" + price);
                    System.out.println("谢谢惠顾");
                    System.out.println("===================");
                    balance-=price;
                    total+=price;}
                break;
            }
            else {
                System.out.println("余额不足，请重新输入");
            }
        }
    }
    int refund(){
        int money = balance;
        System.out.println("您的余额剩余:"+balance);
        balance=0;
        return money;
    }
    int totalMoney(){
        System.out.println("您当前的营业额为:"+total);
        return total;
    }
    public static void main (String[] args){
        machine test1 = new machine();
        test1.setPrice();
        test1.insertMoney();
        test1.print();
        test1.refund();
        test1.totalMoney();

    }
}
