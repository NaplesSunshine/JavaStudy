import java.util.Scanner;

public class ClassAndObjectHomework01 {
    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);
        String[] strArr = {"AAA", "BBB", "CCC"};
        int[] arr = {123, 321, 332, 541, 21, 28};
        A01 a01 = new A01();
        System.out.println(a01.max(12, 32, 3212, 321));

        A02 a02 = new A02();
        System.out.println(a02.find(strArr, "BBB"));

        Book b1 = new Book("ABC", 132);
        System.out.println(b1.bookPrice);
        b1.updatePrice();
        System.out.println(b1.bookPrice);

        A03 a03 = new A03();
        a03.copyArr(arr);
        a03.printArr();
    }

}

class A01 {

    public double max(double... num) {
        double maxNum = 0;
        for (int i = 0; i < num.length - 1; i++) {
            if (num[i + 1] > num[i]) {
                maxNum = num[i + 1];
            }
        }
        return maxNum;
    }
}

class A02 {
    public int find(String[] stringArr, String str) {
        int index = 0;
        for (int i = 0; i < stringArr.length; i++) {
            if (stringArr[i] == str) {
                index = i;
            } else {
                index = -1;
            }
        }
        return index;
    }
}

class Book {
    String bookName;
    double bookPrice;

    public Book(String bookName, double bookPrice) {
        this.bookName = bookName;
        this.bookPrice = bookPrice;
    }

    public void updatePrice() {
        if (this.bookPrice > 150) {
            this.bookPrice = 150;
        } else if (this.bookPrice > 100 && this.bookPrice < 150) {
            this.bookPrice = 100;
        }
    }
}

class A03 {
    int[] arr;

    public int[] copyArr(int[] arr) {
        this.arr = new int[arr.length];
        for (int i = 0; i < this.arr.length; i++) {
            this.arr[i] = arr[i];
        }
        return this.arr;
    }

    public void printArr() {
        for (int i = 0; i < this.arr.length; i++) {
            System.out.print(this.arr[i] + "\t");
        }
        System.out.println();
//        System.out.println(this.arr.hashCode());
//        for(int i = 0; i < arr.length; i++) {
//            System.out.print(arr[i] + "\t");
//        }
//        System.out.println();
//        System.out.println(arr.hashCode());
    }
}

class Circle {
    double radius;
    double perimeter;
    double area;

    public Circle(double radius) {
        this.radius = radius;
    }

    public double calPerimeter(double radius) {
        this.perimeter = 3.14 * radius * 2;
        return this.perimeter;
    }

    public double calArea(double raduis) {
        this.area = 3.14 * raduis * raduis;
        return this.area;
    }
}