package yu241122;

public class WrapperImmutableExample {
    public static void main(String[] args) {
//        Integer a = Integer.valueOf(300);
//        // a와 b는 같은 객체를 참조
//        Integer b = a;
//
//        System.out.println("a: " + a); // 100
//        System.out.println("b: " + b); // 100
//        System.out.println("a == b: " + (a == b)); // true
//
//        // 새로운 Wrapper 객체 생성
//        a = Integer.valueOf(200);
//
//        System.out.println("a: " + a); // 200
//        System.out.println("b: " + b); // 100
//        System.out.println("a == b: " + (a == b)); // false

        Integer obj1 = (100);
        Integer obj2 = Integer.parseInt("100");
        Integer obj3 = Integer.valueOf(100);

        int value1 = obj1.intValue();
        int value2 = obj2.intValue();
        int value3 = obj3.intValue();

        System.out.println("value1 == value2: " + (value1 == value2));
        System.out.println("value1 == value3: " + (value1 == value3));
    }
}
