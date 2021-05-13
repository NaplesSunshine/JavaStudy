package com.HouseRent.service;

import com.HouseRent.domain.House;

public class HouseRentService {
    /**
     * HouseService.java<=>类 [业务层]
     * //定义House[] ,保存House对象
     * 1. 响应HouseView的调用
     * 2. 完成对房屋信息的各种操作(增删改查c[create]r[read]u[update]d[delete])
     */

    private House[] houses; //保存House对象
    private int houseNums = 1; //记录当前有多少个房屋信息
    private int idCounter = 1; //记录当前的id增长到哪个值
}
