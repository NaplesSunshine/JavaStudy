public class VarScopeDetail {
    public static void main(String[] args) {
        Person2 p2 = new Person2();
        p2.say();
        System.out.println(p2.name);
    }
}
class Person2 {
    //属性和局部变量可以重名，访问时遵循就近原则；
    String name = "Jean";
    public void say() {
        String name = "jack";
        System.out.println("say() name= " + name);
    }
}