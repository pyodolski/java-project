package yu241129;

import java.util.*; // List와 Scanner 사용을 위해 추가

// Product 클래스 정의
class Product {
    private int pno; // 상품 번호
    private String name; // 상품 이름
    private int price; // 상품 가격
    private int stock; // 상품 재고

    // 상품 번호의 getter와 setter
    public int getPno() { return pno; }
    public void setPno(int pno) { this.pno = pno; }

    // 상품 이름의 getter와 setter
    public String getName() { return name; }
    public void setName(String name) { this.name = name; }

    // 상품 가격의 getter와 setter
    public int getPrice() { return price; }
    public void setPrice(int price) { this.price = price; }

    // 상품 재고의 getter와 setter
    public int getStock() { return stock; }
    public void setStock(int stock) { this.stock = stock; }
}

// ProductStorage 클래스 정의
class ProductStorage {
    // 상품을 저장할 List
    private List<Product> list = new ArrayList<>();
    // 키보드 입력을 받기 위한 Scanner
    private Scanner scanner = new Scanner(System.in);
    // 상품 번호를 카운팅
    private int counter;

    // 메뉴 표시 및 사용자 선택 처리
    public void showMenu() {
        while (true) {
            System.out.println("---------------------------");
            System.out.println("1. Regist | 2. List | 3. Exit");
            System.out.println("---------------------------");
            System.out.print("Select: ");

            // 선택 값 읽기
            String selectNo = scanner.nextLine();
            switch (selectNo) {
                // 상품 등록
                case "1": registerProduct(); break;
                // 상품 목록 보기
                case "2": showProducts(); break;
                // 프로그램 종료
                case "3": return;
                default:
                    System.out.println("Wrong Input, Please input correctly again.");
            }
        }
    }

    // 상품 등록 메서드
    public void registerProduct() {
        try {
            Product product = new Product();

            // 상품 번호 세팅
            product.setPno(++counter);

            System.out.print("Name: ");
            // 상품명 입력
            product.setName(scanner.nextLine());

            System.out.print("Price: ");
            // 가격 입력
            product.setPrice(Integer.parseInt(scanner.nextLine()));

            System.out.print("Amount: ");
            // 재고 입력
            product.setStock(Integer.parseInt(scanner.nextLine()));

            // List에 상품 추가
            list.add(product);

        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }

    // 상품 목록 표시 메서드
    public void showProducts() {
        for (Product p : list) {
            System.out.println(
                p.getPno() + "\t" + p.getName() + "\t" + p.getPrice() + "\t" + p.getStock()
            );
        }
    }
}

// 메인 클래스
public class PrintExample {
    public static void main(String[] args) {
        // ProductStorage 객체 생성 및 메뉴 표시
        ProductStorage storage = new ProductStorage();
        storage.showMenu();
    }
}