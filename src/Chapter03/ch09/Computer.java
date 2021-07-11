package Chapter03.ch09;

public abstract class Computer {
    public abstract void display();
    public abstract void typing();

    public void turnOn() {
        System.out.println("전원을 킨다");
    }

    public void turnOff() {
        System.out.println("전원을 끈다");
    }
}
