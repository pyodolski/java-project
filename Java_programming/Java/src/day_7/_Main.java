package day_7;
abstract class _Printer
{
    abstract public void print();
}
class Inkjet extends _Printer
{
    @Override
    public void print() {
        System.out.println("Inkjet");
    }
}
class Laser extends _Printer
{
    @Override
    public void print() {
        System.out.println("Laser");
    }
}

public class _Main {
    public static void main(String[] args) {
        Inkjet inkjet = new Inkjet();
        Laser laser = new Laser();
        inkjet.print();
        laser.print();
    }
}
