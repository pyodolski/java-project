package yu241108;
class Car {
    // 중첩 클래스 - Engine
    class Engine {
        public void start() {
            System.out.println("Engine is starting.");
        }

        public void stop() {
            System.out.println("Engine is stopping.");
        }
    }

    private Engine engine;

    // Engine 설정 메서드
    public void setEngine(Engine engine) {
        this.engine = engine;
    }

    public void drive() {
        if (engine != null) {
            engine.start();
            System.out.println("Car is driven.");
            engine.stop();
        } else {
            System.out.println("There is no engine.");
        }
    }

    // Car가 정지할 때 엔진을 정지시키는 메서드
    public void stopCar() {
        if (engine != null) {
            engine.stop();
            System.out.println("Car is stopping.");
        } else {
            System.out.println("There is no engine.");
        }
    }
}

public class Car_Tire {
    public static void main(String[] args) {
        Car car = new Car();

        // Engine을 장착하지 않은 상태에서 주행 시도
        car.drive();

        // Engine 생성 및 설정
        Car.Engine engine = car.new Engine();
        car.setEngine(engine);

        // 엔진 장착 후 주행 시도
        car.drive();
    }
}
