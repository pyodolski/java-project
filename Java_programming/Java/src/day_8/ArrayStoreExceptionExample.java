package day_8;

public class ArrayStoreExceptionExample {
    public static void main(String[] args) {
        Object[] strings = new String[3];
        try {
            strings[0] = "Hello";
            strings[1] = "World";
            strings[2] = 42;
        }catch (ArrayStoreException e){
            System.out.println("ArrayStoreException 발생");
    }  finally {
            System.out.println("Program End");
        }
        }
}
