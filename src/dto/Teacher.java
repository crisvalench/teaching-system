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
