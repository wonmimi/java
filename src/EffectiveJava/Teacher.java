package EffectiveJava;

public class Teacher extends AbstractCharacter implements Character{
    @Override
    public void work() {
        System.out.println("수업을 한다");
    }
}