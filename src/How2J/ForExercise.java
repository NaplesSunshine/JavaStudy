import java.util.Scanner;

public class ForExercise {
    public static void main(String[] args) {
        //打印 1~100 之间所有是 9 的倍数的整数， 统计个数 及 总和。

        //统计个数
        int count = 0;
        //统计总数
        int sum = 0;
        //输入开始值
        Scanner myScanner = new Scanner(System.in);
        System.out.println("请输入开始值");
        //输入结束值
        int startNumber = myScanner.nextInt();
        System.out.println("请输入结束值");
        int endNumber = myScanner.nextInt();
        //输入倍数
        System.out.println("请输入倍数");
        int multiple = myScanner.nextInt();
        for (int i = startNumber; i <= endNumber; i++) {
            if (i%multiple == 0) {
                System.out.print(i + "\t");
                count++;
                sum = sum + i;
            }
        }
        System.out.println("1~100之间所有是9的倍数的整数，个数是" + count + "，总和是" + sum);
    }
}
