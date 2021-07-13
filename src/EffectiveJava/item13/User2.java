package EffectiveJava.item13;

// User , Color 하나에 정의
public class User2 implements Cloneable{
    private  String name;
    private Color2 color; // 가변 상태 필드

    private static class Color2 implements Cloneable{
        private String color;
        public Color2(String color){
            this.color = color;
        }

        public void setColor(String color) {
            this.color = color;
        }

        public String getColor() {
            return color;
        }

        @Override
        public Color2 clone(){
            try {
                return (Color2) super.clone();
            } catch (CloneNotSupportedException e){
                e.printStackTrace();
                throw new AssertionError();
            }
        }
    }


    public User2(String name, Color2 color){
        this.name = name;
        this.color = color;
    }

    public String getName() {
        return name;
    }

    @Override
    public User2 clone(){
        try {
//            return (User)super.clone();
            User2 clone = (User2) super.clone();
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
//        User s3 = new User("wonmimi2","purple");
        User2 s3 = new User2("wonmimi2",new Color2("purple"));
        User2 s4 = s3.clone();
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




