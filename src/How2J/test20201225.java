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
    }
}
