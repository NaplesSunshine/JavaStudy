import java.util.Scanner;

public class MulForExercise01 {
//    1) 统计 3 个班成绩情况， 每个班有 5 名同学， 求出各个班的平均分和所有班级的平均分[学生的成绩从键盘输入]。
//    2) 统计三个班及格人数， 每个班有 5 名同学。
    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);
        int classNum = 3;       //班级个数
        int stuNum = 5;         //学生个数
        int totalPassNum = 0;   //累积及格人数
        double totalScore = 0;  //累积所有学生的成绩
        for (int a = 1; a <= classNum; a++) {
            double classScore = 0;  //一个班级的总分
            int passNum =0;         //班级及格人数
            for (int b = 1; b<= stuNum; b++) {
                System.out.println("请输入" + a + "班的第" + b + "个同学的成绩");
                double stuScore = myScanner.nextDouble();
                if (stuScore >= 60) {
                    passNum++;
                }
                classScore += stuScore;
            }
            totalPassNum += passNum;

            System.out.println("第" + a + "班的总成绩为" + classScore);
            System.out.println("第" + a + "班的平均成绩为" + classScore/stuNum);
            System.out.println("第" + a + "班的及格人数为" + passNum);

            totalScore += classScore;

        }
        System.out.println("所有班的总成绩为" + totalScore);
        System.out.println("所有班的平均成绩为" + totalScore/(classNum * stuNum));
        System.out.println("所有班的及格人数为" + totalPassNum);

    }
}
