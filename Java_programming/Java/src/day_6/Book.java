package day_6;

public class Book {
    private String title;
    private String author;
    private int price;

    private int stock;

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    public Book(String title, String author, int price) {
        this.title = title;
        this.author = author;
        this.price = price;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        if(price < 0) {
            System.out.println("error");
        }
        this.price = price;
    }
    public void printInfo() {
        System.out.println(title + " " + author + " " + price);
    }
    public void sell() {
        if(stock > 0) {
            stock--;
        }
        else {
            System.out.println("sold out");
        }
    }

    public static void main(String[] args) {
        Book book = new Book("Java", "Kim", 10000);
        book.printInfo();
        book.setPrice(-1000);
    }
}
