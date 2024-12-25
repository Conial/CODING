package J241217;
//혼공자 91p

public class A {
    public static void main(String[] args) {
        int var0 = 3;

        System.out.printf("상품의 갯수 : 000%03d000\n", var0);
        System.out.printf("상품의 갯수 : 000%-3d000\n", var0);
        System.out.printf("상품의 가격 : 000%3d000\n", var0);

        double vard0 = 1.234;

        System.out.printf("봉구스밥버거 : %7.3f.\n", vard0);
        System.out.printf("봉구스밥버거 : %07.3f.\n", vard0);
        System.out.printf("봉구스밥버거 : %-7.3f.\n", vard0);
        
    }
}
