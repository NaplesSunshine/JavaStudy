public class Stars1 {
    public static void main(String[] args) {
        int iMax = 5;
        //单边金字塔
        for (int i = 1; i <= iMax; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        //中心金字塔
        for (int i = 1; i<= iMax; i++) {
            for (int nullStars = 1; nullStars <= (iMax - i); nullStars++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= (2 * i - 1); j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        //实心菱形
        for (int i = 1; i <= (iMax+1)/2; i++) {     //打印上半部分
            for (int nullStars = 1; nullStars <= ((iMax+1)/2 - i); nullStars++) {   //打印左上角空白
                System.out.print(" ");
            }
            for (int j = 1; j <= (2 * i - 1); j++) {    //打印星号
                System.out.print("*");
            }
            System.out.println();
        }
        for (int i = (iMax+3)/2; i <= iMax; i++) {      //打印下半部分
            for (int nullStars = (iMax+3)/2; nullStars <= i; nullStars++) {       //打印左下角空白
                System.out.print(" ");
            }
            for (int j = 1; j <= (2 * i - 1); j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        //空心金字塔
        for (int i = 1; i<= iMax; i++) {
            for (int nullStars = 1; nullStars <= (iMax - i); nullStars++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= (2 * i - 1); j++) {
                if ( j == 1 || j == (2 * i - 1) || i == iMax) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
        //空心菱形

    }
}
