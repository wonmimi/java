package GrammarPractice.Chapter03.ch10;

public class AICar extends Car{

    @Override
    public void drive() {
        System.out.println(Car.CARSTRING);
        System.out.println("AI 자율주행");
        System.out.println("자동차가 방향을 바꾼다");
    }

    @Override
    public void stop() {
        System.out.println("장애물 앞에서 스스로 AI 자율주행 끝");
    }
}
