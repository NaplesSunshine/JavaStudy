public class MethodDetail01 {
    public static void main(String[] args) {
        A a = new A();
        a.sayOk();
        a.m1();
    }
}

class A {
    //同一个类中方法调用：直接调用，无需创建对象；
    public void print(int n) {
        System.out.println("print()方法被调用" + n);
    }
    public void sayOk() {
        print(10);
    }
    //跨类的方法调用：创建对象，通过对象名进行调用
    public void m1() {
        B b = new B();
        b.hi(10);
    }
}

class B {
    public void hi(int n) {
        System.out.println("B类中的hi()方法被调用" + n);
    }
}

