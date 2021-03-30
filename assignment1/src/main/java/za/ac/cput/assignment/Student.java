package za.ac.cput.assignment;

public class Student {
    private String studentNum;
    private String studentName;
    private String studentCourse;

    public String getStudentNum() {
        return studentNum;
    }

    public void setStudentNum(String studentNum) {
        this.studentNum = studentNum;
    }

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public String getStudentCourse() {
        return studentCourse;
    }

    public void setStudentCourse(String studentCourse) {
        this.studentCourse = studentCourse;
    }

    @Override
    public String toString() {
        return "Student{" +
                "studentNum='" + studentNum + '\'' +
                ", studentName='" + studentName + '\'' +
                ", studentCourse='" + studentCourse + '\'' +
                '}';
    }
}
