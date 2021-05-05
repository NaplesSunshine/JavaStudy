package com.javaedu.pkg;

public class Account {
    private String name;
    private double balance;
    private String pwd;

    public Account() {

    }

    public Account(String name, double balance, String pwd) {
        this.name = name;
        this.balance = balance;
        this.pwd = pwd;
        this.setName(name);
        this.setBalance(balance);
        this.setPwd(pwd);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if(name.length() >= 2 && name.length() <= 4) {
            this.name = name;
        } else {
            System.out.println("名字有误，使用默认名字name001");
            this.name = "name001";
        }
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        if(balance > 20) {
            this.balance = balance;
        } else {
            System.out.println("余额低于20！");
            this.balance = 100;
        }
    }

    public String getPwd() {
        return pwd;
    }

    public void setPwd(String pwd) {
        if(pwd.length() == 6) {
            this.pwd = pwd;
        } else {
            System.out.println("密码长度不对。使用默认密码111111");
            this.pwd = "111111";
        }
    }
    public void showInfo() {
        System.out.println("姓名为 " + name + ";余额为 " + balance + ";密码为 " + pwd);
    }
}
