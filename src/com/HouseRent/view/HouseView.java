package com.HouseRent.view;

import com.HouseRent.domain.House;
import com.HouseRent.service.HouseRentService;
import com.HouseRent.utils.Utility;

public class HouseView {
    /**
     * HouseView.java<=>类 [界面层]
     * 1. 显示界面
     * 2. 接收用户的输入
     * 3. 调用HouseService完成对房屋信息的各种操作
     */

    //
    private boolean loop = true; //控制显示菜单
    private char key = ' '; //接收用户选择

    public void mainMenu() {
        do {
            System.out.println("================房屋出租系统================");
            System.out.println("\t\t\t1 新 增 房 源");
            System.out.println("\t\t\t2 查 找 房 屋");
            System.out.println("\t\t\t3 删 除 房 屋 信 息");
            System.out.println("\t\t\t4 修 改 房 屋 信 息");
            System.out.println("\t\t\t5 房 屋 列 表");
            System.out.println("\t\t\t6 退      出");
            System.out.print("请输入你的选择(1-6): ");
        } while (loop);
        key = Utility.readChar();
        switch (key) {
            case '1':
                addHouse();
                break;
            case '2':
                findHouse();
                break;
            case '3':
                delHouse();
                break;
            case '4':
                update();
                break;
            case '5':
                listHouses();
                break;
            case '6':
                exit();
                break;
        }

    }

    private void exit() {

    }

    private void listHouses() {

    }

    private void update() {

    }

    private void delHouse() {

    }

    private void findHouse() {

    }

    private void addHouse() {
        System.out.println("=============添加房屋============");
        System.out.print("姓名: ");
        String name = Utility.readString(8);
        System.out.print("电话: ");
        String phone = Utility.readString(12);
        System.out.print("地址: ");
        String address = Utility.readString(16);
        System.out.print("月租: ");
        int rent = Utility.readInt();
        System.out.print("状态: ");
        String state = Utility.readString(3);

        House newHouse = new House(0, name, phone, address, rent, state);
    }
}
