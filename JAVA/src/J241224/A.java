package J241224;
import java.util.Scanner;

public class A {
    // 계산기 자바
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("배열의 길이를 입력하세요: ");
        String len = scanner.nextLine();
        int lenint = Integer.parseInt(len);

        int[] scores = new int[lenint];
        
        for(int i = 0; i < lenint; i++) {
            System.out.print((i+1) + " 번째 숫자를 입력해주세요: ");
            scores[i] = Integer.parseInt(scanner.nextLine());
        }

        int sum = add(scores);
        System.out.println(sum);
        scanner.close();
    }
    
    public static int add(int[] scores) {
        int sum = 0;
        int var0 = scores.length;
        for(int i=0; i<var0; i++) {
            sum += scores[i];
            sum += i;
            System.out.println(scores[i]);
        }
        return sum;
    }
}
