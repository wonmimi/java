package Chapter02.ch24;

import java.util.ArrayList;

public class Student {
    private int ID;
    private String name;
    Subject subject;
    private ArrayList<Subject> subjectList;

    public Student(int ID, String name) {
        this.ID = ID;
        this.name = name;
        subjectList = new ArrayList<>();
    }

    public void addSubject(String subjectName, int score){
        subject = new Subject(subjectName, score);
        subjectList.add(subject);
    }

    public void showStudentInfo(){
        int total = 0;
        int score;

        // for
//        for(int i =0; i< subjectList.size(); i++){
//            score = subjectList.get(i).getScore();
//            System.out.println(
//                    "학생 "+name+"의 "+subjectList.get(i).getSubjectName()+"과목 성적은 " +
//                            score+"점이다"
//            );
//            total += score;
//        }

        // enhanced for
        for(Subject sub : subjectList){
            score = sub.getScore();
            System.out.println(
                    "학생 "+name+"의 "+sub.getSubjectName()+"과목 성적은 " +
                            score+"점이다"
            );
            total += score;
        }
        System.out.println(
                "학생 "+name+"의 총점은 " +total +"점이다"
        );


    }


}
