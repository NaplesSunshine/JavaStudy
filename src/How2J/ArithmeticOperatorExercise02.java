public class ArithmeticOperatorExercise02 {
    public static void main(String[] args) {
        //(1)假如还有 59 天放假， 问： 合 xx 个星期零 xx 天
        int allDay = 59;
        int day,week;
        week = allDay / 7;
        day = allDay % 7;
        System.out.println("合"+ week + "个星期" + day + "天");
        //(2)定义一个变量保存华氏温度， 华氏温度转换摄氏温度的公式为： 5/9*(华氏温度-100),请求出华氏温度对应的摄氏温度。
        double huaShi = 234.6;
        double sheShi = 5.0 / 9 * (huaShi - 100);
        System.out.println("华氏温度" + huaShi + "对应的摄氏温度" + sheShi);
    }
}
