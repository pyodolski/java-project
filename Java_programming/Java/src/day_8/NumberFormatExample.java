package day_8;

public class NumberFormatExample extends Throwable {
    public static void main(String[] args) {
        String invalidNumber = "abc";
        int number = 0;
        try {
            number = Integer.parseInt(invalidNumber);
        } catch (NumberFormatException e) {
            for(char c : invalidNumber.toCharArray()) {
                number += (int)c;
            }
    }finally {
            System.out.println(number);
        }
        }
}
