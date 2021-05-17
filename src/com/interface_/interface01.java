package com.interface_;

public class interface01 {
    public static void main(String[] args) {
        MysqlDB mysqlDB = new MysqlDB();
        conDB(mysqlDB);
    }
    public static void conDB(DBInterface db) {
        db.connect();
        db.close();
    }
}
