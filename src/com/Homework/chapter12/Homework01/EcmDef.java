package com.Homework.chapter12.Homework01;


/**
 * @author naplessunshine
 * @version 1.0.0
 */
public class EcmDef {
    public static void main(String[] args) {
        try {
            if (args.length != 2) {
                throw new ArrayIndexOutOfBoundsException("参数个数不对");
            }
            int num1 = Integer.parseInt(args[0]);
            int num2 = Integer.parseInt(args[1]);
            double res = cal(num1, num2);
            System.out.println("res= " + res);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println(e.getMessage());
        } catch (NumberFormatException e) {
            System.out.println("参数格式不正确，需要输出整数");
        } catch (ArithmeticException e) {
            System.out.println("出现了除0的异常");
        }
    }
    public static double cal(int num1, int num2) {
        return num1 / num2;
    }
}
