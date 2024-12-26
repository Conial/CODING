import java.util.Scanner;

class CAR {
    String 이름;
    String 설명;
    int 최고속도;
    int 달러가격;    
}

public class C {
    public static void main(String[] args) {
        CAR MyCar = new CAR();
        Scanner sc = new Scanner(System.in);
        
        System.out.print("차의 이름은? ");
        MyCar.이름 = sc.nextLine();
        System.out.println("");
        
        System.out.print("차의 설명은? ");
        MyCar.설명 = sc.nextLine();
        System.out.println("");

        System.out.print("차의 최고속도는? ");
        MyCar.최고속도 = Integer.parseInt(sc.nextLine());
        System.out.println("");
        
        System.out.print("차의 달러가격은? ");
        MyCar.달러가격 = Integer.parseInt(sc.nextLine());
        System.out.println("");
        sc.close();

        System.out.println("차의 이름: " + MyCar.이름 + "차의 설명: " + MyCar.설명);
        System.out.printf("차의 최고속도: %d, 차의 달러가격: %d", MyCar.최고속도, MyCar.달러가격);
    }
}
