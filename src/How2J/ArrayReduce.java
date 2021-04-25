import java.util.Scanner;

public class ArrayReduce {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6};
        Scanner myScanner = new Scanner(System.in);
        do {
            if (arr.length != 1) {
                System.out.println("是否需要删除元素（y/n）？");
                char getAns = myScanner.next().charAt(0);
                int[] arrNew = new int[arr.length - 1];
                if (getAns == 'y') {
                    for (int i = 0; i < arr.length - 1; i++) {
                        arrNew[i] = arr[i];
                    }
                    arr = arrNew;
                    System.out.println("====arr 缩减后元素情况====");
                    for (int i = 0; i < arr.length; i++){
                        System.out.print(arr[i] + "\t");
                    }
                    System.out.println();
                } else {
                    System.out.println("退出程序");
                    break;
                }
            } else {
                System.out.println("arr数组为1，不能缩减，退出程序");
                break;
            }
        }while (true);
    }
}
