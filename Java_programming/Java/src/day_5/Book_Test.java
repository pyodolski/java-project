package day_5;
class Book1{
    private String title;
    private String author;
    private int price;

    public void setBook(String title, String author, int price) {
        this.title = title;
        this.author = author;
        this.price = price;
    }
    public void printInfo() {
        System.out.println("title: " + this.title);
        System.out.println("author: " + this.author);
        System.out.println("price: " + this.price);
    }
}
public class Book_Test {
    public static class Book {
        private String title;
        private String author;
        private int price;
        Book(){

        }
        Book(String title){
            this.title = title;
        }
        Book(String title, String author){
            this.title = title;
            this.author = author;
        }
        Book(String title, String author, int price){
            this.title = title;
            this.author = author;
            this.price = price;
        }
    }

    public static void main(String[] args) {
        Book book_00 = new Book();
        System.out.println(book_00.title);
        System.out.println(book_00.author);
        System.out.println(book_00.price);

        Book book_01 = new Book("Java");
        Book book_02 = new Book("C++");
        Book book_03 = new Book("Python");
        System.out.println(book_01);
        System.out.println(book_02);
        System.out.println(book_03);

        Book1 book1 = new Book1();
        book1.setBook("Java", "Kim", 10000);
        book1.printInfo();

    }
}
