package day_8;

public class MultCatExample {
    public static void main(String[] args) {
        try {
            int[] number = new int[3];
            String  text = null;

            System.out.println(text.length());
            int a = 10;
            int b = 0;
            int result = 10 / b;
        } catch (NullPointerException e){
            System.out.println("NullPointerException 발생");
        }catch (ArithmeticException e){
            System.out.println("0으로 나눌 수 없습니다.");
        }finally {
            System.out.println("Program End");
        }
    }
}
