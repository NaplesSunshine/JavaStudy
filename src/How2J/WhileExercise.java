import java.util.Scanner;

public class WhileExercise {
    public static void main(String[] args) {
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
        int i = startNumber;
        while (i <= endNumber) {
            if (i%multiple == 0) {
                System.out.print(i + "\t");
            }
            count++;
            sum += i;
            i++;
        }
        System.out.println("count=" + count);
        System.out.println("sum=" + sum);
    }
}
