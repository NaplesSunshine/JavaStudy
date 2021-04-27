public class MethodParameter02 {
    public static void main(String[] args) {
        C c = new C();
        int[] arr = {1, 2, 3};
        c.test100(arr);//调用方法
        System.out.println(" main 的 arr 数组 ");
        //遍历数组
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + "\t");
        }
        System.out.println();
    }
}

class C {
    public void test100(int[] arr) {
        arr[0] = 200;
        System.out.println(" test100 的 arr 数组 ");
        for(int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + "\t");
        }
        System.out.println();
    }
}
