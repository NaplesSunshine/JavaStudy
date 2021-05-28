package com.Exception;

/**
 * @author naplessunshine
 * @version 1.0.0
 */
public class tryCatchExecrise {
public static int method() {
    int i = 1;
    try {
        i++;
        String[] names = new String[3];
        if(names[1].equals("Tom")) {
            System.out.println(names[1]);
        } else {
            names[3] = "hspedu";
        }
        return 1;
    } catch (ArrayIndexOutOfBoundsException e) {
        return 2;
    } catch (NullPointerException e) {
        return ++i;
    } finally {
        ++i;
        System.out.println("finally中的 i = " + i);
    }
}
    public static void main(String[] args) {
        System.out.println(method());
    }
}
