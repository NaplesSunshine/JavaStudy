public class ArrayHomeWork05 {
    public static void main(String[] args) {
        int[] arr = new int[10];
        int sum = 0;
        double average = 0;
        for(int num = 0; num < arr.length; num++) {
            arr[num] = (int)(Math.random()*100+1);
        }
        int[] arrNew = new int[10];
        for(int i = 0,j = arrNew.length-1; i < arr.length; i++,j--) {
            arrNew[i] = arr[j];
        }
        System.out.println("====原数组====");
        for(int i = 0; i < arrNew.length; i++) {
            System.out.print(arr[i] + "\t");
        }
        System.out.println();
        System.out.println("====倒序排列后====");
        for(int i = 0; i < arrNew.length; i++) {
            System.out.print(arrNew[i] + "\t");
        }
        System.out.println();
        for(int i = 0; i < arrNew.length; i++) {
            sum += arr[i];
        }
        average = (double)sum/10;
        System.out.println("平均值是" + average);


    }
}
