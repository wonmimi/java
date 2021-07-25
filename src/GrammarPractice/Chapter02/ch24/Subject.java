package GrammarPractice.Chapter02.ch24;

public class Subject {
    private String subjectName;
    private int score;

    public Subject(String subject, int score) {
        this.subjectName = subject;
        this.score = score;
    }

    public String getSubjectName() {
        return subjectName;
    }

    public void setSubjectName(String subjectName) {
        this.subjectName = subjectName;
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }
}
