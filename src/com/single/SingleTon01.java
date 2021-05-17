package com.single;

public class SingleTon01 {
    public static void main(String[] args) {
        GirlFriend girlFriend= GirlFriend.getInstance();
        System.out.println(girlFriend);
        //即使再创建一个对象，所指向的地址也是同一个
        GirlFriend girlFriend1 = GirlFriend.getInstance();
        System.out.println(girlFriend);
    }
}
class GirlFriend {
    private String name;
    private static GirlFriend gf = new GirlFriend("小红红");
    //如何保障我们只能创建一个 GirlFriend 对象
    //1.将构造器私有化
    //2.在类的内部直接创建
    //3.提供一个公共的static方法，返回 gf 对象
    private GirlFriend(String name) {
        this.name = name;
    }
    public static GirlFriend getInstance() {
        return gf;
    }
}