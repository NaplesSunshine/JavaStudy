import java.util.Scanner;

public class test20201222 {
    public static void main(String[] args) {
       /* Scanner i = new Scanner(System.in);
        int x = i.nextInt();
        int n = 1;*/
        //while循环
        /*while (x > 1) {
            n = n * x;
            x--;
        }*/
        //do while循环
        /*do {
            n = n * x;
            x--;
        }while (x > 1);
        System.out.println(n);*/
        //for循环
        int amount = 0;
        int money = 1;
        for (int day = 1;day <= 10;day++) {
            //amount = amount + money;
            amount+=money;
            money = money*2;
        }
        System.out.println(amount);
    }
}
