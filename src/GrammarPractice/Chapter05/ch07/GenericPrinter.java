package GrammarPractice.Chapter05.ch07;

public class GenericPrinter<T extends Material> {
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

    public void printing() {  material.doPrinting();}
}
