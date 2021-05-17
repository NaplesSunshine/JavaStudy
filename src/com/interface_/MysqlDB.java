package com.interface_;

public class MysqlDB implements DBInterface{
    @Override
    public void connect() {
        System.out.println("connect MySQL...");
    }

    @Override
    public void close() {
        System.out.println("close MySQL...");
    }
}
