import java.lang.Math;

public class RecursionExercise02_MiGong {
    public static void main(String[] args) {
        MiGongGame miGong = new MiGongGame();
        int[][] map = miGong.generateMap(8,7);
        System.out.println("=====原地图情况======");
        for(int i = 0; i < map.length; i++) {
            for(int j = 0; j < map[i].length; j++) {
                System.out.print(map[i][j] + "\t");
            }
            System.out.println();
        }
        miGong.findWay(map, 1, 1);
        System.out.println("=====当前地图情况======");
        for(int i = 0; i < map.length; i++) {
            for(int j = 0; j < map[i].length; j++) {
                System.out.print(map[i][j] + "\t");
            }
            System.out.println();
        }
    }
}
//迷宫类，用于生成迷宫和寻找最短路径
class MiGongGame {
    //生成迷宫
    public int[][] generateMap(int row, int column) {
        int[][] map = new int[row][column];
        for(int i = 0; i < row; i++) {
            for(int j = 0; j < column; j++) {
                if(i == 0 || i == row-1 || j == 0 || j == column-1) {
                    map[i][j] = 1;
                } else {
                    map[i][j] = 0;
                }
            }
        }
        //生成随机障碍物
        /*
        for(int randomNum = 1; randomNum <= 5; randomNum++) {
            map[(int)(Math.random()*5+1)][(int)(Math.random()*4+1)] = 1;
        }
        */
        map[3][1] = 1;
        map[3][2] = 2;
        return map;
    }
    public boolean findWay(int[][] map, int row , int column) {
        if(map[map.length-2][map[map.length-2].length-2] == 2) {
            return true;
        } else {
            if(map[row][column] == 0) {
                map[row][column] = 2;
                if(findWay(map, row + 1, column)) {
                    return true;
                } else if(findWay(map, row, column + 1)){
                    return true;
                } else if(findWay(map, row - 1, column)) {
                    return true;
                } else if(findWay(map, row, column - 1)) {
                    return true;
                } else {
                    map[row][column] = 3;
                    return false;
                }
            } else {
                return false;
            }
        }
    }
}