import java.util.Scanner;

public class test20201221 {
    public static void main(String[] args) {
    //BIM测试
        /*Scanner Tizhong = new Scanner(System.in);
        System.out.println("请输入你的体重：");
        double getTizhong = Tizhong.nextDouble();
        Scanner Shengao = new Scanner(System.in);
        System.out.println("请输入你的身高：");
        double getShengao = Shengao.nextDouble();
        double BIM;
        BIM = getTizhong/((getShengao*0.01)*(getShengao*0.01));

        String Status;
        if (BIM < 18.5) {
            Status = "体重过轻";
        }else if (BIM >= 18.5 & BIM < 24){
            Status = "正常范围";
        }else if (BIM >= 24 & BIM < 27) {
            Status = "体重过重";
        }else if (BIM >= 27 & BIM < 30) {
            Status = "轻度肥胖";
        }else if (BIM >= 30 & BIM < 35) {
            Status = "中度肥胖";
        }else
            Status = "重度肥胖";
        System.out.println("你的BIM是"+ BIM + ",属于:" + Status);*/
    //月份测试
        System.out.println("请输入月份：");
        Scanner Month = new Scanner(System.in);
        int getMonth = Month.nextInt();
        String Status = "";
        switch (getMonth) {
            case 1 :
            case 2 :
            case 3 :
                Status = "春季";
                break;
            case 4 :
            case 5 :
            case 6 :
                Status = "夏季";
                break;
            case 7 :
            case 8 :
            case 9 :
                Status = "秋季";
                break;
            case 10 :
            case 11 :
            case 12 :
                Status = "冬季";
                break;
            default:
                System.out.println("当前输入月份为错误月份");
        }
        System.out.println("现在是：" + Status);
    }
}
