package EffectiveJava;

public abstract class AbstractCharacter implements Character{
    @Override
    public void wakeup() {
        System.out.println("일어나서 출근한다");
    }

    @Override
    public void gohome() {
        System.out.println("퇴근한다\n");
    }

    @Override
    public void process() {
        wakeup();
        work();
        gohome();
    }
}
