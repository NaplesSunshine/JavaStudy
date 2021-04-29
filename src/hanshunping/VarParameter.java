public class VarParameter {
    public static void main(String[] args) {
        HspMethod h1 = new HspMethod();
        System.out.println(h1.sum1(1,44,2,65,23));
        //可变参数的实参可以是数组
        HspMethod h2 = new HspMethod();
        int[] arr = {1,2,3,4,5};
        System.out.println(h2.sum1(arr));
        h1.sum2("Book", 1,2,3,4,5);
        h1.sum2("Books", arr);
    }
}

class HspMethod {
    //可变参数的实参是0个或任意个
    public int sum1(int... nums) {
        int res = 0;
        for(int i = 0; i < nums.length; i++) {
            //可变参数的本质是数组
            res += nums[i];
        }
        return res;
    }
    //可变参数可以和普通参数放在形参列表，但是可变参数需要放在最后
    //一个形参列表中只能出现一个可变参数
    public void sum2(String str, int... nums) {
        System.out.println(str);
        int res = 0;
        for(int i = 0; i < nums.length; i++) {
            //可变参数的本质是数组
            res += nums[i];
        }
        System.out.println("res= " + res);
    }
}