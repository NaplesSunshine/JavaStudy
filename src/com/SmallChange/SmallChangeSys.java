package com.SmallChange;

import java.util.Scanner;

public class SmallChangeSys {
    //public static void main(String[] args) {
    boolean loop = true;
    String operationNum;
    double balance = 0;
    Detail detail = new Detail();
    Scanner myScanner = new Scanner(System.in);

    public void mainMeun() {
        do {
            System.out.println("\n==========零钱通菜单=========" + "\n"
                    + "\t\t1. 零钱通明细" + "\n"
                    + "\t\t2. 收益入账" + "\n"
                    + "\t\t3. 消     费" + "\n"
                    + "\t\t4. 退     出" + "\n"
                    + "请选择（1-4）：");
            operationNum = myScanner.next();
            switch (operationNum) {
                case "1":
                    System.out.println(detail.detail);
                    break;
                case "2":
                    System.out.println("==========收益入账=========");
                    System.out.println("请输入收入金额：");
                    double money = myScanner.nextDouble();
                    EarningsAndIncome earningsAndIncome = new EarningsAndIncome();
                    earningsAndIncome.setIncome(money);
                    if (money < 0) {
                        System.out.println("收益须大于0！");
                        break;
                    }
                    balance += earningsAndIncome.getIncome();
                    String earningAndIncomeDetail = "\n收益收入\t+" + earningsAndIncome.getIncome() + "\t" + earningsAndIncome.getDate() + "\t" + balance;
                    detail.getDetail(earningAndIncomeDetail);
                    break;
                case "3":
                    System.out.println("==========消     费=========");
                    break;
                case "4":
                    System.out.println("==========退     出=========");
                    loop = false;
                    break;
                default:
                    System.out.println("输入有误，请重新输入");
            }
        } while (loop);
        System.out.println("退出了零钱通...");
    }
}
//}


