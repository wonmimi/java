package Chapter02.objectClassTest;

class Student implements Cloneable{
    String name;
    Student(String name){
        this.name = name;
    }
    protected Object clone() throws CloneNotSupportedException{
        return super.clone();
    }
}

class StudentDemo {
    public static void main(String[] args) {
        Student s1 = new Student("wonmimi");
        try {
            Student s2 = (Student)s1.clone();
            System.out.println(s1.name);
            System.out.println(s2.name);
            System.out.println(s1);
            System.out.println(s2);

        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
    }
}
