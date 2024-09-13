package day_3;

public class Bit {
    public static void main(String[] args) {
        int a = 9;
        int b = 11;

        System.out.println(Integer.toBinaryString(a));
        // 바이너리로 변환
        System.out.println(Integer.toBinaryString(b));
        // 바이너리로 변환
        System.out.println("10진수 : " + (a & b)); // a(1001) AND b(1011) = 9(1001)
        System.out.println("2진수 : " + Integer.toBinaryString(a & b));
    }
}
