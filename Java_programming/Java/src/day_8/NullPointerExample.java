package day_8;


public class NullPointerExample {
    public static void main(String[] args) {
        String text = null;
        try{
            System.out.println(text.length());
        }catch (NullPointerException e){
            System.out.println("NullPointerException 발생");
        }
    }
}
