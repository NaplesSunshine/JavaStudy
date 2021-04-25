public class BubbleSorting {
    public static void main(String[] args) {
        int[] arr = {22,21,45,20,68,86,41};
        int arrLength = arr.length - 1;
        //冒泡排序前
        System.out.println("====冒泡排序前====");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + "\t");
        }
        System.out.println();
        //冒泡排序
        for (int max = arrLength,round = 1; max > 0; max--,round++) {
            for (int min = max - 1; min >= 0; min--) {
                if (arr[max] < arr[min]) {
                    int temp = arr[min];
                    arr[min] = arr[max];
                    arr[max] = temp;
                }
            }
            System.out.println("====第" + round + "次排序后====");
            for (int i = 0; i < arr.length; i++) {
                System.out.print(arr[i] + "\t");
            }
            System.out.println();
        }
        //冒泡排序后
        System.out.println("====冒泡排序后====");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + "\t");
        }
        System.out.println();
    }
}
