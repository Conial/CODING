public class A {

    public static void main(String[] args) {
        char[] arr = new char[26];
        char[] arr2 = new char[24];
        for(int i = 0; i < 26; i++) {
            arr[i] = (char) (65 + i);
            System.out.println(arr[i]);
        }

        System.out.println("ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ");
        System.arraycopy(arr, 0, arr2, 3, 15);

        for(int i = 0; i < 24; i++) {
            System.out.println(arr2[i]);
        }
    }
}

