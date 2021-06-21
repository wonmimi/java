package ch09;

public class SubjectTest {
    public static void main(String[] args) {
        Student studentJung = new Student(100, "Jung");
        studentJung.setKoreaSubject("국어",99);
        studentJung.setMathSubject("수학",100);

        Student studentPark = new Student(200, "Park");
        studentPark.setKoreaSubject("국어",98);
        studentPark.setMathSubject("수학",97);

        studentJung.showScoreInfo();
        studentPark.showScoreInfo();

//        System.out.println(studentJung.math.score);

    }
}
