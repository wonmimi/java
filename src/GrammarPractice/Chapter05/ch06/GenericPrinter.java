package GrammarPractice.Chapter05.ch06;

public class GenericPrinter<T> {
    private T material;

    public T getMaterial() { // 제네릭 메서드
        return material;
    }

    public void setMaterial(T material) {
        this.material = material;
    }

    public String toString(){
        return material.toString();
    }
}
