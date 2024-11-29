package homework;

import java.util.ArrayList;
import java.util.Random;

abstract class Animal {
    private String name;
    private int price;
    private String genes; // 8자리 2진수 유전자
    public static int totalAnimals = 0; // 전체 동물 수 추적

    public abstract void sound();

    public Animal(String name, int price) {
        this.name = name;
        this.price = price;
        this.genes = generateRandomGenes(); // 초기 유전자 생성
        totalAnimals++;
    }

    // 8자리 2진수 유전자 생성 메서드
    private String generateRandomGenes() {
        Random rand = new Random();
        StringBuilder geneBuilder = new StringBuilder();
        for (int i = 0; i < 8; i++) {
            geneBuilder.append(rand.nextInt(2)); // 0 또는 1 생성
        }
        return geneBuilder.toString();
    }

    // 교배 시 유전자 연산 수행
    public static String breedGenes(String genes1, String genes2) {
        Random rand = new Random();
        StringBuilder babyGenes = new StringBuilder();

        for (int i = 0; i < 8; i++) {
            char bit1 = genes1.charAt(i);
            char bit2 = genes2.charAt(i);
            int result;

            // 확률에 따라 비트 연산 결정
            double chance = rand.nextDouble();
            if (chance < 0.75) {
                result = (bit1 - '0') | (bit2 - '0'); // or 연산
            } else if (chance < 0.9) {
                result = (bit1 - '0') & (bit2 - '0'); // and 연산
            } else {
                result = (bit1 - '0') ^ (bit2 - '0'); // xor 연산
            }

            babyGenes.append(result);
        }
        return babyGenes.toString();
    }

    // 동물 정보 출력
    public void printInfo() {
        System.out.println("이름: " + name + ", 가격: " + price + ", 유전자: " + genes);
    }

    // Getter, Setter
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getGenes() {
        return genes;
    }

    public static void printTotalAnimals() {
        System.out.println("총 생성된 동물 수: " + totalAnimals);
    }
}

class Dog extends Animal {
    public Dog(String name, int price) {
        super(name, price);
    }

    @Override
    public void sound() {
        System.out.println("멍멍");
    }
}

class Cat extends Animal {
    public Cat(String name, int price) {
        super(name, price);
    }

    @Override
    public void sound() {
        System.out.println("야옹야옹");
    }
}

class Owner {
    private String name;
    private long balance;
    private ArrayList<Animal> animals;
    public static final int MAX_ANIMALS = 8;

    public Owner(String name, long balance) {
        this.name = name;
        this.balance = balance;
        this.animals = new ArrayList<>();
    }

    // 동물 추가 메서드
    public void addAnimal(Animal animal) {
        if (animals.size() >= MAX_ANIMALS) {
            System.out.println("더이상 동물을 추가할 수 없습니다.");
            return;
        }
        animals.add(animal);
        System.out.println(animal.getName() + "이(가) 성공적으로 추가되었습니다.");
    }

    // 동물 판매 메서드
    public void sellAnimal(Animal animal) {
        if (animals.remove(animal)) {
            balance += animal.getPrice();
            System.out.println(animal.getName() + " 판매 완료.");
        } else {
            System.out.println("해당 동물을 판매할 수 없습니다.");
        }
    }

    // 교배 메서드
    public void breedAnimal(Animal animal1, Animal animal2) {
        if (animal1.getClass() != animal2.getClass()) {
            System.out.println("교배가 불가능합니다. 같은 종끼리 교배 할 수 있습니다.");
            return;
        }
        if (animals.size() >= MAX_ANIMALS) {
            System.out.println("교배할 수 없습니다. 최대 보유 동물 수를 초과합니다.");
            return;
        }

        String babyName = animal1.getName() + " 와 " + animal2.getName() + "의 아기";
        String babyGenes = Animal.breedGenes(animal1.getGenes(), animal2.getGenes()); // 유전자 교배

        Animal baby;
        if (animal1 instanceof Dog) {
            baby = new Dog(babyName, animal1.getPrice() + animal2.getPrice());
        } else {
            baby = new Cat(babyName, animal1.getPrice() + animal2.getPrice());
        }

        animals.add(baby);
        System.out.println("교배 성공! 아기 동물이 추가되었습니다.");
    }

    // 점주의 정보 출력
    public void printInfo() {
        System.out.println(name + "의 동물 리스트:");
        for (Animal animal : animals) {
            animal.printInfo();
        }
        System.out.println("보유 잔고: " + balance);
    }

    // Getter, Setter
    public ArrayList<Animal> getAnimals() {
        return animals;
    }

    public long getBalance() {
        return balance;
    }
}

class Customers {
    private String name;
    private long balance;

    public Customers(String name, long balance) {
        this.name = name;
        this.balance = balance;
    }

    // 돈 벌기
    public void earnMoney(long money) {
        balance += money;
    }

    // 동물 구매 메서드
    public void buyAnimal(Animal animal, Owner owner) {
        if (!owner.getAnimals().contains(animal)) {
            System.out.println("점주가 해당 동물을 보유하고 있지 않습니다.");
            return;
        }
        if (animal.getPrice() > balance) {
            System.out.println("잔고가 부족합니다. 돈을 벌어주세요.");
            return;
        }

        owner.sellAnimal(animal); // 점주로부터 동물 구매
        balance -= animal.getPrice();
        System.out.println(animal.getName() + " 구매 성공! [남은 잔고]: " + balance);
        animal.sound();
    }

    // Getter, Setter
    public String getName() {
        return name;
    }

    public long getBalance() {
        return balance;
    }
}

public class Main {
    public static void main(String[] args) {


        // [1] 기본 클래스 설계
        System.out.println("[1]");
        Dog dog01 = new Dog("강아지01", 10000); // Amimal 상속 Dog 객체 생성
        Cat cat01 = new Cat("고양이01", 10000); // Animal 상속 Cat 객체 생성
        dog01.setName("포메라니안01"); // setter
        cat01.setName("코리안숏헤어01"); // setter
        dog01.sound(); // sound 구현
        cat01.sound(); // sound 구현
        dog01.printInfo();
        cat01.printInfo();

        Owner owner01 = new Owner("점주01", 10000); // Owner 객체 생성, 구매 시 필요
        owner01.addAnimal(dog01); // owner01의 동물리스트에 dog01 추가
        owner01.addAnimal(cat01); // owner01의 동물리스트에 cat01 추가

        // [2] 고객 클래스 구현
        System.out.println("[2]");
        Customers customer01 = new Customers("고객01", 5000);
        customer01.buyAnimal(dog01, owner01); // 잔고부족으로 인한 동물 구매 실패
        customer01.earnMoney(10000); // 돈을 벌어 잔고 증가
        customer01.buyAnimal(cat01, owner01); // 동물 구매 후 소리 출력

        Dog dog02 = new Dog("강아지02", 10000);
        Dog dog03 = new Dog("강아지03", 10000);
        Dog dog04 = new Dog("강아지04", 10000);
        Dog dog05 = new Dog("강아지05", 10000);
        Dog dog06 = new Dog("강아지06", 10000);
        Dog dog07 = new Dog("강아지07", 10000);
        Cat cat02 = new Cat("고양이02", 10000);
        Cat cat03 = new Cat("고양이03", 10000);

        Dog dog10 = new Dog("강아지10", 10000);

        // [3] 점주 클래스 구현 및 동물 관리
        System.out.println("[3]");
        Owner owner02 = new Owner("점주02", 10000);
        owner02.addAnimal(dog02);
        owner02.addAnimal(dog03);
        owner02.addAnimal(dog04);
        owner02.addAnimal(dog05);
        owner02.addAnimal(dog06);
        owner02.addAnimal(dog07);
        owner02.addAnimal(cat02);
        owner02.addAnimal(cat03); // 8마리의 동물 추가
        owner02.printInfo(); // 점주가 가지고 있는 동물 리스트 출력
        owner02.addAnimal(dog10); // 9번째 동물 추가 불가
        owner02.sellAnimal(dog07); // 교배를 하기 위한 판매 (최대 보유 동물 수 8마리)
        System.out.println(owner02.getBalance()); // 판매 후 잔고 증가
        owner02.breedAnimal(dog02,cat02); // 종간 교배 방지
        owner02.breedAnimal(dog02,dog03);
        owner02.printInfo(); // 판매 동물 삭제 및 교배 동물 리스트 추가

        // [4] 상수 및 정적 멤버 활용
        System.out.println("[4]");
        owner02.breedAnimal(dog02, dog03); // 최대 보유 동물 수 8마리 제한
        Animal.printTotalAnimals(); // 전체 동물 개수 출력
        Dog dog08 = new Dog("강아지08", 10000);
        Animal.printTotalAnimals(); // 전체 동물 개수 출력 1마리 추가

        // [5] 유전자 시스템 구현
        System.out.println("[5]");
        Dog dog_dad = new Dog("아빠 강아지", 10000);
        Dog dog_mom = new Dog("엄마 강아지", 10000);
        dog_dad.printInfo(); // 아빠 강아지 유전자 정보
        dog_mom.printInfo(); // 엄마 강아지 유전자 정보
        Owner owner_breed = new Owner("강아지 교배", 10000);
        owner_breed.addAnimal(dog_dad);
        owner_breed.addAnimal(dog_mom);
        owner_breed.breedAnimal(dog_dad, dog_mom); // 점주를 통한 교배
        owner_breed.printInfo(); // 강아지 교배 유전자 정보
    }
}
