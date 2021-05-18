package com.InnerClass;

public class InnerClassExercise01 {
    public static void main(String[] args) {
        //匿名内部类写法
        f1(new IAA() {
            @Override
            public void show() {
                System.out.println("it is show()");
            }
        });
        Car car = new Car();
        f1(car);
        f1(new Car());
    }
    public static void f1(IAA iaa) {
        iaa.show();
    }
}

interface IAA {
    void show();
}
class Car implements IAA {
    @Override
    public void show() {
        System.out.println("it is show() 传统写法");
    }
}