package GrammarPractice.Chapter02.ch06;

public class StudentTest {
    public static void main(String[] args) {
        Student studentLee = new Student();
        System.out.println(studentLee.showStudentInfo());

        Student studentJung = new Student(12345, "정씨",29);
        System.out.println(studentJung.showStudentInfo());


    }
}
