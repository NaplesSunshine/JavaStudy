package com.SmallChange;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class EarningsAndIncome {
    double income = 0;
    Date date = null;
    SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm");    //用于日期格式化
    Scanner myScanner = new Scanner(System.in);

    public double getIncome() {
        return income;
    }

    public String getDate() {
        date = new Date();
        return sdf.format(date);
    }

    public void setIncome(double income) {
        this.income = income;
    }
}
