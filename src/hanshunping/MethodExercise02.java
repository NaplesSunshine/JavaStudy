public class MethodExercise02 {
    public static void main(String[] args) {
        MethodPrint mp = new MethodPrint();
        mp.print(4,4,"#");
    }
}
class MethodPrint {
    public void print(int row, int column,String symbol) {
        for(int i = 0; i <= row; i++) {
            for(int j = 0; j <= column; j++) {
                System.out.print(symbol);
            }
            System.out.println();
        }
    }
}