package com.SmallChange;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class EarningsAndIncome {
    double income = 0;
    double balance = 0;
    Date date = null;
    SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm");    //用于日期格式化
    Scanner myScanner = new Scanner(System.in);

    public double getIncome() {
        System.out.print("\n请输入收入金额：");
        income = myScanner.nextDouble();
        return income;
    }

    public double getBalance(double income) {
        balance += income;
        return balance;
    }
    public String getDate() {
        date = new Date();
        return sdf.format(date);
    }


}
