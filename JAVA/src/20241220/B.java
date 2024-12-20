
public class B {
    public static void main(String[] args) {
        
        for(int i = 3; i >= 0; i -= 1) {
            for(int j = 1; j <= i; j++) {
                System.out.print(" ");
            }
    
            for(int k = 1; k <= 4-i; k++) {
                System.out.print("*");
            }
            System.out.println(" ");
        }
    }
}

