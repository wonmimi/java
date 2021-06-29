package Chapter02.ch02.sub04;

public class Student {
    public int studentId;
    public String studentName;
    public String address;

    public void showStudentInfo() {
        System.out.println(studentId + "학번 학생 이름은 "+ studentName + " 이고, 주소는 " +
                address+ " 입니다");
    }

    public String getStudentName(){
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }
}
