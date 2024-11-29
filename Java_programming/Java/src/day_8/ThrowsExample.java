package day_8;

public class ThrowsExample {
    public static int parseNumber(String str) throws NumberFormatExample {

        return Integer.parseInt(str);
    }

    public static void main(String[] args) {
        String number = "123a";
        try {
            int result = parseNumber(number);
            System.out.println(result);
        }  catch (NumberFormatException e) {
            System.out.println("NumberFormatException 발생");
    } catch (NumberFormatExample e) {
            throw new RuntimeException(e);
        }finally {
            System.out.println("Program End");
        }
        }
    }
