package EffectiveJava.item13;

public class User implements Cloneable{
    private  String name;
    private Color color; // 가변 상태 필드


    public User(String name){
        this.name = name;
    }

    public User(String name, String color){
        this.name = name;
        this.color = new Color(color);
    }

    public String getName() {
        return name;
    }

    @Override
    public User clone(){
        try {
//            return (User)super.clone();
            User clone = (User) super.clone();
            clone.color = clone.color.clone();
            return clone;
        } catch (CloneNotSupportedException e){
            e.printStackTrace();
            throw new AssertionError();
        }
    }

    public static void main(String[] args) {
        //case 1
//        User s1 = new User("wonmimi");
//        User s2 = s1.clone();
//        System.out.println(s1.getName()+", "+s2.getName());
//        System.out.println(s1);
//        System.out.println(s2);

        // case 2
        User s3 = new User("wonmimi2","purple");
        User s4 = s3.clone();
        System.out.println(s3.color.getColor()+", "+s4.color.getColor());
        s3.color.setColor("yellow");
        System.out.println(s3.color.getColor()+", "+s4.color.getColor());
        System.out.println(s3.color);
        System.out.println(s4.color);


        // 규약 (필수로 참은 아니다)
//        System.out.println(s1 != s2);
//        System.out.println(s1.getClass() == s2.getClass());
//        System.out.println(s1.clone().getClass() == s2.getClass());
    }
}




