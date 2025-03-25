package yu241122;

public class BooleanParseExample {
    public static void main(String[] args) {
        // true
        System.out.println(Boolean.parseBoolean("true"));
        // true
        System.out.println(Boolean.parseBoolean("TRUE"));
        // true
        System.out.println(Boolean.parseBoolean("TRue"));
        // false
        System.out.println(Boolean.parseBoolean("false"));
        // false
        System.out.println(Boolean.parseBoolean("FALSE"));
        // false
        System.out.println(Boolean.parseBoolean("False"));
        // false
        System.out.println(Boolean.parseBoolean("F"));
        // false
        System.out.println(Boolean.parseBoolean(null));
    }
}
