public class test20201223 {
    public static void main (String[] args) {
        int[] i = new int[5];
        for (int a = 0;a < i.length;a++) {
            i[a] = (int)(Math.random() * 100);
            System.out.println("数组i中的i[" + a + "]：" + i[a]);
        }
        //寻找数组中的最大值
        /*int Max = 0;
        for (int b = 1;b < i.length;b++) {
            if (Max < i[b-1]) {
                Max = i[b-1];
            }
        }
        System.out.println("数组中的最大值为："+ Max);*/
        //寻找数组中的最小值
        /*int Min = 100;
        for (int c = 0;c < i.length;c++) {
            if (i[c] < Min) {
                Min = i[c];
            }
        }
        System.out.println("数组中的最小值为："+ Min);*/
        //数组反转
        /*思路一： 使用临时数组*/
        /*System.out.println();
        //准备临时数组
        int[] temp1 = new int[i.length];
        //把原数组的内容复制给临时数组
        for (int sum = 0; sum < temp1.length; sum++) {
            temp1[sum] = i[sum];
        }
        System.out.println("临时数组中的各个值是:");
        for (int sum = 0; sum < temp1.length; sum++)
            System.out.print(temp1[sum] + " ");
        System.out.println();*/
        //反转的做法是把临时数组的数据，挨个 倒 放入 原数组中
        /*for (int sum = 0; sum < temp1.length; sum++) {
            i[sum] = temp1[temp1.length-1-sum];
        }

        System.out.println("反转后的数组中各个值是:");
        for (int sum = 0; sum < i.length; sum++)
            System.out.print(i[sum] + " ");

        System.out.println();*/

        //选择排序
        /*for (int x = 0;x < i.length-1;x++) {
            for (int y = x+1;y < i.length;y++) {
                if (i[x] > i[y]){
                    int temp2 = i[y];
                    i[y] = i[x];
                    i[x] = temp2;
                }
            }
        }
        for (int z = 0;z < i.length;z++) {
            System.out.print(i[z]+" ");
        }*/
        //冒泡排序
        for (int x = 0; x < i.length; x++) {
            for (int y = 0; y < i.length-x-1; y++) {
                if(i[y]>i[y+1]){
                    int temp = i[y];
                    i[y] = i[y+1];
                    i[y+1] = temp;
                }
            }
        }

        //把内容打印出来
        for (int z = 0; z < i.length; z++) {
            System.out.print(i[z] + " ");
        }
    }
}