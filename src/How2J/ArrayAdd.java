import java.util.Scanner;

public class ArrayAdd {
    /*
    要求： 实现动态的给数组添加元素效果， 实现对数组扩容。 ArrayAdd.java
    1.原始数组使用静态分配 int[] arr = {1,2,3}
    2.增加的元素 4， 直接放在数组的最后 arr = {1,2,3,4}
    3.用户可以通过如下方法来决定是否继续添加， 添加成功， 是否继续？ y/n
*/
    public static void main(String[] args) {

        int[] arr = {1,2,3};
        Scanner myScanner = new Scanner(System.in);
        do {
            //将arr的数据传给arrNew
            int[] arrNew = new int[arr.length + 1];
            for (int i = 0; i < arr.length; i++) {
                arrNew[i] = arr[i];
            }
            //往arrNew添加数据
            System.out.println("请输入你要添加的元素");
            int newNum = myScanner.nextInt();
            arrNew[arrNew.length-1] = newNum;
            arr= arrNew;
            //打印出arr的数据
            System.out.println("====arr 扩容后元素情况====");
            for (int i = 0; i < arr.length; i++){
                System.out.print(arr[i] + "\t");
            }
            System.out.println();
            //判断是否需要继续添加数据
            System.out.println("是否继续添加(y/n)?");
            char getNewNum = myScanner.next().charAt(0);
            if (getNewNum == 'n') {
                break;
            }
        } while (true);


    }
}
