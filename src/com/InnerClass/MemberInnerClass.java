package com.InnerClass;

public class MemberInnerClass {

}
class Outer06 {
    private int n1 =100;
    public String name = "jack";
    class Inner06 {//成员内部类
        public void say() {
            System.out.println("Outer06的name="+ name);
        }
    }
    public void test01() {
        new Inner06().say();
        new Inner06() {
            @Override
            public void say() {
                System.out.println("123");
            }
        }.say();
    }
}
