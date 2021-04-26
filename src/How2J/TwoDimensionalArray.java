public class TwoDimensionalArray {
    public static void main(String[] args) {
        //TwoDimensionalArrayTest01
        int[][] arr1 = new int[3][];
        for(int i = 0; i < arr1.length; i++) {
            arr1[i] = new int[i+1];
            for(int j = 0; j < arr1[i].length; j++) {
                arr1[i][j] = i + 1;
            }
        }
        for(int i = 0; i < arr1.length; i++) {
            for(int j = 0; j < arr1[i].length; j++) {
                System.out.print(arr1[i][j] + "\t");
            }
            System.out.println();
        }

        //TwoDimensionalArrayTest02
        int sum = 0;
        int[][] arr2 = {{4,6},{1,4,5,7},{-2}};
        for(int i = 0; i < arr2.length; i++) {
            for(int j = 0; j < arr2[i].length; j++) {
                sum += arr2[i][j];
            }
        }
        System.out.println(sum);

        //TwoDimensionalArrayTest03-杨辉三角
        int[][] arr3 = new int[10][];
        /*
        for(int i = 0; i < arr3.length; i++) {
            arr3[i] = new int[i+1];
            if(i == 0 || i == 1) {
                for(int k = 0; k < arr3[i].length; k++){
                    arr3[i][k] = 1;
                }
            } else {
                for(int j = 0; j < arr3[i].length; j++) {
                    if(j == 0 || j == arr3[i].length-1) {
                        arr3[i][j] = 1;
                    } else {
                        arr3[i][j] = arr3[i-1][j] + arr3[i-1][j-1];
                    }
                }
            }

        }
        */

        for(int i = 0; i < arr3.length; i++) {
            arr3[i] = new int[i+1];
            for(int j = 0; j < arr3[i].length; j++) {
                if(j == 0 || j == arr3[i].length-1) {
                    arr3[i][j] = 1;
                } else {
                    arr3[i][j] = arr3[i-1][j] + arr3[i-1][j-1];
                }
            }
        }
        for(int i = 0; i < arr3.length; i++) {
            for(int j = 0; j < arr3[i].length; j++) {
                System.out.print(arr3[i][j] + "\t");
            }
            System.out.println();
        }

        String strs[] = new String[]{"a","b","c","d"};
        for(int i = 0; i < strs.length; i++){
            System.out.print(strs + "\t");
        }
    }
}
