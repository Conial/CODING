package J241217;

import java.util.Scanner;

public class F {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String Name, Front;
        long Phone;

        System.out.print("이름: ");
        Name = scanner.nextLine();

        System.out.print("생년월일(앞 6자리): ");
        Front = scanner.nextLine();

        System.out.print("전번: ");
        Phone = Integer.parseInt(scanner.nextLine());
        
        System.out.println(Name);
        System.out.println(Front);
        System.out.println("0" + (Phone / 100000000) + "-" + ((Phone % 1000000000) / 10000) + "-" + ((Phone % 100000000) % 10000));

        scanner.close();
    }
}