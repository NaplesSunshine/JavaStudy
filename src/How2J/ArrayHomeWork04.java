import java.util.Scanner;

public class ArrayHomeWork04 {
    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);
        int[] arr = {10,12,45,90};
        do {
            System.out.println("请输入要插入的数值");
            int getNum = myScanner.nextInt();
            int[] arrNew = new int[arr.length+1];
            for(int i = 0; i < arr.length; i++) {
                arrNew[i] = arr[i];
            }
            arrNew[arr.length] = getNum;
            arr = arrNew;

            for(int i = 0; i < arr.length; i++) {
                for(int j = i+1; j < arr.length; j++) {
                    if(arr[i] > arr[j]) {
                        int temp = arr[i];
                        arr[i] = arr[j];
                        arr[j] = temp;
                    }
                }
            }

            System.out.println("====插入并进行排序====");
            for(int i = 0; i < arr.length; i++) {
                System.out.print(arr[i] + "\t");
            }
            System.out.println();

            //判断是否需要继续添加数据
            System.out.println("是否继续添加(y/n)?");
            char getNewNum = myScanner.next().charAt(0);
            if (getNewNum == 'n') {
                break;
            }
        } while(true);

    }
}
