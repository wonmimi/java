package EffectiveJava;

public class Police extends AbstractCharacter implements Character{
    @Override
    public void work() {
        System.out.println("순찰을 한다");
    }
}