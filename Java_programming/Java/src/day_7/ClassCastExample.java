package day_7;

class _Animal {

}
class _Dog_ extends _Animal {

}
class __Cat extends _Animal {

}
public class ClassCastExample {
    public static void main(String[] args) {
        _Animal animal = new _Dog_();
        __Cat cat = (__Cat) animal;
    }
}
