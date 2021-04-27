import java.util.Scanner;

public class Person {
    String name;
    int age;
    private Scanner myScanner = new Scanner(System.in);

    public void speak() {
        System.out.println("我是一个好人");
    }
    public void cal01() {
        int sum1 = 0;
        for(int i = 1; i <= 1000; i++) {
            sum1 = sum1 + i;
        }
        System.out.println("sum1=" + sum1);
    }
    public void cal02(int number) {
        int sum2 = 0;
        for(int i = 1; i <= number; i++) {
            sum2 = sum2 + i;
        }
        System.out.println("sum2=" + sum2);
    }
    public int getSum(int number1, int number2) {
        int sum3 = number1 + number2;
        return sum3;
    }

    public int[] getSumAndSub(int n1, int n2) {
            int[] resArr = new int[2];
            resArr[0] = n1 + n2;
            resArr[1] = n1 - n2;
            return resArr;
    }

}


