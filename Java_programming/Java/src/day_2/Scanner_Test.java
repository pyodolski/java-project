import java.util.*/*Scanner*/;

public class Scanner_Test {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input_data = scanner.nextLine();
        System.out.println(input_data);

        char charValue = 'A'; // (2byte)
        int intValue = (int)charValue; // (4byte)
        System.out.println(intValue);
        short shortValue = (short)intValue; // (2byte)
        System.out.println(shortValue);
    }
}
