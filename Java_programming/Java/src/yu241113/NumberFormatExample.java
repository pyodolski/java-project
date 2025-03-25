package yu241113;

public class NumberFormatExample {
    public static void main(String[] args) {
        // 숫자가 아닌 문자열
        String invalidNumber = "abc";
        int number = 0;

        // NumberFormatException 발생
        try {
            number = Integer.parseInt(invalidNumber);
        } catch (NumberFormatException nfe) {
            for (char c : invalidNumber.toCharArray()) {
                number += (int) c;
            }
        } finally {
            System.out.println("transformed: " + number);
        }
    }
}
