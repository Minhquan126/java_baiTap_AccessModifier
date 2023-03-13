package student;

public class Student {
    private String studentName = "jonh";
    private String studentClass = "JV11";

    public Student(String studentName, String studentClass) {
        this.studentName = studentName;
        this.studentClass = studentClass;
    }
    public Student () {

    }

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public String getStudentClass() {
        return studentClass;
    }

    public void setStudentClass(String studentClass) {
        this.studentClass = studentClass;
    }
}
