public class MethodExercise03 {
    public static void main(String[] args) {
        Person1 p = new Person1();
        p.name = "Jack";
        p.age = 100;
        MyTools mt = new MyTools();
        Person1 p1 = mt.copyPerson(p);
        System.out.println("p的属性" + p.name + "\t" + p.age);
        System.out.println("p1的属性" + p1.name + "\t" + p1.age);
        System.out.println(p == p1);
    }
}
class Person1 {
    String name;
    int age;
}
class MyTools {
    public Person1 copyPerson(Person1 p) {
        Person1 p1 = new Person1();
        p1.name = p.name;
        p1.age = p.age;
        return p1;
    }
}