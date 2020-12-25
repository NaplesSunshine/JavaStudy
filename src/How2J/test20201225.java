public class test20201225 {
    public static void main(String[] args) {
        int[] args1 = new int[(int)(Math.random() * 5) + 5];
        int[] args2 = new int[(int)(Math.random() * 5) + 5];

        for (int i = 0;i < args1.length;i++) {
            args1[i] = (int)(Math.random()*100);
        }
        System.out.println("数组1的内容为：");
        for (int value : args1) {
            System.out.print(value + " ");
        }
        System.out.println();

        for (int i = 0;i < args2.length;i++) {
            args2[i] = (int)(Math.random()*100);
        }
        System.out.println("数组2的内容为：");
        for (int value : args2) {
            System.out.print(value + " ");
        }
        System.out.println();

        int[] args3 = new int[args1.length+args2.length];
        //System.arraycopy(src, srcPos, dest, destPos, length)
        System.arraycopy(args1,0,args3,0,args1.length);
        System.arraycopy(args2,0,args3,args1.length,args2.length);
        System.out.println("数组3的内容为：");
        for (int value : args3) {
            System.out.print(value + " ");
        }

        //二维数组
        //初始化二维数组，
        int[][] a = new int[2][3]; //有两个一维数组，每个一维数组的长度是3
        a[1][2] = 5;  //可以直接访问一维数组，因为已经分配了空间

        //只分配了二维数组
        int[][] b = new int[2][]; //有两个一维数组，每个一维数组的长度暂未分配
        b[0]  =new int[3]; //必须事先分配长度，才可以访问
        b[0][2] = 5;

        //指定内容的同时，分配空间
        int[][] c = new int[][]{
                {1,2,4},
                {4,5},
                {6,7,8,9}
        };

        //定义一个5X5的二维数组。 然后使用随机数填充该二维数组。找出这个二维数组里，最大的那个值，并打印出其二维坐标
        int[][] args4 = new int[5][5];
        for (int x = 0;x < args4.length;x++) {
            for (int y = 0;y < args4[x].length;y++) {
                args4[x][y] = (int)(Math.random()*100);
            }
        }
        for (int[] row : args4) {
           for (int value : row) {
               System.out.print(value + "\t");
           }
           System.out.println();
        }
        int max = -1;
        int max_x = 0,max_y = 0;
        for (int x = 0;x < args4.length;x++) {
            for (int y = 0;y < args4[x].length;y++) {
                if (args4[x][y] > max) {
                    max = args4[x][y];
                    max_x = x;
                    max_y = y;
                }
            }
        }
        System.out.println("该二维数组的最大值是：" + max +"，其二维坐标为：" + "(" + max_x + "," + max_y +")");


    }
}
