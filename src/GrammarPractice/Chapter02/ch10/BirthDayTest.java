package GrammarPractice.Chapter02.ch10;

public class BirthDayTest {
    public static void main(String[] args) {
        BirthDay date = new BirthDay();
        date.setYear(2019);
        date.setMonth(10);
        date.setDay(13);

//        date.day = 14;    private 접근 X

        date.showDate();
    }
}
