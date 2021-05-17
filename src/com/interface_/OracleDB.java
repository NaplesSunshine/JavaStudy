package com.interface_;

public class OracleDB implements DBInterface{
    @Override
    public void connect() {
        System.out.println("connect OracleDB...");
    }

    @Override
    public void close() {
        System.out.println("close OracleDB...");
    }
}
