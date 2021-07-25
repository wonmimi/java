package GrammarPractice.Chapter02.ch02.sub04;

public class StudentTest {
    public static void main(String[] args) {
        Student studentPark = new Student(); // student 객체인 studentLee 인스턴스를 참조변수로 생성

        studentPark.studentId = 12345;
        studentPark.setStudentName("박씨");
        studentPark.address = "서울 한남동";
        studentPark.showStudentInfo();

        Student studentJung  = new Student();

        studentJung.studentId = 67890;
        studentJung.studentName = "정씨";
        studentJung.address = "경기 부천";
        studentJung.showStudentInfo();

        System.out.println(studentPark);
        System.out.println(studentJung);
    }
}
