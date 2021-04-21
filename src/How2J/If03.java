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
        int faultNum;
        Scanner myScanner = new Scanner(System.in);
        System.out.println("请输入川建国同志的芝麻信用分：");
        int xinYongFen = myScanner.nextInt();
        if (xinYongFen > 100 || xinYongFen < 0) {
            for (faultNum = 1; faultNum < 3; faultNum++) {
                System.out.println("信用分(0-100)输入有误，请重新输入:");
                int reXinYongFen = myScanner.nextInt();
                xinYongFen = reXinYongFen;
                if (xinYongFen >= 0 && xinYongFen <= 100) {
                    faultNum = 3;
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
                if (faultNum == 3) {
                    System.out.println("输入错误超过3次，退出程序。");
                }
            }
        }else {
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
