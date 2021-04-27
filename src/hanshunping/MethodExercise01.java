public class MethodExercise01 {
    public static void main(String[] args) {
        AA aa = new AA();
       /* boolean b = aa.isOdd(3);
        System.out.println(b);*/
        if(aa.isOdd(3)) {
            System.out.println("是奇数");
        } else {
            System.out.println("是偶数");
        }
    }
}
class AA {
    public boolean isOdd(int num) {
        //实现方法1
        /*
        if(num % 2 != 0) {
            return true;
        } else {
            return false;
        }
        */
        //实现方法2
        //return num % 2 != 0 ? true : false;
        return num % 2 != 0;
    }
}
