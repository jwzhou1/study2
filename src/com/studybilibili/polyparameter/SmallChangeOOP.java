package com.studybilibili.polyparameter;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class SmallChangeOOP {
    boolean loop = true;
    Scanner scanner = new Scanner(System.in);
    String key = "";
    String details = "=====Small Change System detail=====";
    double money = 0;
    double balance = 0;
    Date date = null;
    SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm");
    String note = "";
    public void mainMenu(){
        do {
            System.out.println("======Choose Small Change System Menu OOP======");
            System.out.println("\t\t1 Small Change System Detail");
            System.out.println("\t\t2 Revenue");
            System.out.println("\t\t3 Consumption");
            System.out.println("\t\t4 Exit");
            System.out.println("Please Choose (1-4) :");
            key = scanner.next();
            switch (key){
                case "1":
                   this.detail();
                    break;
                case "2":
                    this.income();
                    break;
                case "3":
                    this.pay();
                    break;
                case "4":
                    this.exit();
                    break;
                default:
                    System.out.println("choice is wrong, please choose again");
            }
        }
        while(loop);

    }
    public void detail() {
        System.out.println(details);

    }
    public void income() {
        System.out.print("revenue money:");
        money = scanner.nextDouble();
        if (money <= 0){
            System.out.println("revenue should be bigger than 0");
            return;
        }
        balance += money;
        date = new Date();
        details+="\nrevenue money \t+" + money + "\t"+sdf.format(date) +"\t"+ balance;
    }
    public void pay() {
        System.out.print("consume money: ");
        money = scanner.nextDouble();
        if(money <= 0 || money > balance) {
            System.out.println("consume money should be 0 -" + balance);
            return;
        }
        System.out.print("consume information: ");
        note = scanner.next();
        balance -= money;
        date = new Date();
        details += "\n" + note + "\t-" + money + "\t" + sdf.format(date) +"\t"+ balance;
    }
    public void exit() {
        String choice = "";
        while (true){
            System.out.println("are you sure to exit? y/n");
            choice = scanner.next();
            if ("y".equals(choice) || "n".equals(choice)){
                break;
            }
        }
        if(choice.equals("y")){
            loop = false;
        }
    }
}
