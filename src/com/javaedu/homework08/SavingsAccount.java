package com.javaedu.homework08;

public class SavingsAccount extends BankAccount {
    private int count = 3;
    private double rate = 0.01;

    public SavingsAccount(double initialBalance) {
        super(initialBalance);
    }

    @Override
    public void deposit(double amount) {
        if (count > 0) {
            super.deposit(amount);
        } else {
            super.deposit(amount - 1);
        }
        count--;
    }

    @Override
    public void withdraw(double amount) {
        if (count > 0) {
            super.withdraw(amount);
        } else {
            super.withdraw(amount + 1);
        }
        count--;
    }

    public void earnMonthlyInterest() {
        this.count = 3;
        super.deposit(getBalance() * rate);
    }

}
