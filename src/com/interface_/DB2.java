package com.interface_;

public class DB2 implements DBInterface{

    @Override
    public void connect() {
        System.out.println("connect DB2...");
    }

    @Override
    public void close() {
        System.out.println("close DB2...");
    }
}
