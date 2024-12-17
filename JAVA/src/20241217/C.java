import java.util.Scanner;

public class C {
    public static void main(String[] args) throws Exception {
        Scanner SCAN = new Scanner(System.in);
        String INPUT;
        
        System.out.println("입력 : ");
        while(true) {
            INPUT = SCAN.nextLine();
            System.out.println("입력된 문자열 : \"" + INPUT + "\"");
            if(INPUT.equals("gojjang061202")) {
                System.out.println("암호와 일치합니다.");
                System.out.println("잠금을 해제합니다.\n");
                break;
            }
            else {
                System.out.println("암호가 틀렸습니다.\n");
            }
        }

        SCAN.close();
    }
}
