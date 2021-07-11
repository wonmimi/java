package Chapter03.ch10;

public class CarDemo {
    public static void main(String[] args) {
        Car aiCar = new AICar();
        aiCar.run();

        Car mCar = new Manualcar();
        mCar.run();
    }
}
