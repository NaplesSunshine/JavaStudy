import java.util.Scanner;

public class test20201214 {
    public static void main(String[] args) {
        Scanner i1 = new Scanner(System.in);
        int a = i1.nextInt();
        System.out.println("第一个整数为：" + a);
        Scanner i2 = new Scanner(System.in);
        int b = i2.nextInt();
        System.out.println("第二个整数为：" + b);
        int c = a + b;
        System.out.println("a+b的值为：" + c);

        int i = 1;
        int j = ++i + i++ + ++i + ++i + i++;
        System.out.println(j);
    }
}
