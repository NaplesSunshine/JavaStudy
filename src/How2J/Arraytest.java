import java.util.Scanner;

public class Arraytest {
    public static void main(String[] args) {
//        double scores[] ; //声明数组， 这时 scores 是 null
//        scores = new double[5]; // 分配内存空间， 可以存放数据
//        Scanner myScanner = new Scanner(System.in);
//        for( int i = 0; i < scores.length; i++) {
//            System.out.println("请输入第"+ (i+1) +"个元素的值");
//            scores[i] = myScanner.nextDouble();
//        }
//        System.out.println("==数组的元素/值的情况如下:===");
//        for( int i = 0; i < scores.length; i++) {
//            System.out.println("第"+ (i+1) +"个元素的值=" + scores[i]);
//        }

        int[] array1 = {4,-1,9,0,23};
        int array1Max = array1[0];
        int array1IndexMax = 0;
        for (int i = 0; i < array1.length - 1; i++) {
            if (array1[i] < array1[i+1]) {
                array1Max = array1[i+1];
                array1IndexMax = i + 1;

            } else {
                array1Max = array1[i];
                array1IndexMax = i;
            }
        }
        System.out.println(array1Max);
        System.out.println(array1IndexMax);
    }
}
