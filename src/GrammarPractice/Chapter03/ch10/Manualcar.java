package GrammarPractice.Chapter03.ch10;

public class Manualcar extends Car{

    @Override
    public void drive() {
        System.out.println("사람이 운전 주행");
    }

    @Override
    public void stop() {
        System.out.println("장애물 앞에서 브레이크를 밟아 주행 중단");
    }
}
