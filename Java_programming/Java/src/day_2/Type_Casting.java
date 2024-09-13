public class Type_Casting {
    public static void main(String[] args) {
        int int_val = 65;
        char char_val = (char)int_val;
        System.out.println(char_val);
        double double_val = (double)int_val; // down -> up 업캐스팅
        System.out.println(double_val);
        double double_val2 = 3.14;
        int int_val2 = (int)double_val2; // up -> down 다운캐스팅
        System.out.println(int_val2);
        byte byte_val = 65;
        char char_val2 = (char)byte_val; // up -> down 다운캐스팅
        System.out.println(char_val2);

        int intValue = 10;
        double doubleValue = 5.5;
        double result = /*(double)*/intValue + doubleValue; // 업캐스팅을 하지 않아도 컴파일에러 X
        System.out.println(result);

        int result2 = intValue + (int)doubleValue;
        System.out.println(result2);

        double result3 = 1.5 + 2.3;
        System.out.println(result3);
        float result4 = 1.5f + 2.4f;
        System.out.println(result4);
        float result5 = (float)(1.5 + 2.4);
        System.out.println(result5);

        System.out.printf("%d\n", 1);
        System.out.println(1);
        System.out.print(1);
    }
}
