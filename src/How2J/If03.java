import java.util.Scanner;

public class If03 {
    public static void main(String[] args) {
    /*
    输入保国同志的芝麻信用分：
    如果：
    信用分为 100 分时， 输出 信用极好；
    信用分为(80， 99]时， 输出 信用优秀；
    信用分为[60,80]时， 输出 信用一般；
    其它情况 ， 输出 信用 不及格
    请从键盘输入保国的芝麻信用分， 并加以判断
    假定信用分数为 int
    */
        int faultNum = 0;
        Scanner myScanner = new Scanner(System.in);
        System.out.println("请输入保国同志的芝麻信用分：");
        //int xinYongFen = myScanner.nextInt();
        for (int xinYongFen = myScanner.nextInt(); xinYongFen >= 100 || xinYongFen <= 1; faultNum++) {
            System.out.println("信用分输入有误，请重新输入:");
            int reXinYongFen = myScanner.nextInt();
            xinYongFen = reXinYongFen;
            if (faultNum >= 3) {
                System.out.println("输入错误数据超过三次，退出程序。");
                break;
            }
            if (xinYongFen == 100) {
                System.out.println("信用极好");
            } else if (xinYongFen > 80 && xinYongFen <= 99) {
                System.out.println("信用优秀");
            } else if (xinYongFen >= 60 && xinYongFen <= 80) {
                System.out.println("信用一般");
            } else {
                System.out.println("信用不及格");
            }
        }
    }
}
