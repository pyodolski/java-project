package day_3;

public class Ref {
    public static void main(String[] args) {
        String string_00 = "영남대학교";
        String string_01 = "영남대학교";
        String string_02 = new String("영남대학교");
        String string_03 = new String("영남대학교");

        System.out.println("literal == literal : " + string_01 == string_02); // false
        System.out.println("literal == object : " + string_01.equals(string_02));
        System.out.println("object == object : " + string_02.equals(string_03));
        System.out.println("literal == literal, equals : " + string_00.equals(string_01)); // 이렇게 해도 true
    }
}
