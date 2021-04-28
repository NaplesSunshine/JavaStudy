public class RecursionExercise01 {
    public static void main(String[] args) {
        FibonacciNumber f1 = new FibonacciNumber();
        int res = f1.getResFibonacci(7);
        System.out.println("res=" + res);

        MonkeyEatPeach m1 = new MonkeyEatPeach();
        int day = 1;
        int peachNum = m1.peach(day);
        if(peachNum != -1) {
            System.out.println("第 " + day + "天有" + peachNum + "个桃子");
        }
    }
}

//请使用递归的方式求出斐波那契数1,1,2,3,5,8,13...给你一个整数n，求出它的值是多
//思路：
//1.
class FibonacciNumber {
    public int getResFibonacci(int n) {
        if(n >= 1){
            if(n == 1 || n == 2) {
                return 1;
            } else {
                return getResFibonacci(n-2) + getResFibonacci(n - 1);
            }
        } else {
            System.out.println("请输入大于1的整数");
            return -1;
        }

    }
}
//猴子吃桃子问题:
//有一堆桃子，猴子第一天吃了其中的一半，并再多吃了一个!以后每天猴子都吃其中的一半，然后再多吃一个。当到第10天时，想再吃时(即还没吃)发现只有1个桃子了。
//问题:最初共多少个桃子?
//1.定义一个求桃子总数的方法，输入时间来求桃子总数
//2.第10天时：1个桃子
//3.第9天时：(day10 + 1)*2
class MonkeyEatPeach {
    public int peach(int day) {
        if(day == 10) {
            return 1;
        } else if(day >= 1 && day <= 9){
            return (peach(day + 1) + 1) * 2;
        } else {
            System.out.println("请输入1-10之间的数字");
            return -1;
        }
    }
}