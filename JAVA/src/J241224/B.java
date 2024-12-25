package J241224;
public class B {
    public static void main(String[] args) {
        int X = 19;
        int Y = 29;
        int[][] Table = new int[Y][X];
        
        for(int i=0;i<Y;i++) {
            for(int j=0;j<X;j++) {
                Table[i][j] = (i+1) * (j+1);
            }
        }
    
        for(int i=0; i<Y; i++) {
            for(int score : Table[i]) {
                System.out.printf("%3d | ", score);
            }
            System.out.println("");
        }
    }
}
