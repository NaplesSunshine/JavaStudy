package com.javaedu.homework08;

public class homework08 {
    public static void main(String[] args) {
        SavingsAccount savingsAccount = new SavingsAccount(1000);
        savingsAccount.deposit(100);
        savingsAccount.deposit(100);
        savingsAccount.deposit(100);
        System.out.println(savingsAccount.getBalance());//1300
        savingsAccount.deposit(100);
        System.out.println(savingsAccount.getBalance());//1400-1=1399

        savingsAccount.earnMonthlyInterest();//统计利息

        System.out.println(savingsAccount.getBalance());//1399 + 13.99 =1412.99
        savingsAccount.withdraw(100);//免手续
        System.out.println(savingsAccount.getBalance());//1412.99 -100 =1312.99
        savingsAccount.withdraw(100);//免手续
        savingsAccount.withdraw(100);//免手续
        System.out.println(savingsAccount.getBalance());//1412.99 -200 =1112.99
        savingsAccount.deposit(100);//扣手续费
        System.out.println(savingsAccount.getBalance());//1112.99 + 100 = 1212.99 - 1 = 1211.99
    }
}
