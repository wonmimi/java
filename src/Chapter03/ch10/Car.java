package Chapter03.ch10;

public abstract class Car {
    public static final String CARSTRING = "Car templete!";
    public abstract void drive();
    public abstract void stop();

    public void startCar(){
        System.out.println("= = 시동을 켠다 = =");
    }
    public void turnOff(){
        System.out.println("= = 시동을 끈다 = = ");
    }

    // 코드 시나리오
    final public void run(){
         startCar();
         drive();
         stop();
         turnOff();
    }
}
