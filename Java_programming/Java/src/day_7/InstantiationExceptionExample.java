package day_7;
abstract class animal {

}
class _Dog extends animal {

}

public class InstantiationExceptionExample {
    public static void main(String[] args) {
        animal animal = new _Dog();
    }
}
