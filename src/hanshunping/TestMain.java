public class TestMain {
    public static void main(String[] args) {
        Person p1 = new Person();
        p1.name = "张三";
        p1.age = 24;
        p1.cal01();
        p1.cal02(25);
        int getSum = p1.getSum(20,30);
        System.out.println("sum3=" + getSum);
    }

}
