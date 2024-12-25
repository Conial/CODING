package J241220;
import java.util.Scanner;

public class C {

    public static void main(String[] args) {
        
        int[] scores = {0, 10, 20, 30};
        System.out.println(scores[2]);
        String var0 = null;
        Scanner scanner = new Scanner(System.in);

        var0 = scanner.nextLine();
        String var1 = "SEX";

        if (!var0.equals(var1)) {
            System.out.println("암호가 틀렸습니다.");
        } else {
            System.out.println("섹스섹스");
        }

        scanner.close();
    }
}