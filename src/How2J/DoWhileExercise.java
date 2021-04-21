import java.util.Scanner;

public class DoWhileExercise {
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
        System.out.println("请输入可整除倍数");
        int multiple1 = myScanner.nextInt();
        System.out.println("请输入不可整除倍数");
        int multiple2 = myScanner.nextInt();
        int i = startNumber;
        do {
//            if (i%multiple1 == 0) {
//                if (i%multiple2 != 0){
//                    System.out.print(i + "\t");
//                    count++;
//                    sum += i;
//                }
//            }
            if (i%multiple1 == 0 && i%multiple2 != 0) {
                System.out.print(i + "\t");
                    count++;
                    sum += i;
            }
            i++;
        }while (i <= endNumber);
        System.out.print("\n");
        System.out.println("count=" + count);
        System.out.println("sum=" + sum);
    }
}
