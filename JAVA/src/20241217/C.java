import java.util.Scanner;

public class C {
    public static void main(String[] args) throws Exception {
        Scanner SCAN = new Scanner(System.in);
        String INPUT;
        
        System.out.println("입력 : ");
        while(true) {
            INPUT = SCAN.nextLine();
            System.out.println("입력된 문자열 : \"" + INPUT + "\"");
            if(INPUT.equals("SEX")) {
                break;
            }
        }
    }
}
