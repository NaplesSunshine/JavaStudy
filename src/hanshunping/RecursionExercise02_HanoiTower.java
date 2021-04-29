public class RecursionExercise02_HanoiTower {
    public static void main(String[] args) {
        TowerLevelTwo tower = new TowerLevelTwo();
        tower.hannoi(5, 'A', 'B', 'C');
    }
}

class TowerLevelTwo {
    public void hannoi(int num, char a, char b, char c) {
        if(num == 0) {
            return;
        } else {
            hannoi(num - 1, a, c, b);
            move(num, a, c);
            hannoi(num - 1, b, a, c);
        }
    }
    public void move(int id, char from, char to) {
        System.out.println("将编号为" + id + "的盘子从" + from + "柱移到" + to + "柱上");
    }
}
