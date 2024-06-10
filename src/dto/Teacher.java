package dto;

public class Teacher extends Person{
    private String teacherCode;
    private int yearsOfExperience;

    public Teacher(){
    }

    public Teacher(String name, String lastName, int age,String teacherCode, int yearsOfExperience){
        super(name, lastName, age);
        this.teacherCode = teacherCode;
        this.yearsOfExperience = yearsOfExperience;
    }

    public void printTeacherProperties(){
        System.out.println("**** Print Teacher Properties ****");
        System.out.println("Name: " +name);
        System.out.println("LastName: " +lastName);
        System.out.println("Age: " +age);
        System.out.println("Years Of Experience: " +yearsOfExperience);
        System.out.println("Teacher Code: " +teacherCode);
    }

    public String getTeacherCode() {
        return teacherCode;
    }

    public void setTeacherCode(String teacherCode) {
        this.teacherCode = teacherCode;
    }

    public int getYearsOfExperience() {
        return yearsOfExperience;
    }

    public void setYearsOfExperience(int yearsOfExperience) {
        this.yearsOfExperience = yearsOfExperience;
    }
}
