package GrammarPractice.Chapter03.ch09;

public class ComputerDemo {
    public static void main(String[] args) {
        Computer desktop = new Desktop();
//        Computer computer = new Computer(); // error

        desktop.display();
//        desktop.desktopOnly();// Computer에 정의된것만 호출
        // computer에 정의하거나 desktop으로 형변환 필요
    }
}
