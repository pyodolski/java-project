package day_8;

public class ArrayIndexOutOfBoundsExample extends Throwable {
    public static void main(String[] args) {
        int[] numbers = {1,2,3};
        try{
            System.out.println(numbers[3]);
        }catch (ArrayIndexOutOfBoundsException e){
            System.out.println("ArrayIndexOutOfBoundsException 발생");
        }
    }
}
