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

    public void printStudentProperties(){
        System.out.println("**** Print Student Properties ****");
        System.out.println("Name: " +name);
        System.out.println("LastName: " +lastName);
        System.out.println("Age: " +age);
        System.out.println("No of Semester: " +noOfSemester);
        System.out.println("Student Code: " +studentCode);
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
