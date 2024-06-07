package dto;

public class Student extends Person {
    private String studentCode;
    private int noOfSemester;

    public Student(){
    }
    public Student(String name, String lastName, int age,String studentCode, int noOfSemester){
        super(name, lastName, age);
        this.studentCode = studentCode;
        this.noOfSemester = noOfSemester;
    }

    public String getStudentCode() {
        return studentCode;
    }

    public void setStudentCode(String studentCode) {
        this.studentCode = studentCode;
    }

    public int getNoOfSemester() {
        return noOfSemester;
    }

    public void setNoOfSemester(int noOfSemester) {
        this.noOfSemester = noOfSemester;
    }
}
