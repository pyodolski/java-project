package Exam;



/*
[1장 : 중첩 클래스]
- interface
- implements

[2장 : 중첩 클래스]
- 인터페이스도 메소드 재정의 및 타입 변환 -> 다양성 보장
- 타이어, 한국타이어, 자동차의 관계 이해 : 인터페이스 다형성
- 자동차, 엔진의 관계 : 중첩 클래스 (강력한 캡슐화)
- class { interface } : 중첩 인터페이스 : 동적으로 다형성

- 인터페이스 = new 객체 (자동 타입 변환) : 인터페이스만 사용가능
- (객체) = (객체) 인터페이스 (강제 타입 변환) : 모두 사용가능 (작 -> 큰)
- instanceof

- public interface extends interface, interface (가능)
- class extends class implements interface (가능)
- 메소드가 같은 다중 인터페이스 상속은 명시!

[3장 : 예외처리]
- 정적 바인딩 : 속도 빠름, 오버로딩, 컴파일 시점에 호출 결정 (클래스 안)
- 동적 바인등 : 속도 느림, 오버라이딩, 런타입 시점에 호출 결정 (클래스 밖)

- instantiationException : 추상 클래스나 인터페이스로 객체 생성 시도 시
- NullPointerException : 참조 객체가 없는데 접근 시도 시
- ArrayIndexOutOfBoundsException : 배열의 인덱스가 없는데 접근 시도 시
- NumberFormatException : 문자열을 숫자로

- ClassCastException : 타입변경시(다운 캐스팅)
- ArithmeticException : 연산 오버로딩
- ArrayStoreException : 잘못된 타입의 객체를 저장할 때

[4장 : Try-Catch]
try - catch - finally
여러개 가능
작 -> 큰 순서
throws
public class Memo {
    // 문자열을 정수로 변환하는 메서드
    // NumberFormatException 발생 가능성을 throws로 선언
    public static int parseNumber(String str) {
        return Integer.parseInt(str);
    }

    public static void main(String[] args) {
        // 잘못된 숫자 형식의 문자열
        String number = "123a";
        try {
            // parseNumber 메서드 호출
            int result = parseNumber(number);
            System.out.println("transformed: " + result);
        } catch (NumberFormatException e) {
            // 예외가 발생하면 오류 메시지를 출력
            System.out.println("NumberFormatException! " + e.getMessage());
        }
    }
}


*/
//public class Memo {
//    public static void main(String[] args) {
//        byte[] data = {72, 101, 108 ,108, 111, 32, 74, 97, 118, 97};
//
//        String str1 = new String(data);
//        System.out.println(str1);
//        String str2 = new String(data, 6, 4);
//        System.out.println(str2);
//    }
//}
/*
charAt
indexOf
length
replace
substring

[6장]
- byteValue 포장 객체에서 기본타입의 값을 획득
valueOf
intValue
parseInt -> 문자열을 기본타입으로 변환

abs
ceil
floor
max
min
pow
sqrt
random
rint
round\

[스트림]
바이트 스트림 vs 문자스트림
 */


