package Chapter02.objectClassTest;

public class Color implements Cloneable{
    private String color;
    public Color(String color){
        this.color = color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    @Override
    public Color clone(){
        try {
            return (Color) super.clone();
        } catch (CloneNotSupportedException e){
            e.printStackTrace();
            throw new AssertionError();
        }
    }
}
